/*
 * DesktopApplication1.java
 */

package com.unique.frame;

import javax.swing.JFrame;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

import com.unique.controller.Controller;
import com.unique.controller.ControllerImpl;
import com.unique.facade.FacadeUnique;
import com.unique.facade.FacadeUniqueImpl;

/**
 * The main class of the application.
 */
public class DesktopApplication1 extends SingleFrameApplication {

	private FacadeUnique facadeUnique;
	
  /**
   * A convenient static getter for the application instance.
   * 
   * @return the instance of DesktopApplication1
   */
  public static DesktopApplication1 getApplication() {
    return Application.getInstance(DesktopApplication1.class);
  }

  /**
   * Main method launching the application.
   */
  public static void main(final String[] args) {
    launch(DesktopApplication1.class, args);
  }

  /**
   * This method is to initialize the specified window by injecting resources.
   * Windows shown in our application come fully initialized from the GUI
   * builder, so this additional configuration is not needed.
   */
  @Override
  protected void configureWindow(final java.awt.Window root) {

  }

  /**
   * At startup create and show the main frame of the application.
   */
  @Override
  protected void startup() {

    final Controller controllerImpl = ControllerImpl.getInstance();

    final JFrame mainFrame = new UniqueFrame(controllerImpl.getTableModel());

    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    controllerImpl.addView("UniqueFrame", mainFrame);
    
    facadeUnique = new FacadeUniqueImpl();

    setMainFrame(mainFrame);

    show(mainFrame);
  }
}
