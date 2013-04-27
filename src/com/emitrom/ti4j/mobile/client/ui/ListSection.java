package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.ui.fx.TableViewAnimation;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class ListSection extends ProxyObject {

    public ListSection() {
        jsObj = createPeer();
    }

    public ListSection(String headerTitle) {
        this();
        this.setHeaderTitle(headerTitle);
    }

    public ListSection(String headerTitle, ListDataSet... items) {
        this();
        this.setHeaderTitle(headerTitle);
        this.setItems(items);
    }

    public ListSection(String headerTitle, ListItem... items) {
        this();
        this.setHeaderTitle(headerTitle);
        ListDataSet dataSet = new ListDataSet(items);
        this.setItems(dataSet);
    }

    public ListSection(String headerTitle, String footerTitle) {
        this();
        this.setHeaderTitle(headerTitle);
        this.setFooterTitle(footerTitle);
    }

    public ListSection(String headerTitle, String footerTitle, ListDataSet... items) {
        this();
        this.setHeaderTitle(headerTitle);
        this.setFooterTitle(footerTitle);
        this.setItems(items);
    }

    public ListSection(String headerTitle, String footerTitle, ListItem... items) {
        this();
        this.setHeaderTitle(headerTitle);
        this.setFooterTitle(footerTitle);
        ListDataSet dataSet = new ListDataSet(items);
        this.setItems(dataSet);
    }

    protected ListSection(JavaScriptObject obj) {
        this.jsObj = obj;
    }

    public native String getFooterTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.footerTitle;
    }-*/;

    public native void setFooterTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.footerTitle = value;
    }-*/;

    public native String getHeaderTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.headerTitle;
    }-*/;

    public native void setHeaderTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.headerTitle = value;
    }-*/;

    /**
     * Items of this list section.
     */
    public void setItems(ListDataSet... dataItems) {
        setItems(Arrays.asList(dataItems));
    }

    /**
     * Items of this list section.
     */
    public native void setItems(List<ListDataSet> values) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.items = @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromList(Ljava/util/List;)(values);
    }-*/;

    /**
     * Items of this list section.
     */
    public native List<ListDataSet> getItems() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.items;
		return @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void appendItems(List<ListDataSet> items) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso.appendItems(obj);
    }-*/;

    public native void appendItems(List<ListDataSet> items, TableViewAnimation animation) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso
				.appendItems(
						obj,
						animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public void appendItems(ListDataSet... dataItems) {
        appendItems(Arrays.asList(dataItems));
    }

    public native void deleteItemsAt(int index, int count) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.deleteItemsAt(index, count);
    }-*/;

    public native void getItemAt(int index) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.getItemAt(index);
		return @com.emitrom.ti4j.mobile.client.ui.ListDataSet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void deleteItemsAt(int index, int count, TableViewAnimation animation) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.deleteItemsAt(
						index,
						count,
						animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void insertItemsAt(int index, List<ListDataSet> items) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso.insertItemsAt(index, obj);
    }-*/;

    public native void insertItemsAt(int index, List<ListDataSet> items, TableViewAnimation animation) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso
				.insertItemsAt(
						index,
						obj,
						animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public void insertItemsAt(int index, ListDataSet... dataItems) {
        insertItemsAt(index, Arrays.asList(dataItems));
    }

    public native void replaceItemsAt(int index, int count, List<ListDataSet> items) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso.replaceItemsAt(index, count, obj);
    }-*/;

    public native void replaceItemsAt(int index, int count, List<ListDataSet> items, TableViewAnimation animation) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso
				.replaceItemsAt(
						index,
						count,
						obj,
						animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public void replaceItemsAt(int index, int count, ListDataSet... dataItems) {
        replaceItemsAt(index, count, Arrays.asList(dataItems));
    }

    public native void updateItemAt(int index, ListDataSet item) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso.updateItemAt(index,
				item.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void updateItemAt(int index, ListDataSet item, TableViewAnimation animation) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListDataSet::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso
				.updateItemAt(
						index,
						item.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    static JavaScriptObject fromList(List<ListSection> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (ListSection item : values) {
            peers.push(item.getJsObj());
        }
        return peers;
    }

    static List<ListSection> fromJsArray(JavaScriptObject obj) {
        List<ListSection> toReturn = new ArrayList<ListSection>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ListSection(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject createPeer() /*-{
		return Ti.UI.createListSection();
    }-*/;
}
