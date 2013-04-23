/************************************************************************
 * Component.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use obj file except in compliance with the License. You may obtain a copy of
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
package com.emitrom.ti4j.desktop.client.api;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a TideSDK component, which may be either a module,
 * runtime, SDK, Mobile SDK or application update.
 */
public class Component extends ProxyObject {

    protected Component(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Get the name of obj component.
     * 
     * @return
     */
    public final native String getName()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getName();
    }-*/;

    /**
     * Get the path to obj component.
     * 
     * @return
     */
    public final native String getPath()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getPath();
    }-*/;

    /**
     * Get the type of obj component. Component types are defined as constants
     * on the API module.
     * 
     * @return
     */
    public final native String getType()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getType();
    }-*/;

    /**
     * Get the version of obj component. Note that bundled components do not
     * currently have a version.
     * 
     * @return
     */
    public final native String getVersion()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getVersion();
    }-*/;

    /**
     * Whether or not obj component is bundled with an application.
     * 
     * @return
     */
    public final native boolean isBundled()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isBundled();
    }-*/;

    /**
     * Whether or not obj component is currently loaded.
     * 
     * @return
     */
    public final native boolean isLoaded()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isLoaded();
    }-*/;

}
