package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchCancelHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TouchCancelEvent extends InteractionEvent {
	public static String EVENT_NAME = "touchcancel";

	/**
	 * UiBinder implementations
	 */
	private static Type<TouchCancelHandler> TYPE = new Type<TouchCancelHandler>(EVENT_NAME, null);
	public static Type<TouchCancelHandler> getType() {
		return TYPE;
	}
	
	public static Type<TouchCancelHandler> getAssociatedType() {
		return TYPE;
	}
	
	protected TouchCancelEvent() {
		
	}
	
	private TouchCancelEvent(JavaScriptObject jso) {
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

}
