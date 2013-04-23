/**************************************************************************
   ReverseGeocoderResult.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.geolocation;

import java.util.ArrayList;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class ReverseGeocoderResult extends ProxyObject {

    protected ReverseGeocoderResult() {
    }

    protected ReverseGeocoderResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    public ArrayList<Place> getPlaces() {
        ArrayList<Place> places = new ArrayList<Place>();
        JsArray<JavaScriptObject> nativePlaces = _getPlaces();
        for (int i = 0; i < nativePlaces.length(); i++) {
            places.add(new Place(nativePlaces.get(i)));
        }

        return places;
    }

    private final native JsArray<JavaScriptObject> _getPlaces() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.places;
    }-*/;
}
