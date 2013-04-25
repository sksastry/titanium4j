package com.emitrom.ti4j.mobile.modules.facebook.client;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.events.ErrorResponse;
import com.google.gwt.core.client.JavaScriptObject;

public class FBRestResponse extends ErrorResponse {

    protected FBRestResponse(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * REST method call you specified.
     */
    public String getMethod(String value) {
        return JsoHelper.getAttribute(jsObj, "method");
    }

    public String getResult() {
        return JsoHelper.getAttribute(jsObj, "result");
    }

}
