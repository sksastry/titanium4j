/**************************************************************************
   PickerColumn.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Picker Column object.Represents a column in a picker element
 */
public class PickerColumn extends View {

    public PickerColumn() {
        createPeer();
    }

    PickerColumn(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Number of rows in the column (readonly)
     */
    public native int getRowCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.rowCount;
    }-*/;

    /**
     * @return An array of rows
     */
    public ArrayList<PickerRow> getRows() {
        ArrayList<PickerRow> rows = new ArrayList<PickerRow>();
        JsArray<JavaScriptObject> values = _getRows();
        for (int i = 0; i < values.length(); i++) {
            rows.add(new PickerRow(values.get(i)));
        }
        return rows;
    }

    private native JsArray<JavaScriptObject> _getRows() /*-{
		return jso.rows;
    }-*/;

    /**
     * Add a row to the column.
     * 
     * @param row The row to add.
     */
    public native void addRow(PickerRow row) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.addRow(row.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Remove a row from the column.
     * 
     * @param row The row to remove.
     */
    public native void removeRow(PickerRow row) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.removeRow(row.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createPickerColumn();
    }

    public static PickerColumn from(ProxyObject proxy) {
        return new PickerColumn(proxy.getJsObj());
    }
}
