/************************************************************************
  User.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.core;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represent the person that send the chat message
 */
public class User extends AbstractCloudResponse {

    public User() {
        jsObj = JsoHelper.createObject();
    }

    public User(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native String getFirstName()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.first_name;
    }-*/;

    public native String getLastName()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.last_name;
    }-*/;

    public native String getUserName()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.user_name;
    }-*/;

    public native String getEmail()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.email;
    }-*/;
}
