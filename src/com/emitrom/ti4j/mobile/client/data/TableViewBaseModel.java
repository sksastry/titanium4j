/**************************************************************************
   TableViewBaseModel.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.data;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class to use in a Table View You can extends this class to add custom
 * properties.
 */
public class TableViewBaseModel extends BaseModel {

    public TableViewBaseModel() {
        jsObj = JsoHelper.createObject();
    }

    TableViewBaseModel(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    public native void setHasChild(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.hasChild = value;
    }-*/;

    public native boolean hasChildren() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.hasChildren;
    }-*/;

    public native void setData(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.data = value;
    }-*/;

    public native String getData() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.data;
    }-*/;

}
