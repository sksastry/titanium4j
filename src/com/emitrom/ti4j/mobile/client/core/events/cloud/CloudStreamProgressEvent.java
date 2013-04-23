/**************************************************************************
   CloudStreamProgressEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.core.events.cloud;

import com.emitrom.ti4j.mobile.client.core.events.TiEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.cloud.CloudStreamHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

/**
 * Argument passed to the callback as a request is transmitted or received.
 */
public class CloudStreamProgressEvent extends TiEvent {


	/**
	 * UiBinder implementations
	 */
	private static Type<CloudStreamHandler> TYPE = new Type<CloudStreamHandler>("cloudstream", null);
	public static Type<CloudStreamHandler> getType() {
		return TYPE;
	}
	
	public static Type<CloudStreamHandler> getAssociatedType() {
		return TYPE;
	}
	
    CloudStreamProgressEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * A value from 0.0-1.0 with the progress of the exchange.
     * 
     * @return
     */
    public native double getProgress()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.progress;
    }-*/;

    /**
     * The URL for the request, to help you identify it.
     * 
     * @return
     */
    public native String getUrl()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.url;
    }-*/;

}
