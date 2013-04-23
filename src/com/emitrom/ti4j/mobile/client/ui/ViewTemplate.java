package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.data.BaseModel;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Template that represents a view subcomponent of an ItemTemplate.
 */
public class ViewTemplate extends ProxyObject {

    public ViewTemplate() {
        jsObj = JsoHelper.createObject();
    }

    protected ViewTemplate(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void setBindId(String event)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.bindId = value
    }-*/;

    public native void setChildTemplate(List<ViewTemplate> values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.childTemplates = @com.emitrom.ti4j.mobile.client.ui.ViewTemplate::fromList(Ljava/util/List;)(values);
    }-*/;

    public native void setEvents(TemplateEvent event) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.events = event.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void setProperties(BaseModel value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.properties = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void setType(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.type = value;
    }-*/;

    static JavaScriptObject fromList(List<ViewTemplate> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (ViewTemplate item : values) {
            peers.push(item.getJsObj());
        }
        return peers;
    }

    static List<ViewTemplate> fromJsArray(JavaScriptObject obj) {
        List<ViewTemplate> toReturn = new ArrayList<ViewTemplate>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ViewTemplate(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

}
