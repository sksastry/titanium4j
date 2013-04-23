/************************************************************************
 * UserWindow.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.Function;
import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.desktop.client.events.TiEventHandler;
import com.google.gwt.core.client.JavaScriptObject;

public class UserWindow extends ProxyObject {

    protected UserWindow(JavaScriptObject obj) {
        jsObj = obj;
    }

    public UserWindow() {

    }

    public native String close()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.close();
    }-*/;

    public native String focus()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.focus();
    }-*/;

    public native WindowBounds getBounds()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getBounds();
		return @com.emitrom.ti4j.desktop.client.ui.WindowBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native List<UserWindow> getChildren()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peers = obj.getChildren();
		return @com.emitrom.ti4j.desktop.client.ui.UserWindow::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(peers);
    }-*/;

    public native Menu getContextMenu()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getContextMenu();
		return @com.emitrom.ti4j.desktop.client.ui.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    public native <T extends JavaScriptObject> T getDOMWindow()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getDOMWindow();
    }-*/;

    public native double getHeight()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getHeight();
    }-*/;

    public native String getID()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getID();
    }-*/;

    public native String getIcon()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getIcon();
    }-*/;

    public native double getMaxHeight()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getMaxHeight();
    }-*/;

    public native double getMinWidth()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getMinWidth();
    }-*/;

    public native UserWindow getParent()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getParent();
		return @com.emitrom.ti4j.desktop.client.ui.UserWindow::new()();
    }-*/;

    public native String getTitle()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getTitle();
    }-*/;

    public native double getTransparency()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getTransparency();
    }-*/;

    public native String getURL()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getURL();
    }-*/;

    public native double getWidth()/*-{
		return obj.getWidth();
    }-*/;

    public native double getX()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getX();
    }-*/;

    public native double getY()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getY();
    }-*/;

    public native boolean hasTransparentBackground()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.hasTransparentBackground();
    }-*/;

    public native String hide()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.hide();
    }-*/;

    public native boolean isActive()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isActive();
    }-*/;

    public native boolean isClosable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isClosable();
    }-*/;

    public native boolean isDocumentEdited()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isDocumentEdited();
    }-*/;

    public native boolean isFullScreen()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isFullScreen();
    }-*/;

    public native boolean isMaximizable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isMaximizable();
    }-*/;

    public native boolean isMaximized()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isMaximized();
    }-*/;

    public native boolean isMimimizable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isMimimizable();
    }-*/;

    public native boolean isMinimized()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isMinimized();
    }-*/;

    public native boolean isResizable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isResizable();
    }-*/;

    public native boolean isTopMost()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isTopMost();
    }-*/;

    public native boolean isUsingChrome()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isUsingChrome();
    }-*/;

    public native boolean isVisible()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isVisible();
    }-*/;

    public native String maximize()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.maximize();
    }-*/;

    public native String minimize()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.minimize();
    }-*/;

    public native String open()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.open();
    }-*/;

    public native String setBounds(WindowBounds bounds)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.setBounds(bounds.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native String openUserWindowChooserDialog(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.openUserWindowChooserDialog(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    public native String openUserWindowChooserDialog(Function callback, JavaScriptObject data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.openUserWindowChooserDialog(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		}, data);
    }-*/;

    public native String openFolderChooserDialog(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.openFolderChooserDialog(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    public native String openFolderChooserDialog(Function callback, JavaScriptObject data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.openFolderChooserDialog(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		}, data);
    }-*/;

    public native String openSaveAsDialog(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.openSaveAsDialog(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    public native String openSaveAsDialog(Function callback, JavaScriptObject data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.openSaveAsDialog(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		}, data);
    }-*/;

    public native String setCloseable(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setCloseable(value);
    }-*/;

    public native String setContents(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setContents(value);
    }-*/;

    public native String setContents(String value, String baseURL)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setContents(value, baseURL);
    }-*/;

    public native String setContextMenu(Menu menu)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.setContextMenu(menu.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void setDocumentEdited(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setDocumentEdited(value);
    }-*/;

    public native String setFullscreen(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setFullscreen(value);
    }-*/;

    public native String setHeight(double value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setHeight(value);
    }-*/;

    public native String setIcon(String icon)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setIcon(icon);
    }-*/;

    public native String setMaxHeight(double value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setMaxHeight(value);
    }-*/;

    public native String setMaxWidth(double value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setMaxWidth(value);
    }-*/;

    public native String setMaximizable(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setMaximizable(value);
    }-*/;

    public native <T> T setPluginsEnabled(boolean value)/*-{
		return obj.setPluginsEnabled(value);
    }-*/;

    public native String setResizable(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setResizable(value);
    }-*/;

    public native String setTitle(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setTitle(value);
    }-*/;

    public native String setTopMost(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setTopMost(value);
    }-*/;

    public native String setTransparency(double value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setTransparency(value);
    }-*/;

    public native String setURL(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setURL(value);
    }-*/;

    public native String setUsingChrome(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setUsingChrome(value);
    }-*/;

    public native String setVisible(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setVisible(value);
    }-*/;

    public native String setMenu(Menu menu)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.setMenu(menu.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native String setMinWidth(double value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setMinWidth(value);
    }-*/;

    public native String setMinimizable(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setMinimizable(value);
    }-*/;

    public native String setWidth(double value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setWidth(value);
    }-*/;

    public native String setX(double x) /*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setX(x);
    }-*/;

    public native String setY(int y) /*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setY(y);
    }-*/;

    public native String show() /*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.show();
    }-*/;

    public native String showInspector()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.showInspector();
    }-*/;

    public native String showInspector(boolean console)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.showInspector(console);
    }-*/;

    public native String unfocus()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.unfocus();
    }-*/;

    public native String unmaximize()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.unmaximize();
    }-*/;

    public native String unminimize()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.unminimize();
    }-*/;

    public native boolean isDialog()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isDialog;
    }-*/;

    public native void addEventHandler(String event, TiEventHandler handler)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj
				.addEventListener(
						event,
						function(e) {
							var event = @com.emitrom.ti4j.desktop.client.events.TiEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.desktop.client.events.TiEventHandler::onEvent(Lcom/emitrom/ti4j/desktop/client/events/TiEvent;)(event);
						});
    }-*/;

    static JavaScriptObject fromList(List<UserWindow> windows) {
        JavaScriptObject toReturn = JsoHelper.createObject();
        for (int i = 0; i < windows.size(); i++) {
            UserWindow f = windows.get(i);
            JsoHelper.setArrayValue(toReturn, i, f.getJsObj());
        }
        return toReturn;
    }

    static List<UserWindow> fromJsArray(JavaScriptObject peers) {
        List<UserWindow> files = new ArrayList<UserWindow>();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            files.add(new UserWindow(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return files;
    }

}
