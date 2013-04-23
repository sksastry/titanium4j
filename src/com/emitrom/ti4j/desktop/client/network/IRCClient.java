/************************************************************************
 * IRCClient.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
import com.emitrom.ti4j.desktop.client.events.TiEventHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * An object representing an IRC client connection.
 * 
 * @author Ekambi
 * 
 */
public class IRCClient extends ProxyObject {

    protected IRCClient(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Connects an IRC to the host specified during creation of the IRCClient
     * object
     * 
     * @param hostName
     *            , the hostname
     * @param port
     *            , the port
     * @param nick
     *            , the users nickname
     * @param name
     *            , the users full name
     * @param user
     *            , the users login name
     * @param pass
     *            , the users password
     * @param callback
     *            , a callback function to receive IRC events
     * @return
     */

    public final native String connect(String hostName, int port, String nick, String name, String user, String pass,
                    TiEventHandler callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.connect(
						hostName,
						port,
						nick,
						name,
						user,
						pass,
						function(e) {
							var event = @com.emitrom.ti4j.desktop.client.events.TiEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.emitrom.ti4j.desktop.client.events.TiEventHandler::onEvent(Lcom/emitrom/ti4j/desktop/client/events/TiEvent;)(event);
						});
    }-*/;

    /**
     * Disconnects an IRC connection
     * 
     * @return
     */
    public final native String disconnet()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.disconnet();
    }-*/;

    /**
     * Returns the nick name for the connection
     * 
     * @return
     */
    public final native String getNick()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getNick();
    }-*/;

    /**
     * Returns a list of users for the channel
     * 
     * @return
     */
    public final native JsArrayString getUsers()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getUsers();
    }-*/;

    /**
     * Checks whether a user has OP status
     * 
     * @return
     */
    public final native boolean isOp()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isOp();
    }-*/;

    /**
     * Checks whether a user has VOICE status
     * 
     * @return
     */
    public final native boolean isVoice()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isVoice();
    }-*/;

    /**
     * Joins a channel
     * 
     * @param channel
     *            ,channel to join
     * @return
     */
    public final native String join(String channel)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.join(channel);
    }-*/;

    /**
     * Sends data to the IRC connection
     * 
     * @param channel
     *            ,the channel to send the data to
     * @param message
     *            , message to send
     * @return
     */
    public final native String send(String channel, String message)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.send(channel, message);
    }-*/;

    /**
     * Sets the nick name for the connection
     * 
     * @param nick
     *            , nickname to use
     * @return
     */
    public final native String setNick(String nick)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setNick(nick);
    }-*/;

    /**
     * Leaves a channel
     * 
     * @param channel
     *            ,channel to leave
     * @return
     */
    public final native String unjoin(String channel)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.unjoin(channel);
    }-*/;

    /**
     * The connected property of an IRCClient object
     * 
     * @return
     */
    public final native String isConnected()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.connected;
    }-*/;

}
