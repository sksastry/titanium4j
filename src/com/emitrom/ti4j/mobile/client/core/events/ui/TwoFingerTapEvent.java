package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.TwoFingerTapHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TwoFingerTapEvent extends InteractionEvent {
	public static String EVENT_NAME = "twofingertap";

	/**
	 * UiBinder implementations
	 */
	private static Type<TwoFingerTapHandler> TYPE = new Type<TwoFingerTapHandler>(EVENT_NAME, null);
	public static Type<TwoFingerTapHandler> getType() {
		return TYPE;
	}
	
	public static Type<TwoFingerTapHandler> getAssociatedType() {
		return TYPE;
	}
	
	protected TwoFingerTapEvent() {
		
	}
	
	private TwoFingerTapEvent(JavaScriptObject jso) {
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
