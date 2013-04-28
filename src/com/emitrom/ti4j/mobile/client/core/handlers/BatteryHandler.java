package com.emitrom.ti4j.mobile.client.core.handlers;

import com.emitrom.ti4j.mobile.client.core.events.battery.BatteryEvent;
import com.google.gwt.event.shared.EventHandler;

public interface BatteryHandler extends EventHandler {
    public void onBattery(BatteryEvent event);
}
