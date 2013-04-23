package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.scrollview.ScrollViewDragEndEvent;
import com.google.gwt.event.shared.EventHandler;

public interface ScrollViewDragEndHandler extends EventHandler {
	public void onDragEnd(ScrollViewDragEndEvent event);
}
