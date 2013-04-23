package com.emitrom.ti4j.mobile.client.ios.calendar;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

class DaysOfTheWeek extends ProxyObject {

    protected DaysOfTheWeek(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The day of the week. Values are from 1 to 7, with Sunday being 1.
     */
    public int getDaysOfWeek() {
        return JsoHelper.getAttributeAsInt(jsObj, "daysOfWeek");
    }

    /**
     * The week number of the day of the week. Values range from -53 to 53. A
     * negative value indicates a value from the end of the range. 0 indicates
     * the week number is irrelevant.
     */
    public int getWeek() {
        return JsoHelper.getAttributeAsInt(jsObj, "week");
    }
}
