/************************************************************************
 * HTTPServerResponse.java is part of Titanium4j Desktop 1.2 Copyright 2012
 * Emitrom LLC
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
 * An object representing a single HTTP server response.
 * 
 * @author Ekambi
 * 
 */
public class HTTPServerResponse extends ProxyObject {

    protected HTTPServerResponse(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * add a cookie to obj response
     * 
     * @param name
     *            , the cookie name
     * @param value
     *            , the cookie value
     * @return
     */
    public final native String addCookie(String name, String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.addCookie(name, value);
    }-*/;

    /**
     * 
     * add a cookie to obj response
     * 
     * @param name
     *            , the cookie name
     * @param value
     *            , the cookie value
     * @param maxAge
     *            ,the cookie's maximum age
     * @return
     */
    public final native String addCookie(String name, String value, int maxAge)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.addCookie(name, value, maxAge);
    }-*/;

    /**
     * 
     * add a cookie to obj response
     * 
     * @param name
     *            , the cookie name
     * @param value
     *            , the cookie value
     * @param maxAge
     *            ,the cookie's maximum age
     * @param domain
     *            , the cookie's domain
     * @return
     */
    public final native String addCookie(String name, String value, int maxAge, String domain)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.addCookie(name, value, maxAge, domain);
    }-*/;

    /**
     * 
     * add a cookie to obj response
     * 
     * @param name
     *            , the cookie name
     * @param value
     *            , the cookie value
     * @param maxAge
     *            ,the cookie's maximum age
     * @param domain
     *            , the cookie's domain
     * @param path
     *            , the cookie's path
     * @return
     */
    public final native String addCookie(String name, String value, int maxAge, String domain, String path)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.addCookie(name, value, maxAge, domain, path);
    }-*/;

    /**
     * set the content length of obj response
     * 
     * @param length
     *            , the content length
     * @return
     */
    public final native String setContentLength(int length)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setContentLength(length);
    }-*/;

    /**
     * set the content type of obj response
     * 
     * @param type
     *            , the content type, i.e "text/plain"
     * @return
     */
    public final native String setContentType(String type)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setContentType(type);
    }-*/;

    /**
     * set an HTTP header of obj response
     * 
     * @param name
     *            ,the header name
     * @param value
     *            ,the header value
     * @return
     */
    public final native String setHeader(String name, String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setHeader(name, value);
    }-*/;

    /**
     * set the reason of obj response
     * 
     * @param reason
     *            , the reason, i.e "OK"
     * @return
     */
    public final native String setReason(String reason)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setReason(reason);
    }-*/;

    /**
     * set the status of obj response
     * 
     * @param value
     *            , the status, i.e "200"
     * @return
     */
    public final native String setStatus(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setStatus(value);
    }-*/;

    /**
     * set the status and reason of obj response
     * 
     * @param status
     *            , the status, i.e "200"
     * @param reason
     *            , the reason, i.e "OK"
     * @return
     */
    public final native String setStatusAndReason(String status, String reason)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setStatusAndReason(status, reason);
    }-*/;

    /**
     * 
     * write content into obj response
     * 
     * @param data
     *            , content to write (can be string or bytes content)
     * @return
     */
    public final native String write(String data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.write(data);
    }-*/;

}
