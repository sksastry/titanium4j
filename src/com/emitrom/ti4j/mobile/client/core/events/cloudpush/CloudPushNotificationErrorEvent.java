/**************************************************************************
   CloudPushNotificationErrorEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.core.events.cloudpush;

import com.emitrom.ti4j.mobile.client.cloudpush.CloudPushNotificationErrorHandler;
import com.emitrom.ti4j.mobile.client.core.events.TiEvent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

/**
 * An event object passed to the retrieveDeviceToken error callback.
 */
public class CloudPushNotificationErrorEvent extends TiEvent {

	/**
	 * UiBinder implementations
	 */
	private static Type<CloudPushNotificationErrorHandler> TYPE = new Type<CloudPushNotificationErrorHandler>("cloudpushnotificationerror", null);
	public static Type<CloudPushNotificationErrorHandler> getType() {
		return TYPE;
	}
	
	public static Type<CloudPushNotificationErrorHandler> getAssociatedType() {
		return TYPE;
	}
	
    public CloudPushNotificationErrorEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The description of the error
     * 
     * @return
     */
    public native String getError()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.error;
    }-*/;

}
