/**************************************************************************
   BarElement.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client.ui.ios;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Element to use in com.emitrom.ti4j.mobile.client.ui.ButtonBar
 */
public class BarElement extends ProxyObject {

    public BarElement() {
        jsObj = JsoHelper.createObject();
    }

    BarElement(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setImage(Object value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.image = value;
    }-*/;

    public native <T> T getImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.image;
    }-*/;

    public native void setWidth(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.width = value;
    }-*/;

    public native double getWidth() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.width;
    }-*/;

    public native boolean isEnabled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.enabled;
    }-*/;

    public native void setEnabled(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.enabled = value;
    }-*/;

    public static BarElement from(ProxyObject proxy) {
        return new BarElement(proxy.getJsObj());
    }

}
