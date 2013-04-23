/**************************************************************************
   CloudClientsResponse.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.clients;

import com.emitrom.ti4j.mobile.client.cloud.core.AbstractHandlerResponse;
import com.google.gwt.core.client.JavaScriptObject;

public class CloudClientsResponse extends AbstractHandlerResponse {

    public CloudClientsResponse(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native String getIpAddress()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.ip_address;
    }-*/;

    public native Location getLocation()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = peer.location;
		return @com.emitrom.ti4j.mobile.client.cloud.clients.Location::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
