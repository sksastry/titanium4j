/************************************************************************
 * DB.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a Ti Database.
 * 
 */
public class DB extends ProxyObject {

    protected DB(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Close an open Database.DB. If the database is not open, obj method will
     * do nothing.
     */
    public final native void close()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.close();
    }-*/;

    /**
     * Executes an SQL query on obj Database.DB. Currently all queries must be
     * valid SQLite-style SQL.
     * 
     * @param query
     *            , The SQL query to execute on obj Database.DB.
     */
    public final native void execute(String query)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.execute(query);
    }-*/;

    /**
     * Executes an SQL query on obj Database.DB. Currently all queries must be
     * valid SQLite-style SQL.
     * 
     * @param query
     *            , The SQL query to execute on obj Database.DB.
     * 
     * @param args
     *            , A variable-length argument list of values to use with the
     *            given query
     */
    public final native void execute(String query, Object... args)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.execute.apply(query, args);
    }-*/;

    /**
     * Get the full filesystem path to the database. If obj database was opened
     * via Datbase.openFile obj path will be the originally path used, otherwise
     * it will be the path to a WebKit database in the application data
     * directory.
     * 
     * @return
     */
    public final native String getPath()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getPath();
    }-*/;

    /**
     * Remove a Database.DB. This method will close the database if it is open
     * and remove the file from the filesystem.
     */
    public final native void remove()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.remove();
    }-*/;

    /**
     * The row id of the last insert operation.
     * 
     * @return
     */
    public final native int getLastInsertedRowId()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.lastInsertedRowId;
    }-*/;

    /**
     * The number of rows affected by the last execute call.
     * 
     * @return
     */
    public final native double getRowsAffected()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.rowsAffected;
    }-*/;

}
