/************************************************************************
 * Platform.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.platform;

import com.emitrom.ti4j.desktop.client.Ti;

/**
 * A module for exposing platform-specific functionality.
 */
public class Platform {

    private Platform() {

    }

    private static final String WIN_32 = "win32";
    private static final String OSX = "osx";
    private static final String LINUX = "linux";

    /**
     * Create a universally unique identifier.
     * 
     * @return
     */
    public static native String createUUID()/*-{
		return Ti.Platform.createUUID();
    }-*/;

    /**
     * Get a String representation of the current system's architecture.
     * 
     * @return
     */
    public static native String getArchitecture()/*-{
		return Ti.Platform.getArchitecture();
    }-*/;

    /**
     * Get the per-user machine identifier of this session.
     * 
     * @return
     */
    public static native String getMachineId()/*-{
		return Ti.Platform.getMachineId();
    }-*/;

    /**
     * Get the name of this platform.
     * 
     * @return
     */
    public static native String getName()/*-{
		return Ti.Platform.getName();
    }-*/;

    /**
     * Return the operating system architecture type of this system. This value
     * will be either '32bit' or '64bit.'
     * 
     * @return
     */
    public static native String getOSType()/*-{
		return Ti.Platform.getOSType();
    }-*/;

    /**
     * Return the number of processors on this system.
     * 
     * @return
     */
    public static native int getProcessorCount()/*-{
		return Ti.Platform.getProcessorCount();
    }-*/;

    /**
     * Return the username of the current user.
     * 
     * @return
     */
    public static native String getUserName()/*-{
		return Ti.Platform.getUserName();
    }-*/;

    /**
     * Return the version of this system's operating system.
     * 
     * @return
     */
    public static native String getVersion()/*-{
		return Ti.Platform.getVersion();
    }-*/;

    /**
     * Open the given application or file in the system's default program.s
     * 
     * @param name
     *            , The name or path to the application or file to open.
     * @return
     */
    public static native String openApplication(String name)/*-{
		return Ti.Platform.openApplication(name);
    }-*/;

    /**
     * Open the given URL in the system's default browser.
     * 
     * @param name
     *            , the URL to open.
     * @return
     */
    public static native String openURL(String name)/*-{
		return Ti.Platform.openURL(name);
    }-*/;

    /**
     * Take a PNG screenshot of the root window and save it to the given
     * filename.
     * 
     * @param filename
     *            , The filename to write the image to.
     * @return
     */
    public static native String takeScreenshot(String filename)/*-{
		return Ti.Platform.takeScreenshot(filename);
    }-*/;

    /**
     * Checks wether or not the current runtime is the tatanium desktop runtime
     * 
     * @return
     */
    public static boolean isTitanium() {
        try {
            Ti.getPlatform();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static final boolean isWindows() {
        return (Ti.getPlatform().toLowerCase().indexOf(WIN_32)) >= 0;
    }

    public static final boolean isLinux() {
        return (Ti.getPlatform().toLowerCase().indexOf(LINUX)) >= 0;
    }

    public static final boolean isMacOS() {
        return (Ti.getPlatform().toLowerCase().indexOf(OSX)) >= 0;
    }
}
