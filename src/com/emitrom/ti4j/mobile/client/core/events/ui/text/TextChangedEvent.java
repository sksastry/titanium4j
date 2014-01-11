/************************************************************************
  TextChangedEvent.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.core.events.ui.text;

import com.emitrom.ti4j.mobile.client.core.events.ui.InteractionEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TextChangedHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TextChangedEvent extends InteractionEvent {
   public static String EVENT_NAME = "change";

    /**
     * UiBinder implementations
     */
    private static Type<TextChangedHandler> TYPE = new Type<TextChangedHandler>(EVENT_NAME, null);

    public static Type<TextChangedHandler> getType() {
        return TYPE;
    }

    public static Type<TextChangedHandler> getAssociatedType() {
        return TYPE;
    }

    protected TextChangedEvent() {

    }

    private TextChangedEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

	public native boolean bubbles() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.bubbles;
	}-*/;
	
	public native boolean bubbleCanceled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.cancelBubble;
    }-*/;

    /**
     * the value of the field upon blur
     */
    public native String getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

}
