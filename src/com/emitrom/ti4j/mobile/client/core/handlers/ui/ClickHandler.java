package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.ClickEvent;
import com.google.gwt.event.shared.EventHandler;

public interface ClickHandler extends EventHandler {
	public void onClick(ClickEvent event);
}
