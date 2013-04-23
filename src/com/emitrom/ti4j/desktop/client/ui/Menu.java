/************************************************************************
 * Menu.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

public class Menu extends ProxyObject {

    public Menu() {
        jsObj = creatPeer();
    }

    protected Menu(JavaScriptObject obj) {
        jsObj = obj;
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

    public native String appendItem(Menu item)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.appendItem(item.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native String clear()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.clear();
    }-*/;

    public native MenuItem getItemAt(int index)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getItemAt(index);
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native int getLength()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getLength();
    }-*/;

    public native String insterItemAt(MenuItem item, int index)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.insterItemAt(
				item.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
				index);
    }-*/;

    public native String removeItemAt(int index)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.removeItemAt(index);
    }-*/;

    private native JavaScriptObject creatPeer()/*-{
		return Ti.UI.createMenu();
    }-*/;

}
