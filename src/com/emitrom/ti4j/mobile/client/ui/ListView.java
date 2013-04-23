package com.emitrom.ti4j.mobile.client.ui;

import java.util.Arrays;
import java.util.List;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.ListViewItemClickHandler;
import com.emitrom.ti4j.mobile.client.ui.fx.TableViewAnimation;
import com.google.gwt.core.client.JavaScriptObject;

public class ListView extends View {

    public ListView() {
        jsObj = creetePeer();
    }

    public ListView(ListViewTemplate template) {
        jsObj = creetePeer(template.getJsObj());
    }

    /**
     * Sets the default template for list data items that do not specify the
     * template property.
     * <p>
     * Can be set to any of the built-in templates or those defined in the
     * templates property.
     * <p>
     * Can be changed dynamically.
     * <p>
     * Default: Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT
     * 
     * @param value
     */
    public native void setDefaultItemTemplate(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.defaultItemTemplate = value;
    }-*/;

    public native void setDefaultItemTemplate(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.defaultItemTemplate = value;
    }-*/;

    public native void setFooterTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.footerTitle = value;
    }-*/;

    public native String getFooterTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.footerTitle;
    }-*/;

    public native void setHeaderTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.headerTitle = value;
    }-*/;

    public native String getHeaderTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.headerTitle;
    }-*/;

    public native void setScrollIndicatorStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.scrollIndicatorStyle = value;
    }-*/;

    public native int getScrollIndictorStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.scrollIndicatorStyle;
    }-*/;

    public native int getSectionCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.sectionCount;
    }-*/;

    public native List<ListSection> getSections() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.sections;
		return @com.emitrom.ti4j.mobile.client.ui.ListSection::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setSections(List<ListSection> values) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.sections = @com.emitrom.ti4j.mobile.client.ui.ListSection::fromList(Ljava/util/List;)(values);
    }-*/;

    public native void setWillScrollOnStatusTap(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.willScrollOnStatusTap = value;
    }-*/;

    public native boolean willScrollOnStatusTap() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.willScrollOnStatusTap;
    }-*/;

    public native void appendSection(List<ListSection> items) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListSection::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso.appendSection(obj);
    }-*/;

    public native void appendSection(List<ListSection> items, TableViewAnimation animation) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = @com.emitrom.ti4j.mobile.client.ui.ListSection::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso
				.appendSection(
						obj,
						animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public void appendSection(ListSection... dataItems) {
        appendSection(Arrays.asList(dataItems));
    }

    public native void deleteSectionAt(int index) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.deleteSectionAt(index);
    }-*/;

    public native void deleteSectionAt(int index, int count, TableViewAnimation animation) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.deleteSectionAt(
						index,
						animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native int getStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.getStyle();
    }-*/;

    public native void replaceSectionAt(int index, ListSection section) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.replaceSectionAt(
						index,
						section.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void replaceSectionAt(int index, ListSection section, TableViewAnimation animation) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.replaceSectionAt(
						index,
						section.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void scrollToItem(int sectionIndex, int itemIndex) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.scrollToItem(sectionIndex, itemIndex);
    }-*/;

    public native void scrollToItem(int sectionIndex, int itemIndex, TableViewAnimation animation) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.scrollToItem(
						sectionIndex,
						itemIndex,
						animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void selectItem(int sectionIndex, int itemIndex) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selectItem(sectionIndex, itemIndex);
    }-*/;

    public native CallbackRegistration addListViewItemClickHandler(ListViewItemClickHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.ListViewItemClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.ListViewItemClickHandler::onListViewItemClick(Lcom/emitrom/ti4j/mobile/client/core/events/ui/ListViewItemClickEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.ListViewItemClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    public ListView(JavaScriptObject obj) {
        super(obj);
    }

    private native JavaScriptObject creetePeer()/*-{
		return Ti.UI.createListView();
    }-*/;

    private native JavaScriptObject creetePeer(JavaScriptObject template)/*-{
		return Ti.UI.createListView(template);
    }-*/;

}
