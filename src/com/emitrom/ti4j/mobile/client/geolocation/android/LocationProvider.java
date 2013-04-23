/**************************************************************************
   LocationProvider.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.geolocation.android;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represents a source of location information, such as GPS.
 */
public class LocationProvider extends ProxyObject {

    public LocationProvider() {
        jsObj = JsoHelper.createObject();
    }

    public LocationProvider(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * 
     * Don't send a location update unless the location has changed at least
     * minUpdateDistance meters since the previous update.
     */
    public native double getMinUpdateDistance() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.minUpdateDistance;
    }-*/;

    /**
     * Limits the frequency of location updates to no more than one per
     * minUpdateTime seconds.
     * 
     */
    public native double getMinUpdateTime() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.minUpdateTime;
    }-*/;

    /**
     * Type of location provider: PROVIDER_GPS, PROVIDER_NETWORK, or
     * PROVIDER_PASSIVE.
     */
    public native String getName() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.name;
    }-*/;

    /**
     * Sets the value of the minUpdateDistance property.
     */
    public native void setMinUpdateDistance(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.minUpdateDistance = value;
    }-*/;

    /**
     * Sets the value of the minUpdateTime property.
     */
    public native void setMinUpdateTime(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.minUpdateTime = value;
    }-*/;

    /**
     * Sets the value of the name property.
     */
    public native void setName(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.name = value;
    }-*/;
}
