/************************************************************************
 * MenuItem.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use obj file except in compliance with the License. You may obtain a copy of
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
package com.emitrom.ti4j.desktop.client.ui;

import com.emitrom.ti4j.core.client.Function;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class MenuItem extends ProxyObject {

    protected MenuItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    public MenuItem(String label) {
        jsObj = createItem(label);
    }

    public MenuItem(String label, Function callback) {
        jsObj = createItem(label, callback);
    }

    public MenuItem(String label, Function callback, String icon) {
        jsObj = createItem(label, callback, icon);
    }

    public native MenuItem addCheckItem(String label)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.addCheckItem(label);
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native MenuItem addCheckItem(String label, Function listener)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.addCheckItem(label, function() {
			listener.@com.emitrom.ti4j.core.client.Function::execute()();
		});
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native MenuItem addItem(String label)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.addItem(label);
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native MenuItem addItem(String label, Function listener)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.addItem(label, function() {
			listener.@com.emitrom.ti4j.core.client.Function::execute()();
		});
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native MenuItem addItem(String label, Function listener, String iconURL)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.addItem(label, function() {
			listener.@com.emitrom.ti4j.core.client.Function::execute()();
		}, iconURL);
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native MenuItem addSeparatorItem()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.addSeparatorItem();
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native String disable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.disable();
    }-*/;

    public native String enable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.enable();
    }-*/;

    public native String getAutoCheck(boolean autoCheck)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getAutoCheck(autoCheck);
    }-*/;

    public native String getIcon()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getIcon();
    }-*/;

    public native String getLabel()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getLabel();
    }-*/;

    public native boolean getState()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getState();
    }-*/;

    public native Menu getSubMenu()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getSubMenu();
		return @com.emitrom.ti4j.desktop.client.ui.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native boolean isCheck()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isCheck();
    }-*/;

    public native boolean isEnabled()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isEnabled();
    }-*/;

    public native boolean isSeparator()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isSeparator();
    }-*/;

    public native String setAutoCheck(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setAutoCheck(value);
    }-*/;

    public native String setIcon(String iconURL)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setIcon(iconURL);
    }-*/;

    public native String setLabel(String label)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setLabel(label);
    }-*/;

    public native String setState(boolean state)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setState(state);
    }-*/;

    public native String setSubMenu(Menu menu)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.setSubMenu(menu.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private native JavaScriptObject createItem(String label)/*-{
		return Ti.UI.createMenuItem(label);
    }-*/;

    private native JavaScriptObject createItem(String label, Function eventHanler)/*-{
		return Ti.UI.createMenuItem(label, function(e) {
			eventHandler.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    private native JavaScriptObject createItem(String label, Function eventHanler, String iconUrl)/*-{
		return Ti, UI.createMenuItem(label, function(e) {
			eventHandler.@com.emitrom.ti4j.core.client.Function::execute()();
		}, iconUrl);
    }-*/;

}
