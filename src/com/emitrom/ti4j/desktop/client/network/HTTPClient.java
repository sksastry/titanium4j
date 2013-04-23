/************************************************************************
 * HTTPClient.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

import com.emitrom.ti4j.core.client.Function;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.desktop.client.filesystem.File;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * An HTTPClient which can be used as an alternative to XMLHttpRequest.
 * 
 * @author Ekambi
 * 
 */
public class HTTPClient extends ProxyObject {

    private static final int DONE = HTTPClient.DONE();
    public static final int HEADERS_RECEIVED = HTTPClient.HEADERS_RECEIVED();
    public static final int LOADING = HTTPClient.LOADING();
    public static final int OPENED = HTTPClient.OPENED();
    public static final int UNSENT = HTTPClient.UNSENT();

    protected HTTPClient(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Aborts an in progress connection
     * 
     * @return
     */
    public final native String abort()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.abort();
    }-*/;

    /**
     * Clear any cookies set on the request
     * 
     * @return
     */
    public final native String clearCookies()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.clearCookies();
    }-*/;

    /**
     * Get a HTTP cookie from the response.
     * 
     * @param name
     *            , name of the cookie to get
     * @return
     */
    public final native HTTPCookie getCookie(String name)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getCookie(name);
		return @com.emitrom.ti4j.desktop.client.network.HTTPCookie::new(Lcom/google/gwt/core/client/JavaScriptObject;)(peer);
    }-*/;

    /**
     * Get the maximum number of redirects to follow. The default is -1, which
     * means that there is no maximum limit to the number of redirects to
     * follow.
     * 
     * @return
     */
    public final native double getMaxRedirects()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getMaxRedirects();
    }-*/;

    /**
     * Return all response headers as an array of two element arrays.
     * 
     * @return
     */
    public final native JsArrayString getResponseHeader()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getResponseHeader();
    }-*/;

    /**
     * Return the current timeout setting of obj Network.HTTPClient object in
     * milliseconds. Thie value may be -1 to indicate no timeout. The default
     * timeout value is five minutes.
     * 
     * @return
     */
    public final native int getTimeOut()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getTimeOut();
    }-*/;

    /**
     * Opens an HTTP connection
     * 
     * @param method
     *            , The HTTP method to use e.g. POST
     * @param url
     *            , The url to connect to
     * @return
     */
    public final native boolean open(String method, String url)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.open(method, url);
    }-*/;

    /**
     * Opens an HTTP connection
     * 
     * @param method
     *            , The HTTP method to use e.g. POST
     * @param url
     *            , The url to connect to
     * @param asynchron
     *            , Whether or not the request should be asynchronous (default:
     *            True)
     * @return
     */
    public final native boolean open(String method, String url, boolean asynchron)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.open(method, url, asynchron);
    }-*/;

    /**
     * 
     * Opens an HTTP connection
     * 
     * @param method
     *            , The HTTP method to use e.g. POST
     * @param url
     *            , The url to connect to
     * @param asynchron
     *            , Whether or not the request should be asynchronous (default:
     *            True)
     * @param userName
     *            , The HTTP username to use
     * @return
     */
    public final native boolean open(String method, String url, boolean asynchron, String userName)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.open(method, url, asynchron, userName);
    }-*/;

    /**
     * 
     * Opens an HTTP connection
     * 
     * @param method
     *            , The HTTP method to use e.g. POST
     * @param url
     *            , The url to connect to
     * @param asynchron
     *            , Whether or not the request should be asynchronous (default:
     *            True)
     * @param userName
     *            , The HTTP username to use
     * @param password
     *            , * Opens an HTTP connection
     * 
     * @param method
     *            , The HTTP method to use e.g. POST
     * @param url
     *            , The url to connect to
     * @param asynchron
     *            , Whether or not the request should be asynchronous (default:
     *            True)
     * @param userName
     *            , The HTTP username to use
     * @return
     */
    public final native boolean open(String method, String url, boolean asynchron, String userName, String password)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.open(method, url, asynchron, userName, password);
    }-*/;

    /**
     * Sends a request to the server and receive data with the provided handler.
     * 
     * @param handler
     *            , A handler to receive the response data.
     * @return
     */
    public final native boolean receive(File handler)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.receive(handler.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * 
     * Sends a request to the server and receive data with the provided handler.
     * 
     * @param handler
     *            , A handler to receive the response data.
     * @param data
     *            , Data to send to the server.
     * @return
     */
    public final native boolean receive(File handler, Object data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.receive(
						handler.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						data);
    }-*/;

    /**
     * Sends a request to the server and receive data with the provided handler.
     * 
     * @param handler
     *            , A handler to receive the response data.
     * @return
     */
    public final native boolean receive(Function handler)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.receive(function() {
			handler.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    /**
     * 
     * Sends a request to the server and receive data with the provided handler.
     * 
     * @param handler
     *            , A handler to receive the response data.
     * @param data
     *            , Data to send to the server.
     * @return
     */
    public final native boolean receive(Function handler, Object data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.receive(function() {
			handler.@com.emitrom.ti4j.core.client.Function::execute()();
		}, data);
    }-*/;

    /**
     * Sends the contents of a file as body content
     * 
     * @param file
     *            , the File object to send
     * @return
     */
    public final native String sendFile(File file)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.sendFile(file.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Set the basic authentication credentials
     * 
     * @param userName
     *            , The username to use or an empty String to use none
     * @param password
     *            , The password to use or an empty String to use none
     * @return
     */
    public final native String setBasicCredentials(String userName, String password)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setBasicCredentials(userName, password);
    }-*/;

    /**
     * Set a HTTP cookie in the request.
     * 
     * @param name
     *            ,the cookie name
     * 
     * @param value
     *            ,the cookie value
     * @return
     */
    public final native String setCookie(String name, String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setCookie(name, value);
    }-*/;

    /**
     * Set the authentication credentials for the HTTPClient.
     * 
     * @param userName
     *            , The username to use or an empty String to use none
     * @param password
     *            , The password to use or an empty String to use none
     * @return
     */
    public final native String setCredentials(String userName, String password)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setCredentials(userName, password);
    }-*/;

    /**
     * Set the maximum number of redirects to follow. The default is -1, which
     * means that there is no maximum limit to the number of redirects to
     * follow.
     * 
     * @param amount
     *            , the number of redirects to follow.
     * @return
     */
    public final native String setMaxRedirects(double amount)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setMaxRedirects(amount);
    }-*/;

    /**
     * Sets a request header for the connection
     * 
     * @param header
     *            , request header name
     * @param value
     *            , request header value
     * @return
     */
    public final native String setRequestHeader(String header, String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setRequestHeader(header, value);
    }-*/;

    /**
     * Set the timeout setting of obj Network.HTTPClient. Thie value may be -1
     * to indicate no timeout. The default timeout value is five minutes.
     * 
     * @param value
     *            ,The new timeout value in milliseconds.
     * @return
     */
    public final native String setTimeOut(double value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setTimeOut(value);
    }-*/;

    /**
     * Whether an HTTPClient object is connected or not
     * 
     * @return
     */
    public final native boolean isConnected()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.connected;
    }-*/;

    /**
     * Amount of data sent to server so far. Updated on HTTP_DATA_SENT event.
     * 
     * @return
     */
    public final native String getDataSent()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.dataSent;
    }-*/;

    /**
     * Amount of data received from server so far. Updated on HTTP_DATA_RECEIVED
     * event.
     * 
     * @return
     */
    public final native String getDataReceived()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.dataReceived;
    }-*/;

    /**
     * The handler function that will be fired as stream data is received from
     * an HTTP request
     * 
     * @param callback
     */
    public final native void setOnDataStream(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.ondatastream = function() {
			callback.callback.@com.emitrom.ti4j.core.client.Function::execute()();
		};
    }-*/;

    /**
     * The handler function that will be fired when request is completed
     * 
     * @param callback
     */
    public final native void setOnLoad(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.onload = function() {
			callback.callback.@com.emitrom.ti4j.core.client.Function::execute()();
		};
    }-*/;

    /**
     * The handler function that will be fired when the readyState code of an
     * HTTPClient object changes.
     * 
     * @param callback
     */
    public final native void setReadyStateChange(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.onreadystatechange = function() {
			callback.callback.@com.emitrom.ti4j.core.client.Function::execute()();
		};
    }-*/;

    /**
     * The handler function that will be fired as the stream data is sent.
     * 
     * @param callback
     */
    public final native void setOnSendStream(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.onsendstream = function() {
			callback.callback.@com.emitrom.ti4j.core.client.Function::execute()();
		};
    }-*/;

    public final native int getReadyState()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.readyState;
    }-*/;

    /**
     * The response of an HTTP request as a Bytes. Currently obj property is
     * only valid after the request has been completed.
     * 
     * @return
     */
    public final native String getResponseData()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.responseData;
    }-*/;

    /**
     * The response of an HTTP request as text
     * 
     * @return
     */
    public final native String getResponseText()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.responseText;
    }-*/;

    /**
     * The response of an HTTP request as XML
     * 
     * @return
     */
    public final native String getResponseXML()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.responseXML;
    }-*/;

    /**
     * The response status code of an HTTP request
     * 
     * @return
     */
    public final native int getStatus()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.status;
    }-*/;

    /**
     * The response of an HTTP request as text
     * 
     * @return
     */
    public final native int getStatusText()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.statusText;
    }-*/;

    /**
     * True if HTTP request timed out
     * 
     * @return
     */
    public final native boolean hasTimedOut()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.timedOut;
    }-*/;

    /**
     * The request URL. This value will be updated on redirect events.
     * 
     * @return
     */
    public final native String getUrl()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.url;
    }-*/;

    /**
     * User agent string to use for requests. (Default: Ti.userAgent)
     * 
     * @return
     */
    public final native String getUserAgent()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.userAgent;
    }-*/;

    private static native int DONE()/*-{
		return Ti.Network.HTTPClient.DONE;
    }-*/;

    private static native int HEADERS_RECEIVED()/*-{
		return Ti.Network.HTTPClient.HEADERS_RECEIVED;
    }-*/;

    private static native int LOADING()/*-{
		return Ti.Network.HTTPClient.LOADING;
    }-*/;

    private static native int UNSENT()/*-{
		return Ti.Network.HTTPClient.UNSENT;
    }-*/;

    private static native int OPENED()/*-{
		return Ti.Network.HTTPClient.OPENED;
    }-*/;

}
