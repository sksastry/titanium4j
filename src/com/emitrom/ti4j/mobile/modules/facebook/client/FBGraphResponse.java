package com.emitrom.ti4j.mobile.modules.facebook.client;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.events.ErrorResponse;
import com.google.gwt.core.client.JavaScriptObject;

public class FBGraphResponse extends ErrorResponse {

    protected FBGraphResponse(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Graph API path of the original request.
     */
    public String getPath(String value) {
        return JsoHelper.getAttribute(jsObj, "path");
    }

    /**
     * If successful, returns the JSON response returned by Facebook. If the
     * request is not successfully completed, the result is undefined.
     */
    public String getResult() {
        return JsoHelper.getAttribute(jsObj, "result");
    }

}
