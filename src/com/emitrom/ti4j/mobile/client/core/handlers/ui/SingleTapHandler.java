package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.SingleTapEvent;
import com.google.gwt.event.shared.EventHandler;

public interface SingleTapHandler extends EventHandler {
	public void onSingleTap(SingleTapEvent event);
}
