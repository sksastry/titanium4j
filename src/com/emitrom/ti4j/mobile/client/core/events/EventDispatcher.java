/**************************************************************************
 * EventDispatcher.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom
 * LLC
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

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.handlers.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class of all objects that are able to dispatch events
 * 
 */
public abstract class EventDispatcher extends ProxyObject {

    protected EventDispatcher() {

    }

    private final native void addEventListener(String event, JavaScriptObject listener) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.addEventListener(event, listener);
    }-*/;

    /**
     * Remove a previously added event listener
     * 
     * @param event
     *            , name of the event
     * @param listener
     *            , EventListner passed in addEventListener
     */
    public final void removeEventListner(String event, TiEventListener<? extends TiEvent> listener) {
        removeEventListener(event, listener.getJsoPeer());
    }

    private final native void removeEventListener(String event, JavaScriptObject listener) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.removeEventListener(event, listener);
    }-*/;

    public native void addEventHandler(String event, EventHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						event,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.TiEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.EventHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/TiEvent;)(eventObject);
						});
    }-*/;

    /**
     * Adds an event listener for the instance to receive view triggered events
     * 
     * @param event
     *            , name of the event
     * @param listener
     *            , callback function to invoke when the event is fired
     */
    public void addEventListener(String event, TiEventListener<? extends TiEvent> listener) {
        addEventListener(event, listener.getJsoPeer());
    }

    /**
     * Fires a synthesized event to the views listener
     * 
     * @param name
     *            , name of event
     * @param eventObject
     *            , event object
     */
    public native void fireEvent(String name, TiEvent eventObject) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.fireEvent(
						name,
						eventObject.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public void fireEvent(String eventName) {
        this.fireEvent(eventName, new TiEvent());
    }

}
