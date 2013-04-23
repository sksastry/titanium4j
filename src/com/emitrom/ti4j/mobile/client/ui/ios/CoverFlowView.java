/**************************************************************************
   CoverFlowView.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.mobile.client.blob.Blob;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.CoverFlowIndexChangeHandler;
import com.emitrom.ti4j.mobile.client.filesystem.File;
import com.emitrom.ti4j.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The cover flow view is container for showing animated, three dimensional
 * images in a nice ui.
 * 
 */
public class CoverFlowView extends View {
    public CoverFlowView() {
        createPeer();
    }

    CoverFlowView(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    public native JsArrayString getImages() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.images;
    }-*/;

    public native void setImages(JsArrayString value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.images = value;
    }-*/;

    public native int getSelected() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.selected;
    }-*/;

    public native void setSelected(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selected = value;
    }-*/;

    public native void setImage(int index, Object image) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.setImage(index, image);
    }-*/;

    public native void setImage(int index, Blob image) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.setImage(
						index,
						image.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void setImage(int index, File image) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.setImage(
						index,
						image.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void addChangeHandler(CoverFlowIndexChangeHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.ChangeEvent::CHANGE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.ChangeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.CoverFlowIndexChangeHandler::onChange(Lcom/emitrom/ti4j/mobile/client/core/events/ui/ChangeEvent;)(eventObject);
						});

    }-*/;

    @Override
    public void createPeer() {
        jsObj = createCoverFlowView();
    }

    public static CoverFlowView from(ProxyObject proxy) {
        return new CoverFlowView(proxy.getJsObj());
    }

    static native JavaScriptObject createCoverFlowView() /*-{
		return Titanium.UI.iOS.createCoverFlowView();
    }-*/;

}