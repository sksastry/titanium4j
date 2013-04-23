/************************************************************************
 * HTTPCookie.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.network;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing an HTTP cookie.
 * 
 * @author Ekambi
 * 
 */
public class HTTPCookie extends ProxyObject {

    protected HTTPCookie(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Get the cookie comment text
     * 
     * @return
     */
    public final native String getComment()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getComment();
    }-*/;

    /**
     * Get the domain for which the cookie is valid
     * 
     * @return
     */
    public final native String getDomain()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getDomain();
    }-*/;

    /**
     * Get the lifetime of the cookie, in seconds.
     * 
     * @return
     */
    public final native int getMaxAge()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getMaxAge();
    }-*/;

    /**
     * Get the cookie name
     * 
     * @return
     */
    public final native String getName()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getName();
    }-*/;

    /**
     * Get the subset of URLs to which obj cookie applies
     * 
     * @return
     */
    public final native String getPath()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getPath();
    }-*/;

    /**
     * Get the cookie value
     * 
     * @return
     */
    public final native String getValue()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getValue();
    }-*/;

    /**
     * Identifies to which version of the state management specification the
     * cookie conforms. 0 = netscape 1 = RFC2109
     * 
     * @return
     */
    public final native int getVersion()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getVersion();
    }-*/;

    /**
     * Check if the http only flag is set on the cookie
     * 
     * @return
     */
    public final native boolean isHTTPOnly()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isHTTPOnly();
    }-*/;

    /**
     * Check if the secure flag is set on the cookie
     * 
     * @return
     */
    public final native boolean isSecure()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isSecure();
    }-*/;

    /**
     * Set the cookie comment text
     * 
     * @param value
     *            , text to set as comment
     * @return
     */
    public final native String setComment(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setComment(value);
    }-*/;

    /**
     * Set the domain for which the cookie is valid
     * 
     * @param value
     *            , the domain to set
     * @return
     */
    public final native String setDomain(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setDomain(value);
    }-*/;

    /**
     * Set the http only flag on the cookie
     * 
     * @param value
     *            , if True sets the http only flag
     * @return
     */
    public final native String setHTTPOnly(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setHTTPOnly(value);
    }-*/;

    /**
     * Set the lifetime of the cookie, in seconds.
     * 
     * @param value
     *            , the lifetime in seconds. 0 = discard
     * @return
     */
    public final native String setMaxAge(int value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setMaxAge(value);
    }-*/;

    /**
     * Set the cookie name
     * 
     * @param value
     *            , name of the cookie
     * @return
     */
    public final native String setName(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setName(value);
    }-*/;

    /**
     * Set the subset of URLs to which obj cookie applies
     * 
     * @param value
     *            , the path to set
     * @return
     */
    public final native String setPath(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setPath(value);
    }-*/;

    /**
     * Set the secure flag on the cookie
     * 
     * @param value
     *            , if True makes the cookie secure
     * @return
     */
    public final native String setSecure(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setSecure(value);
    }-*/;

    /**
     * Set the cookie value
     * 
     * @param newValue
     *            , value to set cookie
     * @return
     */
    public final native String setValue(String newValue)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setValue(newValue);
    }-*/;

    /**
     * Set the state management specifiction version the cookie conforms.
     * (Default: 0)
     * 
     * @param value
     *            , cookie version (0 or 1)
     * @return
     */
    public final native String setVersion(int value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setVersion(value);
    }-*/;

    /**
     * return a string representation of the cookie
     * 
     * @return
     */
    public final native String stringValue()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.toString();
    }-*/;

}
