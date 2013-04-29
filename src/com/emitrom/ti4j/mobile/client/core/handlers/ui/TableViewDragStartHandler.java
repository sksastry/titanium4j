package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewDragStartEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TableViewDragStartHandler extends EventHandler {
    public void onTableViewDragStart(TableViewDragStartEvent event);
}
