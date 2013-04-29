package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableRowDoubleTapEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TableRowDoubleTapHandler extends EventHandler {
    public void onTableRowDoubleTap(TableRowDoubleTapEvent event);
}
