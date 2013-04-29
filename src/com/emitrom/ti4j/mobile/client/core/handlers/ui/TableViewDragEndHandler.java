package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewDragEndEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TableViewDragEndHandler extends EventHandler {
    public void onTableViewDragEnd(TableViewDragEndEvent event);
}
