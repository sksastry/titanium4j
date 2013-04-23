/**************************************************************************
 * ActivityIndicator.java is part of Titanium4j Mobile 3.0. Copyright 2012
 * Emitrom LLC
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

import com.emitrom.ti4j.core.client.Color;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.handlers.EventHandler;
import com.emitrom.ti4j.mobile.client.ui.interfaces.ColoredElement;
import com.emitrom.ti4j.mobile.client.ui.interfaces.Displayable;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasColor;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasExtremum;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasFont;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasStyle;
import com.emitrom.ti4j.mobile.client.ui.style.Font;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An activity indicator can be used to show the progress of an operation in the
 * ui to let the user know some action is taking place.
 * <p>
 * For iPhone, the style can be set from the constants
 * com.emitrom.gwt.appcelerator
 * .mobile.client.ui.iphone.IPhone.ActivityIndicatorStyle.
 */
public class ActivityIndicator extends View implements HasFont, HasColor, Displayable, ColoredElement, HasStyle,
                HasExtremum {

    public ActivityIndicator() {
        jsObj = UI.createActivityIndicator();
    }

    private ActivityIndicator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The color of the message label
     */
    public native String getColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.color;
    }-*/;

    public void setColor(Color color) {
        setColor(color.getValue());
    }

    public native void setColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.color = value;
    }-*/;

    /**
     * @return The font object for the activity message label
     */
    public native Font getFont() /*-{
		return jso.font;
    }-*/;

    public native void setFont(Font value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.font = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The activity message label text
     */
    public native String getMessage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.message;
    }-*/;

    public native void setMessage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.message = value;
    }-*/;

    /**
     * @return The activity type
     */
    public native int getType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.type;
    }-*/;

    /**
     * @return The activity value
     */
    public native double getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

    public native void setValue(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.value = value;
    }-*/;

    /**
     * @return The activity minimum value
     */
    public native double getMin() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.min;
    }-*/;

    public native void setMin(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.min = value;
    }-*/;

    /**
     * @return The activity maximum value
     */
    public native double getMax() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.min;
    }-*/;

    public native void setMax(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.max = value;
    }-*/;

    /**
     * @return The activity location
     */
    public native int getLocation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.location;
    }-*/;

    /**
     * @return The key in the locale file to use for the message property
     */
    public native String getMessageId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.messageid;
    }-*/;

    public native void setMessageId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.messageid = value;
    }-*/;

    /**
     * @return The style constant of the activity indicator
     */
    public native int getStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.style;
    }-*/;

    public native void setStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.style = value;
    }-*/;

    /**
     * Call hide to make the activity indicator hidden and stop spinning
     */
    public native void hide() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.hide();
    }-*/;

    /**
     * Call show to make the activity indicator visible and start spinning
     */
    public native void show() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.show();
    }-*/;

    @Override
    public String getSelectedColor() {
        return null;
    }

    @Override
    public void setSelectedColor(String value) {

    }

    /**
     * @Android only Fired when the user has canceled the activity indicator
     *          dialog.
     * @param handler
     */
    public void addCancelHandler(EventHandler handler) {
        addEventHandler("cancel", handler);
    }

    public static ActivityIndicator from(ProxyObject proxy) {
        return new ActivityIndicator(proxy.getJsObj());
    }

}
