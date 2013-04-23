package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.dashboard.DashboardItemClickEvent;
import com.google.gwt.event.shared.EventHandler;

public interface DashboardItemClickHandler extends EventHandler {
    public void onDashboardItemClick(DashboardItemClickEvent event);
}
