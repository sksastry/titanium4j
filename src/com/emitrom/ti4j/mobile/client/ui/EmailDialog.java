/************************************************************************
  EmailDialog.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.blob.Blob;
import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.emitrom.ti4j.mobile.client.core.handlers.EmailCompleteHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.email.CompleteHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration;
import com.emitrom.ti4j.mobile.client.filesystem.File;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasAttachment;
import com.emitrom.ti4j.mobile.client.ui.interfaces.Sendable;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * The email dialog allows you to send in application emails on behalf of the
 * application user.
 */
public class EmailDialog extends EventDispatcher implements HasAttachment, Sendable {

    private static final EmailDialog INSTANCE = new EmailDialog();

    public static final int CANCELLED = INSTANCE._getCancelled();
    public static final int FAILED = INSTANCE._getFailed();
    public static final int SENT = INSTANCE._getSent();
    public static final int SAVED = INSTANCE._getSaved();

    public EmailDialog() {
        createPeer();
    }

    EmailDialog(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return The bar color of the email dialog window when opened
     */
    public native String getBarColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.barColor;
    }-*/;

    public native void setBarColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.barColor = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#getBccRecipients()
     */
    @Override
    public native JsArrayString getBccRecipients() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.bccRecipients;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.Sendable#setBccRecipients(com.google
     * .gwt.core.client.JsArrayString)
     */
    @Override
    public native void setBccRecipients(JsArrayString value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.bccRecipients = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#getCcRecipients()
     */
    @Override
    public native JsArrayString getCcRecipients() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.ccRecipients;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.Sendable#setCcRecipients(com.google
     * .gwt.core.client.JsArrayString)
     */
    @Override
    public native void setCcRecipients(JsArrayString value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.ccRecipients = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#isHtml()
     */
    @Override
    public native boolean isHtml() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.html;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#setHtml(boolean)
     */
    @Override
    public native void setHtml(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.html = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#getMessageBody()
     */
    @Override
    public native String getMessageBody() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.messageBody;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#setMessageBody(java.lang
     * .String)
     */
    @Override
    public native void setMessageBody(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.messageBody = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#getSubject()
     */
    @Override
    public native String getSubject() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.subject;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.Sendable#setSubject(java.lang.String )
     */
    @Override
    public native void setSubject(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.subject = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#getToRecipients()
     */
    @Override
    public native JsArrayString getToRecipients() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.toRecipients;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.Sendable#setToRecipients(com.google
     * .gwt.core.client.JsArrayString)
     */
    @Override
    public native void setToRecipients(JsArrayString value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.toRecipients = value;
    }-*/;

    public void setToRecipients(String... values) {
        JsArrayString peers = JsArray.createArray().cast();
        for (String s : values) {
            peers.push(s);
        }
        setToRecipients(peers);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAttachment#addAttachment(com.
     * emitrom.gwt4.ti.mobile.client.blob.Blob)
     */
    @Override
    public native void addAttachment(Blob attachment) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addAttachment(attachment.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAttachment#addAttachment(com.
     * emitrom.gwt4.ti.mobile.client.filesystem.File)
     */
    @Override
    public native void addAttachment(File attachment) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addAttachment(attachment.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#isSupported()
     */
    @Override
    public native void isSupported() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.isSupported();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#open(java.lang.Object)
     */
    @Override
    public native void open(Object properties) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.open(properties);
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Sendable#open()
     */
    @Override
    public native void open() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.open();
    }-*/;

    @Deprecated
    public native void addCompleteHandler(EmailCompleteHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.email.EmailCompleteEvent::COMPLETE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.email.EmailCompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.EmailCompleteHandler::onComplete(Lcom/emitrom/ti4j/mobile/client/core/events/ui/email/EmailCompleteEvent;)(eventObject);
						});
    }-*/;

    public native CallbackRegistration addCompleHandler(CompleteHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.email.CompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.email.CompleteHandler::onComplete(Lcom/emitrom/ti4j/mobile/client/core/events/ui/email/CompleteEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.email.CompleteEvent::COMPLETE;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    private native int _getCancelled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.CANCELLED;
    }-*/;

    private native int _getFailed() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.FAILED;
    }-*/;

    private native int _getSent() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.sENT;
    }-*/;

    private native int _getSaved() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.SAVED;
    }-*/;

    private void createPeer() {
        jsObj = UI.createEmailDialog();
    }

    public static EmailDialog from(ProxyObject proxy) {
        return new EmailDialog(proxy.getJsObj());
    }

}
