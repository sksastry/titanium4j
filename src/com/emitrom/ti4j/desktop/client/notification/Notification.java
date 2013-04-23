/************************************************************************
 * Notification.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom
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
package com.emitrom.ti4j.desktop.client.notification;

import com.emitrom.ti4j.core.client.Function;

/**
 * A module for displaying desktop notifications.TideSDK allows you to display
 * notifications from your desktop apps using Growl on OS X, Snarl on Windows
 * and libnotify on Linux. In the event of a notification provider being absent,
 * notifications are shown using HTML/CSS.
 * 
 * @author Ekambi
 * 
 */
public class Notification {

    private Notification() {

    }

    /**
     * Create a new Notification object.
     * 
     * @return
     */
    public static native NotificationObject createNotification()/*-{
		var obj = Ti.Notification.createNotification();
		return @com.emitrom.ti4j.desktop.client.notification.NotificationObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Create a new Notification object.
     * 
     * @return
     */
    public static native NotificationObject createNotification(String message)/*-{
		var obj = Ti.Notification.createNotification({
			'message' : message
		});
		return @com.emitrom.ti4j.desktop.client.notification.NotificationObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Create a new Notification object.
     * 
     * @return
     */
    public static native NotificationObject createNotification(String title, String message)/*-{
		var obj = Ti.Notification.createNotification({
			'title' : title,
			'message' : message
		});
		return @com.emitrom.ti4j.desktop.client.notification.NotificationObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Create a new Notification object.
     * 
     * @return
     */
    public static native NotificationObject createNotification(String title, String message, int timeout)/*-{
		var obj = Ti.Notification.createNotification({
			'title' : title,
			'message' : message,
			'timeout' : timeout
		});
		return @com.emitrom.ti4j.desktop.client.notification.NotificationObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Create a new Notification object.
     * 
     * @return
     */
    public static native NotificationObject createNotification(String title, String message, int timeout, String icon)/*-{
		var obj = Ti.Notification.createNotification({
			'title' : title,
			'message' : message,
			'timeout' : timeout,
			'icon' : icon
		});
		return @com.emitrom.ti4j.desktop.client.notification.NotificationObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Create a new Notification object.
     * 
     * @return
     */
    public static native NotificationObject createNotification(String title, String message, int timeout, String icon,
                    Function callback)/*-{
		var obj = Ti.Notification.createNotification({
			'title' : title,
			'message' : message,
			'timeout' : timeout,
			'icon' : icon,
			'callback' : function() {
				callback.@com.emitrom.ti4j.core.client.Function::execute()();
			}
		});
		return @com.emitrom.ti4j.desktop.client.notification.NotificationObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
