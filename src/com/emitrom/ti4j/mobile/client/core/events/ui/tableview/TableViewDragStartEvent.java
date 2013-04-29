package com.emitrom.ti4j.mobile.client.core.events.ui.tableview;

import com.emitrom.ti4j.mobile.client.core.events.ui.InteractionEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TableViewDragStartHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TableViewDragStartEvent extends InteractionEvent {

    public static String EVENT_NAME = "dragstart";

    /**
     * UiBinder implementations
     */
    private static Type<TableViewDragStartHandler> TYPE = new Type<TableViewDragStartHandler>(EVENT_NAME, null);

    public static Type<TableViewDragStartHandler> getType() {
        return TYPE;
    }

    public static Type<TableViewDragStartHandler> getAssociatedType() {
        return TYPE;
    }

    protected TableViewDragStartEvent() {

    }

    private TableViewDragStartEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    /**
     * Indicates whether scrolling will continue but decelerate, now that the
     * drag gesture has been released by the touch. If false, scrolling will
     * stop immediately.
     */
    public native boolean decelerate() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.decelerate;
    }-*/;

}
