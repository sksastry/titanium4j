/************************************************************************
  HybridView.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.core;

import com.emitrom.ti4j.mobile.client.ui.WebView;

/**
 * Default WebView to use in Hybrid apps. Loads his content from
 * app/Resources/index.html
 * 
 */
public class DefaultWebView extends WebView {

    protected static String INDEX_FILE_NAME = "index.html";

    protected static final DefaultWebView INSTANCE = new DefaultWebView();

    public static DefaultWebView get() {
        return INSTANCE;
    }

    protected DefaultWebView() {
        this.setUrl(INDEX_FILE_NAME);
    }
}
