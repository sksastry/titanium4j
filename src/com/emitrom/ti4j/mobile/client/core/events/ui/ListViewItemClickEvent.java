package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.ListViewItemClickHandler;
import com.emitrom.ti4j.mobile.client.ui.ListSection;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ListViewItemClickEvent extends InteractionEvent {

    public static String EVENT_NAME = "itemclick";

    /**
     * UiBinder implementations
     */
    private static Type<ListViewItemClickHandler> TYPE = new Type<ListViewItemClickHandler>(EVENT_NAME, null);

    public static Type<ListViewItemClickHandler> getType() {
        return TYPE;
    }

    public static Type<ListViewItemClickHandler> getAssociatedType() {
        return TYPE;
    }

    protected ListViewItemClickEvent() {

    }

    protected ListViewItemClickEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    public native boolean accessoryClicked() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.accessoryClicked;
    }-*/;

    public native String getBinId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.bindId;
    }-*/;

    public native String getItemId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.itemId;
    }-*/;

    public native int getItemIndex() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.itemIndex;
    }-*/;

    public native ListSection getSection() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.section;
		return @com.emitrom.ti4j.mobile.client.ui.ListSection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getSectionIndex() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.sectionIndex;
    }-*/;

    public native String getEventType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.type;
    }-*/;

}
