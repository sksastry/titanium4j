/************************************************************************
  DaysOfTheWeek.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
