/**************************************************************************
   NavigationGroup.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.iphone;

import com.emitrom.ti4j.mobile.client.ui.View;
import com.emitrom.ti4j.mobile.client.ui.Window;

/**
 * A navigation group implements a specialized view that manages the navigation
 * of hierarchical content. the navigation group is created by the method
 * {@link com.emitrom.ti4j.mobile.client.ui.iphon.IPhone.createNavigationGroup}
 * . (http://img.skitch.com/20100406-rwe44533tkd94fdnbqqudxynpe.png) a
 * navigation group is very similar to tab bars with the exception that they do
 * not maintain a group of windows with a interface bar at the bottom.
 * <p>
 * The window property must be set initially in the constructor when creating a
 * navigation group to the root level window. All Navigation Groups must have at
 * least one root window that cannot be removed.
 */
public class NavigationGroup extends View {

    public NavigationGroup() {
        createPeer();
    }

    /**
     * Close a window and remove it from the navigation group
     * 
     * @param window window to close
     */
    public native void close(Window window) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.close(window.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Close a window and remove it from the navigation group
     * 
     * @param window window to close
     * @param animate, indicates if the window should be closed animated
     *            (default) or not.
     * */

    public native void close(Window window, boolean animate) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.close(
						window.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						{
							animated : animate
						});
    }-*/;

    /**
     * Open a window within the navigation group
     * 
     * @param window window to open within the tab group
     * @param properties optional dictionary. the only current property
     *            supported is `animated` which is a boolean to indicate if the
     *            window should be opened animated (default) or not.
     */
    public native void open(Window window) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.open(window.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Open a window within the navigation group
     * 
     * @param window window to open within the tab group
     * @param animate indicates if the window should be opened animated
     *            (default) or not.
     */
    public native void open(Window window, boolean animate) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.open(
						window.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						{
							animated : animate
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = IPhone.get().createNavigationGroup();
    }

}
