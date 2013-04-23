/**************************************************************************
   Point.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Point extends ProxyObject {

    public Point() {
        jsObj = create(0, 0);
    }

    public Point(double x, double y) {
        jsObj = create(x, y);
    }

    private Point(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native double getX() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.x;
    }-*/;

    public native double getY() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.y;
    }-*/;

    private static native JavaScriptObject create(double xCoordinate, double yCoordinate) /*-{
		return {
			x : xCoordinate,
			y : xCoordinate
		};
    }-*/;

    public native void setX(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.x = value;
    }-*/;

    public native void setY(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.y = value;
    }-*/;

    public static Point from(ProxyObject proxy) {
        return new Point(proxy.getJsObj());
    }
}
