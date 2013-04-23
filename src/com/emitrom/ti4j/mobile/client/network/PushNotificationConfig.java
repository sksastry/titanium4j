package com.emitrom.ti4j.mobile.client.network;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * Config Object for pushnotification
 * 
 */
public class PushNotificationConfig extends ProxyObject {

    public PushNotificationConfig() {
        jsObj = JsoHelper.createObject();
    }

    public native JsArrayNumber getTypes()/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.types;
    }-*/;

    public native void setTypes(JsArrayNumber values)/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.types = values;
    }-*/;

    /**
     * Callback function invoked upon receiving a new push notification.
     * 
     * @param callback
     */
    public native void setCallback(PushNotificationCallback callback)/*-{
		var obj = thi.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.callback = function(d) {
			var data = @com.emitrom.ti4j.mobile.client.network.PushNotificationData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(d);
			callback.@com.emitrom.ti4j.mobile.client.network.PushNotificationCallback::onReceived(Lcom/emitrom/ti4j/mobile/client/network/PushNotificationData;)(data);
		};

		obj.error = function(e) {
			var error = @com.emitrom.ti4j.mobile.client.network.PushNotificationError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(d);
			callback.@com.emitrom.ti4j.mobile.client.network.PushNotificationCallback::onError(Lcom/emitrom/ti4j/mobile/client/network/PushNotificationError;)(error);
		};

		obj.success = function(s) {
			var success = @com.emitrom.ti4j.mobile.client.network.PushNotificationSuccess::new(Lcom/google/gwt/core/client/JavaScriptObject;)(d);
			callback.@com.emitrom.ti4j.mobile.client.network.PushNotificationCallback::onSuccess(Lcom/emitrom/ti4j/mobile/client/network/PushNotificationSuccess;)(success);
		};
    }-*/;

}
