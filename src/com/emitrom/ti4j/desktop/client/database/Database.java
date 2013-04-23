/************************************************************************
 * Database.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.database;

import com.emitrom.ti4j.core.client.ProxyObject;

/**
 * A module for dealing with Database storage.
 * 
 * 
 */
public final class Database extends ProxyObject {

    protected Database() {

    }

    /**
     * Open a WebKit HTML5 compatible-database, given the name of the database
     * to open. WebKit HTML5 databases are stored per-security origin and are
     * not available between security origins. A security origin is composed of
     * a URL scheme and hostname pair.
     * 
     * @param databaseName
     *            , Name of the database. The call will create the database if
     *            it does not exist.
     */
    public static native DB open(String databaseName)/*-{
		var db = Ti.Database.open(databaseName);
		return @com.emitrom.ti4j.desktop.client.database.DB::new(Lcom/google/gwt/core/client/JavaScriptObject;)(db);
    }-*/;

    /**
     * Open a database, given a path to an sqlite file.
     * 
     * @param path
     *            , Path to an SQLite file to store the database in. If the file
     *            does not exist
     * @return
     */
    public static native DB openFile(String path)/*-{
		var db = Ti.Database.openFile(path);
		return @com.emitrom.ti4j.desktop.client.database.DB::new(Lcom/google/gwt/core/client/JavaScriptObject;)(db);
    }-*/;

}
