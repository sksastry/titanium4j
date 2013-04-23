/************************************************************************
 * UpdateManager.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom
 * LLC
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
package com.emitrom.ti4j.desktop.client.updatemanager;

import com.emitrom.ti4j.desktop.client.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;

public final class UpdateManager extends JavaScriptObject {

    private UpdateManager() {

    }

    public static native String startMonitor(int id)/*-{
		return Ti.UpdateManager.startMonitor(id);
    }-*/;

    public static native String installAppUpdate(Object value)/*-{
		return Ti.UpdateManager.installAppUpdate(value);
    }-*/;

    public static double startMonitor(String component, TiEventListener<?> callback, double interval) {
        return UpdateManager.startMonitor(component, callback.getJsoPeer(), interval);
    }

    private static native double startMonitor(String component, JavaScriptObject callback, double interval)/*-{
		return Ti.UpdateManager.startMonitor(component, callback, interval);
    }-*/;

    // TODO
    // Implement onUpdata

}
