/************************************************************************
  DeleteEvent.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
**************************************************************************/

package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.HideHandler;
import com.emitrom.ti4j.mobile.client.ui.DashboardItem;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class DeleteEvent extends UIEvent {

    public static String DELETE = "delete";

    /**
     * UiBinder implementations
     */
    private static Type<HideHandler> TYPE = new Type<HideHandler>(DELETE, null);

    public static Type<HideHandler> getType() {
        return TYPE;
    }

    public static Type<HideHandler> getAssociatedType() {
        return TYPE;
    }

    protected DeleteEvent() {

    }

    private DeleteEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Item that was deleted.
     */
    public native DashboardItem getItem() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.item;
		return @com.emitrom.ti4j.mobile.client.ui.DashboardItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
