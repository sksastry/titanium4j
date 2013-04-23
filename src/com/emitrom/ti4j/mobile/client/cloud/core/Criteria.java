/**************************************************************************
   Criteria.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.core;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;

/**
 * Constrains values for fields. where should be encoded JSON. Without it, query
 * will simply return all objects.
 */
public class Criteria extends ProxyObject {

    public Criteria() {
        jsObj = JsoHelper.createObject();
    }

    public void setContrain(String property, Object value) {
        JsoHelper.setAttribute(jsObj, property, value);
    }

}
