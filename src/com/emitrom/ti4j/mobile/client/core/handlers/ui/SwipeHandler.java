package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.SwipeEvent;
import com.google.gwt.event.shared.EventHandler;

public interface SwipeHandler extends EventHandler {
	public void onSwipe(SwipeEvent swipeEvent);
}
