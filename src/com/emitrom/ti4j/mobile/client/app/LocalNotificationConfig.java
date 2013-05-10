/************************************************************************
  LocalNotificationConfig.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.app;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

/**
 * Config object for a local notification
 * 
 */
public class LocalNotificationConfig extends ProxyObject {

    public LocalNotificationConfig() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Alert button text ('View', by default) or slider text ('slide to
     * unlock...', by default).
     */
    public native void setAlertAction(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.alertAction = value;
    }-*/;

    /**
     * Alert message.
     */
    public native void setAlertBody(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.alertBody = value;
    }-*/;

    /**
     * Image displayed instead of Default.png when launching the application.
     */
    public native void setAlertLaunchImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.alertLaunchImage = value;
    }-*/;

    /**
     * Date and time when the notification was configured to fire.
     */
    public native void setDate(JsDate value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.date = value;
    }-*/;

    /**
     * Timezone of the date when the notification was configured to fire.
     */
    public native void setTimeZone(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.timezone = value;
    }-*/;

    /**
     * Custom data object.
     */
    public native void setUserInfo(JavaScriptObject value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.userInfo = value;
    }-*/;
}
