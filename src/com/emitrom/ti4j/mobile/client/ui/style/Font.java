/**************************************************************************
   Font.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.ui.style;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.Unit;
import com.emitrom.ti4j.mobile.client.ui.UI;
import com.google.gwt.core.client.JavaScriptObject;

public class Font extends ProxyObject {

    public Font() {
        jsObj = JsoHelper.createObject();
    }

    public Font(int fontSize) {
        this();
        setFontSize(fontSize);
    }

    public Font(int fontSize, String fontFamilly) {
        this();
        setFontSize(fontSize);
        setFontFamily(fontFamilly);
        setFontWeight(FontWeight.NORMAL);
    }

    public Font(int fontSize, String fontFamilly, FontWeight fontWeight) {
        this();
        setFontSize(fontSize);
        setFontFamily(fontFamilly);
        setFontWeight(fontWeight);
    }

    public Font(int fontSize, FontWeight fontWeight) {
        this();
        setFontSize(fontSize);
        setFontWeight(fontWeight);
    }

    public Font(String fontSize, String fontFamilly, FontWeight fontWeight) {
        this();
        setFontSize(fontSize);
        setFontFamily(fontFamilly);
        setFontWeight(fontWeight);
    }

    public Font(String fontSize, FontWeight fontWeight) {
        this();
        setFontSize(fontSize);
        setFontWeight(fontWeight);
    }

    private Font(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void setFontFamily(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.fontFamily = value;
    }-*/;

    public native String getFontFamily() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fontFamily;
    }-*/;

    public void setFontWeight(FontWeight fontWeight) {
        this.setFontWeight(fontWeight.value);
    }

    private native void setFontWeight(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.fontWeight = value;
    }-*/;

    public FontWeight getFontWeight() {
        return FontWeight.fromValue(_getFontWeight());
    }

    private native String _getFontWeight() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fontWeight;
    }-*/;

    public FontStyle getFontStyle() {
        return FontStyle.fromValue(_getFontStyle());
    }

    private native String _getFontStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fontStyle;
    }-*/;

    public void setFontStyle(FontStyle fontStyle) {
        this.setFontStyle(fontStyle.value);
    }

    public native int getFontSize() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fontSize;
    }-*/;

    public void setFontSize(int value) {
    	//Android uses PX, DP, PT as size units for fonts
    	//iOS uses PT if you like it or not. 
    	//Set default unit to points then
    	UI.get().setSizePropertyAsString(jsObj, "fontSize", "" + value  + Unit.POINTS);
    }

    private native void _setFontSize(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.fontSize = value;
    }-*/;

    public void setFontSize(String value) {
        UI.get().setSizePropertyAsString(jsObj, "fontSize", value);
    }

    private native void _setFontSize(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.fontSize = value;
    }-*/;

    private native void setFontStyle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.fontStyle = value;
    }-*/;

}
