package com.unique.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.Document;

import org.jdesktop.application.Application;

import com.unique.controller.ControllerImpl;
import com.unique.document.CharacterLimitator;
import com.unique.model.PersonTo;
import com.unique.patterns.Event;
import com.unique.types.EventType;

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
public class TabFrame extends JPanel {

	private static final long serialVersionUID = -6817973532723328055L;

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		final JFrame frame = new JFrame("Add person");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add content to the window.
		frame.add(new TabFrame(frame, 0), BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	/** Returns an ImageIcon, or null if the path was invalid. */
	protected static ImageIcon createImageIcon(final String path) {

		final java.net.URL imgURL = TabFrame.class.getResource(path);

		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	public static void main(final String[] args) {
		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				// Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});
	}

	private JPanel jPanelButton;
	private JButton jCancelButton;
	private JButton jButton1;
	private JLabel jLabelOperatorName;
	private JTextField jTextFieldOperatorName;
	private JLabel jLabelOperatorCode;
	private JPanel jPanel5;
	private JButton jSaveButton;
	private JLabel jLabel2;
	private JPanel jPanel3;
	private JTextField jTextFieldRequestNumber;
	private JLabel jLabel1;
	private JPanel jPanel2;
	private JPanel jPanel1;
	private JComboBox jComboBoxRequestType;
	// private JDateChooser jDateChooser;
	private final Window parentFrame;
	// private final Window frame;
	// private JScrollPane verticalPane;
	private final Integer requestNumber;

	public TabFrame(final Window frame, final Integer requestNumber) {

		// super(new GridLayout(1, 1));

		this.requestNumber = requestNumber;
		// this.frame = frame;s
		this.parentFrame = frame;

		final JTabbedPane tabbedPane = new JTabbedPane();
		final ImageIcon icon = createImageIcon("images/middle.gif");

		makeRequestDataTab(tabbedPane, icon);

		// Add the tabbed pane to this panel.
		final BoxLayout thisLayout = new BoxLayout(this,
				javax.swing.BoxLayout.Y_AXIS);
		this.setLayout(thisLayout);
		this.setPreferredSize(new java.awt.Dimension(623, 428));
		this.setSize(new java.awt.Dimension(623, 428));
		this.add(tabbedPane);

		// The following line enables to use scrolling tabs.
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setPreferredSize(new java.awt.Dimension(662, 521));
		{
			jPanelButton = new JPanel();
			this.add(jPanelButton);
			final FlowLayout jPanel1Layout = new FlowLayout();
			jPanel1Layout.setAlignment(FlowLayout.LEFT);
			jPanelButton.setLayout(jPanel1Layout);
			jPanelButton.setPreferredSize(new java.awt.Dimension(623, 41));
			{
			}
			{
				jPanelButton.add(getJButton1());
				jPanelButton.add(getSaveButton());
				jPanelButton.add(getCancelButton());
			}
		}
		Application.getInstance().getContext().getResourceMap(getClass())
				.injectComponents(this);
	}

	// private JComponent buildVerticalScrool(final JPanel panel) {
	//
	// verticalPane = new JScrollPane(panel, // component
	// JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, // vertical bar
	// JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // assuming you only
	// // need
	//
	// return verticalPane;
	// }

	private void closeDialog() {
		parentFrame.dispose();
	}

	public JButton getCancelButton() {

		if (jCancelButton == null) {
			jCancelButton = new JButton();
			jCancelButton.setText("Cancelar");

			jCancelButton.addMouseListener(new MouseAdapter() {

				private void jButton2MouseClicked(final MouseEvent evt) {
					System.out.println("Cancelling add register");

					closeDialog();
				}

				@Override
				public void mouseClicked(final MouseEvent evt) {
					jButton2MouseClicked(evt);
				}
			});
		}
		return jCancelButton;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setName("jButton1");
			jButton1.setPreferredSize(new java.awt.Dimension(151, 22));
			jButton1.addMouseListener(new MouseAdapter() {

				private void jButton1MouseClicked(final MouseEvent evt) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseClicked(final MouseEvent evt) {
					jButton1MouseClicked(evt);
					closeDialog();
				}
			});
		}
		return jButton1;
	}

	private JComboBox getJComboBox1() {
		if (jComboBoxRequestType == null) {
			final ComboBoxModel jComboBox1Model = new DefaultComboBoxModel(
					new String[] { "Male", "Female" });
			jComboBoxRequestType = new JComboBox();
			jComboBoxRequestType.setModel(jComboBox1Model);
			jComboBoxRequestType.setBounds(0, 0, 536, 270);
			jComboBoxRequestType.setPreferredSize(new java.awt.Dimension(146,
					25));
			jComboBoxRequestType
					.setToolTipText("Gender");
		}
		return jComboBoxRequestType;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Person Number");
			jLabel1.setPreferredSize(new java.awt.Dimension(201, 15));
		}
		return jLabel1;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("BirthDay");
			jLabel2.setPreferredSize(new java.awt.Dimension(200, 15));
		}
		return jLabel2;
	}

	public JLabel getJLabelOperatorCode() {
		if (jLabelOperatorCode == null) {
			jLabelOperatorCode = new JLabel();
			jLabelOperatorCode.setText("Código Operador Autorizado");
			jLabelOperatorCode
					.setPreferredSize(new java.awt.Dimension(252, 15));
		}
		return jLabelOperatorCode;
	}

	private JLabel getJLabelOperatorName() {
		if (jLabelOperatorName == null) {
			jLabelOperatorName = new JLabel();
			jLabelOperatorName
					.setPreferredSize(new java.awt.Dimension(252, 15));
			jLabelOperatorName.setText("Nombre operador");
		}
		return jLabelOperatorName;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			final FlowLayout jPanel1Layout1 = new FlowLayout();
			jPanel1Layout1.setAlignment(FlowLayout.LEFT);
			jPanel1.setLayout(jPanel1Layout1);
			jPanel1.setPreferredSize(new java.awt.Dimension(508, 37));
			jPanel1.add(getJComboBox1());
		}
		return jPanel1;
	}

	// private void initComponents() {
	// setSize(541, 340);
	// this.setName("this");
	// this.setPreferredSize(new java.awt.Dimension(583, 340));
	// Application.getInstance().getContext().getResourceMap(getClass())
	// .injectComponents(this);
	// }

	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			final FlowLayout jPanel2Layout = new FlowLayout();
			jPanel2Layout.setAlignment(FlowLayout.LEFT);
			jPanel2.setLayout(jPanel2Layout);
			jPanel2.setPreferredSize(new java.awt.Dimension(509, 32));
			jPanel2.add(getJLabel1());
			jPanel2.add(getJTextField1());
		}
		return jPanel2;
	}

	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			final FlowLayout jPanel3Layout = new FlowLayout();
			jPanel3Layout.setAlignment(FlowLayout.LEFT);
			jPanel3.setLayout(jPanel3Layout);
			jPanel3.setPreferredSize(new java.awt.Dimension(526, 32));
			jPanel3.add(getJLabel2());
			{
				// jDateChooser = new JDateChooser(new Date());
				// jPanel3.add(jDateChooser);
				// jDateChooser.setPreferredSize(new java.awt.Dimension(195,
				// 22));
			}

		}
		return jPanel3;
	}

	public JPanel getJPanel5() {
		if (jPanel5 == null) {
			jPanel5 = new JPanel();
			final FlowLayout jPanel5Layout = new FlowLayout();
			jPanel5Layout.setAlignment(FlowLayout.LEFT);
			jPanel5.setLayout(jPanel5Layout);
			jPanel5.setPreferredSize(new java.awt.Dimension(559, 31));
			jPanel5.add(getJLabelOperatorName());
			jPanel5.add(getJTextFieldOperatorName());
		}
		return jPanel5;
	}

	private JTextField getJTextField1() {

		if (jTextFieldRequestNumber == null) {
			jTextFieldRequestNumber = new JTextField(requestNumber.toString());
			jTextFieldRequestNumber.setEditable(false);
			jTextFieldRequestNumber.setColumns(10);

			jTextFieldRequestNumber.setPreferredSize(new java.awt.Dimension(
					173, 22));
			final Document doc = new CharacterLimitator(10);
			jTextFieldRequestNumber.setDocument(doc);
			jTextFieldRequestNumber.setText(requestNumber.toString());
		}
		return jTextFieldRequestNumber;
	}

	private JTextField getJTextFieldOperatorName() {
		if (jTextFieldOperatorName == null) {
			jTextFieldOperatorName = new JTextField();
			jTextFieldOperatorName.setPreferredSize(new java.awt.Dimension(139,
					22));
			jTextFieldOperatorName.setText("Gowex");
		}
		return jTextFieldOperatorName;
	}

	// private JComboBox getPortalTypeComboBox() {
	// if (jComboBox3 == null) {
	// final ComboBoxModel jComboBox3Model = new DefaultComboBoxModel(
	// new String[] { "Item One", "Item Two" });
	// jComboBox3 = new JComboBox();
	// jComboBox3.setModel(jComboBox3Model);
	// jComboBox3.setPreferredSize(new java.awt.Dimension(142, 22));
	// }
	// return jComboBox3;
	// }

	public JButton getSaveButton() {

		if (jSaveButton == null) {
			jSaveButton = new JButton();
			jSaveButton.setText("Guardar");

			jSaveButton.addMouseListener(new MouseAdapter() {

				/**
				 * @return
				 */
				private PersonTo buildLineRecord() {

					final PersonTo lineRecord = new PersonTo();

					return lineRecord;
				}

				private void jButton1MouseClicked(final MouseEvent evt) {

					final PersonTo lineRecord = buildLineRecord();

					ControllerImpl.getInstance().onEvent(
							new Event(EventType.ADD_RECORD, lineRecord));

				}

				@Override
				public void mouseClicked(final MouseEvent evt) {
					jButton1MouseClicked(evt);
					closeDialog();
				}
			});
		}

		return jSaveButton;
	}

	private JComponent makePanelPersonData() {

		final JPanel panel = new JPanel(false);

		panel.add(getJPanel2());
		panel.add(getJPanel3());
		panel.add(getJPanel1());

		return panel;
	}

	/**
	 * @param tabbedPane
	 * @param icon
	 */
	private void makeRequestDataTab(final JTabbedPane tabbedPane,
			final ImageIcon icon) {

		final JComponent panel1 = makePanelPersonData();

		final FlowLayout panel1Layout = new FlowLayout();
		panel1Layout.setAlignment(FlowLayout.LEFT);
		panel1.setLayout(panel1Layout);

		tabbedPane.addTab("Person data", icon, panel1, "Does nothing");

		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
	}

	protected JComponent makeTextPanel(final String text) {
		final JPanel panel = new JPanel(false);
		final JLabel filler = new JLabel(text);
		filler.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(1, 1));
		panel.add(filler);
		return panel;
	}

}
