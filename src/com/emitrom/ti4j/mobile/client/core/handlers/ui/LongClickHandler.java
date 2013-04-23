package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.LongClickEvent;
import com.google.gwt.event.shared.EventHandler;

public interface LongClickHandler extends EventHandler {
	public void onLongClick(LongClickEvent event);
}
