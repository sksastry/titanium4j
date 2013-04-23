/************************************************************************
 * Clipboard.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.ui;


public class Clipboard {

    private Clipboard() {

    }

    public static native String clearData()/*-{
		return Ti.UI.Clipboard.clearData();
    }-*/;

    public static native String clearData(String type)/*-{
		return Ti.UI.Clipboard.clearData(type);
    }-*/;

    public static native String clearText()/*-{
		return Ti.UI.Clipboard.clearText();
    }-*/;

    public static native String getData(String type)/*-{
		return Ti.UI.Clipboard.getData(type);
    }-*/;

    public static native String getText()/*-{
		return Ti.UI.Clipboard.getText();
    }-*/;

    public static native boolean hasData()/*-{
		return Ti.UI.Clipboard.hasData();
    }-*/;

    public static native boolean hasData(String type)/*-{
		return Ti.UI.Clipboard.hasData(type);
    }-*/;

    public static native String hasText()/*-{
		return Ti.UI.Clipboard.hasText();
    }-*/;

    public static native String setData(String type, String data)/*-{
		return Ti.UI.Clipboard.setData(type, data);
    }-*/;

    public static native String setText(String newText)/*-{
		return Ti.UI.Clipboard.setText(newText);
    }-*/;

}
