/**************************************************************************
 * XML.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.mobile.client.xml;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;

/**
 * The top level xml module. The xml module is used parsing and processing
 * xml-based content.
 */
public class XML extends TiModule {
    private static XML instance = null;

    public static XML get() {
        if (instance == null) {
            instance = new XML();
        }
        return instance;
    }

    private XML() {
        createPeer();
    }

    /**
     * Parses an xml string into a
     * {@link com.emitrom.ti4j.mobile.client.xml.Document} object. throws an
     * exception if the string is unable to be parsed into a valid document.
     * 
     * @param xml
     *            the XML content as a string
     */
    public native Document parseString(String xml) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.parseString(xml);
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.Document::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Serializes a {@link document} object into a string.
     * 
     * @param node
     *            The XML DOMNode or DOMDocument to serialize
     */
    public native String serializeToString(Node node) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.serializeToString(node.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeXMLModule();
    }

}
