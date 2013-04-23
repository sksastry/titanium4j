/**************************************************************************
   ShadowOffset.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

public class ShadowOffset extends ProxyObject {

    public ShadowOffset() {
        jsObj = JsoHelper.createObject();
    }

    public ShadowOffset(int x, int y) {
        this();
        setX(x);
        setY(x);
    }

    public ShadowOffset(String x, String y) {
        this();
        setX(x);
        setY(x);
    }

    public ShadowOffset(String x, String y, Unit unit) {
        this();
        setX(x, unit);
        setY(x, unit);
    }

    private ShadowOffset(JavaScriptObject obj) {
        jsObj = obj;
    }

    public void setX(int value) {
        UI.get().setSizePropertyAsDouble(jsObj, "x", value);
    }

    public void setX(String value) {
        UI.get().setSizePropertyAsString(jsObj, "x", value);
    }

    public void setX(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "x", value, unit);
    }

    public void setY(int value) {
        UI.get().setSizePropertyAsDouble(jsObj, "y", value);
    }

    public void setY(String value) {
        UI.get().setSizePropertyAsString(jsObj, "y", value);
    }

    public void setY(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "y", value, unit);
    }

    public native <T> T getX() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.x;
    }-*/;

    public native <T> T getY() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.y;
    }-*/;

}
