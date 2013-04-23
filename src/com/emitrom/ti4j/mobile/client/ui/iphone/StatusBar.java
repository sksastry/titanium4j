/**************************************************************************
   StatusBar.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.iphone;


/**
 * A set of constants for the status bar style.
 */
public class StatusBar {

    public static final int DEFAULT = DEFAULT();
    public static final int GRAY = GRAY();
    public static final int OPAQUE_BLACK = OPAQUE_BLACK();
    public static final int TRANSLUCENT_BLACK = TRANSLUCENT_BLACK();

    private StatusBar() {
    }

    private static native final int DEFAULT() /*-{
		return Titanium.UI.iPhone.StatusBar.DEFAULT;
    }-*/;

    private static native final int GRAY() /*-{
		return Titanium.UI.iPhone.StatusBar.GRAY;
    }-*/;

    private static native final int OPAQUE_BLACK() /*-{
		return Titanium.UI.iPhone.StatusBar.OPAQUE_BLACK;
    }-*/;

    private static native final int TRANSLUCENT_BLACK() /*-{
		return Titanium.UI.iPhone.StatusBar.TRANSLUCENT_BLACK;
    }-*/;

}
