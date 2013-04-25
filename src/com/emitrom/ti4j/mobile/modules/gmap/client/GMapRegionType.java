package com.emitrom.ti4j.mobile.modules.gmap.client;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.BaseModel;
import com.emitrom.ti4j.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Data object to use for Facebook request
 * 
 */
public class GMapRegionType extends BaseModel {

    public GMapRegionType() {
        jsObj = JsoHelper.createObject();
    }

    protected GMapRegionType(JavaScriptObject obj) {
        jsObj = obj;
    }

    public double getLatitude() {
        return JsoHelper.getAttributeAsDouble(jsObj, "latitude");
    }

    public void setLatitude(double value) {
        JsoHelper.setAttribute(jsObj, "latitude", value);
    }

    public double getLatitudeDelta() {
        return JsoHelper.getAttributeAsDouble(jsObj, "latitudeDelta");
    }

    public void setLatitudeDelta(double value) {
        JsoHelper.setAttribute(jsObj, "latitudeDelta", value);
    }

    public void setLongitude(double value) {
        JsoHelper.setAttribute(jsObj, "longitude", value);
    }

    public double getLongitude() {
        return JsoHelper.getAttributeAsDouble(jsObj, "longitude");
    }

    public void setLongitudeDelta(double value) {
        JsoHelper.setAttribute(jsObj, "longitudeDelta", value);
    }

    public double getLongitudeDelta() {
        return JsoHelper.getAttributeAsDouble(jsObj, "longitudeDelta");
    }

    static JsArray<JavaScriptObject> fromList(List<GMapRegionType> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (GMapRegionType type : values) {
            peers.push(type.getJsObj());
        }
        return peers;
    }

    static List<GMapRegionType> fromArray(JavaScriptObject obj) {
        int size = JsoHelper.arrayLength(obj);
        List<GMapRegionType> toReturn = new ArrayList<GMapRegionType>();
        for (int i = 0; i < size; i++) {
            toReturn.add(new GMapRegionType(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
