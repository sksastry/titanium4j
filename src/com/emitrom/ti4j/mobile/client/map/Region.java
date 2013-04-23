/**************************************************************************
   Region.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.map;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Region extends ProxyObject {

    public Region() {
        jsObj = JsoHelper.createObject();
    }

    public Region(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Region(double latitude, double longitude, double latitudeAlpha, double longitudeAlpha) {
        this();
        setLatitude(latitude);
        setLongitude(longitude);
        setLatitudeDelta(latitudeAlpha);
        setLongitudeDelta(longitudeAlpha);
    }

    public native void setLatitude(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.latitude = value;
    }-*/;

    public native double getLatitude() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.latitude;
    }-*/;

    public native void setLongitude(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.longitude = value;
    }-*/;

    public native double getLongitude() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.longitude;
    }-*/;

    public native void setLatitudeDelta(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.latitudeDelta = value;
    }-*/;

    public native double getLatitudeDelta() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.latitudeDelta;
    }-*/;

    public native void setLongitudeDelta(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.longitudeDelta = value;
    }-*/;

    public native double getLongitudeDelta() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.longitudeDelta;
    }-*/;

}
