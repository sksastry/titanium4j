/**************************************************************************
   PumpArguments.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.mobile.client.buffer.Buffer;
import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class PumpArguments extends ProxyObject {

	public PumpArguments() {
		jsObj = JsoHelper.createObject();
	}

	public PumpArguments(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * @return Stream being read from
	 */
	public native IOStream getSource() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.source;
		var toReturn = @com.emitrom.ti4j.mobile.client.stream.IOStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setSource(IOStream value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.source = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
	}-*/;

	/**
	 * @return Buffer object holding the data currently being pumped to the
	 *         handler method
	 */
	public native Buffer getBuffer() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.buffer;
		var toReturn = @com.emitrom.ti4j.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setBuffer(Buffer value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.buffer = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
	}-*/;

	/**
	 * @return Number of bytes processed in the current pump segment
	 */
	public native double getBytesProcessed() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.bytesProcessed;
	}-*/;

	public native void setBytesProcessed(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.bytesProcessed = value;
	}-*/;

	/**
	 * @return Total number of bytes processed in the overall pump operation so
	 *         far
	 */
	public native double getTotalBytesProcessed() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.totalBytesProcessed;
	}-*/;

	public native void setTotalBytesProcessed(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.totalBytesProcessed = value;
	}-*/;

	/**
	 * @return State representing error
	 */
	public native String getErrorState() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.errorState;
	}-*/;

	public native void setErrorState(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.errorState = value;
	}-*/;

	/**
	 * @return Description of the error
	 */
	public native String getErrorDescription() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.errorDescription;
	}-*/;

	public native void setErrorDescription(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.errorDescription = value;
	}-*/;

}
