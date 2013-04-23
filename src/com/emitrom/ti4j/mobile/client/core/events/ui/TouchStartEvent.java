package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchStartHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TouchStartEvent extends InteractionEvent {
	public static String EVENT_NAME = "touchstart";

	/**
	 * UiBinder implementations
	 */
	private static Type<TouchStartHandler> TYPE = new Type<TouchStartHandler>(EVENT_NAME, null);
	public static Type<TouchStartHandler> getType() {
		return TYPE;
	}
	
	public static Type<TouchStartHandler> getAssociatedType() {
		return TYPE;
	}
	
	protected TouchStartEvent() {
		
	}
	
	private TouchStartEvent(JavaScriptObject jso) {
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
