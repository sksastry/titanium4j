package com.emitrom.ti4j.mobile.modules.facebook.client;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.data.BaseModel;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Data object to use for Facebook request
 * 
 */
public class FBData extends BaseModel {

    public FBData() {
        jsObj = JsoHelper.createObject();
    }

    protected FBData(JavaScriptObject obj) {
        jsObj = obj;
    }
}
