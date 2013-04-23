/**************************************************************************
   Photo.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represent the person that send the chat message
 */
public class Photo extends AbstractCloudResponse {

    Photo(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native String getFileName()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.filename;
    }-*/;

    public native double getSize()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.size;
    }-*/;

    public native String getMd5()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.md5;
    }-*/;

    public native boolean isProcessed()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.processed;
    }-*/;
}
