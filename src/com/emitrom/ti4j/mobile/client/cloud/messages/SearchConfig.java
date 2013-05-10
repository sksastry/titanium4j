/************************************************************************
  SearchConfig.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.messages;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represents a config for the entries to be shown in the user 'S inbox
 */
public class SearchConfig extends ProxyObject {

    public SearchConfig() {
        jsObj = JsoHelper.createObject();
    }

    public SearchConfig(JavaScriptObject obj) {
        jsObj = obj;
    }

    public void setPage(int value) {
        JsoHelper.setAttribute(jsObj, "page", value);
    }

    public void setPerPage(int value) {
        JsoHelper.setAttribute(jsObj, "per_page", value);
    }

}
