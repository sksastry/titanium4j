/************************************************************************
 * NotificationObject.java is part of Titanium4j Desktop 1.2 Copyright 2012
 * Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.notification;

import com.emitrom.ti4j.core.client.Function;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a Desktop notification.
 * 
 * @author Ekambi
 * 
 */
public class NotificationObject extends ProxyObject {

    protected NotificationObject(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Set the notification message
     * 
     * @param message
     *            , notification message text
     * @return
     */
    public final native String setMessage(String message)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setMessage(message);
    }-*/;

    /**
     * Hide obj Notification.
     * 
     * @return
     */
    public final native boolean hide()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.hide();
    }-*/;

    /**
     * Set a callback function fired when notification is clicked.
     * 
     * @param callback
     *            , function to execute when notification is clicked
     * @return
     */
    public final native String setCallback(Function callback)/*-{
		return obj.setCallback(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    /**
     * Set the notification icon image.
     * 
     * @param icon
     *            , path to the icon image
     * @return
     */
    public final native String setIcon(String icon)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setIcon(icon);
    }-*/;

    /**
     * Set the timeout before the notification expires.
     * 
     * @param value
     *            , Timeout in seconds. (-1 = use system default
     * @return
     */
    public final native String setTimeout(int value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setTimeout(value);
    }-*/;

    /**
     * Set the notification title
     * 
     * @param value
     *            , the notification title text
     * @return
     */
    public final native String setTitle(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setTitle(value);
    }-*/;

    /**
     * Display the notification
     */
    public final native void show()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.show();
    }-*/;

}
