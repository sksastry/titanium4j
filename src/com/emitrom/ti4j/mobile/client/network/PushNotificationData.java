package com.emitrom.ti4j.mobile.client.network;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A simple object representing a push notification.
 * 
 */
public class PushNotificationData extends ProxyObject {

    protected PushNotificationData(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The userinfo dictionary passed to the Apple Push Notification Service.
     * <p>
     * For more information, see the following item in the iOS Developer
     * Library:
     * <p>
     * application:didReceiveRemoteNotification in the UIApplicationDelegate
     * Protocol Reference
     * 
     * @return
     */
    public native JavaScriptObject getData()/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.data;
    }-*/;

    public native boolean inBackground()/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.inBackground;
    }-*/;

}
