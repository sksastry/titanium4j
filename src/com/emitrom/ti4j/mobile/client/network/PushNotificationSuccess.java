package com.emitrom.ti4j.mobile.client.network;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.events.ErrorResponse;
import com.google.gwt.core.client.JavaScriptObject;

public class PushNotificationSuccess extends ErrorResponse {

    protected PushNotificationSuccess(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * The value of this string is always "remote".
     */
    public String getType() {
        return JsoHelper.getAttribute(jsObj, "type");
    }

    /**
     * The device token which this device was registered for.
     */
    public String getDeviceToken() {
        return JsoHelper.getAttribute(jsObj, "deviceToken");
    }

}
