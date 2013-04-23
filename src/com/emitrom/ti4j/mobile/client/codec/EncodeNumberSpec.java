/**************************************************************************
   EncodeNumberSpec.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
 * {@link com.emitrom.ti4j.mobile.client.codec.Codec.encodeNumber}
 */
public class EncodeNumberSpec extends ProxyObject {

    public EncodeNumberSpec() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * @return The source number to encode
     */
    public native double getSource() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.source;
    }-*/;

    public native void setSource(double value) /*-{
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
     * @return The encoding type to use. must be one of
     * 
     *         {@link com.emitrom.ti4j.mobile.client.codec.CODEC.TYPE_BYTE} ,
     *         {@link com.emitrom.ti4j.mobile.client.codec.CODEC.TYPE_SHORT}
     *         , {@link com.emitrom.ti4j.mobile.client.codec.CODEC.TYPE_INT}
     *         ,
     *         {@link com.emitrom.ti4j.mobile.client.codec.CODEC.TYPE_FLOAT}
     *         , {@link com.emitrom.ti4j.mobile.client.codec.CODEC.TYPE_LONG}
     *         , or
     *         {@link com.emitrom.ti4j.mobile.client.codec.CODEC.TYPE_DOUBLE}
     */
    public native String getType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.type;
    }-*/;

    public native void setType(String value) /*-{
		this.type = value;
    }-*/;

    /**
     * @return The position in dest to set the encoded data
     */
    public native int getPosition() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.position;
    }-*/;

    public native void setPosition(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.position = value;
    }-*/;

    /**
     * @return The byte order to encode with
     */
    public native int getByteOrder() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.byteOrder;
    }-*/;

    public native void setByteOrder(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.byteOrder = value;
    }-*/;
}
