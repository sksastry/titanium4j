/**************************************************************************
 * TiEvent.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
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

package com.emitrom.ti4j.mobile.client.core.events;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class TiEvent extends ProxyObject {

    public static final String POST_LAYOUT = "postlayout";

    public TiEvent() {
        jsObj = JsoHelper.createObject();
    }

    private TiEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native ProxyObject getSource() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.source;
		var toReturn = @com.emitrom.ti4j.core.client.ProxyObject::create(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void preventDefault() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.preventDefault();
    }-*/;

    public native void stopPropagation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.stopPropagation();
    }-*/;

    /**
     * Changed from getType to getEventType, due to UIBinder clashes
     * 
     * @return
     */
    public native String getEventType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.type;
    }-*/;

    /**
     * True if the event will try to bubble up if possible.
     */
    public native boolean bubbles() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.bubbles;
    }-*/;

    /**
     * Set to true to stop the event from bubbling.
     */
    public native void setCancelBubble(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.cancelBubble = value;
    }-*/;

    public native void setEventData(EventData data) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var attribute = @com.emitrom.ti4j.mobile.client.core.events.EventData::DATA_ATTRIBUTE;
		jso[attribute] = data.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native EventData getEventData() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var attribute = @com.emitrom.ti4j.mobile.client.core.events.EventData::DATA_ATTRIBUTE;
		var toReturn = jso[attribute];
		return @com.emitrom.ti4j.mobile.client.core.events.EventData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

}
