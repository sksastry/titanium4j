/************************************************************************
 * WindowBounds.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.desktop.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class WindowBounds extends ProxyObject {

    protected WindowBounds(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static native WindowBounds create()/*-{
		return {};
    }-*/;

    public final native void setX(double value)/*-{
		this.x = value;
    }-*/;

    public final native double getX()/*-{
		return this.x;
    }-*/;

    public final native void setY(double value)/*-{
		this.y = value;
    }-*/;

    public final native double getY()/*-{
		return this.y;
    }-*/;

    public final native void setWidth(double value)/*-{
		this.width = value;
    }-*/;

    public final native double getWidth()/*-{
		return this.width;
    }-*/;

    public final native void setHeight(double value)/*-{
		this.height = value;
    }-*/;

    public final native double getHeight()/*-{
		return this.height;
    }-*/;

}
