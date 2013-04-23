package com.emitrom.ti4j.mobile.modules.facebook.client;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Facebook login button.
 * <p>
 * The Login Button created by Modules.Facebook.createLoginButton. This is a
 * Facebook-themed button that does not require a click event handler or any
 * listeners. Click events on the button are automatically handled by the
 * Facebook module.
 * <p>
 * The button changes its label to reflect the current state of the Facebook
 * session. For example, if the user is already logged in, this button will show
 * "Logout".
 * 
 */
public class LoginButton extends ProxyObject {

    protected LoginButton(JavaScriptObject obj) {
        jsObj = obj;
    }
}
