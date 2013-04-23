/************************************************************************
 * Properties.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use obj file except in compliance with the License. You may obtain a copy of
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
package com.emitrom.ti4j.desktop.client.app;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * An object holding a group of properties. Application properties provide an
 * alternative to storing information in HTML5 Databases or through the TideSDK
 * Database module. They can be categorized into System Properties and User
 * Properties.
 * 
 */
public class Properties extends ProxyObject {

    protected Properties(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Returns a property value as double. Throws an exception if obj value can
     * not be found and no default is provided or the value stored in the
     * properties file could not be converted to the appropriate type.
     * 
     * @param name
     *            ,The name of the property to return.
     * @param defaultValue
     *            , The value to return if obj property is not set.
     * @return
     */
    public final native double getDouble(String name, double defaultValue)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getDouble(name, defaultValue);
    }-*/;

    /**
     * Returns a property value as integer. Throws an exception if obj value can
     * not be found and no default is provided or the value stored in the
     * properties file could not be converted to the appropriate type.
     * 
     * @param name
     *            ,The name of the property to return.
     * @param defaultValue
     *            , The value to return if obj property is not set.
     * @return
     */
    public final native int getInt(String name, int defaultValue)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getInt(name, defaultValue);
    }-*/;

    /**
     * Returns a property value as an Array. Throws an exception if obj value
     * can not be found and no default is provided or the value stored in the
     * properties file could not be converted to the appropriate type.
     * 
     * 
     * @param name
     *            ,The name of the property to return.
     * @param defaultValue
     *            , The value to return if obj property is not set.
     * @return
     */
    public final native <T> T getList(Object name, Object defaultValue)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getList(name, defaultValue);
    }-*/;

    /**
     * Returns a property value as string. Throws an exception if obj value can
     * not be found and no default is provided or the value stored in the
     * properties file could not be converted to the appropriate type.
     * 
     * @param name
     *            ,The name of the property to return.
     * @param defaultValue
     *            , The value to return if obj property is not set.
     * @return
     */
    public final native String getString(String name, String defaultValue)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.string(name, defaultValue);
    }-*/;

    /**
     * Query whether or not a given property exists in obj Property object.
     * 
     * @param name
     *            ,The name of the property to return.
     * @return
     */
    public final native boolean hasProperty(String name)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.hasProperty(name);
    }-*/;

    /**
     * Returns an Array of all property names in obj App.Properties object.
     * 
     * @return
     */
    public final native JsArrayString listProperties()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.listProperties();
    }-*/;

    /**
     * Save obj App.Properties object to file at the given path.
     * 
     * @param path
     */
    public final native void saveTo(String path)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.saveTo(path);
    }-*/;

    /**
     * Set a double property value given the name and value.
     * 
     * @param name
     *            ,The name of the property to return.
     * @param defaultValue
     *            , The value to return if obj property is not set.
     */
    public final native void setDouble(String name, double value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setDouble(name, value);
    }-*/;

    /**
     * Set a double property value given the name and value.
     * 
     * @param name
     *            ,The name of the property to return.
     * @param defaultValue
     *            , The value to return if obj property is not set.
     */
    public final native void setInt(String name, int value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setInt(name, value);
    }-*/;

    /**
     * Set a double property value given the name and value.
     * 
     * @param name
     *            ,The name of the property to return.
     * @param defaultValue
     *            , The value to return if obj property is not set.
     */
    public final native void setList(String name, Object value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setList(name, value);
    }-*/;

    /**
     * Set a double property value given the name and value.
     * 
     * @param name
     *            ,The name of the property to return.
     * @param defaultValue
     *            , The value to return if obj property is not set.
     */
    public final native void setString(String name, String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setString(name, value);
    }-*/;

}
