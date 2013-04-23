package com.emitrom.ti4j.mobile.client.core.events.ui.scrollview;

import com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class ScrollViewDragStartEvent extends UIEvent {
	public static final String EVENT_NAME = "dragstart";

    protected ScrollViewDragStartEvent() {

    }

	public ScrollViewDragStartEvent(JavaScriptObject obj) {
        jsObj = obj;
    }
	
}
