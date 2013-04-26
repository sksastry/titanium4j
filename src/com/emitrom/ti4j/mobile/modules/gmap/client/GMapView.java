package com.emitrom.ti4j.mobile.modules.gmap.client;

import java.util.Arrays;
import java.util.List;

import com.emitrom.ti4j.mobile.client.core.handlers.EventHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration;
import com.emitrom.ti4j.mobile.client.ui.View;

/**
 * Map view is used for embedding native mapping capabilities as a view in your
 * application.
 * <p>
 * With native maps, you can control the mapping location, the type of map, the
 * zoom level and you can add custom annotations and routes directly to the map.
 * Once the map view is displayed, the user can pan, zoom and tilt the map using
 * the native control gestures.
 * <p>
 * All latitude and longitude values are specified in decimal degrees. Values in
 * degrees, minutes and seconds (DMS) must be converted to decimal degrees
 * before being passed to the map view.
 * <p>
 * You can add Annotation objects to the map to mark points of interest. An
 * annotation has two states: selected and deselected. A deselected annotation
 * is marked by a pin image. When selected, the full annotation is displayed,
 * typically including a title and an optional subtitle.
 * <p>
 * You can add Route objects to the map to create paths between two or more
 * points of interest.
 */
public class GMapView extends View {

    public GMapView() {
        jsObj = GMap.get().createView();
    }

    public native boolean isAnimate()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.animate;
    }-*/;

    public native void setAnimate(boolean value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.animate = value;
    }-*/;

    public native boolean enableZoomControls()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.enableZoomControls;
    }-*/;

    public native void setEnableZoomControls(boolean value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.enableZoomControls = value;
    }-*/;

    public native List<GMapAnnotation> getAnnotations()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.annotations;
		return @com.emitrom.ti4j.mobile.modules.gmap.client.GMapAnnotation::fromArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setAnnotations(List<GMapAnnotation> values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.annotations = @com.emitrom.ti4j.mobile.modules.gmap.client.GMapAnnotation::fromList(Ljava/util/List;)(values);
    }-*/;

    public void setAnnotations(GMapAnnotation... values) {
        setAnnotations(Arrays.asList(values));
    }

    public native int getMapType()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.mapType;
    }-*/;

    public native void setMapType(int value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.mapType = value;
    }-*/;

    public native boolean isTrafic()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.trafic;
    }-*/;

    public native void setTrafic(boolean value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.trafic = value;
    }-*/;

    public native boolean isUserlocation()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.userLocation;
    }-*/;

    public native void setUserlocation(boolean value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.userLocation = value;
    }-*/;

    public native GMapRegionType getRegion()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.region;
		return @com.emitrom.ti4j.mobile.modules.gmap.client.GMapRegionType::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setRegion(GMapRegionType value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.region = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void addAnnotation(GMapAnnotation value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addAnnotation(value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void addAnnotations(List<GMapAnnotation> values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addAnnotation(@com.emitrom.ti4j.mobile.modules.gmap.client.GMapAnnotation::fromList(Ljava/util/List;)(values));
    }-*/;

    public void addAnnotations(GMapAnnotation... annotations) {
        this.addAnnotations(Arrays.asList(annotations));
    }

    public native void addRoute(GMapRoute value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addRoute(value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void deselectAnnotation(GMapAnnotation value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.deselectAnnotation(value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void deselectAnnotation(String value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.deselectAnnotation(value);
    }-*/;

    public native void removeAnnotation(GMapAnnotation value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.removeAnnotation(value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void removeAnnotations(List<GMapAnnotation> values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.removeAnnotations(@com.emitrom.ti4j.mobile.modules.gmap.client.GMapAnnotation::fromList(Ljava/util/List;)(values));
    }-*/;

    public void removeAnnotations(GMapAnnotation... annotations) {
        this.removeAnnotations(Arrays.asList(annotations));
    }

    public native void removeRoute(GMapRoute value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.removeRoute(value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void selectAnnotation(GMapAnnotation value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.delectAnnotation(value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void selectAnnotation(String value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selectAnnotation(value);
    }-*/;

    /**
     * Fired when the map completes loading.
     */
    public void addCompleteHandler(EventHandler handler) {
        this.addEventHandler("complete", handler);
    }

    /**
     * Fired when the user interacts with a draggable annotation.
     */
    public native CallbackRegistration addPinchChangedDragStateHandler(PinchChangedDragStateHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.modules.gmap.client.PinchChangedDragStateEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.modules.gmap.client.PinchChangedDragStateHandler::onPinchChangedDragState(Lcom/emitrom/ti4j/mobile/modules/gmap/client/PinchChangedDragStateEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.modules.gmap.client.PinchChangedDragStateEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /**
     * Fired when the mapping region changes.
     */
    public native CallbackRegistration addRegionChangedHandler(RegionChangedHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.modules.gmap.client.RegionChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.modules.gmap.client.RegionChangedHandler::onRegionChanged(Lcom/emitrom/ti4j/mobile/modules/gmap/client/RegionChangedEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.modules.gmap.client.RegionChangedEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

}
