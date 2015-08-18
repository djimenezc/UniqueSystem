package com.unique.frame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.TableModel;

import org.jdesktop.application.Action;
import org.jdesktop.application.Application;

import com.unique.controller.ControllerImpl;
import com.unique.filter.factory.FilterFileFactory;
import com.unique.patterns.Event;
import com.unique.types.EventType;
import com.unique.types.FileType;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class UniqueFrame extends javax.swing.JFrame {

  private static final long serialVersionUID = 7611325959460041181L;

  /**
   * Auto-generated main method to display this JFrame
   */
  public static void main(final String[] args) {
    SwingUtilities.invokeLater(new Runnable() {

      public void run() {
        final UniqueFrame inst = new UniqueFrame();
        inst.setLocationRelativeTo(null);
        inst.setVisible(true);
      }
    });
  }

  private JMenuBar jMenuBar1;
  private JPanel jPanelFiles;
  private JLabel jLabelPublicKeyFile;
  private JTextField jTextFieldPublicKeyFile;
//  private JPanel jPanelPublicKeyFile;
  private JPanel jPanelMainTableRecord;
  private JPanel jPanelDestinationFile;
  private JPanel jPanelLoadFiles;

  private JMenu jMenu1;
  private JMenu jMenu0;
  private JMenuItem jMenuItem1;
  private JMenuItem jMenuItem0;

  private JTextField jTextFieldPathLoadFile;
  private JLabel jLabelLoadFileDischarge;
  private JButton jButtonLoadFileDischarge;
  private JPanel jPanelMain;
  private JPanel jPanelSeparatorLoadFileDischarge;
  private JPanel jPanelSeparatorPublicKeyFile;
  private JPanel jPanelSeparatorDestinationFile;
  private JPanel jPanelSeparatorLoadDischargeFile;
  private JButton jButtonAddRecord;
  private JPanel jPanelButtons;
  private JButton saveButton;
  private JSeparator jSeparator1;
  private JButton jButtonEditRecord;
  private JButton jButtonDeleteRecord;

  private JDialog jselectFileDialog;
  private JButton jButtonConvertToEncryptedFile;
  private JLabel jLabelDestinationFile;
  private JTextField jTextFieldDestinationFile;

  private JTable jTableRecords;
  private TableModel tableModel;

  public UniqueFrame() {
    super();
    initGUI();
  }

  public UniqueFrame(final TableModel tableModel) {
    super();
    this.tableModel = tableModel;
    this.initGUI();
  }

  /**
   * 
   */
  private void buildMenuBar() {
    jMenuBar1 = new JMenuBar();
    this.setJMenuBar(getJMenuBar1());
    {
      jMenuBar1.add(getJMenu0());
      jMenuBar1.add(getJMenu1());
    }
  }

  private void buildPanels() {

  }

  public void changeJTextField0Text(final String text) {
    jTextFieldPathLoadFile.setText(text);
  }

  public void changeJTextField1Text(final String text) {

    jTextFieldDestinationFile.setText(text);
  }

  private JButton getGuardar() {
    if (saveButton == null) {
      saveButton = new JButton();
      saveButton.setText("Save");
      saveButton.setPreferredSize(new java.awt.Dimension(100, 22));

      saveButton.addMouseListener(new MouseAdapter() {

        @Override
        public void mouseClicked(final MouseEvent evt) {
          saveButtonMouseClicked(evt);
        }

        private void saveButtonMouseClicked(final MouseEvent evt) {
          System.out.println("Guardando fichero de registros");

        }
      });
    }
    return saveButton;
  }

  private JButton getJButton2() {
    if (jButtonAddRecord == null) {
      jButtonAddRecord = new JButton();
      jButtonAddRecord.setText("Add");
      jButtonAddRecord.setPreferredSize(new java.awt.Dimension(90, 22));

      jButtonAddRecord.addMouseListener(new MouseAdapter() {

        private void jButton2MouseClicked(final MouseEvent evt) {
          System.out.println("Añadiendo elemento");

          final JDialog jDialog = new JDialog();

          final Component tabFrame =
            new TabFrame(jDialog, ControllerImpl.getInstance()
              .getNextRequestNumber());

          jDialog.add(tabFrame);

          jDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

          jDialog.setPreferredSize(tabFrame.getPreferredSize());

          DesktopApplication1.getApplication().show(jDialog);
        }

        @Override
        public void mouseClicked(final MouseEvent evt) {
          jButton2MouseClicked(evt);
        }
      });
    }
    return jButtonAddRecord;
  }

  private JButton getJButton3() {
    if (jButtonEditRecord == null) {
      jButtonEditRecord = new JButton();
      jButtonEditRecord.setText("Edit");
      jButtonEditRecord.setPreferredSize(new java.awt.Dimension(90, 22));

      jButtonEditRecord.addMouseListener(new MouseAdapter() {

        private void jButton3MouseClicked(final MouseEvent evt) {
          System.out.println("Editando registro");

        }

        @Override
        public void mouseClicked(final MouseEvent evt) {
          jButton3MouseClicked(evt);
        }
      });
    }
    return jButtonEditRecord;
  }

  private JButton getJButton4() {
    if (jButtonDeleteRecord == null) {
      jButtonDeleteRecord = new JButton();
      jButtonDeleteRecord.setText("Remove");
      jButtonDeleteRecord.setPreferredSize(new java.awt.Dimension(90, 22));

      jButtonDeleteRecord.addMouseListener(new MouseAdapter() {

        private void jButton4MouseClicked(final MouseEvent evt) {
          System.out.println("Borrando registro");

        }

        @Override
        public void mouseClicked(final MouseEvent evt) {
          jButton4MouseClicked(evt);
        }
      });

    }
    return jButtonDeleteRecord;
  }

  private JButton getJButtonLoadFileDischarge() {
    if (jButtonLoadFileDischarge == null) {
      jButtonLoadFileDischarge = new JButton();
      jButtonLoadFileDischarge.setText("Load");
      jButtonLoadFileDischarge.setName("load");
      jButtonLoadFileDischarge
        .setPreferredSize(new java.awt.Dimension(100, 22));

      jButtonLoadFileDischarge.addMouseListener(new MouseAdapter() {

        private void jButton1MouseClicked(final MouseEvent evt) {
          System.out.println("Cargando fichero de registros");

          final Event event =
            new Event(EventType.LOAD_SOURCE_FILE, jTextFieldPathLoadFile
              .getText());

          ControllerImpl.getInstance().onEvent(event);
        }

        @Override
        public void mouseClicked(final MouseEvent evt) {
          jButton1MouseClicked(evt);
        }
      });
    }
    return jButtonLoadFileDischarge;
  }

  private JLabel getJLabel0() {
    if (jLabelLoadFileDischarge == null) {
      jLabelLoadFileDischarge = new JLabel();
      jLabelLoadFileDischarge.setText("Data file");
      jLabelLoadFileDischarge.setPreferredSize(new java.awt.Dimension(207, 15));
    }
    return jLabelLoadFileDischarge;
  }

  private JLabel getJLabel1() {
    if (jLabelDestinationFile == null) {
      jLabelDestinationFile = new JLabel();
      jLabelDestinationFile.setText("Target file");
      jLabelDestinationFile.setPreferredSize(new java.awt.Dimension(204, 15));
    }
    return jLabelDestinationFile;
  }

  private JMenu getJMenu0() {
    if (jMenu0 == null) {
      jMenu0 = new JMenu();
      jMenu0.setText("File");
      jMenu0.setOpaque(false);
      jMenu0.add(getJMenuItem0());
    }
    return jMenu0;
  }

  private JMenu getJMenu1() {
    if (jMenu1 == null) {
      jMenu1 = new JMenu();
      jMenu1.setText("Help");
      jMenu1.setOpaque(false);
      jMenu1.add(getJMenuItem1());
    }
    return jMenu1;
  }

  private JMenuBar getJMenuBar1() {

    if (jMenuBar1 == null) {
      jMenuBar1 = new JMenuBar();
    }
    return jMenuBar1;
  }

  private JMenuItem getJMenuItem0() {
    if (jMenuItem0 == null) {
      jMenuItem0 = new JMenuItem();
      jMenuItem0.setText("Exit");
    }
    return jMenuItem0;
  }

  private JMenuItem getJMenuItem1() {
    if (jMenuItem1 == null) {
      jMenuItem1 = new JMenuItem();
      jMenuItem1.setText("About");
    }
    return jMenuItem1;
  }

  private JPanel getJPanel1() {
    if (jPanelMain == null) {
      jPanelMain = new JPanel();
      jPanelMain.setLayout(null);
      jPanelMain.add(getJPanelFiles());
      jPanelMain.add(getJSeparator1());
      jPanelMain.add(getJPanel3());
    }
    return jPanelMain;
  }

  private JPanel getJPanel10() {
    if (jPanelSeparatorLoadFileDischarge == null) {
      jPanelSeparatorLoadFileDischarge = new JPanel();
      jPanelSeparatorLoadFileDischarge.setPreferredSize(new java.awt.Dimension(
        16, 10));
    }
    return jPanelSeparatorLoadFileDischarge;
  }

  private JPanel getJPanel1x() {
    if (jPanelLoadFiles == null) {
      jPanelLoadFiles = new JPanel();
      final FlowLayout jPanel1Layout = new FlowLayout();
      jPanel1Layout.setAlignment(FlowLayout.LEFT);
      jPanelLoadFiles.setLayout(jPanel1Layout);
      jPanelLoadFiles.setPreferredSize(new java.awt.Dimension(584, 34));
      jPanelLoadFiles.add(getJLabel0());
      jPanelLoadFiles.add(getJTextField0());
      jPanelLoadFiles.add(getJPanel6());
      jPanelLoadFiles.add(getJButtonLoadFileDischarge());
    }
    return jPanelLoadFiles;
  }

  private JPanel getJPanel2() {
    if (jPanelDestinationFile == null) {
      jPanelDestinationFile = new JPanel();
      final FlowLayout jPanel2Layout = new FlowLayout();
      jPanel2Layout.setAlignment(FlowLayout.LEFT);
      jPanelDestinationFile.setLayout(jPanel2Layout);
      jPanelDestinationFile.setPreferredSize(new java.awt.Dimension(579, 34));
      jPanelDestinationFile.add(getJLabel1());
      jPanelDestinationFile.add(getJTextField1());
      jPanelDestinationFile.add(getJPanel7());
      jPanelDestinationFile.add(getGuardar());
    }
    return jPanelDestinationFile;
  }

  private JPanel getJPanel3() {
    if (jPanelMainTableRecord == null) {
      jPanelMainTableRecord = new JPanel();
      final FlowLayout jPanel3Layout = new FlowLayout();
      jPanel3Layout.setAlignment(FlowLayout.LEFT);
      jPanelMainTableRecord.setLayout(jPanel3Layout);
      jPanelMainTableRecord.setBounds(-1, 137, 606, 280);
      jPanelMainTableRecord.setName("jPanel3");
      jPanelMainTableRecord.add(new JScrollPane(getJTable1()));
      jPanelMainTableRecord.add(getJPanel5());
    }
    return jPanelMainTableRecord;
  }

//  private JPanel getJPanel4() {
//    if (jPanelPublicKeyFile == null) {
//      jPanelPublicKeyFile = new JPanel();
//      final FlowLayout jPanel4Layout = new FlowLayout();
//      jPanel4Layout.setAlignment(FlowLayout.LEFT);
//      jPanelPublicKeyFile.setPreferredSize(new java.awt.Dimension(579, 34));
//      jPanelPublicKeyFile.setLayout(jPanel4Layout);
//      jPanelPublicKeyFile.add(getJLabel2());
//      jPanelPublicKeyFile.add(getJTextField2());
//      jPanelPublicKeyFile.add(getJPanel9());
//      jPanelPublicKeyFile.add(getJButton0());
//    }
//    return jPanelPublicKeyFile;
//  }

  private JPanel getJPanel5() {
    if (jPanelButtons == null) {
      jPanelButtons = new JPanel();
      jPanelButtons.setPreferredSize(new java.awt.Dimension(98, 269));
      jPanelButtons.add(getJButton2());
      jPanelButtons.add(getJButton3());
      jPanelButtons.add(getJButton4());
    }
    return jPanelButtons;
  }

  private JPanel getJPanel6() {
    if (jPanelSeparatorLoadDischargeFile == null) {
      jPanelSeparatorLoadDischargeFile = new JPanel();
      jPanelSeparatorLoadDischargeFile.setPreferredSize(new java.awt.Dimension(
        16, 10));
      jPanelSeparatorLoadDischargeFile.add(getJPanel10());
    }
    return jPanelSeparatorLoadDischargeFile;
  }

  private JPanel getJPanel7() {
    if (jPanelSeparatorDestinationFile == null) {
      jPanelSeparatorDestinationFile = new JPanel();
      jPanelSeparatorDestinationFile.setPreferredSize(new java.awt.Dimension(
        16, 10));
    }
    return jPanelSeparatorDestinationFile;
  }

  private JPanel getJPanel9() {
    if (jPanelSeparatorPublicKeyFile == null) {
      jPanelSeparatorPublicKeyFile = new JPanel();
      jPanelSeparatorPublicKeyFile.setPreferredSize(new java.awt.Dimension(16,
        10));
    }
    return jPanelSeparatorPublicKeyFile;
  }

  private JPanel getJPanelFiles() {
    if (jPanelFiles == null) {
      jPanelFiles = new JPanel();
      final FlowLayout jPanelFilesLayout = new FlowLayout();
      jPanelFiles.setLayout(jPanelFilesLayout);
      jPanelFiles.setBounds(0, 0, 608, 116);
      // jPanelFiles.setBounds(0, 5, 800, 150);
      jPanelFiles.add(getJPanel1x());
      jPanelFiles.add(getJPanel2());
//      jPanelFiles.add(getJPanel4());
    }
    return jPanelFiles;
  }

  private JSeparator getJSeparator1() {
    if (jSeparator1 == null) {
      jSeparator1 = new JSeparator();
      jSeparator1.setBounds(12, 128, 575, 3);
    }
    return jSeparator1;
  }

  private JTable getJTable1() {

    if (jTableRecords == null) {

      jTableRecords = new JTable();
      jTableRecords.setModel(tableModel);

      jTableRecords.setPreferredScrollableViewportSize(new Dimension(480, 240));
      jTableRecords.setFillsViewportHeight(true);
      jTableRecords.setPreferredSize(new java.awt.Dimension(480, 240));

    }
    return jTableRecords;
  }

  private JTextField getJTextField0() {
    if (jTextFieldPathLoadFile == null) {
      jTextFieldPathLoadFile = new JTextField();
      jTextFieldPathLoadFile.setText("Click here to select file");
      jTextFieldPathLoadFile.setPreferredSize(new java.awt.Dimension(235, 22));
      jTextFieldPathLoadFile.addMouseListener(new MouseAdapter() {

        @Override
        public void mouseClicked(final MouseEvent event) {
          jTextField0MouseMouseClicked(event);
        }
      });
    }
    return jTextFieldPathLoadFile;
  }

  private JTextField getJTextField1() {
    if (jTextFieldDestinationFile == null) {
      jTextFieldDestinationFile = new JTextField();
      jTextFieldDestinationFile.setText("Click here to select file");
      jTextFieldDestinationFile
        .setPreferredSize(new java.awt.Dimension(235, 22));
      jTextFieldDestinationFile.addMouseListener(new MouseAdapter() {

        @Override
        public void mouseClicked(final MouseEvent event) {
          jTextField1MouseMouseClicked(event);
        }
      });
    }
    return jTextFieldDestinationFile;
  }

  private JTextField getJTextField2() {
    if (jTextFieldPublicKeyFile == null) {
      jTextFieldPublicKeyFile = new JTextField();
      jTextFieldPublicKeyFile.setName("jTextField2");
      jTextFieldPublicKeyFile.setPreferredSize(new java.awt.Dimension(237, 22));
      jTextFieldPublicKeyFile.setText("Click here to select file");
      jTextFieldPublicKeyFile.addMouseListener(new MouseAdapter() {

        @Override
        public void mouseClicked(final MouseEvent evt) {
          jTextField2MouseClicked(evt);
        }
      });
    }
    return jTextFieldPublicKeyFile;
  }

  private void initGUI() {
    try {

      setTitle("Unique person manager");

      setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      getContentPane().add(getJPanel1(), BorderLayout.CENTER);
      {
        buildMenuBar();
        buildPanels();
        loadFrameIcon();
      }
      pack();
      this.setSize(603, 457);
      this.setPreferredSize(new java.awt.Dimension(603, 457));
      Application.getInstance().getContext().getResourceMap(getClass())
        .injectComponents(getContentPane());
    }
    catch (final Exception e) {
      // add your error handling code here
      e.printStackTrace();
    }
  }

  private void jButton0MouseMouseClicked(final MouseEvent event) {

    ControllerImpl.getInstance().onEvent(
      new Event(EventType.FILES_CONVERT, null));
  }

  private void jTextField0MouseMouseClicked(final MouseEvent event) {

    System.out.println("Select file");

    ControllerImpl.getInstance().onEvent(
      new Event(EventType.READ_SOURCE_FILE_PATH, null));

    showSelectFileDialog(FileType.SOURCE_FILE);
  }

  private void jTextField1MouseMouseClicked(final MouseEvent event) {

    System.out.println("Select target file");

    ControllerImpl.getInstance().onEvent(
      new Event(EventType.READ_DESTINATION_FILE_PATH, null));

    showSelectFileDialog(FileType.DESTINATION_FILE);
  }

  private void jTextField2MouseClicked(final MouseEvent evt) {
    System.out.println("jTextField2.mouseClicked, event=" + evt);
  }

  private void loadFrameIcon() {
    // TODO añadir icono al frame
    // final Image icon =
    // Toolkit.getDefaultToolkit().getImage("resources/favicon.png");
    // this.setIconImage(icon);
  }

  @Action
  public void showSelectFileDialog(final FileType fileType) {

    final JFrame mainFrame =
      DesktopApplication1.getApplication().getMainFrame();

    FileFilter filter;

    if (fileType.equals(FileType.SOURCE_FILE)) {
      filter = FilterFileFactory.getSourceFilter();
    }
    else {
      filter = FilterFileFactory.getDestinationFilter();
    }

    jselectFileDialog = new ChooseFileDialog(mainFrame, filter);
    jselectFileDialog.setLocationRelativeTo(mainFrame);

    jselectFileDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

    // }
    DesktopApplication1.getApplication().show(jselectFileDialog);
  }

  public void updateJTable(final TableModel dataModel) {

    jTableRecords.setModel(dataModel);
    jTableRecords.updateUI();
  }

}
