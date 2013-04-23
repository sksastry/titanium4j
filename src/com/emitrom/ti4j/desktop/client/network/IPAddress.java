/************************************************************************
 * IPAddress.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.network;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class IPAddress extends ProxyObject {

    protected IPAddress(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native boolean isBroadCast()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isBroadCast();
    }-*/;

    public final native boolean isGlobalMC()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isGlobalMC();
    }-*/;

    public final native boolean isIPV4()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isIPV4();
    }-*/;

    public final native boolean isIPV6()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isIPV6();
    }-*/;

    public final native boolean isInvalid()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isInvalid();
    }-*/;

    public final native boolean isLinkLocal()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isLinkLocal();
    }-*/;

    public final native boolean isLocalMC()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isLocalMC();
    }-*/;

    public final native boolean isLoopback()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isLoopback();
    }-*/;

    public final native boolean isMulticast()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isMulticast();
    }-*/;

    public final native boolean isNodeLocalMC()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isNodeLocalMC();
    }-*/;

    public final native boolean isOrgLocalMC()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isOrgLocalMC();
    }-*/;

    public final native boolean isSiteLocal()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isSiteLocal();
    }-*/;

    public final native boolean isSileLocalMC()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isSileLocalMC();
    }-*/;

    public final native boolean isUniCast()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isUniCast();
    }-*/;

    public final native boolean isWellKnownMC()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isWellKnownMC();
    }-*/;

    public final native boolean isWildcard()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isWildcard();
    }-*/;

    public final native String stringValue()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.toString();
    }-*/;

}
