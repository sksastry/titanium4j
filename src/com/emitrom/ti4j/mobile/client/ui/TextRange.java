/**************************************************************************
 * TextRange.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
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

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class TextRange extends ProxyObject {

    public TextRange() {
        jsObj = JsoHelper.createObject();
    }

    TextRange(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native double getLength() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.length;
    }-*/;

    public native Point getLocation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public static TextRange from(ProxyObject proxy) {
        return new TextRange(proxy.getJsObj());
    }
}
