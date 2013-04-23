/************************************************************************
 * TiEvent.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

package com.emitrom.ti4j.desktop.client.events;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.desktop.client.Ti;
import com.google.gwt.core.client.JavaScriptObject;

public class TiEvent extends ProxyObject {

    public static final String ALL = Ti.ALL();
    public static final String APP_EXIT = Ti.APP_EXIT();
    public static final String CLOSE = Ti.CLOSE();
    public static final String CLOSED = Ti.CLOSED();
    public static final String CREATE = Ti.CREATE();
    public static final String EXIT = Ti.EXIT();
    public static final String FOCUSED = Ti.FOCUSED();
    public static final String FULLSCREENED = Ti.FULLSCREENED();
    public static final String HIDDEN = Ti.HIDDEN();
    public static final String HTTP_ABORT = Ti.HTTP_ABORT();
    public static final String HTTP_DATA_RECEIVED = Ti.HTTP_DATA_RECEIVED();
    public static final String HTTP_DATA_SENT = Ti.HTTP_DATA_SENT();
    public static final String HTTP_DONE = Ti.HTTP_DONE();
    public static final String HTTP_REDIRECT = Ti.HTTP_REDIRECT();
    public static final String HTTP_STATE_CHANGED = Ti.HTTP_STATE_CHANGED();
    public static final String HTTP_TIMEOUT = Ti.HTTP_TIMEOUT();
    public static final String MAXIMIZED = Ti.MAXIMIZED();
    public static final String MIMIMIZED = Ti.MINIMIZED();
    public static final String MOVED = Ti.MOVED();
    public static final String OPEN = Ti.OPEN();
    public static final String OPEN_REQUEST = Ti.OPEN_REQUEST();
    public static final String OPENED = Ti.OPENED();
    public static final String PAGE_INITIALIZED = Ti.PAGE_INITIALIZED();
    public static final String PAGE_LOADED = Ti.PAGE_LOADED();
    public static final String READ = Ti.READ();
    public static final String RESIZED = Ti.RESIZED();
    public static final String SHOWN = Ti.SHOWN();
    public static final String UNFOCUSED = Ti.UNFOCUSED();
    public static final String UNFULLSCREENED = Ti.UNFULLSCREENED();

    protected TiEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native void preventDefault() /*-{
		obj.preventDefault();
    }-*/;

    public final native void stopPropagation() /*-{
		obj.stopPropagation();
    }-*/;

    public final native <T> T getTarget() /*-{
		return obj.getTarget();
    }-*/;

    public final native String getType() /*-{
		return obj.getType();
    }-*/;

    public final native String getTimestamp() /*-{
		return obj.getTimestamp();
    }-*/;
}
