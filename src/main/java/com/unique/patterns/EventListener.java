package com.unique.patterns;

import com.unique.types.ControllerResponseType;

public interface EventListener {

  /**
   * Manage events
   * 
   * @param event
   *          The event generated
   */
  ControllerResponseType onEvent(Event event);

}