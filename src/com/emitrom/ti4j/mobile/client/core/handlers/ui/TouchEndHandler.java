package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.TouchEndEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TouchEndHandler extends EventHandler {
	public void onTouchEnd(TouchEndEvent event);
}
