/************************************************************************
  InstantMessage.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.contacts;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class InstantMessage extends ProxyObject {

    protected InstantMessage(JavaScriptObject obj) {
        jsObj = obj;
    }

    public String getUserName() {
        return JsoHelper.getAttribute(jsObj, "username");
    }

    public String getService() {
        return JsoHelper.getAttribute(jsObj, "service");
    }

    static List<InstantMessage> fromJsArray(JavaScriptObject obj) {
        List<InstantMessage> toReturn = new ArrayList<InstantMessage>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new InstantMessage(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
