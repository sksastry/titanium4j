/************************************************************************
  PushNotificationConfig.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.network;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * Config Object for pushnotification
 * 
 */
public class PushNotificationConfig extends ProxyObject {

    public PushNotificationConfig() {
        jsObj = JsoHelper.createObject();
    }

    public native JsArrayNumber getTypes()/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.types;
    }-*/;

    public native void setTypes(JsArrayNumber values)/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.types = values;
    }-*/;

    /**
     * Callback function invoked upon receiving a new push notification.
     * 
     * @param callback
     */
    public native void setCallback(PushNotificationCallback callback)/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.callback = function(d) {
			var data = @com.emitrom.ti4j.mobile.client.network.PushNotificationData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(d);
			callback.@com.emitrom.ti4j.mobile.client.network.PushNotificationCallback::onReceived(Lcom/emitrom/ti4j/mobile/client/network/PushNotificationData;)(data);
		};

		obj.error = function(e) {
			var error = @com.emitrom.ti4j.mobile.client.network.PushNotificationError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(d);
			callback.@com.emitrom.ti4j.mobile.client.network.PushNotificationCallback::onError(Lcom/emitrom/ti4j/mobile/client/network/PushNotificationError;)(error);
		};

		obj.success = function(s) {
			var success = @com.emitrom.ti4j.mobile.client.network.PushNotificationSuccess::new(Lcom/google/gwt/core/client/JavaScriptObject;)(d);
			callback.@com.emitrom.ti4j.mobile.client.network.PushNotificationCallback::onSuccess(Lcom/emitrom/ti4j/mobile/client/network/PushNotificationSuccess;)(success);
		};
    }-*/;

}
