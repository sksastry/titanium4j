package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchEndHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TouchEndEvent extends InteractionEvent {
	public static String EVENT_NAME = "touchend";

	/**
	 * UiBinder implementations
	 */
	private static Type<TouchEndHandler> TYPE = new Type<TouchEndHandler>(EVENT_NAME, null);
	public static Type<TouchEndHandler> getType() {
		return TYPE;
	}
	
	public static Type<TouchEndHandler> getAssociatedType() {
		return TYPE;
	}
	
	protected TouchEndEvent() {
		
	}
	
	private TouchEndEvent(JavaScriptObject jso) {
		this.jsObj = jso;
	}

	public native double getX() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.x;
	}-*/; 
	
	public native double getY() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.y;
	}-*/;
	
	public native boolean bubbles() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.bubbles;
	}-*/;
	
	public native boolean bubbleCanceled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.cancelBubble;
	}-*/;
}
