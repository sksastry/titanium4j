package com.emitrom.ti4j.mobile.client.app;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.emitrom.ti4j.mobile.client.core.handlers.app.LocalNotificationHandler;

/**
 * The top-level App iOS module, available only to iOS devices, that includes
 * the facilities to create and manage local notifications and background
 * services.
 * <p>
 * Local notifications are a way for an application that is not running in the
 * foreground to let users know that it has information for them. When invoked,
 * an alert dialog is displayed containing a "Close" button to dismiss and a
 * customizable "View" button to bring the application into the foreground.
 * Also, they can be configured to set an application icon badge, to show the
 * number of pending notifications, and to generate a sound.
 */
public class IOs extends TiModule {

    public static final String IOS_APP_EVENT_ACCESSIBILITY_LAYOUT_CHANGED = EVENT_ACCESSIBILITY_LAYOUT_CHANGED();
    public static final String IOS_APP_EVENT_ACCESSIBILITY_SCREEN_CHANGED = EVENT_ACCESSIBILITY_SCREEN_CHANGED();

    private static final IOs INSTANCE = new IOs();

    public static IOs get() {
        return INSTANCE;
    }

    private IOs() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createIosApp();
    }

    /**
     * Cancels all scheduled local notifications.
     */
    public native void cancelAllLocalNotifications() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.cancelAllLocalNotifications();
    }-*/;

    /**
     * Cancels a local notification.
     */
    public native void cancelLocalNotification(int id) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.cancelLocalNotification(id);
    }-*/;

    /**
     * Creates and returns an instance of Titanium.App.iOS.LocalNotification.
     */
    public native LocalNotification createLocalNotification(LocalNotificationConfig config) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso
				.createLocalNotification(config.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.ti4j.mobile.client.app.LocalNotification::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Registers a service to run when the application is placed in the
     * background.
     */
    public native BackgroundService registerBackgroundService(String serviceUrl) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.registerBackgroundService({
			url : serviceUrl
		});
		return @com.emitrom.ti4j.mobile.client.app.BackgroundService::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Schedule a local notification.
     */
    public native LocalNotification scheduleLocalNotification(LocalNotificationConfig config) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso
				.scheduleLocalNotification(config.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.ti4j.mobile.client.app.LocalNotification::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Fired when a local notification is received by the application.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native void addNoficationHandler(LocalNotificationHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.LocalNotificationEvent::NOTIFICATION,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.LocalNotificationEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.app.LocalNotificationHandler::onNotification(Lcom/emitrom/ti4j/mobile/client/core/events/LocalNotificationEvent;)(eventObject);
						});
    }-*/;

    public static native final String EVENT_ACCESSIBILITY_LAYOUT_CHANGED() /*-{
		return Titanium.App.iOS.EVENT_ACCESSIBILITY_LAYOUT_CHANGED;
    }-*/;

    public static native final String EVENT_ACCESSIBILITY_SCREEN_CHANGED() /*-{
		return Titanium.App.iOS.EVENT_ACCESSIBILITY_SCREEN_CHANGED;
    }-*/;

}
