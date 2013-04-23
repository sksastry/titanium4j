/************************************************************************
 * App.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.app;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * A module for holding currently running application specific functionality.
 * 
 * 
 */
public class App extends ProxyObject {

    private App() {

    }

    /**
     * Convert the given app URL to a filesystem path. App URLs generally have
     * the form 'app://subdir/resource.html' and resolve to a fileystem path
     * rooted in the application resources directory.
     * 
     * @return
     */
    public static native String appURLToPath()/*-{
		return Ti.App.appURLToPath();
    }-*/;

    /**
     * Creates an object holding a group of properties. Properties may either be
     * defined in tiapp.xml (read-only) or in any other file on the filesystem.
     * Ti Properties offer an alternative to traditional HTML5 DOM storage.
     * 
     * @return
     */
    public static native Properties createProperties()/*-{
		var obj = Ti.App.createProperties();
		return @com.emitrom.ti4j.desktop.client.app.Properties::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates an object holding a group of properties. Properties may either be
     * defined in tiapp.xml (read-only) or in any other file on the filesystem.
     * Ti Properties offer an alternative to traditional HTML5 DOM storage.
     * 
     * @return
     */
    public static native Properties createProperties(JavaScriptObject properties)/*-{
		var obj = Ti.App.createProperties(properties);
		return @com.emitrom.ti4j.desktop.client.app.Properties::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Cause the application to exit after firing the Ti.EXIT event. The
     * application isn't gauaranteed to exit when this method is called, because
     * an event handler may cancel the EXIT event by calling preventDefault or
     * stopPropagation on it.
     */
    public static native void exit()/*-{
		Ti.App.exit();
    }-*/;

    /**
     * Return the command-line arguments passed to this application, excluding
     * the first which is the path to the application executable.
     * 
     * @return
     */
    public static native JsArrayString getArguments()/*-{
		return Ti.App.getArguments();
    }-*/;

    /**
     * Return the application's copyright information, defined in the tiapp.xml
     * file.
     * 
     * @return
     */
    public static native String getCopyright()/*-{
		return Ti.App.getCopyright();
    }-*/;

    /**
     * Return the application's description, defined in the tiapp.xml file.
     * 
     * @return
     */
    public static native String getDescription()/*-{
		return Ti.App.getDescription();
    }-*/;

    /**
     * Return the application's GUID, defined in the application manifest.
     * 
     * @return
     */
    public static native String getGUID()/*-{
		return Ti.App.getGUID();
    }-*/;

    /**
     * Return the full path to the application home directory. The application
     * home or contents directory is the subdirectory within the application
     * which contains the application Resources directory and bundled
     * components. On OS X this is the directory "My App.app/Contents" and on
     * Windows and Linux it is simply the path to the application.
     * 
     * @return
     */
    public static native String getHome()/*-{
		return Ti.App.getHome();
    }-*/;

    /**
     * Get this human readable id defined in both the application manifest and
     * the application's tiapp.xml file.
     * 
     * @return
     */
    public static native String getID()/*-{
		return Ti.App.getID();
    }-*/;

    /**
     * Return the full path to the application icon. The application icon path
     * is specified in the application manifest and tiapp.xml relative to the
     * application Resources directory.
     * 
     * @return
     */
    public static native String getIcon()/*-{
		return Ti.App.getIcon();
    }-*/;

    /**
     * Return the application name.
     * 
     * @return
     */
    public static native String getName()/*-{
		return Ti.App.getName();
    }-*/;

    /**
     * Return the full path to the application executable.
     * 
     * @return
     */
    public static native String getPath()/*-{
		return Ti.App.getPath();
    }-*/;

    /**
     * Return the application publisher information specifiedi in the tiapp.xml
     * file.
     * 
     * @return
     */
    public static native String getPublisher()/*-{
		return Ti.App.getPublisher();
    }-*/;

    /**
     * Return the stream URL for the application's updates.
     * 
     * @param arguments
     *            , Any number of String arguments which will be appended as
     *            path components of the stream URL.
     * @return
     */
    public static native String getStreamURL(String... arguments)/*-{
		return Ti.App.getStreamURL(arguments);
    }-*/;

    /**
     * Get the system properties defined in tiapp.xml (see App.Properties).
     * 
     * @return
     */
    public static native Properties getSystemProperties()/*-{
		var obj = Ti.App.getSystemProperties();
		return @com.emitrom.ti4j.desktop.client.app.Properties::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the application URL definedin the tiapp.xml file.
     * 
     * @return
     */
    public static native String getURL()/*-{
		return Ti.App.getURL();
    }-*/;

    /**
     * Return the application version defined in the tiapp.xml file.
     * 
     * @return
     */
    public static native String getVersion()/*-{
		return Ti.App.getVersion();
    }-*/;

    /**
     * Loads a properties list from a file path.
     * 
     * @return
     */
    public List<Properties> loadProperties(String path) {
        List<Properties> list = new ArrayList<Properties>();
        JavaScriptObject peers = _loadProperties(path);
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            list.add(new Properties(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return list;
    }

    public static native JavaScriptObject _loadProperties(String path)/*-{
		return Ti.App.loadProperties(path);
    }-*/;

    /**
     * Exit the application and restart it.
     * 
     * @return
     */
    public static native String restart()/*-{
		return Ti.App.restart();
    }-*/;

    /**
     * Print a raw string to stderr without a trailing newline.
     * 
     * @param value
     *            , The data to print.
     * @return
     */
    public static native String sdterr(String value)/*-{
		return Ti.App.sdterr(value);
    }-*/;

    /**
     * Reads from stdin
     * 
     * @return
     */
    public static native String sdtin()/*-{
		return Ti.App.sdtin();
    }-*/;

    /**
     * Reads from stdin
     * 
     * @param prompt
     *            , Text prompt for input. If not specified, no prompt will
     *            appear.
     * @return
     */
    public static native String sdtin(Object prompt)/*-{
		return Ti.App.sdtin(prompt);
    }-*/;

    /**
     * Reads from stdin
     * 
     * @param prompt
     *            , Text prompt for input. If not specified, no prompt will
     *            appear.
     * @param delimiter
     *            , Will continue reading stdin until the delimiter character is
     *            reached. If no argument is specified, this method will
     *            continue reading until a newline.
     * @return
     */
    public static native String sdtin(String prompt, String delimiter)/*-{
		return Ti.App.sdtin(prompt, delimiter);
    }-*/;

    /**
     * Print a String to stdout including a trailing newline.
     * 
     * @param value
     *            , The data to print.
     * @return
     */
    public static native void sdtout(Object value)/*-{
		Ti.App.sdtout(value);
    }-*/;

}
