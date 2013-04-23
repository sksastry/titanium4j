/**************************************************************************
 * MenuItemConfig.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom
 * LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client.android;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.ui.View;

public class MenuItemConfig extends ProxyObject {

    public MenuItemConfig() {
        jsObj = JsoHelper.createObject();
    }

    public final native void setItemId(int value) /*-{
		var jso = jso.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.itemId = value;
    }-*/;

    public final native void setGroupId(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.groupId = value;
    }-*/;

    public final native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    public final native void setOrder(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.order = value;
    }-*/;

    public final native void setActionView(View value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.actionView = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public final native void setCheckable(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.checkable = value;
    }-*/;

    public final native void setChecked(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.checked = value;
    }-*/;

    public final native void setEnabled(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.enabled = value;
    }-*/;

    public final native void setIcon(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.icon = value;
    }-*/;

    public final native void setIcon(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.icon = value;
    }-*/;

    public final native void setShowsAsAction(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.showAsAction = value;
    }-*/;

    public final native void setTitleCondensed(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titleCondensed = value;
    }-*/;

}
