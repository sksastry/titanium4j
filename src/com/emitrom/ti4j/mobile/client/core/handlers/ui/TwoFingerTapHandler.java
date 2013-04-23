package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.TwoFingerTapEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TwoFingerTapHandler extends EventHandler {
	public void onTwoFingerTap(TwoFingerTapEvent event);

}
