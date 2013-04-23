package com.emitrom.ti4j.mobile.client.contacts;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class InstantMessage extends ProxyObject {

    protected InstantMessage(JavaScriptObject obj) {
        jsObj = obj;
    }

    public String getUserName() {
        return JsoHelper.getAttribute(jsObj, "username");
    }

    public String getService() {
        return JsoHelper.getAttribute(jsObj, "service");
    }

    static List<InstantMessage> fromJsArray(JavaScriptObject obj) {
        List<InstantMessage> toReturn = new ArrayList<InstantMessage>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new InstantMessage(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
