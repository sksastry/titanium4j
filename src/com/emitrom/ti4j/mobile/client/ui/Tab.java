/**************************************************************************
   Tab.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasTitle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A tabgroup tab instance. each tab instance maintains a stack of tab windows.
 * only one window within in the tab can be visible at a time. when a window is
 * closed, either by the user or by code, the window is removed from the stack,
 * make the previous window visible. the root tab window cannot be removed.
 */
public class Tab extends View implements HasTitle {

    public Tab() {
        createPeer();
    }

    public Tab(String title) {
        this();
        setTitle(title);
    }

    Tab(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The badge value for the tab group for jso tab. null indicates no
     *         badge is value
     */
    public native String getBadge() /*-{
		var jso = jso.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.badge;
    }-*/;

    public native void setBadge(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.badge = value;
    }-*/;

    /**
     * @return The icon url for the tab group for jso tab
     */
    public native String getIcon() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.icon;
    }-*/;

    public native void setIcon(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.icon = value;
    }-*/;

    /**
     * @return The title for the tab group for jso tab
     */
    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * @return The key in the locale file to use for the title property
     */
    public native String getTitleId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.titleid;
    }-*/;

    public native void setTitleId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titleid = value;
    }-*/;

    /**
     * @return The root level tab window. all tabs must have at least one root
     *         level tab window.
     */
    public native View getWindow() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.window;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setWindow(View value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.window = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @param view
     *            The view to open in the tab
     */
    public native void open(View view) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		jso
				.open(view.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * @param view
     *            The view to open in the tab with an animation
     */
    public native void open(View view, boolean animated) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.open(
						view.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						{
							animate : animated
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createTab();
    }

    public static Tab from(ProxyObject proxy) {
        return new Tab(proxy.getJsObj());
    }

}
