package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.ListViewItemClickEvent;
import com.google.gwt.event.shared.EventHandler;

public interface ListViewItemClickHandler extends EventHandler {
    public void onListViewItemClick(ListViewItemClickEvent event);
}
