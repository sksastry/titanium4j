package com.emitrom.ti4j.mobile.client.core.events.ui.tableview;

import com.emitrom.ti4j.mobile.client.core.events.ui.InteractionEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TableRowClickHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TableRowDblClickEvent extends InteractionEvent {

    public static String EVENT_NAME = "dblclick";

    /**
     * UiBinder implementations
     */
    private static Type<TableRowClickHandler> TYPE = new Type<TableRowClickHandler>(EVENT_NAME, null);

    public static Type<TableRowClickHandler> getType() {
        return TYPE;
    }

    public static Type<TableRowClickHandler> getAssociatedType() {
        return TYPE;
    }

    protected TableRowDblClickEvent() {

    }

    private TableRowDblClickEvent(JavaScriptObject jso) {
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

}
