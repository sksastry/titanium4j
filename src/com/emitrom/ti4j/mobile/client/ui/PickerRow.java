/**************************************************************************
   PickerRow.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The picker row object created by
 * com.emitrom.ti4j.mobile.client.ui.UI.createPickerRow.
 */
public class PickerRow extends View {

    public PickerRow() {
        createPeer();
    }

    PickerRow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The font size when displaying the text. ignored when using a
     *         custom view
     */
    public native int getFontSize() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fontSize;
    }-*/;

    public native void setFontSize(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.fontSize = value;
    }-*/;

    /**
     * @return When used in the constructor, set the row to selected on initial
     *         display
     */
    public native boolean isSelected() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.selected;
    }-*/;

    public native void setSelected(boolean value) /*-{
		var jso = jso.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selected = value;
    }-*/;

    /**
     * @return The display text
     */
    public native String getTitle() /*-{
		var jso = jso.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = jso.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createPickerRow();
    }

    public static PickerRow from(ProxyObject proxy) {
        return new PickerRow(proxy.getJsObj());
    }
}
