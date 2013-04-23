/**************************************************************************
   AdView.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.ios;

import com.emitrom.ti4j.mobile.client.core.handlers.ErrorHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.loading.LoadHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.ChangeHandler;
import com.emitrom.ti4j.mobile.client.ui.View;

/**
 * The adview is a view for display apple iads. the view is created by the
 * method {@link com.emitrom.ti4j.mobile.client.ui.ios.IOS.createAdView}.
 */
public class AdView extends View {

    public static String SIZE_320x50 = SIZE_320x50();
    public static String SIZE_480x32 = SIZE_480x32();

    public AdView() {
        createPeer();
    }

    /**
     * A banner view action can cover your application's user interface.
     * however, your application continues to run, and receives events normally.
     * if your application receives an event that requires the user's attention,
     * it can programmatically cancel the action and uncover its interface by
     * calling cancelaction. canceling actions frequently can cause a loss of
     * revenue for your application.
     */
    public native void cancelAction() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.cancelAction();
    }-*/;

    public native void addChangeHandler(ChangeHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent::CHANGE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.ChangeHandler::onChange(Lcom/emitrom/ti4j/mobile/client/core/events/ui/UIEvent;)(eventObject);
						});
    }-*/;

    public native void addErrorHandler(ErrorHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ErrorEvent::ERROR,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ErrorHandler::onError(Lcom/emitrom/ti4j/mobile/client/core/events/ErrorEvent;)(eventObject);
						});
    }-*/;

    public native void addLoadHandler(LoadHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.loading.LoadEvent::LOAD,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.loading.LoadEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.loading.LoadHandler::onLoad(Lcom/emitrom/ti4j/mobile/client/core/events/loading/LoadEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = IOS.get().createAdView();
    }

    /**
     * @return Constant for 320x50 ad sizes
     */
    private static native String SIZE_320x50() /*-{
		return Titanium.UI.iOS.AdView.SIZE_320x50;
    }-*/;

    /**
     * @return Constant for 480x32 ad sizes
     */
    private static native String SIZE_480x32() /*-{
		return Titanium.UI.iOS.AdView.SIZE_480x32;
    }-*/;

}
