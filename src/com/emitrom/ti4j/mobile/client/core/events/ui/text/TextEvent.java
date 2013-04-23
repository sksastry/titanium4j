/**************************************************************************
   TextEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.core.events.ui.text;

import com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class TextEvent extends UIEvent {

    public static final String BLUR = "blur";
    public static final String CHANGE = "change";
    public static final String FOCUS = "focus";
    public static final String RETURN = "return";

    protected TextEvent() {

    }

    private TextEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the value of the field upon blur
     */
    public native String getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

}
