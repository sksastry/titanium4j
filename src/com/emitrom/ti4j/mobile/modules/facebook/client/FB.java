package com.emitrom.ti4j.mobile.modules.facebook.client;

import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;

/**
 * Add-on Facebook module. The Facebook module is used for connecting your
 * application with Facebook.
 * <p>
 * This module supports the following features: <br/>
 * <ul>
 * <li>Logging in to Facebook and authorizing your application.</li>
 * <li>Making requests through the Facebook Graph API using the
 * requestWithGraphPath method.</li>
 * <li>Making requests through the legacy Facebook REST API using the request
 * method.</li>
 * <li>Posting Facebook dialogs.</li>
 * </ul>
 * <p>
 * For releases prior to 3.1.0, use the built-in Titanium.Facebook module.</li>
 * 
 */
public class FB extends TiModule {

    public static final String FB_BUTTON_STYLE_NORMAL = BUTTON_STYLE_NORMAL();
    public static final String FB_BUTTON_STYLE_WIDE = BUTTON_STYLE_WIDE();

    private static final FB INSTANCE = new FB();

    public static FB get(String applicationID) {
        INSTANCE.setAppId(applicationID);
        return INSTANCE;
    }

    private FB() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = create();
    }

    /**
     * Your Facebook application id. You need to set this for anything to work.
     */
    private native void setAppId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.appId = value;
    }-*/;

    /**
     * Your Facebook application id. You need to set this for anything to work.
     */
    public native String getAppId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.appId;
    }-*/;

    /**
     * OAuth token set after a successful authorize.
     */
    public native String getAccessToken() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.accessToken;
    }-*/;

    /**
     * Time at which the accessToken expires.
     */
    public native JsDate getExpirationDate() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.expirationDate;
    }-*/;

    /**
     * Indicates whether the login should use the traditional dialog-based
     * authentication.
     * <p>
     * Set to false to enable Single-Sign-On (SSO) in cases where the official
     * Facebook app is on the device. Default is true, meaning the traditional,
     * dialog-based authentication is used rather than SSO. See the Facebook
     * Mobile Guide for details of their Single-Sign-On scheme.
     * <p>
     * To use the built-in iOS 6 login, set this property to false. This
     * property is read-only on Mobile Web.
     * <p>
     * Default: true
     */
    public native boolean forceDialogAuth() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.forceDialogAuth;
    }-*/;

    /**
     * Indicates whether the login should use the traditional dialog-based
     * authentication.
     * <p>
     * Set to false to enable Single-Sign-On (SSO) in cases where the official
     * Facebook app is on the device. Default is true, meaning the traditional,
     * dialog-based authentication is used rather than SSO. See the Facebook
     * Mobile Guide for details of their Single-Sign-On scheme.
     * <p>
     * To use the built-in iOS 6 login, set this property to false. This
     * property is read-only on Mobile Web.
     * <p>
     * Default: true
     */
    public native boolean setForceDialogAuth(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.forceDialogAuth = value
    }-*/;

    /**
     * Indicates if the user is logged in.
     */
    public native boolean isLoggedIn() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.loggedIn;
    }-*/;

    /**
     * Unique user ID returned from Facebook.
     */
    public native String getUid() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.uid;
    }-*/;

    /**
     * Array of permissions to request for your app.
     * <p>
     * Be sure the permissions you want are set before calling authorize.
     * <p>
     * To use the build-in iOS 6 login, this property cannot contain any of the
     * following: offline_access, publish_actions, publish_stream,
     * publish_checkins, ads_management, create_event, rsvp_event,
     * manage_friendlists, manage_notifications, or manage_pages.
     */
    public native JsArrayString getPermissions() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.permissions;
    }-*/;

    /**
     * Array of permissions to request for your app.
     * <p>
     * Be sure the permissions you want are set before calling authorize.
     * <p>
     * To use the build-in iOS 6 login, this property cannot contain any of the
     * following: offline_access, publish_actions, publish_stream,
     * publish_checkins, ads_management, create_event, rsvp_event,
     * manage_friendlists, manage_notifications, or manage_pages.
     */
    public native void setPermissions(JsArrayString values) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.permissions = values;
    }-*/;

    public void setPermissions(String... values) {
        JsArrayString perms = JsArrayString.createArray().cast();
        for (String v : values) {
            perms.push(v);
        }
        setPermissions(perms);
    }

    /**
     * Prompts the user to log in (if not already logged in) and authorize your
     * application. Be sure to set your appid and your required permissions
     * before calling authorize.
     * <p>
     * A login event is generated to indicate successful or unsuccessful login
     * attempt.
     */
    public native void authorize() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.authorize();
    }-*/;

    /**
     * Creates and returns an instance of Modules.Facebook.LoginButton.
     */
    public native LoginButton createLoginButton() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createLoginButton();
		return @com.emitrom.ti4j.mobile.modules.facebook.client.LoginButton::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates and returns an instance of Modules.Facebook.LoginButton.
     */
    public native LoginButton createLoginButton(String buttonStyle) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createLoginButton({
			style : buttonStyle
		});
		return @com.emitrom.ti4j.mobile.modules.facebook.client.LoginButton::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native JavaScriptObject create()/*-{
		return require('facebook');
    }-*/;

    public static native String BUTTON_STYLE_NORMAL()/*-{
		var fb = require('facebook');
		return fb.BUTTON_STYLE_NORMAL;
    }-*/;

    public static native String BUTTON_STYLE_WIDE()/*-{
		var fb = require('facebook');
		return fb.BUTTON_STYLE_WIDE;
    }-*/;

}
