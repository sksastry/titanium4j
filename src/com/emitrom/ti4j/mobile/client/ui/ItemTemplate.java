package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class ItemTemplate extends ProxyObject {

    public ItemTemplate() {
        jsObj = JsoHelper.createObject();
    }

    protected ItemTemplate(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * 
     * Contains key-value pairs of view properties and their values that are
     * applied to the ListItem.
     * <p>
     * If there are properties set in the ItemTemplate (not the children view
     * templates), the values set in the list data item override the template's
     * properties.
     */
    public void setProperties(ListItem... items) {
        setProperties(Arrays.asList(items));
    }

    /**
     * Contains key-value pairs of view events and their listeners that are
     * applied to the ListItem.
     * 
     * @param event
     */
    public native void setEvents(TemplateEvent event) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.events = event.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * 
     * Contains key-value pairs of view properties and their values that are
     * applied to the ListItem.
     * <p>
     * If there are properties set in the ItemTemplate (not the children view
     * templates), the values set in the list data item override the template's
     * properties.
     */
    public native void setProperties(List<ListItem> values) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.properties = @com.emitrom.ti4j.mobile.client.ui.ListItem::fromList(Ljava/util/List;)(values);
    }-*/;

    public native List<ListItem> getProperties() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.properties;
		return @com.emitrom.ti4j.mobile.client.ui.ListItem::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setChildTemplates(List<ViewTemplate> values) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.childTemplates = @com.emitrom.ti4j.mobile.client.ui.ViewTemplate::fromList(Ljava/util/List;)(values);
    }-*/;

    public native List<ViewTemplate> getChildTemplates() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.childTemplates;
		return @com.emitrom.ti4j.mobile.client.ui.ViewTemplate::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    static JavaScriptObject fromList(List<ItemTemplate> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (ItemTemplate item : values) {
            peers.push(item.getJsObj());
        }
        return peers;
    }

    static List<ItemTemplate> fromJsArray(JavaScriptObject obj) {
        List<ItemTemplate> toReturn = new ArrayList<ItemTemplate>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ItemTemplate(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
