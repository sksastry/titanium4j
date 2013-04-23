/************************************************************************
 * HTTPServerRequest.java is part of Titanium4j Desktop 1.2 Copyright 2012
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
import com.google.gwt.core.client.JsArrayString;

/**
 * An object representing a single HTTP server request.
 * 
 * @author Ekambi
 * 
 */
public class HTTPServerRequest extends ProxyObject {

    protected HTTPServerRequest(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the content length of obj request
     * 
     * @return
     */
    public final native double getContentLength()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getContentLength();
    }-*/;

    /**
     * get the content type of obj request
     * 
     * @return
     */
    public final native String getContentType()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getContentType();
    }-*/;

    /**
     * get an HTTP header value from obj request
     * 
     * @param header
     *            , the header of the request
     * @return
     */
    public final native String getHeader(String header)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getHeader();
    }-*/;

    /**
     * get an HTTP header value from obj request
     * 
     * @return
     */
    public final native JsArrayString getHeaders()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getHeaders();
    }-*/;

    /**
     * get the HTTP method of obj request
     * 
     * @return
     */
    public final native String getMethod()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getMethod();
    }-*/;

    /**
     * get the URI of obj request
     * 
     * @return
     */
    public final native String getURI()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getURI();
    }-*/;

    /**
     * get the HTTP version of obj request
     * 
     * @return
     */
    public final native String getVersion()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getVersion();
    }-*/;

    /**
     * check to see if obj request has an HTTP header
     * 
     * @param header
     *            , the header of the request to check
     * 
     * @return
     */
    public final native boolean hasHeader(String header)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.hasHeader(header);
    }-*/;

    /**
     * read content from obj request
     * 
     * @return
     */
    public final native String read()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.read();
    }-*/;

    /**
     * read content from obj request
     * 
     * @param length
     *            , the number of bytes to read (default 8096)
     * @return
     */
    public final native String read(int length)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.read(length);
    }-*/;

}
