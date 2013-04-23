/**************************************************************************
   EncodeStringSpec.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.codec;

import com.emitrom.ti4j.mobile.client.buffer.Buffer;
import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;

/**
 * Specification for
 * {@link com.emitrom.ti4j.mobile.client.codec.Codec.encodeString}
 */
public class EncodeStringSpec extends ProxyObject {

    public EncodeStringSpec() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * @return The source string to encode
     */
    public native String getSource() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.source;
    }-*/;

    public native void setSource(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.source = value;
    }-*/;

    /**
     * @return The buffer to decode
     */
    public native Buffer getDest() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.dest;
		var toReturn = @com.emitrom.ti4j.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setDest(Buffer value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.dest = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The position in `dest` to set the encoded string.
     */
    public native int getDestPosition() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.destPosition;
    }-*/;

    public native void setDestPosition(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.destPosition = value;
    }-*/;

    /**
     * @return The position in `source` to start encoding.
     */
    public native int getSourcePosition() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.sourcePosition;
    }-*/;

    public native void setSourcePosition(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.sourcePosition = value;
    }-*/;

    /**
     * @return The number of characters in `source` to encode.
     */
    public native int getSourceLength() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.sourceLength;
    }-*/;

    public native void setSourceLength(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.sourceLength = value;
    }-*/;

    /**
     * @return The character set to use when encoding this string to bytes.
     */
    public native String getCharset() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.charset;
    }-*/;

    public native void setCharset(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.charset = value;
    }-*/;

}
