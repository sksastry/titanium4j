/************************************************************************
  PushNotificationData.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A simple object representing a push notification.
 * 
 */
public class PushNotificationData extends ProxyObject {

    protected PushNotificationData(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The userinfo dictionary passed to the Apple Push Notification Service.
     * <p>
     * For more information, see the following item in the iOS Developer
     * Library:
     * <p>
     * application:didReceiveRemoteNotification in the UIApplicationDelegate
     * Protocol Reference
     * 
     * @return
     */
    public native JavaScriptObject getData()/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.data;
    }-*/;

    public native boolean inBackground()/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.inBackground;
    }-*/;

}
