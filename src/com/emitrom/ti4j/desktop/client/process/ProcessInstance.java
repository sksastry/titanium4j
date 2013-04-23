/************************************************************************
 * ProcessInstance.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom
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
package com.emitrom.ti4j.desktop.client.process;

import com.emitrom.ti4j.core.client.Function;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class ProcessInstance extends ProxyObject {

    protected ProcessInstance(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native JsArrayString getArguments()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getArguments();
    }-*/;

    public final native <T> T getEnvironment(String key)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getEnvironment(key);
    }-*/;

    public final native int getExitCode()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getExitCode();
    }-*/;

    public final native int getPID()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getPID();
    }-*/;

    public final native Pipe getStderr()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getStderr();
		return @com.emitrom.ti4j.desktop.client.process.Pipe::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Pipe getStdin()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getStdin();
		return @com.emitrom.ti4j.desktop.client.process.Pipe::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native Pipe getStdout()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var peer = obj.getStdout();
		return @com.emitrom.ti4j.desktop.client.process.Pipe::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native boolean isRunning()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isRunning();
    }-*/;

    public final native String kill()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.kill();
    }-*/;

    public final native String launch()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.launch();
    }-*/;

    /**
     * does nothing in Windows
     */
    public final native String sendSignal(String signal)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.sendSignal(signal);
    }-*/;

    /**
     * does nothing in Windows
     */
    public final native String sendSignal(double signal)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.sendSignal(signal);
    }-*/;

    public final native String setEnvironment(String key, String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setEnvironment(key, value);
    }-*/;

    public final native String setOnExit(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setOnExit(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    public final native String setOnRead(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setOnRead(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    public final native String setOnReadLine(Function callback)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.setOnReadLine(function() {
			callback.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    /**
     * does nothing on Windows
     */
    public final native String terminate()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.terminate();
    }-*/;

    public final native String asString()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.toString();
    }-*/;

}
