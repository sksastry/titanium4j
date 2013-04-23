/************************************************************************
 * Bytes.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.bytes;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * An object for holding arrays of bytes.
 * 
 */
public class Bytes extends ProxyObject {

    protected Bytes(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Return the character code (or byte value) at the given index in a Bytes.
     * 
     * @param index
     *            , The index to look for a character code at.
     * @return
     */
    public native int byteAt(int index)/*-{
		var obj = obj.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.byteAt(index);
    }-*/;

    /**
     * Return a character representing a byte at the given index in a Bytes.
     * 
     * @param index
     *            , The index to look for a character at.
     * @return
     */
    public native String chartAt(int index)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.chartAt(index);
    }-*/;

    /**
     * Concatenate multiple Bytes into one Bytes.
     * 
     * @param bytes
     *            , A variable-length list of Bytes to concatenate to obj Bytes
     *            object.
     * @return
     */
    public native Bytes concat(Bytes... bytes)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var toReturn = obj.concat(bytes);
		return @com.emitrom.ti4j.desktop.client.bytes.Bytes::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

    /**
     * Concatenate multiple string into one Bytes.
     * 
     * @param bytes
     *            , A variable-length list of string to concatenate to obj Bytes
     *            object.
     * @return
     */
    public native Bytes concat(String... bytes)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var toReturn = obj.concat(bytes);
		return @com.emitrom.ti4j.desktop.client.bytes.Bytes::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

    /**
     * Return the index of a String within obj Bytes. The String will first be
     * converted to UTF-8 before obj method searches the Bytes object.
     * 
     * @param needle
     *            , The String to search for.
     * @return
     */
    public native int indexOf(String needle)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.indexOf(needle);
    }-*/;

    /**
     * Return the last index of a String within obj Bytes. The String will first
     * be converted to UTF-8 before obj method searches the Bytes object.
     * 
     * @param needle
     *            , The String to search for.
     * @return
     */
    public native int lasIndexOf(String needle)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.lasIndexOf(needle);
    }-*/;

    /**
     * Split a bytes as if it were a String given a delimiter. The Bytes object
     * is expected to contain a UTF-8 encoded String. That means that the first
     * NUL character in the string will be the end of the string.
     * 
     * @param delimiter
     *            , The index to look for a character at
     * @return
     */
    public native JsArrayString slipt(String delimiter)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.slipt(delimiter);
    }-*/;

    /**
     * 
     * Split a bytes as if it were a String given a delimiter. The Bytes object
     * is expected to contain a UTF-8 encoded String. That means that the first
     * NUL character in the string will be the end of the string.
     * 
     * @param delimiter
     *            , The index to look for a character at
     * @param limit
     *            ,The maximum number of matches to return
     * @return
     */
    public native JsArrayString slipt(String delimiter, int limit)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.slipt(delimiter, limit);
    }-*/;

    /**
     * The number of bytes in obj Bytes object.
     * 
     * @return
     */
    public native int getLength()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.length;
    }-*/;

    /**
     * Return a substring of a Bytes given a start index and a length. This
     * assumes that Bytes contains a UTF-8 string. This means that the first NUL
     * character in the Bytes object will signify the end of the string. If no
     * length index is given, return all characters from the start index to the
     * end of the string.
     * 
     * @param startIndex
     *            , The starting index
     * @return
     */
    public native String substr(int startIndex)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.substr(startIndex);
    }-*/;

    /**
     * 
     * Return a substring of a Bytes given a start index and a length. This
     * assumes that Bytes contains a UTF-8 string. This means that the first NUL
     * character in the Bytes object will signify the end of the string. If no
     * length index is given, return all characters from the start index to the
     * end of the string.
     * 
     * @param startIndex
     *            , The starting index
     * @param length
     *            ,The length of the substring
     * @return
     */
    public native String substr(int startIndex, int length)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.substr(startIndex, length);
    }-*/;

    /**
     * Return a substring of a Bytes given a start index and end index. This
     * assumes that Bytes contains a UTF-8 string. This means that the first NUL
     * character in the Bytes object will signify the end of the string. If no
     * end index is given, return all characters from the start index to the end
     * of the string. If startIndex > endIndex, the indices are swapped.
     * 
     * @param startIndex
     *            , The starting index
     * @return
     */
    public native String substring(int startIndex)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.substring(startIndex);
    }-*/;

    /**
     * 
     * Return a substring of a Bytes given a start index and end index. This
     * assumes that Bytes contains a UTF-8 string. This means that the first NUL
     * character in the Bytes object will signify the end of the string. If no
     * end index is given, return all characters from the start index to the end
     * of the string. If startIndex > endIndex, the indices are swapped.
     * 
     * @param startIndex
     *            , The starting index
     * @param endIndex
     *            , The ending index
     * @return
     */
    public native String substring(int startIndex, int endIndex)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.substring(startIndex, endIndex);
    }-*/;

    /**
     * Convert characters in the Bytes to lower-case as if it it were a String.
     * This method assumes that Bytes contains a UTF-8 string. This means that
     * the first NUL character in the Bytes object will signify the end of the
     * string.
     * 
     * @return
     */
    public native String toLowerCase()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.toLowerCase();
    }-*/;

    /**
     * Return a string representation of a Byte object. This method assumes that
     * Bytes contains a UTF-8 string. This means that the first NUL character in
     * the Bytes object will signify the end of the string.
     * 
     * @return
     */
    public native String toByteString()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.toString();
    }-*/;

    /**
     * Convert characters in the Bytes to upper-case as if it it were a String.
     * This method assumes that Bytes contains a UTF-8 string. This means that
     * the first NUL character in the Bytes object will signify the end of the
     * string.
     * 
     * @return
     */
    public native String toUpperCase()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.toUpperCase();
    }-*/;

}
