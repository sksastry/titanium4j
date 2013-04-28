package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Represents displayed item data.
 * 
 * In addition to the properties defined below, you can define custom key-value
 * pairs, which bind to the child templates of an ItemTemplate. The key for
 * these pairs match the bindId of the child view templates and the values are a
 * dictionary of view properties applied to the view components. Any other
 * properties that are not identified by a bindId are permitted but are ignored
 * by the item template.
 * 
 */
public class ListDataItem extends ProxyObject {

    public ListDataItem() {
        jsObj = JsoHelper.createObject();
    }

    public ListDataItem(ListItem items) {
        this();
        this.setProperties(items);
    }

    protected ListDataItem(JavaScriptObject obj) {
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
    public native void setProperties(ListItem value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.properties = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native ListItem getProperties() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.properties;
		return @com.emitrom.ti4j.mobile.client.ui.ListItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the LisItem in this DataSet
     */
    public ListItem getItem() {
        return this.getProperties();
    }

    /**
     * 
     * Template ID configured with the Titanium.UI.ListView.templates property
     * or Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT.
     * <p>
     * On iOS, you can specify one of the following pre-defined templates:
     * Titanium.UI.LIST_ITEM_TEMPLATE_CONTACTS,
     * Titanium.UI.LIST_ITEM_TEMPLATE_SETTINGS or
     * Titanium.UI.LIST_ITEM_TEMPLATE_SUBTITLE.
     * <p>
     * Default: If the ListView's defaultItemTemplate property is not set, then
     * Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT is used.
     */
    public native void setTemplate(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.template = value;
    }-*/;

    /**
     * 
     * Template ID configured with the Titanium.UI.ListView.templates property
     * or Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT.
     * <p>
     * On iOS, you can specify one of the following pre-defined templates:
     * Titanium.UI.LIST_ITEM_TEMPLATE_CONTACTS,
     * Titanium.UI.LIST_ITEM_TEMPLATE_SETTINGS or
     * Titanium.UI.LIST_ITEM_TEMPLATE_SUBTITLE.
     * <p>
     * Default: If the ListView's defaultItemTemplate property is not set, then
     * Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT is used.
     */
    public native void setTemplate(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.template = value;
    }-*/;

    static JavaScriptObject fromList(List<ListDataItem> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (ListDataItem item : values) {
            peers.push(item.getJsObj());
        }
        return peers;
    }

    static List<ListDataItem> fromJsArray(JavaScriptObject obj) {
        List<ListDataItem> toReturn = new ArrayList<ListDataItem>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ListDataItem(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
