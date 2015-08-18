package com.unique.frame;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import com.unique.controller.ControllerImpl;
import com.unique.patterns.Event;
import com.unique.types.EventType;

// VS4E -- DO NOT REMOVE THIS LINE!
public class ChooseFileDialog extends JDialog {

  private static final long serialVersionUID = 1L;
  private JFileChooser jFileChooser0;

  private static final String PREFERRED_LOOK_AND_FEEL =
    "javax.swing.plaf.metal.MetalLookAndFeel";

  private static void installLnF() {
    try {
      String lnfClassname = PREFERRED_LOOK_AND_FEEL;
      if (lnfClassname == null) {
        lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
      }
      UIManager.setLookAndFeel(lnfClassname);
    }
    catch (final Exception e) {
      System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
        + " on this platform:" + e.getMessage());
    }
  }

  /**
   * Main entry of the class. Note: This class is only created so that you can
   * easily preview the result at runtime. It is not expected to be managed by
   * the designer. You can modify it as you like.
   */
  public static void main(final String[] args) {
    installLnF();
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        final ChooseFileDialog dialog = new ChooseFileDialog();
        dialog.setDefaultCloseOperation(ChooseFileDialog.DISPOSE_ON_CLOSE);
        dialog.setTitle("Seleccione un fichero");
        dialog.setLocationRelativeTo(null);
        dialog.getContentPane().setPreferredSize(dialog.getSize());
        dialog.pack();
        dialog.setVisible(true);
      }
    });
  }

  public ChooseFileDialog() {
    initComponents();
  }

  public ChooseFileDialog(final Dialog parent) {
    super(parent);
    initComponents();
  }

  public ChooseFileDialog(final Dialog parent, final boolean modal) {
    super(parent, modal);
    initComponents();
  }

  public ChooseFileDialog(final Dialog parent, final String title) {
    super(parent, title);
    initComponents();
  }

  public ChooseFileDialog(final Dialog parent, final String title,
    final boolean modal) {
    super(parent, title, modal);
    initComponents();
  }

  public ChooseFileDialog(final Dialog parent, final String title,
    final boolean modal, final GraphicsConfiguration arg) {
    super(parent, title, modal, arg);
    initComponents();
  }

  public ChooseFileDialog(final Frame parent) {
    super(parent);
    initComponents();
  }

  public ChooseFileDialog(final Frame parent, final boolean modal) {
    super(parent, modal);
    initComponents();
  }

  public ChooseFileDialog(final Frame parent, final FileFilter fileFilter) {
    super(parent);
    initComponents(fileFilter);
  }

  public ChooseFileDialog(final Frame parent, final String title) {
    super(parent, title);
    initComponents();
  }

  public ChooseFileDialog(final Frame parent, final String title,
    final boolean modal) {
    super(parent, title, modal);
    initComponents();
  }

  public ChooseFileDialog(final Frame parent, final String title,
    final boolean modal, final GraphicsConfiguration arg) {
    super(parent, title, modal, arg);
    initComponents();
  }

  public ChooseFileDialog(final Window parent) {
    super(parent);
    initComponents();
  }

  public ChooseFileDialog(final Window parent, final ModalityType modalityType) {
    super(parent, modalityType);
    initComponents();
  }

  public ChooseFileDialog(final Window parent, final String title) {
    super(parent, title);
    initComponents();
  }

  public ChooseFileDialog(final Window parent, final String title,
    final ModalityType modalityType) {
    super(parent, title, modalityType);
    initComponents();
  }

  public ChooseFileDialog(final Window parent, final String title,
    final ModalityType modalityType, final GraphicsConfiguration arg) {
    super(parent, title, modalityType, arg);
    initComponents();
  }

  private JFileChooser getJFileChooser0() {
    if (jFileChooser0 == null) {
      jFileChooser0 = new JFileChooser();
      jFileChooser0.setBorder(BorderFactory.createEmptyBorder(12, 12, 11, 11));
      jFileChooser0.setAcceptAllFileFilterUsed(true);
      jFileChooser0.setControlButtonsAreShown(true);
      jFileChooser0.setFileHidingEnabled(true);

      jFileChooser0.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(final ActionEvent e) {

          if (e.getActionCommand().equals(JFileChooser.CANCEL_SELECTION)) {
            System.out.println("Cancelado selección de fichero");
            dispose();
          }
          else
            if (e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {

              final File file = jFileChooser0.getSelectedFile();

              ControllerImpl.getInstance().onEvent(
                new Event(EventType.CHANGE_FILE_TEXT_BOX, file
                  .getAbsolutePath()));

              dispose();
            }
        }
      });
    }
    return jFileChooser0;
  }

  private void initComponents() {
    setFont(new Font("Dialog", Font.PLAIN, 12));
    setBackground(new Color(223, 223, 223));
    setForeground(Color.black);
    setSize(572, 338);

    setLayout(new GroupLayout());

    add(getJFileChooser0(), new Constraints(new Leading(2, 10, 10),
      new Leading(2, 10, 10)));
  }

  private void initComponents(final FileFilter fileFilter) {

    initComponents();

    this.jFileChooser0.setFileFilter(fileFilter);
  }

}
