/************************************************************************
 * Tray.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Tray extends ProxyObject {

    protected Tray(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native String getHint()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getHint();
    }-*/;

    public native String getIcon()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getIcon();
    }-*/;

    public native Menu getMenu()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getMenu();
		return @com.emitrom.ti4j.desktop.client.ui.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native String remove()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.remove();
    }-*/;

    public native String setHint()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setHint();
    }-*/;

    public native String setHint(String hint)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setHint(hint);
    }-*/;

    public native String setIcon()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setIcon();
    }-*/;

    public native String setIcon(String icon)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setIcon(icon);
    }-*/;

    public native String setMenu(Menu menu)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.setMenu(menu.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

}
