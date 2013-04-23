/**************************************************************************
   Messages.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.messages;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;

/**
 * Provides methods for accessing ACS messages.
 */
public class Messages extends TiModule {

    private static final Messages INSTANCE = new Messages();

    public static Messages get() {
        return INSTANCE;
    }

    private Messages() {
        createPeer();
    }

    /**
     * Create a message.
     * 
     * Requires user login.
     */
    public native void create(Message message, MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.create(
						message.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Delete a message.
     * 
     * Requires user login.
     */
    public native void remove(Message message, MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.remove(
						message.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Reply to all recipients of a message.
     * 
     */
    public native void reply(Message message, MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.reply(
						message.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve information about a message.
     */
    public native void show(Message message, MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.show(
						message.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Delete a message.
     * 
     * Requires user login.
     */
    public native void removeThread(MessageThread messageThread, MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.removeThread(
						message.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showInBox(MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.showInBox(
						message.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showInBox(SearchConfig config, MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.showInBox(
						config.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showSent(MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.showSent(
						message.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showSent(SearchConfig config, MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.showSent(
						config.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showThread(ThreadSearchConfig config, MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.showThread(
						config.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showThreads(ThreadSearchConfig config, MessageResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.showThreads(
						config.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createMessages();
    }

}
