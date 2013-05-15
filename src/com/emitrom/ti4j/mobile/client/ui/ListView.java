/************************************************************************
  ListView.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
**************************************************************************/
package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.ListViewItemClickHandler;
import com.emitrom.ti4j.mobile.client.ui.fx.TableViewAnimation;
import com.google.gwt.core.client.JavaScriptObject;

public class ListView extends View {

    private List<ListSection> sections;

    public ListView() {
        jsObj = creetePeer();
        this.sections = new ArrayList<ListSection>();
    }

    public ListView(ListViewTemplate template) {
        jsObj = creetePeer(template.getJsObj());
        this.sections = new ArrayList<ListSection>();
    }

    public ListView(ListSection... sections) {
        this();
        setSections(sections);
    }

    /**
     * Adds a new section the the underlying section collection But does not
     * draw it. Call <code>layout()</code> to actually add the section to the
     * listview
     */
    public void addSection(ListSection section) {
        this.sections.add(section);
    }

    /**
     * Adds a new section the the underlying section collection But does not
     * draw it. If <code>autoLayout</code> is true the section will be added to
     * the listview UI.
     */
    public void addSection(ListSection section, boolean autoLayout) {
        this.sections.add(section);
        if (autoLayout) {
            this.layout();
        }
    }

    public void layout() {
        this.setSections(this.sections);
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

    public void setSections(ListSection... sections) {
        this.setSections(Arrays.asList(sections));
    }

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
