package com.emitrom.ti4j.mobile.client.network;

import com.emitrom.ti4j.core.client.BaseModel;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * Request Object to use as parameter when sending object over http
 * 
 */
public class RequestParameter {

    private BaseModel baseModel;

    public RequestParameter() {
        baseModel = BaseModel.create();
    }

    protected RequestParameter(JavaScriptObject obj) {
        baseModel = BaseModel.create(obj);
    }

    public void setParam(String name, ProxyObject value) {
        baseModel.set(name, value.getJsObj());
    }

    public void setParam(String name, JavaScriptObject value) {
        baseModel.set(name, value);
    }

    public void setParam(String name, Object value) {
        baseModel.set(name, value);
    }

    public void setParam(String name, String value) {
        baseModel.set(name, value);
    }

    public void setParam(String name, double value) {
        baseModel.set(name, value);
    }

    public BaseModel getModel() {
        return this.baseModel;
    }

    public static RequestParameter from(JavaScriptObject obj) {
        return new RequestParameter(obj);
    }

}
