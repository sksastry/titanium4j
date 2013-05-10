/************************************************************************
  ItemTemplate.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
