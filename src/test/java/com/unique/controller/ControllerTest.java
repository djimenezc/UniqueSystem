package com.unique.controller;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.unique.controller.Controller;
import com.unique.controller.ControllerImpl;
import com.unique.patterns.Event;
import com.unique.types.ControllerResponseType;
import com.unique.types.EventType;

public class ControllerTest {

  private Controller controller;

  @Test
  public void loadSourceFile() {

    String sourceFilePath = "sourceFiles/fichero_telefonica.tel";
    sourceFilePath =
      System.getProperty("user.dir") + "/target/test-classes/" + sourceFilePath;

    final Event event = new Event(EventType.LOAD_SOURCE_FILE, sourceFilePath);

    final ControllerResponseType controllerResponse = controller.onEvent(event);

    assertEquals(ControllerResponseType.OK, controllerResponse);
  }

  @Before
  public void setup() {

    controller = ControllerImpl.getInstance();
  }

  @After
  public void tearDown() {
  }
}
