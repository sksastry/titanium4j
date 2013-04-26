package com.emitrom.ti4j.mobile.modules.gmap.client;

import com.emitrom.ti4j.mobile.client.core.events.TiEvent;
import com.emitrom.ti4j.mobile.client.core.events.ui.ClickEvent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

/**
 * Fired when the mapping region changes.
 */
public class RegionChangedEvent extends TiEvent {

    public static String EVENT_NAME = "regionchanged";

    /**
     * UiBinder implementations
     */
    private static Type<RegionChangedHandler> TYPE = new Type<RegionChangedHandler>(EVENT_NAME, null);

    public static Type<RegionChangedHandler> getType() {
        return TYPE;
    }

    public static Type<RegionChangedHandler> getAssociatedType() {
        return TYPE;
    }

    protected RegionChangedEvent() {

    }

    private RegionChangedEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    public native double getLatitude() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.latitude;
    }-*/;

    public native double getLongitude() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.longitude;
    }-*/;

    public static RegionChangedEvent cast(ClickEvent event) {
        return new RegionChangedEvent(event.getJsObj());
    }

}
