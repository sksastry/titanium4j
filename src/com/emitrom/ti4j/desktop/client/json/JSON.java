/************************************************************************
 * JSON.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
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
package com.emitrom.ti4j.desktop.client.json;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A module for serializing and deserializing JSON.
 * 
 */
public class JSON {

    private JSON() {

    }

    /**
     * Deserialize a JSON string into a JavaScript value.
     * 
     * @param jSonString
     *            , JSON string to deserialize into a JavaScript object.
     * @return
     */
    public static native <T extends JavaScriptObject> T parse(String jSonString)/*-{
		return Ti.JSON.parse(jSonString);
    }-*/;

    /**
     * Serialize a JavaScript value into a JSON string.
     * 
     * @param value
     *            ,The JavaScript value to serialize into a JSON string.
     * @return
     */
    public static native String stringify(Object value)/*-{
		return Ti.JSON.stringify(value);
    }-*/;

}
