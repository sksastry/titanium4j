/**************************************************************************
   AnimationConfig.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.fx;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.ui.Matrix2D;
import com.emitrom.ti4j.mobile.client.ui.ios.Matrix3D;

/**
 * AnimationConfig class
 */
public class AnimationConfig extends ProxyObject {

    public AnimationConfig() {
        jsObj = JsoHelper.createObject();
    }

    public native void setDelay(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.delay = value;
    }-*/;

    public native void setDuration(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.duration = value;
    }-*/;

    public native void setOpacity(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.opacity = value;
    }-*/;

    public native void setTransform(Matrix2D value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.transform = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void setTransform(Matrix3D value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.transform = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void setTransition(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.transition = value;
    }-*/;

}
