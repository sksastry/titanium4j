/**************************************************************************
 * Intent.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.mobile.client.android;

import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an Android Intent
 */
public class Intent extends EventDispatcher {

    protected Intent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Add a category to this Intent. See the category constants in the
     * AndroidMedia class.
     * 
     * @param name
     *            , the category name.
     */
    public native void addCategory(String name) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.addCategory(name);
    }-*/;

    /**
     * Augment the existing flags on the Intent.
     * 
     * @param flags
     *            , the flags to add to the existing set.
     */
    public native void addFlags(int flags) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.addFlags(flags);
    }-*/;

    /**
     * Get a boolean property from this Intent
     * 
     * @param name
     *            , The boolean property to get
     * @return
     */
    public native boolean getBooleanExtra(String name) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.getBooleanExtra(name);
    }-*/;

    /**
     * Get the Data URI from this Intent
     */
    public native void getData() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.getData();
    }-*/;

    /**
     * Get a double property from this Intent
     * 
     * @param name
     *            , The double property to get
     * @return
     */
    public native boolean getDoubleExtra(String name) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.getDoubleExtra(name);
    }-*/;

    /**
     * Get a int property from this Intent
     * 
     * @param name
     *            , The int property to get
     * @return
     */
    public native boolean getIntExtra(String name) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.getIntExtra(name);
    }-*/;

    /**
     * Get a long property from this Intent
     * 
     * @param name
     *            , The long property to get
     * @return
     */
    public native boolean getLongExtra(String name) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.getLongExtra(name);
    }-*/;

    /**
     * Get a string property from this Intent
     * 
     * @param name
     *            , The string property to get
     * @return
     */
    public native boolean getStringExtra(String name) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.getStringExtra(name);
    }-*/;

    /**
     * Returns whether or not this Intent has a property
     * 
     * @param name
     *            , The property name to check for
     * @return
     */
    public native boolean hasExtra(String name) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.hasExtra(name);
    }-*/;

    /**
     * Put an extra property on this Intent
     * 
     * @param name
     *            , The property name
     * @param value
     *            , The property value
     */
    public native void putExtra(String name, Object value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.putExtra(name, value);
    }-*/;

    /**
     * Put an extra property on this Intent
     * 
     * @param name
     *            , The property name
     * @param value
     *            , The URI value
     */
    public native void putExtraUri(String name, String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.putExtraUri(name, value);
    }-*/;

    /**
     * Gets the action constant of this Intent.
     * 
     * @see com.emitrom.ti4j.mobile.client.android.Android
     * @return
     */
    public native String getAction() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.action;
    }-*/;

    /**
     * Sets the action constant of this Intent.
     * 
     * @see com.emitrom.ti4j.mobile.client.android.Android
     * @param value
     *            , the bane of the action
     */
    public native void setAction(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.action = value;
    }-*/;

    public native String getClassName() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.className;
    }-*/;

    /**
     * Sets the Java class name of the activity (packageName must also be set)
     * 
     * @param value
     */
    public native void setClassName(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.className = value;
    }-*/;

    /**
     * The Intent's Data URI. See also Intent.setData
     * 
     * @param value
     */
    public native void setData(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.data = value;
    }-*/;

    public native int getFlags() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.flags;
    }-*/;

    /**
     * Set the Intent flags. See the flags constants in
     * com.emitrom.ti4j.mobile.client.android.Android
     * 
     * @param value
     */
    public native void setFlags(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.flags = value;
    }-*/;

    public native String getPackageName() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.packageName;
    }-*/;

    /**
     * Sets the fully-qualified Java package name of the activity
     * 
     * @param value
     */
    public native void setPackageName(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.packageName = value;
    }-*/;

    public native String getType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.type;
    }-*/;

    /**
     * Sets the mime type for this Intent. See also AndroidMedia's
     * Intent.setType
     * 
     * @param value
     */
    public native void setType(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.type = value;
    }-*/;

    public native String getUrl() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.url;
    }-*/;

    /**
     * The URL to a Titanium Javascript Activity
     * 
     * @param value
     */
    public native void setUrl(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.url = value;
    }-*/;

}
