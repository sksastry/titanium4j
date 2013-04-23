package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.TouchCancelEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TouchCancelHandler extends EventHandler {
	public void onCancel(TouchCancelEvent event);
}
