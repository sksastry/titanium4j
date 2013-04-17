/**************************************************************************
   Gesture.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.gesture;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.emitrom.ti4j.mobile.client.core.events.OrientationChangeEvent;
import com.emitrom.ti4j.mobile.client.core.events.ShakeEvent;
import com.emitrom.ti4j.mobile.client.core.events.TiEventListener;

/**
 * The top level gestures module. the gesture module is responsible for high
 * level device gestures that are device-wide.
 */
public class Gesture extends TiModule {

    private static Gesture instance = null;

    public static Gesture get() {
        if (instance == null) {
            instance = new Gesture();
        }
        return instance;
    }

    private Gesture() {
        createPeer();
    }

    public void addOrientationchangeHandler(TiEventListener<OrientationChangeEvent> listener) {
        addEventListener(OrientationChangeEvent.ORIENTATION_CHANGE, listener);
    }

    public void addShakeHandler(TiEventListener<ShakeEvent> listener) {
        addEventListener(ShakeEvent.SHAKE, listener);
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeGestureModule();
    }
}
