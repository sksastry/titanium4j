/**************************************************************************
   ProxyObject.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.core.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class for wrapping a native Javascript class. <b>Note</b> : For internal
 * use only.
 */
public class ProxyObject {

    protected JavaScriptObject jsObj;

    protected ProxyObject() {
    }

    public ProxyObject(JavaScriptObject jsObj) {
        this.jsObj = jsObj;
    }

    @SuppressWarnings("unused")
    private static ProxyObject create(JavaScriptObject obj) {
        return new ProxyObject(obj) {
        };
    }

    protected boolean isCreated() {
        return jsObj != null;
    }

    final public JavaScriptObject getJsObj() {
        return jsObj;
    }

    final public void setJsObj(JavaScriptObject jsObj) {
        this.jsObj = jsObj;
    }

    public void addProperty(String properytyName, String value) {
        JsoHelper.setAttribute(jsObj, properytyName, value);
    }

    public void addProperty(String properytyName, double value) {
        JsoHelper.setAttribute(jsObj, properytyName, value);
    }

    public void addProperty(String properytyName, ProxyObject value) {
        JsoHelper.setAttribute(jsObj, properytyName, value.getJsObj());
    }

    public String getString(String propertyName) {
        return JsoHelper.getAttribute(jsObj, propertyName);
    }

    public double getDouble(String propertyName) {
        return JsoHelper.getAttributeAsDouble(jsObj, propertyName);
    }

    public ProxyObject getObject(String propertyName) {
        JavaScriptObject obj = JsoHelper.getAttributeAsJavaScriptObject(jsObj, propertyName);
        return new ProxyObject(obj);
    }
}
