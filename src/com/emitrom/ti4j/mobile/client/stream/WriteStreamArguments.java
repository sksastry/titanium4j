/**************************************************************************
   WriteStreamArguments.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class WriteStreamArguments extends ProxyObject {

	public WriteStreamArguments() {
		jsObj = JsoHelper.createObject();
	}

	public WriteStreamArguments(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * @return Stream being read from
	 */
	public native IOStream getFromStream() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.fromStream;
		var toReturn = @com.emitrom.ti4j.mobile.client.stream.IOStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setFromStream(IOStream value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.fromStream = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
	}-*/;

	/**
	 * @return Stream being written to
	 */
	public native IOStream getToStream() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.toStream;
		var toReturn = @com.emitrom.ti4j.mobile.client.stream.IOStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setToStream(IOStream value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.toStream = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
	}-*/;

	/**
	 * @return Number of bytes processed
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
		return this.errorDescription;
	}-*/;

	public native void setErrorDescription(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.errorDescription = value;
	}-*/;

}
