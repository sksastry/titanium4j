package com.emitrom.ti4j.mobile.client.contacts;

import java.util.List;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class PersonInstantMessage extends ProxyObject {

    protected PersonInstantMessage(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native List<InstantMessage> getHome()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.home;
		return @com.emitrom.ti4j.mobile.client.contacts.InstantMessage::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native List<InstantMessage> getWork()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.work;
		return @com.emitrom.ti4j.mobile.client.contacts.InstantMessage::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native List<InstantMessage> getOther()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.other;
		return @com.emitrom.ti4j.mobile.client.contacts.InstantMessage::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
