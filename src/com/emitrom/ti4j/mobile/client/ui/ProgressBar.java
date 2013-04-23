/**************************************************************************
 * ProgressBar.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.ui.interfaces.ColoredElement;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasExtremum;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasFont;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasStyle;
import com.emitrom.ti4j.mobile.client.ui.interfaces.MessageElement;
import com.emitrom.ti4j.mobile.client.ui.style.Color;
import com.emitrom.ti4j.mobile.client.ui.style.Font;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A progress bar object.
 * <p>
 * 
 * Notes: For iPhone, progress bar styles are constants defined in
 * com.emitrom.ti4j.mobile.client.ui.iphone.IPhone.ProgressBarStyle).
 */
public class ProgressBar extends View implements MessageElement, HasStyle, ColoredElement, HasFont, HasExtremum {

    public ProgressBar() {
        createPeer();
    }

    ProgressBar(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The color of the progress bar text
     */
    public native String getColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		return jso.color;
    }-*/;

    public native void setColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		jso.color = value;
    }-*/;

    /**
     * sets the color of the progress
     * 
     * @param color
     */
    public void setColor(Color color) {
        setColor(color.getRgb());
    }

    /**
     * @return The font object for the progress bar text
     */
    public native Font getFont() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		var obj = jso.font;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.style.Font::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setFont(Font value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		jso.font = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasExtremum#getMax()
     */
    @Override
    public native double getMax() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		return jso.max;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasExtremum#setMax(double)
     */
    @Override
    public native void setMax(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		jso.max = value;
    }-*/;

    /**
     * @return The progress bar message
     */
    public native String getMessage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		return jso.message;
    }-*/;

    public native void setMessage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		jso.message = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasExtremum#getMin()
     */
    @Override
    public native double getMin() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		return jso.min;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasExtremum#setMin(double)
     */
    @Override
    public native void setMin(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		jso.min = value;
    }-*/;

    /**
     * @return The style of the progress bar
     */
    public native int getStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		return jso.style;
    }-*/;

    public native void setStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		jso.style = value;
    }-*/;

    /**
     * @return The current value of the progress bar
     */
    public native double getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		return jso.value;
    }-*/;

    public native void setValue(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		jso.value = value;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createProgressBar();
    }

    public static ProgressBar from(ProxyObject proxy) {
        return new ProgressBar(proxy.getJsObj());
    }

}
