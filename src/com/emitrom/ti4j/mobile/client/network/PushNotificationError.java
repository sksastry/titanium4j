package com.emitrom.ti4j.mobile.client.network;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.events.ErrorResponse;
import com.google.gwt.core.client.JavaScriptObject;

public class PushNotificationError extends ErrorResponse {

    protected PushNotificationError(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * The value of this string is always "remote".
     */
    public String getType() {
        return JsoHelper.getAttribute(jsObj, "type");
    }

}
