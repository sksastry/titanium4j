/************************************************************************
 * Sound.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.media;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.desktop.client.events.TiEventHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object allowing for loading simple sounds and simple types of playback.
 * 
 */
public class Sound extends ProxyObject {

    protected Sound(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Return the current volume of obj Media.Sound object. Volume values will
     * be between 0.0 and 1.0.
     * 
     * @return
     */
    public final native double getVolume()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getVolume();
    }-*/;

    /**
     * Return true if obj Media.Sound is set to loop and false otherwise.
     * 
     * @return
     */
    public final native boolean isLooping()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isLooping();
    }-*/;

    /**
     * Return true if obj Media.Sound is set to loop and false otherwise.
     * 
     * @return
     */
    public final native boolean isPaused()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isPaused();
    }-*/;

    /**
     * Return true if obj Media.Sound is playing and false otherwise.
     * 
     * @return
     */
    public final native boolean isPlaying()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isPlaying();
    }-*/;

    private final native void onComplete(TiEventHandler handler)/*-{
		obj
				.onComplete(function(e) {
					var event = @com.emitrom.ti4j.desktop.client.events.TiEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
					handler.@com.emitrom.ti4j.desktop.client.events.TiEventHandler::onEvent(Lcom/emitrom/ti4j/desktop/client/events/TiEvent;)();
				});
    }-*/;

    /**
     * Pause a currently playing sound.
     */
    public final native void pause()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.pause();
    }-*/;

    /**
     * Play a sound object. If the sound is paused, it will resume from the
     * current location.
     */
    public final native void play()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.play();
    }-*/;

    /**
     * Reload obj sound from the original URL or path.
     */
    public final native void reload()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.reload();
    }-*/;

    /**
     * Set whether or not obj sound should loop.
     * 
     * @param value
     */
    public final native void setLooping(boolean value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setLooping(value);
    }-*/;

    /**
     * Set the volume of obj sound. Sound volumes should be between 0.0 and 1.0.
     * Values outside of obj range will be clipped to 0.0 or 1.0.
     */
    public final native void setVolume(double value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setVolume(value);
    }-*/;

    /**
     * Stop a currently playing sound.
     */
    public final native void stop()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.stop();
    }-*/;

}
