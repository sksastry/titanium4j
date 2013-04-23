/**************************************************************************
 * Color.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client.ui.style;

@Deprecated
public class Color {

    public final static Color INDIA_RED = new Color("#B0171F");
    public final static Color CRIMPSON = new Color("#DC143C");
    public final static Color BLACK = new Color("#000000");
    public final static Color WHITE = new Color("#FFFFFF");

    private String value;

    public Color(String rgb) {
        this.value = rgb;
    }

    public String getRgb() {
        return this.value;
    }

}
