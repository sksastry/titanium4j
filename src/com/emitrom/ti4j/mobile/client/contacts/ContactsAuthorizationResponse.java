package com.emitrom.ti4j.mobile.client.contacts;

import com.emitrom.ti4j.mobile.client.core.events.ErrorResponse;
import com.google.gwt.core.client.JavaScriptObject;

public class ContactsAuthorizationResponse extends ErrorResponse {

    protected ContactsAuthorizationResponse(JavaScriptObject obj) {
        super(obj);
    }

}
