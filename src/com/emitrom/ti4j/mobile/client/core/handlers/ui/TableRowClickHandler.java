package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableRowClickEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TableRowClickHandler extends EventHandler {
    public void onTableRowClick(TableRowClickEvent event);
}
