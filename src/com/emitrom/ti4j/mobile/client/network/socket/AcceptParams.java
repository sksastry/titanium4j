/**************************************************************************
   AcceptParams.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

public class AcceptParams extends ProxyObject {

    /**
     * Creates a new, empty instance of AcceptParams
     */
    public AcceptParams() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * @return The timeout for connect() and all i/o write() operations. cannot
     *         be modified when not in the initialized state
     */
    public native double getTimeout() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return this.timeout;
    }-*/;

    public native void setTimeout(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.timeout = value;
    }-*/;

    /**
     * @return The callback to be fired after the socket enters the error state
     */
    public native void setError(ErrorCallback callback) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.error = function(e) {
			var obj = @com.emitrom.ti4j.mobile.client.network.socket.ErrorCallbackArgs::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			callback.@com.emitrom.ti4j.mobile.client.network.socket.ErrorCallback::onError(Lcom/emitrom/ti4j/mobile/client/network/socket/ErrorCallbackArgs;)(obj);
		};
    }-*/;

}
