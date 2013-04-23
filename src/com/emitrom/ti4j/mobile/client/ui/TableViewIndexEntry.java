package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class TableViewIndexEntry extends ProxyObject {

    public TableViewIndexEntry() {
        jsObj = JsoHelper.createObject();
    }

    protected TableViewIndexEntry(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Row index associated with this item.
     */
    public int getIndex() {
        return JsoHelper.getAttributeAsInt(jsObj, "index");
    }

    /**
     * Row index associated with this item.
     */
    public void setIndex(int value) {
        JsoHelper.setAttribute(jsObj, "index", value);
    }

    /**
     * Title to display in the index bar for this item.
     */
    public String getTitle() {
        return JsoHelper.getAttribute(jsObj, "title");
    }

    /**
     * Title to display in the index bar for this item.
     */
    public void setTitle(String value) {
        JsoHelper.setAttribute(jsObj, "title", value);
    }

    static JavaScriptObject fromList(List<TableViewIndexEntry> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (TableViewIndexEntry rule : values) {
            peers.push(rule.getJsObj());
        }
        return peers;
    }

    static List<TableViewIndexEntry> fromJsArray(JavaScriptObject obj) {
        List<TableViewIndexEntry> toReturn = new ArrayList<TableViewIndexEntry>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new TableViewIndexEntry(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
