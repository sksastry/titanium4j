/************************************************************************
 * Network.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.network;

import java.util.List;

import com.emitrom.ti4j.desktop.client.events.TiEventHandler;

/**
 * A module for network functionality.
 * 
 * @author Ekambi
 * 
 */
public class Network {

    private Network() {

    }

    /**
     * Adds a connectivity change listener that fires when the system connects
     * or disconnects from the internet
     * 
     * @param listener
     * @return
     */

    public static native double addConnectivityListener(TiEventHandler handler)/*-{
		return Ti.Network
				.addConnectivityListener(function(e) {
					var event = @com.emitrom.ti4j.desktop.client.events.TiEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
					handler.@com.emitrom.ti4j.desktop.client.events.TiEventHandler::onEvent(Lcom/emitrom/ti4j/desktop/client/events/TiEvent;)(event);
				});
    }-*/;

    /**
     * Creates an HTTPClient object
     * 
     * @return
     */
    public static native HTTPClient createHTTPClient()/*-{
		var obj = Ti.Network.createHTTPClient();
		return @com.emitrom.ti4j.desktop.client.network.HTTPClient::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates a new HTTPCookie object
     * 
     * @return
     */
    public static native HTTPCookie createHTTPCookie()/*-{
		var obj = Ti.Network.createHTTPCookie();
		return @com.emitrom.ti4j.desktop.client.network.HTTPCookie::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates an HTTPServer object
     * 
     * @return
     */
    public static native HTTPServer createHTTPServer()/*-{
		var obj = Ti.Network.createHTTPServer();
		return @com.emitrom.ti4j.desktop.client.network.HTTPServer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates an IPAddress object
     * 
     * @param adress
     *            , the IP address
     * @return
     */
    public static native IPAddress createIPAddress(String adress)/*-{
		var obj = Ti.Network.createIPAddress(adress);
		return @com.emitrom.ti4j.desktop.client.network.IPAddress::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates an IRCClient object
     * 
     * @return
     */
    public static native IRCClient createIRCClient()/*-{
		var obj = Ti.Network.createIRCClient();
		return @com.emitrom.ti4j.desktop.client.network.IRCClient::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates a TCPSocket object
     * 
     * @param host
     *            ,the hostname to connect to
     * @param port
     *            , the port to use
     * @return
     */
    public static native TCPSocket createTCPSocket(String host, double port)/*-{
		var obj = Ti.Network.createTCPSocket(host, port);
		return @com.emitrom.ti4j.desktop.client.network.TCPSocket::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Decodes a URI component
     * 
     * @param value
     *            , value to decode
     * @return
     */
    public static native String decodeURIComponent(String value)/*-{
		return Ti.Network.decodeURIComponent(value);
    }-*/;

    /**
     * Encodes a URI Component
     * 
     * @param value
     *            , value to encode
     * @return
     */
    public static native String encodeURIComponent(String value)/*-{
		return Ti.Network.encodeURIComponent(value);
    }-*/;

    /**
     * Return the first IPv4 address in this system's list of interfaces.
     * 
     * @return
     */
    public static native String getFirstIPAddress()/*-{
		return Ti.Network.getFirstIPAddress();
    }-*/;

    /**
     * Return the first MAC address in this system's list of interfaces.
     * 
     * @return
     */
    public static native String getFirstMACAddress()/*-{
		return Ti.Network.getFirstMACAddress();
    }-*/;

    /**
     * Return the proxy override, if one is set.
     * 
     * @return
     */
    public static native String getHTTPProxy()/*-{
		return Ti.Network.getHTTPProxy();
    }-*/;

    /**
     * Return the proxy override, if one is set.
     * 
     * @return
     */
    public static native String getHTTPSProxy()/*-{
		return Ti.Network.getHTTPSProxy();
    }-*/;

    /**
     * Returns a Host object using an address
     * 
     * @param adress
     *            , the address
     * @return
     */
    public static native Host getHostByAddress(String adress)/*-{
		var obj = Ti.Network.getHostByAddress(adress);
		return @com.emitrom.ti4j.desktop.client.network.Host::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns a Host object using a hostname
     * 
     * @param name
     *            , the hostname
     * @return
     */
    public static native Host getHostByName(String name)/*-{
		var obj = Ti.Network.getHostByName(name);
		return @com.emitrom.ti4j.desktop.client.network.Host::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return a list of network interfaces on this system.
     * 
     * @return
     */
    public static native List<Interface> getInterfaces()/*-{
		var obj = Ti.Network.getInterfaces();
		return @com.emitrom.ti4j.desktop.client.network.Interface::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Removes a connectivity change listener
     * 
     * @param id
     *            ,the callback id of the method
     * @return
     */
    public static native String removeConncetivityListener(int id)/*-{
		return Ti.Network.removeConncetivityListener(id);
    }-*/;

    /**
     * Override application proxy autodetection with a proxy URL.
     * 
     * @param hostName
     *            , The full proxy hostname.
     * @return
     */
    public static native String setHTTPProxy(String hostName)/*-{
		return Ti.Network.setHTTPProxy(hostName);
    }-*/;

    /**
     * Override application proxy autodetection with a proxy URL.
     * 
     * @param hostName
     *            , The full proxy hostname.
     * @return
     */
    public static native String setHTTPSProxy(String hostName)/*-{
		return Ti.Network.setHTTPSProxy(hostName);
    }-*/;

    /**
     * Whether or not the system is connected to the internet
     * 
     * @return
     */
    public static native boolean isOnline()/*-{
		return Ti.Network.online;
    }-*/;

}
