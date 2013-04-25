package com.emitrom.ti4j.mobile.modules.facebook.client;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.events.ErrorResponse;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Argument passed to the reauthorize callback when the request is completed or
 * canceled.
 * 
 */
public class FBReauthResponse extends ErrorResponse {

    protected FBReauthResponse(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Indicates if the user canceled the dialog.
     */
    public boolean isCancelled() {
        return JsoHelper.getAttributeAsBoolean(jsObj, "cancelled");
    }

}
