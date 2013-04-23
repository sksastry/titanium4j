/************************************************************************
 * UI.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

package com.emitrom.ti4j.desktop.client.ui;

import java.util.List;

import com.emitrom.ti4j.core.client.Function;
import com.google.gwt.core.client.JavaScriptObject;

public class UI {

    public static final int CENTERED = CENTERED();

    private UI() {

    }

    public static native UserWindow createWindow() /*-{
		var peer = Ti.UI.createWindow();
		return @com.emitrom.ti4j.desktop.client.ui.UserWindow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native UserWindow createWindow(JavaScriptObject config) /*-{
		var peer = Ti.UI.createWindow(config);
		return @com.emitrom.ti4j.desktop.client.ui.UserWindow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native Tray addTray(String iconURL)/*-{
		var peer = Ti.UI.addTray(iconURL);
		return @com.emitrom.ti4j.desktop.client.ui.Tray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native Tray addTray(String iconURL, Function callback)/*-{
		var peer = Ti.UI.addTray(iconURL, function() {
			callbac.@com.emitrom.ti4j.core.client.Function::execute()();
		});
		return @com.emitrom.ti4j.desktop.client.ui.Tray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native void clearTray()/*-{
		Ti.UI.clearTray();
    }-*/;

    public static native CheckMenuItem createCheckMenuItem(String label)/*-{
		var peer = Ti.UI.createCheckMenuItem(label);
		return @com.emitrom.ti4j.desktop.client.ui.CheckMenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native CheckMenuItem createCheckMenuItem(String label, Function callback)/*-{
		var peer = Ti.UI.createCheckMenuItem(label, function() {
			callbac.@com.emitrom.ti4j.core.client.Function::execute()();
		});
		return @com.emitrom.ti4j.desktop.client.ui.CheckMenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native Menu createMenu()/*-{
		var peer = Ti.UI.createMenu();
		return @com.emitrom.ti4j.desktop.client.ui.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native MenuItem createMenuItem(String label)/*-{
		var peer = Ti.UI.createMenuItem(label);
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native MenuItem createMenuItem(String label, Function callback)/*-{
		var peer = Ti.UI.createMenuItem(label, function() {
			callbac.@com.emitrom.ti4j.core.client.Function::execute()();
		});
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native MenuItem createMenuItem(String label, Function callback, String iconURL)/*-{
		var peer = Ti.UI.createMenuItem(label, function() {
			callbac.@com.emitrom.ti4j.core.client.Function::execute()();
		}, iconURL);
		return @com.emitrom.ti4j.desktop.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native SeparatorMenuItem createSeparatorMenuItem()/*-{
		var peer = Ti.UI.createSeparatorMenuItem();
		return @com.emitrom.ti4j.desktop.client.ui.SeparatorMenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native Menu getContextMenu()/*-{
		var peer = Ti.UI.getContextMenu();
		return @com.emitrom.ti4j.desktop.client.ui.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native UserWindow getCurrentWindow()/*-{
		var peer = Ti.UI.getCurrentWindow();
		return @com.emitrom.ti4j.desktop.client.ui.UserWindow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native double getIdleTime()/*-{
		return Ti.UI.getIdleTime();
    }-*/;

    public static native UserWindow getMainWindow()/*-{
		var peer = Ti.UI.getMainWindow();
		return @com.emitrom.ti4j.desktop.client.ui.UserWindow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native Menu getMenu()/*-{
		var peer = Ti.UI.getMenu();
		return @com.emitrom.ti4j.desktop.client.ui.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public static native List<UserWindow> getOpenWindows()/*-{
		var peers = Ti.UI.getOpenWindows();
		return @com.emitrom.ti4j.desktop.client.ui.UserWindow::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(peers);
    }-*/;

    public static native List<UserWindow> getWindows()/*-{
		var peers = Ti.UI.getWindows();
		return @com.emitrom.ti4j.desktop.client.ui.UserWindow::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(peers);
    }-*/;

    public static native String setBadge(String text)/*-{
		return Ti.UI.setBadge(text);
    }-*/;

    public static native String setBadgeImage(String imageURL)/*-{
		return Ti.UI.setBadgeImage(imageURL);
    }-*/;

    public static native void setContextMenu(Menu value)/*-{
		Ti.UI
				.setContextMenu(value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public static native String setDockIcon(String icon)/*-{
		return Ti.UI.setDockIcon(icon);
    }-*/;

    public static native String setDockMenu(Menu menu)/*-{
		return Ti.UI
				.setDockMenu(menu.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public static native String setIcon(String iconPath)/*-{
		return Ti.UI.setIcon(iconPath);
    }-*/;

    public static native String setMenu(Menu menu)/*-{
		return Ti.UI
				.setMenu(menu.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public static native Dialog showDialog()/*-{
		var peer = Ti.UI.showDialog();
		return @com.emitrom.ti4j.desktop.client.ui.Dialog::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native int CENTERED()/*-{
		return Ti.UI.CENTERED();
    }-*/;

}
