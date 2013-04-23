package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.LongPressHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class LongPressEvent extends InteractionEvent {
	public static String EVENT_NAME = "longclick";
	
	/**
	 * UiBinder implementations
	 */
	private static Type<LongPressHandler> TYPE = new Type<LongPressHandler>(EVENT_NAME, null);
	public static Type<LongPressHandler> getType() {
		return TYPE;
	}
	
	public static Type<LongPressHandler> getAssociatedType() {
		return TYPE;
	}
	
	protected LongPressEvent() {
		
	}
	
	private LongPressEvent(JavaScriptObject jso) {
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
