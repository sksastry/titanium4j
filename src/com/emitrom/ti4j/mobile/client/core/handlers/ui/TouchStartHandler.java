package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.TouchStartEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TouchStartHandler extends EventHandler {
	public void onTouchStart(TouchStartEvent event);
}
