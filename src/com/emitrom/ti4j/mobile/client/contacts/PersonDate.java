package com.emitrom.ti4j.mobile.client.contacts;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class PersonDate extends ProxyObject {

    public PersonDate() {
        jsObj = JsoHelper.createObject();
    }

    protected PersonDate(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native JsArrayString getAnniversary()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.anniversary;
    }-*/;

    public native void setAnniversary(JsArrayString values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.anniversary = values;
    }-*/;

    public native JsArrayString getOther()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.other;
    }-*/;

    public native void setOther(JsArrayString values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.other = values;
    }-*/;

}
