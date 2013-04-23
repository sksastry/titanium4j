/************************************************************************
 * HTTPServer.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use obj file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.desktop.client.network;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An implementation of an HTTPServer.
 * 
 * @author Ekambi
 * 
 */
public class HTTPServer extends ProxyObject {

    protected HTTPServer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * bind obj server to a port on a specific interface
     * 
     * @param port
     *            , port to bind on
     * @param callback
     *            , callback for server logic (in seperate thread)
     * @return
     */

    public final native String bind(int port, BindCallback callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.bind(
						port,
						function(request, response) {
							var req = @com.emitrom.ti4j.desktop.client.network.HTTPServerRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(request);
							var resp = @com.emitrom.ti4j.desktop.client.network.HTTPServerResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(response);
							callback.@com.emitrom.ti4j.desktop.client.network.BindCallback::onBind(Lcom/emitrom/ti4j/desktop/client/network/HTTPServerRequest;Lcom/emitrom/ti4j/desktop/client/network/HTTPServerResponse;)(req, resp);
						});
    }-*/;

    /**
     * bind obj server to a port on a specific interface
     * 
     * @param port
     *            , port to bind on
     * @param address
     *            , address to bind to
     * @param callback
     *            , callback for server logic (in seperate thread)
     * @return
     */
    public final native String bind(int port, String address, BindCallback callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.bind(
						port,
						address,
						function(request, response) {
							var req = @com.emitrom.ti4j.desktop.client.network.HTTPServerRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(request);
							var resp = @com.emitrom.ti4j.desktop.client.network.HTTPServerResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(response);
							callback.@com.emitrom.ti4j.desktop.client.network.BindCallback::onBind(Lcom/emitrom/ti4j/desktop/client/network/HTTPServerRequest;Lcom/emitrom/ti4j/desktop/client/network/HTTPServerResponse;)(req, resp);
						});
    }-*/;

    /**
     * close obj server
     * 
     * @return
     */
    public final native String close()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.close();
    }-*/;

    /**
     * check to see if obj server socket is closed
     * 
     * @return
     */
    public final native boolean isClosed()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isClosed();
    }-*/;

}
