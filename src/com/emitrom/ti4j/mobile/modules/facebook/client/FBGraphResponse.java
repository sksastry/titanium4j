/************************************************************************
  FBGraphResponse.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.modules.facebook.client;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.events.ErrorResponse;
import com.google.gwt.core.client.JavaScriptObject;

public class FBGraphResponse extends ErrorResponse {

    protected FBGraphResponse(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Graph API path of the original request.
     */
    public String getPath(String value) {
        return JsoHelper.getAttribute(jsObj, "path");
    }

    /**
     * If successful, returns the JSON response returned by Facebook. If the
     * request is not successfully completed, the result is undefined.
     */
    public String getResult() {
        return JsoHelper.getAttribute(jsObj, "result");
    }

}
