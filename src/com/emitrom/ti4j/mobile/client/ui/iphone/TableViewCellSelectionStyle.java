/**************************************************************************
   TableViewCellSelectionStyle.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
 * A set of constants for the style that can be used for the 'selectionstyle'
 * property of {@link com.emitrom.ti4j.mobile.client.ui.TableViewRow} .
 */
public class TableViewCellSelectionStyle {

    public static final int BLUE = BLUE();
    public static final int GRAY = GRAY();
    public static final int NONE = NONE();

    private TableViewCellSelectionStyle() {
    }

    private static native final int BLUE() /*-{
		return Titanium.UI.iPhone.TableViewCellSelectionStyle.BLUE;
    }-*/;

    private static native final int GRAY() /*-{
		return Titanium.UI.iPhone.TableViewCellSelectionStyle.GRAY;
    }-*/;

    private static native final int NONE() /*-{
		return Titanium.UI.iPhone.TableViewCellSelectionStyle.NONE;
    }-*/;

}
