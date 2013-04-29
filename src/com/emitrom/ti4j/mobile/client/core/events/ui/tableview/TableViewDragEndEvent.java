package com.emitrom.ti4j.mobile.client.core.events.ui.tableview;

import com.emitrom.ti4j.mobile.client.core.events.ui.InteractionEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TableViewDragEndHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TableViewDragEndEvent extends InteractionEvent {

    public static String EVENT_NAME = "dragend";

    /**
     * UiBinder implementations
     */
    private static Type<TableViewDragEndHandler> TYPE = new Type<TableViewDragEndHandler>(EVENT_NAME, null);

    public static Type<TableViewDragEndHandler> getType() {
        return TYPE;
    }

    public static Type<TableViewDragEndHandler> getAssociatedType() {
        return TYPE;
    }

    protected TableViewDragEndEvent() {

    }

    private TableViewDragEndEvent(JavaScriptObject jso) {
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
