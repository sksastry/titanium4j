/**************************************************************************
   Yahoo.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.yahoo;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.emitrom.ti4j.mobile.client.core.events.TiEvent;
import com.emitrom.ti4j.mobile.client.core.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level yahoo module. the yahoo module is used for accessing yahoo
 * related api services.
 */
public class Yahoo extends TiModule {
	
	private static Yahoo instance = null;
	
	public static Yahoo get(){
		if(instance == null){
			instance = new Yahoo();
		}
		return instance;
	}

	private Yahoo() {
		createPeer();
	}

	public void yql(String yql, TiEventListener<TiEvent> listener) {
		yql(yql, listener.getJsoPeer());
	}

	private native void yql(String yql, JavaScriptObject callback) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.yql(yql, callback);
	}-*/;


	@Override
	public void createPeer() {
		jsObj = TiFactory.createNativeYahooModule();
	}

}
