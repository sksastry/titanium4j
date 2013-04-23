/**************************************************************************
   Utils.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.core;

import com.emitrom.ti4j.mobile.client.core.events.TiEvent;
import com.emitrom.ti4j.mobile.client.core.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level Utils module. The Utils module is a set of common functions
 * that are useful for applications
 * 
 */
public class Utils {

    private Utils() {

    }

    /**
     * Adds an event listener for the instance to receive view triggered events
     * 
     * @param event
     *            , name of the event
     * @param listener
     *            , callback function to invoke when the event is fired
     */
    public static void addEventListener(String event, TiEventListener<?> listener) {
        addEventListener(event, listener.getJsoPeer());
    }

    private static native void addEventListener(String event, JavaScriptObject listener) /*-{
		Titanium.Utils.addEventListener(event, listener);
    }-*/;

    /**
     * Remove a previously added event listener
     * 
     * @param event
     *            , name of the event
     * @param listener
     *            , EventListner passed in addEventListener
     */
    public static void removeEventListner(String event, TiEventListener<?> listener) {
        removeEventListener(event, listener.getJsoPeer());
    }

    private static native void removeEventListener(String event, JavaScriptObject listener) /*-{
		Titanium.Utils.removeEventListener(event, listener);
    }-*/;

    /**
     * Fires a synthesized event to the views listener
     * 
     * @param name
     *            , name of event
     * @param eventObject
     *            , event object
     */
    public static native void fireEvent(String name, TiEvent eventObject) /*-{
		Titanium.fireEvent(name, eventObject);
    }-*/;

    /**
     * Decode a Base64 string
     * 
     * @param str
     *            , the string to use for the input
     */
    public static native String base64decode(String str) /*-{
		return Titanium.Utils.base64decode(str);
    }-*/;

    /**
     * Encode a string into Base64
     * 
     * @param str
     *            , the string to use for the input
     */
    public static native String base64encode(String str) /*-{
		return Titanium.Utils.base64encode(str);
    }-*/;

    /**
     * Compute a MD5 hash algorithm against the input and return a hex-based
     * string
     * 
     * @param str
     *            , the string to use for the input
     */
    public static native String md5HexDigest(String str) /*-{
		return Titanium.Utils.md5HexDigest(str);
    }-*/;

    /**
     * Convenient method to detect if TiMobile is running in the browser
     * 
     * @return true if we are running in the regular browser
     */
    public native static boolean isWebMode()/*-{
		return ((typeof ($wnd) != 'undefined') || (typeof (window) != 'undefined'));
    }-*/;

    /**
     * Binds Titanium to the global space when using HTML5 UI
     */
    public native static void bindTi()/*-{
		Titanium = $wnd.Titanium;
		Ti = $wnd.Ti;
    }-*/;

}
