package com.emitrom.ti4j.mobile.client.core.events.ui.dashboard;

import com.emitrom.ti4j.mobile.client.core.events.ui.InteractionEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.DashboardItemClickHandler;
import com.emitrom.ti4j.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class DashboardItemClickEvent extends InteractionEvent {
    public static String EVENT_NAME = "click";

    /**
     * UiBinder implementations
     */
    private static Type<DashboardItemClickHandler> TYPE = new Type<DashboardItemClickHandler>(EVENT_NAME, null);

    public static Type<DashboardItemClickHandler> getType() {
        return TYPE;
    }

    public static Type<DashboardItemClickHandler> getAssociatedType() {
        return TYPE;
    }

    protected DashboardItemClickEvent() {

    }

    private DashboardItemClickEvent(JavaScriptObject jso) {
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

    public native boolean bubbleCanceled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.cancelBubble;
    }-*/;
}
