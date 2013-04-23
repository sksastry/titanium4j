package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.LongClickHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class LongClickEvent extends InteractionEvent {
	public static String EVENT_NAME = "longclick";
	

	/**
	 * UiBinder implementations
	 */
	private static Type<LongClickHandler> TYPE = new Type<LongClickHandler>(EVENT_NAME, null);
	public static Type<LongClickHandler> getType() {
		return TYPE;
	}
	
	public static Type<LongClickHandler> getAssociatedType() {
		return TYPE;
	}
	
	
	protected LongClickEvent() {
		
	}
	
	
	private LongClickEvent(JavaScriptObject jso) {
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
