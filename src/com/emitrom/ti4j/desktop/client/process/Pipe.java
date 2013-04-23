/************************************************************************
 * Pipe.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.process;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.desktop.client.bytes.Bytes;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * An object representing an IO pipe. An IO Pipe helps in reading data from an
 * input stream, processing this data and then writing this to an output stream.
 * 
 */
public class Pipe extends ProxyObject {

    protected Pipe(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native String attach()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.attach();
    }-*/;

    public final native String close()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.close();
    }-*/;

    public final native String detach()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.detach();
    }-*/;

    public final native boolean isAttached()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isAttached();
    }-*/;

    public final native int write(String data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.write(data);
    }-*/;

    public final native int write(Bytes data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.write(data);
    }-*/;

}
