package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.TouchMoveEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TouchMoveHandler extends EventHandler {
	public void onTouchMove(TouchMoveEvent event);
}
