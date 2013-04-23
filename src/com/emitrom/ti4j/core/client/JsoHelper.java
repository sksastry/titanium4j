/**************************************************************************
 * JsoHelper.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.core.client;

import java.util.Date;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Core Helper class to deal with JavaScript Object
 */
public final class JsoHelper {

    private JsoHelper() {
    }

    public static native JavaScriptObject createObject() /*-{
		return {};
    }-*/;

    public static native String getAttribute(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret === undefined) ? null : String(ret);

    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, String value) /*-{
		elem[attr] = value;
    }-*/;

    public static native JavaScriptObject getAttributeAsJavaScriptObject(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret === undefined) ? null : ret;
    }-*/;

    public static native JavaScriptObject[] getAttributeAsJavaScriptObjectArray(JavaScriptObject elem, String attr) /*-{
		var arrayJS = elem[attr];
		return (arrayJS === undefined) ? null
				: @com.emitrom.ti4j.core.client.JsoHelper::toArray(Lcom/google/gwt/core/client/JavaScriptObject;)(arrayJS);
    }-*/;

    public static JavaScriptObject[] toArray(JavaScriptObject array) {
        int length = getJavaScriptObjectArraySize(array);
        JavaScriptObject[] recs = new JavaScriptObject[length];
        for (int i = 0; i < length; i++) {
            recs[i] = getValueFromJavaScriptObjectArray(array, i);
        }
        return recs;
    }

    public static native void setAttribute(JavaScriptObject elem, String attr, JavaScriptObject[] value) /*-{
		elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, Object value) /*-{
		elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, JavaScriptObject value) /*-{
		elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, int value) /*-{
		elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, boolean value) /*-{
		elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, float value) /*-{
		elem[attr] = value;
    }-*/;

    public static native void setAttribute(JavaScriptObject elem, String attr, double value) /*-{
		elem[attr] = value;
    }-*/;

    public static native void setObjectAttribute(JavaScriptObject elem, String attr, Object object) /*-{
		elem[attr] = object;
    }-*/;

    public static native int getAttributeAsInt(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret === undefined) ? 0 : ret;
    }-*/;

    public static native double getAttributeAsDouble(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret === undefined) ? 0.0 : ret;
    }-*/;

    public static native Date getAttributeAsDate(JavaScriptObject elem, String attr) /*-{
                                                                                   var ret = elem[attr];
                                                                                   return (ret === undefined || ret == null) ? null: @com.emitrom.ti4j.core.client.JsoHelper::toDate(D)(ret.getTime());
                                                                                   }-*/;

    public static native float getAttributeAsFloat(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret === undefined) ? 0 : ret;
    }-*/;

    public static int[] getAttributeAsIntArray(JavaScriptObject elem, String attr) {
        int[] rtn = null;
        JavaScriptObject hold = getAttributeAsJavaScriptObject(elem, attr);

        if (hold != null) {
            rtn = new int[getJavaScriptObjectArraySize(hold)];

            for (int i = 0; i < rtn.length; i++) {
                rtn[i] = getIntValueFromJavaScriptObjectArray(hold, i);
            }
        }
        return rtn;
    }

    public static String[] getAttributeAsStringArray(JavaScriptObject elem, String attr) {
        String[] rtn = null;
        JavaScriptObject hold = getAttributeAsJavaScriptObject(elem, attr);

        if (hold != null) {
            rtn = new String[getJavaScriptObjectArraySize(hold)];

            for (int i = 0; i < rtn.length; i++) {
                rtn[i] = getStringValueFromJavaScriptObjectArray(hold, i);
            }
        }
        return rtn;
    }

    public static native int getJavaScriptObjectArraySize(JavaScriptObject elem) /*-{
		if (elem)
			return elem.length;
		return 0;
    }-*/;

    public static native int getIntValueFromJavaScriptObjectArray(JavaScriptObject elem, int i) /*-{
		return elem[i];
    }-*/;

    public static native String getStringValueFromJavaScriptObjectArray(JavaScriptObject elem, int i) /*-{
		return elem[i];
    }-*/;

    public static native JavaScriptObject getValueFromJavaScriptObjectArray(JavaScriptObject elem, int i) /*-{
		return elem[i];
    }-*/;

    public static native boolean getAttributeAsBoolean(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret === undefined) ? false : ret;
    }-*/;

    public static native Object getAttributeAsObject(JavaScriptObject elem, String attr) /*-{
		var ret = elem[attr];
		return (ret === undefined) ? null : ret;
    }-*/;

    @SuppressWarnings("rawtypes")
    public static JavaScriptObject[] listToArray(List list) {
        JavaScriptObject[] array = new JavaScriptObject[list.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (JavaScriptObject) list.get(i);
        }
        return array;
    }

    public static native int arrayLength(JavaScriptObject array) /*-{
		return array.length;
    }-*/;

    public static native Object arrayGetObject(JavaScriptObject array, int index) /*-{
		return array[index];
    }-*/;

    public static native void arraySet(JavaScriptObject array, int index, Object value) /*-{
		array[index] = value;
    }-*/;

    public static native void arraySet(JavaScriptObject array, int index, JavaScriptObject value) /*-{
		array[index] = value;
    }-*/;

    public static Integer toInteger(int value) {
        return new Integer(value);
    }

    /**
     * 
     * @param value
     * @return
     */
    public static Long toLong(double value) {
        return new Long((long) value);
    }

    public static Float toFloat(float value) {
        return new Float(value);
    }

    public static Double toDouble(double value) {
        return new Double(value);
    }

    public static Date toDate(double millis) {
        return new Date((long) millis);
    }

    public static Boolean toBoolean(boolean value) {
        return Boolean.valueOf(value);
    }

    public static native void setArrayValue(JavaScriptObject array, int index, String value) /*-{
		array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, double value) /*-{
		array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, float value) /*-{
		array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, boolean value) /*-{
		array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, JavaScriptObject value) /*-{
		array[index] = value;
    }-*/;

    public static native void setArrayValue(JavaScriptObject array, int index, Object value) /*-{
		array[index] = value;
    }-*/;

    public static native String getArrayValue(JavaScriptObject array, int index) /*-{
		var result = array[index];
		return (result == null || result === undefined) ? null : result;
    }-*/;

    public static native int getIntArrayValue(JavaScriptObject array, int index) /*-{
		return array[index];
    }-*/;

    public static native int getArrayLength(JavaScriptObject array) /*-{
		return array.length;
    }-*/;

    public static int[] convertToJavaIntArray(JavaScriptObject array) {
        int length = getArrayLength(array);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getIntArrayValue(array, i);
        }
        return arr;
    }

    public static String[] convertToJavaStringArray(JavaScriptObject array) {
        if (array == null)
            return new String[] {};
        int length = getArrayLength(array);
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getArrayValue(array, i);
        }
        return arr;
    }

    public static native void apply(JavaScriptObject config, JavaScriptObject jsObj) /*-{
		for ( var k in config) {
			jsObj[k] = config[k];
		}
    }-*/;

    public static native String getPropertiesAsString(JavaScriptObject jsObj) /*-{
		var props = '{';
		for ( var k in jsObj) {
			props += '\n' + k;
		}
		return props + '}';
    }-*/;

}
