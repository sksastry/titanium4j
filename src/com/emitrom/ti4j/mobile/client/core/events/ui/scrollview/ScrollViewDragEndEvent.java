package com.emitrom.ti4j.mobile.client.core.events.ui.scrollview;

import com.google.gwt.core.client.JavaScriptObject;

public class ScrollViewDragEndEvent extends ScrollViewEvent {
	public static final String EVENT_NAME = "dragend";
	

    protected ScrollViewDragEndEvent() {

    }

	private ScrollViewDragEndEvent(JavaScriptObject obj) {
        jsObj = obj;
    }
    
    public final native void stopDecelerating() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.decelerating = false;
    }-*/;
}
