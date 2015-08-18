package com.unique.patterns;

import com.unique.types.EventType;

public class Event {

  private EventType eventType;
  private Object value;

  public Event() {
  }

  /**
   * @param eventType
   * @param value
   */
  public Event(final EventType eventType, final Object value) {
    this.eventType = eventType;
    this.value = value;
  }

  /**
   * @return the eventType
   */
  public EventType getEventType() {
    return eventType;
  }

  /**
   * @return the value
   */
  public Object getValue() {
    return value;
  }

  /**
   * @param eventType
   *          the eventType to set
   */
  public void setEventType(final EventType eventType) {
    this.eventType = eventType;
  }

  /**
   * @param value
   *          the value to set
   */
  public void setValue(final Object value) {
    this.value = value;
  }
}
