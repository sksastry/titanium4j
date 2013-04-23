package com.emitrom.ti4j.mobile.client.contacts;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class PersonEmail extends ProxyObject {

    protected PersonEmail(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native JsArrayString getHomePage()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.homepage;
    }-*/;

    public native JsArrayString getHome()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.home;
    }-*/;

    public native JsArrayString getOther()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.other;
    }-*/;

    public native JsArrayString getWork()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.work;
    }-*/;

}
