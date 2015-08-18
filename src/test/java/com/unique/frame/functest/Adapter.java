package com.unique.frame.functest;

import org.uispec4j.Trigger;
import org.uispec4j.UISpecAdapter;
import org.uispec4j.Window;
import org.uispec4j.interception.WindowInterceptor;

import com.unique.frame.DesktopApplication1;

public class Adapter implements UISpecAdapter {

  private Window window;

  public Window getMainWindow() {
    if (window == null) {
      window = WindowInterceptor.run(new Trigger() {

        public void run() throws Exception {
          DesktopApplication1.main(new String[0]);
        }
      });
    }
    return window;
  }
}
