package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.DoubleClickEvent;
import com.google.gwt.event.shared.EventHandler;

public interface DoubleClickHandler extends EventHandler {
	public void onDoubleClick(DoubleClickEvent event);
}
