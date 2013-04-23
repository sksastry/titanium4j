/************************************************************************
 * WorkerObject.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom
 * LLC
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
package com.emitrom.ti4j.desktop.client.worker;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class WorkerObject extends ProxyObject {

    protected WorkerObject(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native String postMessage(JavaScriptObject value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.postMessage(value);
    }-*/;

    public final native void start()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.start();
    }-*/;

    public final native void terminate()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.terminate();
    }-*/;

}
