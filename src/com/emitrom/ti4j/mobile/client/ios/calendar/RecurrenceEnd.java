package com.emitrom.ti4j.mobile.client.ios.calendar;

import java.util.Date;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

class RecurrenceEnd extends ProxyObject {

    protected RecurrenceEnd(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * End date of the recurrence end, or undefined if the recurrence end is
     * count-based.
     */
    public Date getEndDate() {
        return JsoHelper.getAttributeAsDate(jsObj, "endDate");
    }

    /**
     * Occurrence count of the recurrence end, or 0 if the recurrence end is
     * date-based.
     */
    public int getOccurenceCount() {
        return JsoHelper.getAttributeAsInt(jsObj, "occurenceCount");
    }
}
