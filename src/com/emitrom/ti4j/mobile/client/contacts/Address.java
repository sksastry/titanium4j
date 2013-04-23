package com.emitrom.ti4j.mobile.client.contacts;

import java.util.List;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Address extends ProxyObject {

    protected Address(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native List<AddressEntry> getHome()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.home;
		return @com.emitrom.ti4j.mobile.client.contacts.AddressEntry::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setHome(List<AddressEntry> values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.home = @com.emitrom.ti4j.mobile.client.contacts.AddressEntry::fromList(Ljava/util/ArrayList;)(values);
    }-*/;

    public native List<AddressEntry> getWork()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.work;
		return @com.emitrom.ti4j.mobile.client.contacts.AddressEntry::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setWork(List<AddressEntry> values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.work = @com.emitrom.ti4j.mobile.client.contacts.AddressEntry::fromList(Ljava/util/ArrayList;)(values);
    }-*/;

    public native List<AddressEntry> getOther()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.other;
		return @com.emitrom.ti4j.mobile.client.contacts.AddressEntry::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setOther(List<AddressEntry> values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.other = @com.emitrom.ti4j.mobile.client.contacts.AddressEntry::fromList(Ljava/util/ArrayList;)(values);
    }-*/;

}
