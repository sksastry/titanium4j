/************************************************************************
  DialogClickEvent.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.core.events.ui.dialog;

import com.emitrom.ti4j.mobile.client.core.events.ui.InteractionEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class DialogClickEvent extends InteractionEvent {

    protected DialogClickEvent() {

    }

    private DialogClickEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * boolean to indicate that the index refers to a button on the dialog and
     * not an item. (AndroidMedia)
     */
    public final native boolean isButton() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.button;
    }-*/;

    /**
     * the index of the destructive button
     */
    public final native int getDestructive() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.destructive;
    }-*/;

}
