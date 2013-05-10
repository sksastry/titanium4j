/************************************************************************
 * CallbackRegistration.java is part of Ti4j 3.1.0 Copyright 2013 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.events;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * A callback registration object, created so that an event listener can
 * unregister.
 * 
 */
public class CallbackRegistration implements HandlerRegistration {

    private final ProxyObject proxyObject;
    private final String actionString;
    private final JavaScriptObject functionJso;

    /**
     * Constructor.
     * 
     * @param proxyObject
     *            The object to which the listener was created against
     * @param actionString
     *            The name of the action
     * @param jso
     *            The function that needs to be removed on unregister
     */
    public CallbackRegistration(ProxyObject uiObject, String actionString, JavaScriptObject jso) {
        this.proxyObject = uiObject;
        this.actionString = actionString;
        this.functionJso = jso;
    }

    public ProxyObject getProxyObject() {
        return proxyObject;
    }

    public String getActionString() {
        return actionString;
    }

    public JavaScriptObject getJso() {
        return functionJso;
    }

    @Override
    public void removeHandler() {
        unregister();
    }

    /**
     * Unregisters the event listener from the object
     */
    public native void unregister() /*-{
		var obj = this.@com.emitrom.ti4j.desktop.client.events.CallbackRegistration::getProxyObject()();
		var objjso = obj.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var action = this.@com.emitrom.ti4j.desktop.client.events.CallbackRegistration::getActionString()();
		var jso = this.@com.emitrom.ti4j.desktop.client.events.CallbackRegistration::getJso()();
		objjso.removeEventListener(action, jso);
    }-*/;
}
