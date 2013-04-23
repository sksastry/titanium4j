/**************************************************************************
   MediaQueryType.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.media;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A full query descriptor for a filtering predicate. Available on iOs only
 */
public class MediaQueryType extends ProxyObject {

    public MediaQueryType() {
        jsObj = JsoHelper.createObject();
    }

    public MediaQueryType(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void setValue(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.value = value;
    }-*/;

    public native void setValue(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.value = value;
    }-*/;

    public native void setValue(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.value = value;
    }-*/;

    /**
     * @return The value for the given predicate. see the descriptions in for
     *         information about which properties require which values.
     */
    public native Object getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

    /**
     * @return Whether or not the predicate is for an exact match. the default
     *         is true.
     */
    public native boolean isExact() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.exact;
    }-*/;

    public native void setExact(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.exact = value;
    }-*/;
}
