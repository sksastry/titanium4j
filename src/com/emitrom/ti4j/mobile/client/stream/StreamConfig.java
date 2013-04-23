/**************************************************************************
   StreamConfig.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.stream;

import com.emitrom.ti4j.mobile.client.blob.Blob;
import com.emitrom.ti4j.mobile.client.buffer.Buffer;
import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;

public class StreamConfig extends ProxyObject {

	public StreamConfig() {
		jsObj = JsoHelper.createObject();
	}

	public native void setSource(Blob value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.source = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
	}-*/;

	public native void setSource(Buffer value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.source = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
	}-*/;

	/**
	 * @return Object to create stream around
	 */
	public native Buffer getSource() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.source;
		var toReturn = @com.emitrom.ti4j.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * @return Mode for the stream to be opened in. can be
	 *         com.emitrom.ti4j.mobile.client.stream.Stream.MODE_READ,
	 *         com.emitrom.ti4j.mobile.client.stream.Stream.MODE_WRITE or
	 *         com.emitrom.ti4j.mobile.client.stream.STEAM.MODE_APPEND
	 */
	public native int getMode() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.mode;
	}-*/;

	public native void setMode(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.mode = value;
	}-*/;

}
