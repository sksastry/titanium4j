package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.LongPressEvent;
import com.google.gwt.event.shared.EventHandler;

public interface LongPressHandler extends EventHandler {
	public void onLongPress(LongPressEvent event);
}
