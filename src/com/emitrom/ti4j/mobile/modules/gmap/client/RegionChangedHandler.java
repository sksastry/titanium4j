package com.emitrom.ti4j.mobile.modules.gmap.client;

import com.google.gwt.event.shared.EventHandler;

public interface RegionChangedHandler extends EventHandler {
    public void onRegionChanged(RegionChangedEvent event);
}
