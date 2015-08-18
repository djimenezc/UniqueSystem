package com.unique.frame;

import org.uispec4j.MenuItem;
import org.uispec4j.Trigger;
import org.uispec4j.Window;
import org.uispec4j.interception.PopupMenuInterceptor;
import org.uispec4j.interception.WindowHandler;
import org.uispec4j.interception.WindowInterceptor;

public class RecordRemovalTest extends ParserFrameTestCase {

  private void deleteRow(final int row, final boolean confirm) {
    recordsTable.selectRow(row);
    final MenuItem removeContactMenuItem = getRemoveMenuItem();
    WindowInterceptor.init(removeContactMenuItem.triggerClick()).process(
      "Confirmation", new WindowHandler() {

        @Override
        public Trigger process(final Window window) throws Exception {
          assertThat(window
            .containsLabel("Are you sure you want to delete this contact?"));
          return window.getButton(confirm ? "Yes" : "No").triggerClick();
        }
      }).run();
  }

  private MenuItem getRemoveMenuItem() {
    return PopupMenuInterceptor.run(recordsTable.triggerRightClick(0, 0))
      .getSubMenu("Remove");
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    addRecord("Smith", "John");
    addRecord("Smith", "Maria");
  }

  public void testActionIsDisabledWhenNoContactIsSelected() throws Exception {
    recordsTable.clearSelection();
    assertFalse(getRemoveMenuItem().isEnabled());
  }

  public void testSimpleContactRemoval() throws Exception {
    deleteRow(0, true);
    assertThat(recordsTable.contentEquals(new Object[][] { { "Smith", "Maria",
      "", "", "" } }));

    deleteRow(0, false);
    assertThat(recordsTable.contentEquals(new Object[][] { { "Smith", "Maria",
      "", "", "" } }));
  }
}
