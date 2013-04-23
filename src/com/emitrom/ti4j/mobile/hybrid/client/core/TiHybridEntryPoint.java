/**************************************************************************
   TiHybridEntryPoint.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.hybrid.client.core;

import com.emitrom.ti4j.mobile.client.core.Utils;
import com.google.gwt.core.client.EntryPoint;

/**
 * EntryPoint for Titanium hybrid applications. This class should be extends
 * when using an HTML5 based UI inside Ti4j
 */
public abstract class TiHybridEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        if (Utils.isWebMode()) {
            Utils.bindTi();
            onWebLoad();
        } else {
            onNativeLoad();
        }
    }

    /**
     * called for native mobile applications
     */
    public abstract void onNativeLoad();

    /**
     * called for mobile web application
     */
    public abstract void onWebLoad();

}
