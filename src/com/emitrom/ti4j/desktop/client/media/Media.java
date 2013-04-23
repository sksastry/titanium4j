/************************************************************************
 * Media.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.media;

/**
 * A module for dealing with media.
 */
public class Media {

    private Media() {

    }

    /**
     * Activate the system bell. Some systems may have disabled the system bell.
     */
    public static native void beep()/*-{
		Ti.Media.beep();
    }-*/;

    /**
     * Factory method for Sound objects, created given a path or a URL to a
     * sound file. The types of sound files that can be played depend on the
     * codecs installed on the user's system.
     * 
     * @param path
     *            , The path or url to the sound file to play.
     * @return
     */
    public static native Sound createSound(String path)/*-{
		var obj = Ti.Media.createSound(path);
		return @com.emitrom.ti4j.desktop.client.media.Sound::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
