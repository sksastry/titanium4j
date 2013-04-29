package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableRowDeleteEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TableRowDeleteHandler extends EventHandler {
    public void onTableRowDelete(TableRowDeleteEvent event);
}
