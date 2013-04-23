package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.scrollview.ScrollViewDragStartEvent;
import com.google.gwt.event.shared.EventHandler;

public interface ScrollViewDragStartHandler extends EventHandler {
	public void onDragStart(ScrollViewDragStartEvent event);
}
