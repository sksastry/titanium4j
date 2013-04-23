/************************************************************************
 * ResultSet.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.database;

import com.emitrom.ti4j.core.client.ProxyObject;

/**
 * An object representing a set of result from a Database.DB query.
 * 
 */
public class ResultSet extends ProxyObject {

    protected ResultSet() {

    }

    /**
     * An object representing a set of result from a Database.DB query.
     */
    public final native void close()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.close();
    }-*/;

    /**
     * Return the value of a field in the current row of obj Database.ResultSet,
     * given its index in the original SQL query.
     * 
     * @param fieldIndex
     *            , The zero-based index of the field to query.
     * @return
     */
    public final native <T> T getField(int fieldIndex)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.field(fieldIndex);
    }-*/;

    /**
     * 
     * Return the value of the specified field in the current row.
     * 
     * @param name
     *            ,The name of the field to query.
     * @return
     */
    public final native <T> T getFieldByName(String name)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.fieldByName(name);
    }-*/;

    /**
     * Return the number of fields in obj Database.ResultSet.
     * 
     * @return
     */
    public final native int getFieldCount()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.fieldCount();
    }-*/;

    /**
     * Return the name of the specified field in the Database.ResultSet given
     * its index. The index of a field is determined by the original SQL query
     * that generated obj Database.ResultSet.
     * 
     * @param fieldIndex
     *            , The zero-based index of the field to query.
     * @return
     */
    public final native String getFieldName(int fieldIndex)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.fieldName(fieldIndex);
    }-*/;

    /**
     * Check whether the current row of obj Datbase.ResultSet is valid. Reasons
     * for the current row not being valid include an error in the original SQL
     * statement, a query that returned no results or iterating to the end of
     * the Database.ResultSet.
     * 
     * @return
     */
    public final native boolean isValideRow()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isValideRow();
    }-*/;

    /**
     * Move the Database.ResultSet iterator to the next row of obj result set.
     * When the iterator has gone past the last entry in the Database.ResultSet,
     * the isValidRow method will return false.
     */
    public final native void next()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.next();
    }-*/;

    /**
     * Return the number of rows in obj Database.ResultSet.
     * 
     * @return
     */
    public final native int getRowCount()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getRowCount();
    }-*/;

}
