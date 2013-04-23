package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.TiEvent;
import com.google.gwt.event.shared.EventHandler;

public interface PostLayoutEventHandler extends EventHandler {
	public void onPostLayout(TiEvent event);
}
