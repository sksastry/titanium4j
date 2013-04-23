/**************************************************************************
 * ResultSet.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.mobile.client.database;

import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The resultset instance returned by invoking a database sql execute.
 */
public class ResultSet extends EventDispatcher {

    private ResultSet() {

    }

    private ResultSet(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The number of rows in the result set
     */
    public native int getRowCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.rowCount;
    }-*/;

    /**
     * @return The number of columns in this result set.
     */
    public native int getFieldCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fieldCount;
    }-*/;

    /**
     * @return Returns true if the current row is still valid
     */
    public native boolean getValidRow() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.validRow;
    }-*/;

    /**
     * Close the result set and release resources. once closed, this result set
     * must no longer be used
     */
    public native void close() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.close();
    }-*/;

    /**
     * Retrieve a row value by field index
     * 
     * @param index
     *            column index (which is zero based)
     */
    public native <T> T field(int index) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.field(index);
    }-*/;

    /**
     * Retrieve a row value by field index
     * 
     * @param index
     *            column index (which is zero based)
     * @param type
     *            One of (
     *            {@link com.emitrom.ti4j.mobile.client.database.Database.FIELD_TYPE_STRING}
     *            {@link com.emitrom.ti4j.mobile.client.database.Database.FIELD_TYPE_INT}
     *            {@link com.emitrom.ti4j.mobile.client.database.Database.FIELD_TYPE_FLOAT}
     *            {@link com.emitrom.ti4j.mobile.client.database.Database.FIELD_TYPE_DOUBLE}
     *            )
     */
    public native <T> T field(int index, int type) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.field(index, type);
    }-*/;

    /**
     * Retrieve a row value by field name
     * 
     * @param name
     *            column name from SQL query
     */
    public native <T> T fieldByName(String name) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fieldByName(name);
    }-*/;

    /**
     * Retrieve a row value by field name
     * 
     * @param name
     *            column name from SQL query
     * @param type
     *            One of (
     *            {@link com.emitrom.ti4j.mobile.client.database.Database.FIELD_TYPE_STRING}
     *            {@link com.emitrom.ti4j.mobile.client.database.Database.FIELD_TYPE_INT}
     *            {@link com.emitrom.ti4j.mobile.client.database.Database.FIELD_TYPE_FLOAT}
     *            {@link com.emitrom.ti4j.mobile.client.database.Database.FIELD_TYPE_DOUBLE}
     *            )
     */
    public native <T> T fieldByName(String name, int type) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fieldByName(name, type);
    }-*/;

    /**
     * Return the number of columns in the result set
     */
    public native int fieldCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fieldCount();
    }-*/;

    /**
     * Return the field name for field index
     * 
     * @param index
     *            field name column index (which is zero based)
     */
    public native String fieldName(int index) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fieldName(index);
    }-*/;

    /**
     * Return true if the row is a valid row
     */
    public native boolean isValidRow() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.isValidRow();
    }-*/;

    /**
     * Iterate to the next row in the result set.
     * 
     * @return If the next operation goes past the row, this returns false. Else
     *         true.
     */
    public native boolean next() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.next();
    }-*/;

}
