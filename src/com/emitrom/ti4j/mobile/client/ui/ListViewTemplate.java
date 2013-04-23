package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;

public class ListViewTemplate extends ProxyObject {

    public ListViewTemplate() {
        jsObj = JsoHelper.createObject();
    }

    public native void addTemplate(String templateId, ViewTemplate template)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso[templateId] = template.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void setStyle(int value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso['style'] = value;
    }-*/;

}
