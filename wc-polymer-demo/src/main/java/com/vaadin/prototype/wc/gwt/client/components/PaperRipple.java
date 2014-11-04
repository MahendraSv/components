package com.vaadin.prototype.wc.gwt.client.components;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.BodyElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.user.client.EventListener;
import com.vaadin.prototype.wc.gwt.client.html.*;

@JsType(prototype = "HTMLElement", isNative = true)
public interface PaperRipple extends HTMLElement  {
  Class<?>[] dependencies = new Class<?>[]{};


  /**
   * The initial opacity set on the wave.
   *
   * @attribute initialOpacity
   * @type number
   */
  @JsProperty PaperRipple initialOpacity(double val);
  @JsProperty double initialOpacity();

  /**
   * How fast (opacity per second) the wave fades out.
   *
   * @attribute opacityDecayVelocity
   * @type number
   */
  @JsProperty PaperRipple opacityDecayVelocity(double val);
  @JsProperty double opacityDecayVelocity();

}
