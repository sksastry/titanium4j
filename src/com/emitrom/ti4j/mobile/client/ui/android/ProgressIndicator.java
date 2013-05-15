/************************************************************************
  ProgressIndicator.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.android;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.emitrom.ti4j.mobile.client.core.handlers.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 A progress dialog or a horizontal progress bar in the title of the window.
 * <p>
 * A progress indicator can be used to show the progress of an operation in the
 * UI to let the user know that some action is taking place. It is used to
 * indicate an ongoing activity of determinate or indeterminate length.
 * <p>
 * 
 * A progress indicator can be either a progress dialog or a horizontal progress
 * bar in the title of the window. The progress dialog is a modal dialog that
 * blocks the UI. See also: Titanium.UI.Android.PROGRESS_INDICATOR_DIALOG,
 * Titanium.UI.Android.PROGRESS_INDICATOR_STATUS_BAR.
 * <p>
 * Calling show displays the indicator, and calling hide removes it.
 * 
 */
public class ProgressIndicator extends EventDispatcher {

    public ProgressIndicator() {
        jsObj = createPeer();
    }

    protected ProgressIndicator(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * 
     * When true allows the user to cancel the progress dialog by pressing the
     * BACK button.
     */
    public native void setCancelable(boolean value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.cancelable = value;
    }-*/;

    public native boolean isCancelable()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.cancelable;
    }-*/;

    public native void setMax(double value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.max = value;
    }-*/;

    public native double getMax()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.max;
    }-*/;

    public native void setMessage(String value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.message = value;
    }-*/;

    public native String getMessage()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.message;
    }-*/;

    public native void setMessageId(String value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.messageid = value;
    }-*/;

    public native String getMessageId()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.messageid;
    }-*/;

    public native void setMin(double value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.min = value;
    }-*/;

    public native int getMin()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.min;
    }-*/;

    public native void setType(double value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.type = value;
    }-*/;

    public native int getype()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.type;
    }-*/;

    public native void hide()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.hide();
    }-*/;

    public native void show()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.show();
    }-*/;

    /**
     * Fired when the user has canceled the progress indicator dialog.
     * <p>
     * The user triggers this event by pressing the BACK button when the dialog
     * is visible. The dialog will be hidden and this event dispatched.
     */
    public void addCancelHandler(EventHandler handler) {
        this.addEventHandler("cancel", handler);
    }

    public static ProgressIndicator cast(ProxyObject peer) {
        return new ProgressIndicator(peer.getJsObj());
    }

    private native JavaScriptObject createPeer()/*-{
		return Ti.UI.Android.createProgressIndicator();
    }-*/;

}
