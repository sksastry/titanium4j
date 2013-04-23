package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.SingleTapHandler;
import com.emitrom.ti4j.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class SingleTapEvent extends InteractionEvent {
	public static String EVENT_NAME = "singletap";

	/**
	 * UiBinder implementations
	 */
	private static Type<SingleTapHandler> TYPE = new Type<SingleTapHandler>(EVENT_NAME, null);
	public static Type<SingleTapHandler> getType() {
		return TYPE;
	}
	
	public static Type<SingleTapHandler> getAssociatedType() {
		return TYPE;
	}
	
	protected SingleTapEvent() {
		
	}
	
	private SingleTapEvent(JavaScriptObject jso) {
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
	
	private native double _getGlobalX() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.globalPoint.x;
	}-*/;
	
	private native double _getGlobalY() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.globalPoint.y;
	}-*/;
	
	public Point getGlobalPoint() {
		return new Point(_getGlobalX(), _getGlobalY());
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
