package com.emitrom.ti4j.mobile.client.contacts;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class Url extends ProxyObject {

    public Url() {
        jsObj = JsoHelper.createObject();
    }

    protected Url(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native JsArrayString getHome()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.home;
    }-*/;

    public native void setHome(JsArrayString value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.home = value;
    }-*/;

    public native JsArrayString getHomePage()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.homepage;
    }-*/;

    public native void setHomePage(JsArrayString value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.homepage = value;
    }-*/;

    public native JsArrayString getOther()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.other;
    }-*/;

    public native void setOther(JsArrayString value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.other = value;
    }-*/;

    public native JsArrayString getWork()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.work;
    }-*/;

    public native void setWork(JsArrayString value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.work = value;
    }-*/;

}
