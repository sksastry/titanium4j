package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.handlers.EventHandler;

public class TemplateEvent extends ProxyObject {

    public TemplateEvent() {
        jsObj = JsoHelper.createObject();
    }

    public native void addHandler(String event, EventHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso[event] = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.TiEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.EventHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/TiEvent;)(eventObject);
		}
    }-*/;

}
