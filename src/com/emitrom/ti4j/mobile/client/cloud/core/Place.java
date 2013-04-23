/**************************************************************************
   Place.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.core;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class Place extends AbstractCloudResponse {

    public Place() {
        jsObj = JsoHelper.createObject();
    }

    Place(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native String getName()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.name;
    }-*/;

    public native String getAddress()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.address;
    }-*/;

    public native String getCity()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.city;
    }-*/;

    public native String getState()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.state;
    }-*/;

    public native String getCountry()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.country;
    }-*/;

    public native String getPhone()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.phone;
    }-*/;

    public native double getLatitude()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.lat;
    }-*/;

    public native double getLongitude()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.lgn;
    }-*/;

}
