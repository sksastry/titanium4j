package com.emitrom.ti4j.mobile.client.core.handlers.ui;

import com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableRowDblClickEvent;
import com.google.gwt.event.shared.EventHandler;

public interface TableRowDblClickHandler extends EventHandler {
    public void onTableRowDblClick(TableRowDblClickEvent event);
}
