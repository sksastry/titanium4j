/************************************************************************
  PinchChangedDragStateEvent.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.modules.gmap.client;

import com.emitrom.ti4j.mobile.client.core.events.TiEvent;
import com.emitrom.ti4j.mobile.client.core.events.ui.InteractionEvent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class PinchChangedDragStateEvent extends InteractionEvent {

    public static String EVENT_NAME = "pinchedchangedragstate";

    /**
     * UiBinder implementations
     */
    private static Type<PinchChangedDragStateHandler> TYPE = new Type<PinchChangedDragStateHandler>(EVENT_NAME, null);

    public static Type<PinchChangedDragStateHandler> getType() {
        return TYPE;
    }

    public static Type<PinchChangedDragStateHandler> getAssociatedType() {
        return TYPE;
    }

    protected PinchChangedDragStateEvent() {

    }

    private PinchChangedDragStateEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    /**
     * Annotation source object.
     */
    public native GMapAnnotation getAnnotation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.annotation;
		return @com.emitrom.ti4j.mobile.modules.gmap.client.GMapAnnotation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native GMapView getMap() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.map;
		return @com.emitrom.ti4j.mobile.modules.gmap.client.GMapView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public static PinchChangedDragStateEvent cast(TiEvent event) {
        return new PinchChangedDragStateEvent(event.getJsObj());
    }

}
