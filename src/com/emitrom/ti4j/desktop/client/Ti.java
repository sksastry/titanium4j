/************************************************************************
 * Ti.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

package com.emitrom.ti4j.desktop.client;


/**
 * This is the top-level Ti module, containing all Ti APIs.
 * 
 * @author Ekambi
 * 
 */
public class Ti {

    private Ti() {

    }

    /**
     * Return the current platform, usually one of 'osx', 'win32', or 'linux'.
     * 
     * @return
     */
    public static native String getPlatform() /*-{
		return Ti.getPlatform();
    }-*/;

    /**
     * Return the Ti runtime version.
     * 
     * @return
     */
    public static native String getVersion() /*-{
		return Ti.getVersion();
    }-*/;

    public static native String ALL() /*-{
		return Ti.ALL;
    }-*/;

    public static native String APP_EXIT() /*-{
		return Ti.APP_EXIT;
    }-*/;

    public static native String CLOSE() /*-{
		return Ti.CLOSE;
    }-*/;

    public static native String CLOSED() /*-{
		return Ti.CLOSED;
    }-*/;

    public static native String CREATE() /*-{
		return Ti.CREATE;
    }-*/;

    public static native String EXIT() /*-{
		return Ti.EXIT;
    }-*/;

    public static native String FOCUSED() /*-{
		return Ti.FOCUSED;
    }-*/;

    public static native String FULLSCREENED() /*-{
		return Ti.FULLSCREENED;
    }-*/;

    public static native String HIDDEN() /*-{
		return Ti.HIDDEN;
    }-*/;

    public static native String HTTP_ABORT() /*-{
		return Ti.HTTP_ABORT;
    }-*/;

    public static native String HTTP_DATA_RECEIVED() /*-{
		return Ti.HTTP_ABORT;
    }-*/;

    public static native String HTTP_DATA_SENT() /*-{
		return Ti.HTTP_DATA_SENT;
    }-*/;

    public static native String HTTP_DONE() /*-{
		return Ti.HTTP_DONE;
    }-*/;

    public static native String HTTP_REDIRECT() /*-{
		return Ti.HTTP_REDIRECT;
    }-*/;

    public static native String HTTP_STATE_CHANGED() /*-{
		return Ti.HTTP_STATE_CHANGED;
    }-*/;

    public static native String HTTP_TIMEOUT() /*-{
		return Ti.HTTP_TIMEOUT;
    }-*/;

    public static native String MAXIMIZED() /*-{
		return Ti.MAXIMIZED;
    }-*/;

    public static native String MINIMIZED() /*-{
		return Ti.MINIMIZED;
    }-*/;

    public static native String MOVED() /*-{
		return Ti.MOVED;
    }-*/;

    public static native String OPEN() /*-{
		return Ti.OPEN;
    }-*/;

    public static native String OPEN_REQUEST() /*-{
		return Ti.OPEN_REQUEST;
    }-*/;

    public static native String OPENED() /*-{
		return Ti.OPENED;
    }-*/;

    public static native String PAGE_INITIALIZED() /*-{
		return Ti.PAGE_INITIALIZED;
    }-*/;

    public static native String PAGE_LOADED() /*-{
		return Ti.PAGE_LOADED;
    }-*/;

    public static native String READ() /*-{
		return Ti.READ;
    }-*/;

    public static native String RESIZED() /*-{
		return Ti.RESIZED;
    }-*/;

    public static native String SHOWN() /*-{
		return Ti.SHOWN;
    }-*/;

    public static native String UNFOCUSED() /*-{
		return Ti.UNFOCUSED;
    }-*/;

    public static native String UNFULLSCREENED() /*-{
		return Ti.UNFULLSCREENED;
    }-*/;

}
