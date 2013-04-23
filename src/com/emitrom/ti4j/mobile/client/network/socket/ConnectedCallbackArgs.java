/**************************************************************************
   ConnectedCallbackArgs.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.network.socket;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class ConnectedCallbackArgs extends ProxyObject {

    public ConnectedCallbackArgs() {
        jsObj = JsoHelper.createObject();
    }

    private ConnectedCallbackArgs(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Socket that experienced the error
     */
    public native TCP getSocket() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.socket;
		var toReturn = @com.emitrom.ti4j.mobile.client.network.socket.TCP::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setSocket(TCP value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.socket = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

}
