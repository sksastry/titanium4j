/************************************************************************
  LoginButton.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
