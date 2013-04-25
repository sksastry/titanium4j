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
public class GMapPointType extends BaseModel {

    public GMapPointType() {
        jsObj = JsoHelper.createObject();
    }

    protected GMapPointType(JavaScriptObject obj) {
        jsObj = obj;
    }

    public double getLatitude() {
        return JsoHelper.getAttributeAsDouble(jsObj, "latitude");
    }

    public void setLatitude(double value) {
        JsoHelper.setAttribute(jsObj, "latitude", value);
    }

    public void setLongitude(double value) {
        JsoHelper.setAttribute(jsObj, "longitude", value);
    }

    public double getLongitude() {
        return JsoHelper.getAttributeAsDouble(jsObj, "longitude");
    }

    static JsArray<JavaScriptObject> fromList(List<GMapPointType> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (GMapPointType type : values) {
            peers.push(type.getJsObj());
        }
        return peers;
    }

    static List<GMapPointType> fromArray(JavaScriptObject obj) {
        int size = JsoHelper.arrayLength(obj);
        List<GMapPointType> toReturn = new ArrayList<GMapPointType>();
        for (int i = 0; i < size; i++) {
            toReturn.add(new GMapPointType(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
