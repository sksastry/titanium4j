/************************************************************************
 * UI.java is part of Ti4j 3.1.0 Copyright 2013 Emitrom LLC
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
package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.emitrom.ti4j.mobile.client.core.Unit;
import com.emitrom.ti4j.mobile.client.platform.Platform;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The main ui module. The ui module is responsible for native user-interface
 * components and interaction inside titanium. the goal of the ui module is to
 * provide a native experience along with native performance by compiling
 * javascript code into their native counterparts as part of the build process.
 * <p>
 * 
 * Design
 * 
 * The UI module is broken down into 3 major area:
 * 
 * **Views** - [Views](Ti.UI.View-object.html) are containers that host visual
 * elements such as controls or other views. Views can have their properties
 * customized, such as their border color and radius, can fire events such as
 * swipe events or touches, and can optionally contain a hierarchy or other
 * views as children. In Ti, most views are specialized to perform both a visual
 * function and set of interaction behaviors such as [Table
 * View](Ti.UI.TableView-object.html) or [Coverflow
 * View](Ti.UI.CoverFlowView-object.html). Views are always named with the
 * suffix `View`. **Controls** - controls, or sometimes referred as widgets, are
 * visual elements such as [sliders](Ti.UI.Slider-object.html),
 * [buttons](Ti.UI.Button-object.html) and [switches](Ti.UI.Switch-object.html).
 * They provide a visual element which has a defined behavior and typical have
 * special configuration and special events. Controls themselves are views and
 * also inherit a views properties, functions and events. **Windows** -
 * [Windows](Ti.UI.Window-object.html) are typically top-level visual constructs
 * that are the main part of your interface. An application will always have at
 * least one window and windows can take different shapes and sizes, can have
 * display and interaction properties such as fullscreen or modal and can be
 * customized, such as changing their opacity or background color. Windows
 * themselves are views and also inherit a views properties, functions and
 * events. There are a few specialization of Windows such as a [Tab
 * Group](Ti.UI.TabGroup-object.html) which offer additional behavior beyond the
 * basic Window.
 * 
 * 
 * Ti uses the [Factory
 * Pattern](http://en.wikipedia.org/wiki/Factory_method_pattern) for
 * constructing objects and a general naming pattern for APIs. For example, to
 * construct a [Alert Dialog](Ti.UI.AlertDialog-object.html), you call the
 * method <Ti.UI.createAlertDialog>. To create a
 * [TextArea](Ti.UI.TextArea-object.html), you call the method
 * <Ti.UI.createTextArea>. Once an object is created, it will be available until
 * it goes out of scope.
 * 
 * Optimizations
 * 
 * UI objects are optimized by Ti to not be realized into the drawing context
 * and placed into the device UI surface until needed. That means that you can
 * create UI objects, set their properties and add them to their hierarchy
 * without much worry about memory or performance. When the native drawing
 * surface needs to render a specific view or control, Ti will automatically
 * create the view as needed. Additionally, Ti is optimized to also release
 * memory once the view is no longer needed, on screen or in low memory
 * situations. However, it's a good idea to help Ti along in certain cases where
 * you are no longer using objects. For example, you should call `close` on a
 * [Window](Ti.UI.Window-object.html) instance when you are no longer using it.
 * You can safely call `open` on the [Window](Ti.UI.Window-object.html) again to
 * re-open it.
 * 
 * Global Context and Threading
 * 
 * Be careful with the objects that are created in 'app.js' but only used once.
 * Since the 'app.js' context is global and generally is not garbage collected
 * until the application exits, you should think about the design of your
 * application as it relates to this fact. [Window](Ti.UI.Window-object.html)
 * objects that are opened up with the 'url' property to another Javascript file
 * contain a nice way to decompose your application into smaller units. The
 * other benefit is that when a [Window](Ti.UI.Window-object.html) is closed,
 * its resources can be immediately cleaned up, saving resources such as memory
 * and CPU. Additionally, [Window](Ti.UI.Window-object.html) objects run in a
 * separate Javascript context and Thread. While all UI processing is done on
 * the main UI thread, other processing inside a Window or the 'app.js' that
 * does not have UI interaction will run in its own thread.
 * 
 * 
 * Portability
 * 
 * Ti components are designed to be portable across as many platforms as it
 * supports. However, there are cases where a device either does not support a
 * specific feature or capability or where it support additional functionality.
 * For cases where the device OS supports capabilities that other platforms do
 * not, we attempt to place those capabilities in a separate namespace, such as
 * [Ti.UI.iPhone](Ti.UI.iPhone-module.html). However, in cases where the control
 * is in a common namespace and support additional features, we continue to
 * place that functionality directly on the object.
 */
public class UI extends TiModule {

    public static final int UI_FACE_DOWN = FACE_DOWN();
    public static final int UI_FACE_UP = FACE_UP();
    public static final int UI_FILL = FILL();
    public static final int UI_INHERIT = INHERIT();
    public static final int UI_INPUT_BORDERSTYLE_BEZEL = INPUT_BORDERSTYLE_BEZEL();
    public static final int UI_INPUT_BORDERSTYLE_LINE = INPUT_BORDERSTYLE_LINE();
    public static final int UI_INPUT_BORDERSTYLE_NONE = INPUT_BORDERSTYLE_NONE();
    public static final int UI_INPUT_BUTTONMODE_ALWAYS = INPUT_BUTTONMODE_ALWAYS();
    public static final int UI_INPUT_BUTTONMODE_NEVER = INPUT_BUTTONMODE_NEVER();
    public static final int UI_INPUT_BUTTONMODE_ONBLUR = INPUT_BUTTONMODE_ONBLUR();
    public static final int UI_INPUT_BUTTONMODE_ONFOCUS = INPUT_BUTTONMODE_ONFOCUS();
    public static final int UI_INPUT_BORDERSTYLE_ROUNDED = INPUT_BORDERSTYLE_ROUNDED();
    public static final int UI_KEYBOARD_APPEARANCE_ALERT = KEYBOARD_APPEARANCE_ALERT();
    public static final int UI_KEYBOARD_APPEARANCE_DEFAULT = KEYBOARD_APPEARANCE_DEFAULT();
    public static final int UI_KEYBOARD_ASCII = KEYBOARD_ASCII();
    public static final int UI_KEYBOARD_DECIMAL_PAD = KEYBOARD_DECIMAL_PAD();
    public static final int UI_KEYBOARD_DEFAULT = KEYBOARD_DEFAULT();
    public static final int UI_KEYBOARD_EMAIL = KEYBOARD_EMAIL();
    public static final int UI_KEYBOARD_NAMEPHONE_PAD = KEYBOARD_NAMEPHONE_PAD();
    public static final int UI_KEYBOARD_NUMBERS_PUNCTUATION = KEYBOARD_NUMBERS_PUNCTUATION();
    public static final int UI_KEYBOARD_NUMBER_PAD = KEYBOARD_NUMBER_PAD();
    public static final int UI_KEYBOARD_PHONE_PAD = KEYBOARD_PHONE_PAD();
    public static final int UI_KEYBOARD_URL = KEYBOARD_URL();
    public static final int UI_LANDSCAPE_LEFT = LANDSCAPE_LEFT();
    public static final int UI_LANDSCAPE_RIGHT = LANDSCAPE_RIGHT();
    public static final int UI_NOTIFICATION_DURATION_LONG = 60;
    public static final int UI_NOTIFICATION_DURATION_SHORT = 30;
    public static final int UI_PICKER_TYPE_COUNT_DOWN_TIMER = PICKER_TYPE_COUNT_DOWN_TIMER();
    public static final int UI_PICKER_TYPE_DATE = PICKER_TYPE_DATE();
    public static final int UI_PICKER_TYPE_DATE_AND_TIME = PICKER_TYPE_DATE_AND_TIME();
    public static final int UI_PICKER_TYPE_PLAIN = PICKER_TYPE_PLAIN();
    public static final int UI_PICKER_TYPE_TIME = PICKER_TYPE_TIME();
    public static final int UI_PORTRAIT = PORTRAIT();
    public static final int UI_RETURNKEY_DEFAULT = RETURNKEY_DEFAULT();
    public static final int UI_RETURNKEY_DONE = RETURNKEY_DONE();
    public static final int UI_RETURNKEY_EMERGENCY_CALL = RETURNKEY_EMERGENCY_CALL();
    public static final int UI_RETURNKEY_GO = RETURNKEY_GO();
    public static final int UI_RETURNKEY_GOOGLE = RETURNKEY_GOOGLE();
    public static final int UI_RETURNKEY_JOIN = RETURNKEY_JOIN();
    public static final int UI_RETURNKEY_NEXT = RETURNKEY_NEXT();
    public static final int UI_RETURNKEY_ROUTE = RETURNKEY_ROUTE();
    public static final int UI_RETURNKEY_SEARCH = RETURNKEY_SEARCH();
    public static final int UI_RETURNKEY_SEND = RETURNKEY_SEND();
    public static final int UI_RETURNKEY_YAHOO = RETURNKEY_YAHOO();
    public static final int UI_SIZE = SIZE();
    public static final int UI_TEXT_ALIGNMENT_CENTER = TEXT_ALIGNMENT_CENTER();
    public static final int UI_TEXT_ALIGNMENT_LEFT = TEXT_ALIGNMENT_LEFT();
    public static final int UI_TEXT_ALIGNMENT_RIGHT = TEXT_ALIGNMENT_RIGHT();
    public static final int UI_TEXT_AUTOCAPITALIZATION_ALL = TEXT_AUTOCAPITALIZATION_ALL();
    public static final int UI_TEXT_AUTOCAPITALIZATION_NONE = TEXT_AUTOCAPITALIZATION_NONE();
    public static final int UI_TEXT_AUTOCAPITALIZATION_SENTENCES = TEXT_AUTOCAPITALIZATION_SENTENCES();
    public static final int UI_TEXT_AUTOCAPITALIZATION_WORDS = TEXT_AUTOCAPITALIZATION_WORDS();
    public static final int UI_TEXT_VERTICAL_ALIGNMENT_BOTTOM = TEXT_VERTICAL_ALIGNMENT_BOTTOM();
    public static final int UI_TEXT_VERTICAL_ALIGNMENT_CENTER = TEXT_VERTICAL_ALIGNMENT_CENTER();
    public static final int UI_TEXT_VERTICAL_ALIGNMENT_TOP = TEXT_VERTICAL_ALIGNMENT_TOP();
    public static final int UI_UNKNOWN = UNKNOWN();
    public static final int UI_UPSIDE_PORTRAIT = UPSIDE_PORTRAIT();

    private static UI instance = null;

    public static UI get() {
        if (instance == null) {
            instance = new UI();
        }
        return instance;
    }

    private UI() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeUiModule();
    }

    /**
     * @return This sets the background color of the master uiview (when there
     *         are no windows/tab groups on it)
     */
    public native String getBackgroundColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundColor;
    }-*/;

    /**
     * The currently active tab, if a tab group is open.
     * <p>
     * If no tab group is open, this value is undefined.
     */
    public native Tab getCurrentTab()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = obj.currentTab;
		return @com.emitrom.ti4j.mobile.client.ui.Tab::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setCurrentTab(Tab tab)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.currentTab = tab.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * The active window associated with the executing JavaScript context.
     */
    public native Window getCurrentWindow()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = obj.currentWindow;
		return @com.emitrom.ti4j.mobile.client.ui.Window::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setBackgroundColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundColor = value;
    }-*/;

    /**
     * @return Path/url to an image file for setting a background for the master
     *         uiview (when there are no windows/tab groups on it).
     */
    public native String getBackgroundImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundImage;
    }-*/;

    public native void setBackgroundImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundImage = value;
    }-*/;

    /**
     * Inspired from grid-drawing module : https://gist.github.com/1187384. Draw
     * a grid on the given view.
     * 
     * @param view
     *            , the view to draw the grid on
     * @param gridSpacing
     *            , the spacing of the grid lines
     * @param color
     *            , the color of the grid lines
     */
    public void drawGrid(View view, int gridSpacing, String color) {

        double numHorizontal = Math.ceil(Platform.get().getDisplayCaps().getPlatformHeight() / gridSpacing);
        double numVertical = Math.ceil(Platform.get().getDisplayCaps().getPlatformWidth() / gridSpacing);

        for (int i = 0; i < numHorizontal; i++) {
            View hLine = new View();
            hLine.setHeight(1);
            hLine.setWidth(100, Unit.PERCENT);
            hLine.setBackgroundColor(color);
            hLine.setTop(i * gridSpacing);
            hLine.setLeft(0);
            view.add(hLine);
        }

        for (int i = 0; i < numVertical; i++) {
            View vLine = new View();
            vLine.setHeight(100, Unit.PERCENT);
            vLine.setWidth(1);
            vLine.setBackgroundColor(color);
            vLine.setLeft(i * gridSpacing);
            vLine.setTop(0);
            view.add(vLine);
        }

    }

    public void drawGrid(View view, int gridSpacing) {
        drawGrid(view, gridSpacing, "#dedede");
    }

    public void drawGrid(View view) {
        drawGrid(view, 20, "#dedede");
    }

    public void setSizePropertyAsDouble(JavaScriptObject peer, String property, double value) {
        if (Platform.get().isAndroid()) {
            JsoHelper.setAttribute(peer, property, value + Unit.DP.getValue());
        } else {
            JsoHelper.setAttribute(peer, property, value);
        }

    }

    public void setSizePropertyAsString(JavaScriptObject peer, String property, String value) {
        if (Platform.get().isAndroid()) {
            // Check if the value ends with a non-number, then we know it
            // contains the unit at the back
            if (value != null && value.length() > 2 && !value.substring(value.length() - 2).matches("/^[0-9]+$/")) {
                JsoHelper.setAttribute(peer, property, value);
            } else if (!"auto".equalsIgnoreCase(value)) { // Used the string
                                                          // literal first to
                                                          // keep from running
                                                          // validation code on
                                                          // a null object
                JsoHelper.setAttribute(peer, property, value + Unit.DP.getValue());
            } else {
                JsoHelper.setAttribute(peer, property, value);
            }

        } else {
            JsoHelper.setAttribute(peer, property, value);
        }

    }

    public void setSizePropertyAsString(JavaScriptObject peer, String property, String value, Unit unit) {
        JsoHelper.setAttribute(peer, property, value + unit.getValue());
    }

    private void setSizeProperty(JavaScriptObject peer, String property, String value) {
        if (Platform.get().isAndroid()) {
            JsoHelper.setAttribute(peer, property, value + Unit.DP.getValue());
        } else {
            JsoHelper.setAttribute(peer, property, value);
        }

    }

    static native JavaScriptObject create2DMatrix() /*-{
		return Ti.UI.create2DMatrix();
    }-*/;

    static native JavaScriptObject createActivityIndicator() /*-{
		return Ti.UI.createActivityIndicator();
    }-*/;

    static native JavaScriptObject createAlertDialog() /*-{
		return Ti.UI.createAlertDialog();
    }-*/;

    static native JavaScriptObject createAlertDialog(JsArrayString buttons) /*-{
		return Ti.UI.createAlertDialog({
			buttonNames : buttons
		});
    }-*/;

    static native JavaScriptObject createAnimation() /*-{
		return Ti.UI.createAnimation();
    }-*/;

    static native JavaScriptObject createButton() /*-{
		return Ti.UI.createButton();
    }-*/;

    static native JavaScriptObject create3DMatrix() /*-{
		return Ti.UI.create3DMatrix();
    }-*/;

    static native JavaScriptObject createDashboardItem() /*-{
		return Ti.UI.createDashboardItem();
    }-*/;

    static native JavaScriptObject createDashboardView() /*-{
		return Ti.UI.createDashboardView();
    }-*/;

    static native JavaScriptObject createDashboardView(int column, int row) /*-{
		return Ti.UI.createDashboardView({
			columnCount : column,
			rowCount : row
		});
    }-*/;

    static native JavaScriptObject createEmailDialog() /*-{
		return Ti.UI.createEmailDialog();
    }-*/;

    static native JavaScriptObject createImageView() /*-{
		return Ti.UI.createImageView();
    }-*/;

    static native JavaScriptObject createMaskedImage() /*-{
		return Ti.UI.createMaskedImage();
    }-*/;

    static native JavaScriptObject createNotification() /*-{
		return Ti.UI.createNotification();
    }-*/;

    static native JavaScriptObject createLabel() /*-{
		return Ti.UI.createLabel();
    }-*/;

    static native JavaScriptObject createOptionDialog() /*-{
		return Ti.UI.createOptionDialog();
    }-*/;

    static native JavaScriptObject createPicker() /*-{
		return Ti.UI.createPicker();
    }-*/;

    static native JavaScriptObject createPicker(boolean spinner) /*-{
		return Ti.UI.createPicker({
			useSpinner : spinner
		});
    }-*/;

    static native JavaScriptObject createPickerColumn() /*-{
		return Ti.UI.createPickerColumn();
    }-*/;

    static native JavaScriptObject createPickerRow() /*-{
		return Ti.UI.createPickerRow();
    }-*/;

    static native JavaScriptObject createProgressBar() /*-{
		return Ti.UI.createProgressBar();
    }-*/;

    static native JavaScriptObject createScrollableView() /*-{
		return Ti.UI.createScrollableView();
    }-*/;

    static native JavaScriptObject createScrollView() /*-{
		return Ti.UI.createScrollView();
    }-*/;

    static native JavaScriptObject createSearchBar() /*-{
		return Ti.UI.createSearchBar();
    }-*/;

    static native JavaScriptObject createSlider() /*-{
		return Ti.UI.createSlider();
    }-*/;

    static native JavaScriptObject createSwitch() /*-{
		return Ti.UI.createSwitch();
    }-*/;

    static native JavaScriptObject createTab() /*-{
		return Ti.UI.createTab();
    }-*/;

    static native JavaScriptObject createTabGroup() /*-{
		return Ti.UI.createTabGroup();
    }-*/;

    static native JavaScriptObject createTableView() /*-{
		return Ti.UI.createTableView();
    }-*/;

    static native JavaScriptObject createTableViewRow() /*-{
		return Ti.UI.createTableViewRow();
    }-*/;

    static native JavaScriptObject createTableViewSection() /*-{
		return Ti.UI.createTableViewSection();
    }-*/;

    static native JavaScriptObject createTextArea() /*-{
		return Ti.UI.createTextArea();
    }-*/;

    static native JavaScriptObject createTextField() /*-{
		return Ti.UI.createTextField();
    }-*/;

    static native JavaScriptObject createToolbar() /*-{
		return Ti.UI.iOS.createToolbar();
    }-*/;

    static native JavaScriptObject createView() /*-{
		return Ti.UI.createView();
    }-*/;

    static native JavaScriptObject createWebView() /*-{
		return Ti.UI.createWebView();
    }-*/;

    static native JavaScriptObject createWindow() /*-{
		return Ti.UI.createWindow();
    }-*/;

    static native JavaScriptObject createAndroid() /*-{
		return Ti.UI.createAndroid();
    }-*/;

    public static native JavaScriptObject createIOs() /*-{
		return Ti.UI.createiOS();
    }-*/;

    static native JavaScriptObject createIPad() /*-{
		return Ti.UI.createiPad();
    }-*/;

    static native JavaScriptObject createIPhone() /*-{
		return Ti.UI.createiPhone();
    }-*/;

    static native JavaScriptObject createButtonBar() /*-{
		return Ti.UI.createButtonBar();
    }-*/;

    static native JavaScriptObject createListItem() /*-{
		return Ti.UI.createListItem();
    }-*/;

    static native JavaScriptObject createListView() /*-{
		return Ti.UI.createListView();
    }-*/;

    static native JavaScriptObject createListSection() /*-{
		return Ti.UI.createListSection();
    }-*/;

    public static native final int FACE_DOWN() /*-{
		return Ti.UI.FACE_DOWN ? Ti.UI.FACE_DOWN : 0;
    }-*/;

    public static native final int FACE_UP() /*-{
		return Ti.UI.FACE_UP ? Ti.UI.FACE_UP : 0;
    }-*/;

    public static native final int FILL() /*-{
		return Ti.UI.FILL ? Ti.UI.FILL : 0;
    }-*/;

    public static native final int INHERIT() /*-{
		return Ti.UI.INHERIT ? Ti.UI.INHERIT : 0;
    }-*/;

    public static native final int ANIMATION_CURVE_EASE_IN() /*-{
		return Ti.UI.ANIMATION_CURVE_EASE_IN ? Ti.UI.ANIMATION_CURVE_EASE_IN
				: 0;
    }-*/;

    public static native final int ANIMATION_CURVE_EASE_IN_OUT() /*-{
		return Ti.UI.ANIMATION_CURVE_EASE_IN_OUT ? Ti.UI.ANIMATION_CURVE_EASE_IN_OUT
				: 0;
    }-*/;

    public static native final int ANIMATION_CURVE_EASE_OUT() /*-{
		return Ti.UI.ANIMATION_CURVE_EASE_OUT ? Ti.UI.ANIMATION_CURVE_EASE_OUT
				: 0;
    }-*/;

    public static native final int ANIMATION_CURVE_LINEAR() /*-{
		return Ti.UI.ANIMATION_CURVE_LINEAR ? Ti.UI.ANIMATION_CURVE_LINEAR : 0;
    }-*/;

    public static native final int AUTOLINK_ALL() /*-{
		return Ti.UI.AUTOLINK_ALL ? Ti.UI.AUTOLINK_ALL : 0;
    }-*/;

    public static native final int AUTOLINK_CALENDAR() /*-{
		return Ti.UI.AUTOLINK_CALENDAR ? AUTOLINK_CALENDAR : 0;
    }-*/;

    public static native final int AUTOLINK_EMAIL_ADDRESS() /*-{
		return Ti.UI.AUTOLINK_EMAIL_ADDRESS ? AUTOLINK_EMAIL_ADDRESS : 0;
    }-*/;

    public static native final int AUTOLINK_MAP_ADDRESS() /*-{
		return Ti.UI.AUTOLINK_MAP_ADDRESS ? AUTOLINK_MAP_ADDRESS : 0;
    }-*/;

    public static native final int AUTOLINK_NONE() /*-{
		return Ti.UI.AUTOLINK_NONE ? AUTOLINK_NONE : 0;
    }-*/;

    public static native final int AUTOLINK_PHONE_NUMBERS() /*-{
		return Ti.UI.AUTOLINK_PHONE_NUMBERS ? AUTOLINK_PHONE_NUMBERS : 0;
    }-*/;

    public static native final int AUTOLINK_URLS() /*-{
		return Ti.UI.AUTOLINK_URLS ? AUTOLINK_URLS : 0;
    }-*/;

    public static native final int INPUT_BORDERSTYLE_BEZEL() /*-{
		return Ti.UI.INPUT_BORDERSTYLE_BEZEL ? Ti.UI.INPUT_BORDERSTYLE_BEZEL
				: 0;
    }-*/;

    public static native final int INPUT_BORDERSTYLE_LINE() /*-{
		return Ti.UI.INPUT_BORDERSTYLE_LINE ? Ti.UI.INPUT_BORDERSTYLE_LINE : 0;
    }-*/;

    public static native final int INPUT_BORDERSTYLE_NONE() /*-{
		return Ti.UI.INPUT_BORDERSTYLE_NONE ? Ti.UI.INPUT_BORDERSTYLE_NONE : 0;
    }-*/;

    public static native final int INPUT_BORDERSTYLE_ROUNDED() /*-{
		return Ti.UI.INPUT_BORDERSTYLE_ROUNDED ? Ti.UI.INPUT_BORDERSTYLE_ROUNDED
				: 0;
    }-*/;

    public static native final int INPUT_BUTTONMODE_ALWAYS() /*-{
		return Ti.UI.INPUT_BUTTONMODE_ALWAYS ? Ti.UI.INPUT_BUTTONMODE_ALWAYS
				: 0;
    }-*/;

    public static native final int INPUT_BUTTONMODE_NEVER() /*-{
		return Ti.UI.INPUT_BUTTONMODE_NEVER ? Ti.UI.INPUT_BUTTONMODE_NEVER : 0;
    }-*/;

    public static native final int INPUT_BUTTONMODE_ONBLUR() /*-{
		return Ti.UI.INPUT_BUTTONMODE_ONBLUR ? Ti.UI.INPUT_BUTTONMODE_ONBLUR
				: 0;
    }-*/;

    public static native final int INPUT_BUTTONMODE_ONFOCUS() /*-{
		return Ti.UI.INPUT_BUTTONMODE_ONFOCUS ? Ti.UI.INPUT_BUTTONMODE_ONFOCUS
				: 0;
    }-*/;

    public static native final int KEYBOARD_APPEARANCE_ALERT() /*-{
		return Ti.UI.KEYBOARD_APPEARANCE_ALERT ? Ti.UI.KEYBOARD_APPEARANCE_ALERT
				: 0;
    }-*/;

    public static native final int KEYBOARD_APPEARANCE_DEFAULT() /*-{
		return Ti.UI.KEYBOARD_APPEARANCE_DEFAULT ? Ti.UI.KEYBOARD_APPEARANCE_DEFAULT
				: 0;
    }-*/;

    public static native final int KEYBOARD_ASCII() /*-{
		return Ti.UI.KEYBOARD_ASCII ? Ti.UI.KEYBOARD_APPEARANCE_DEFAULT : 0;
    }-*/;

    public static native final int KEYBOARD_DEFAULT() /*-{
		return Ti.UI.KEYBOARD_DEFAULT ? Ti.UI.KEYBOARD_DEFAULT : 0;
    }-*/;

    public static native final int KEYBOARD_EMAIL() /*-{
		return Ti.UI.KEYBOARD_EMAIL ? Ti.UI.KEYBOARD_EMAIL : 0;
    }-*/;

    public static native final int KEYBOARD_NAMEPHONE_PAD() /*-{
		return Ti.UI.KEYBOARD_NAMEPHONE_PAD ? Ti.UI.KEYBOARD_NAMEPHONE_PAD : 0;
    }-*/;

    public static native final int KEYBOARD_DECIMAL_PAD() /*-{
		return Ti.UI.KEYBOARD_DECIMAL_PAD ? Ti.UI.KEYBOARD_DECIMAL_PAD : 0;
    }-*/;

    public static native final int KEYBOARD_NUMBERS_PUNCTUATION() /*-{
		return Ti.UI.KEYBOARD_NUMBERS_PUNCTUATION ? Ti.UI.KEYBOARD_NUMBERS_PUNCTUATION
				: 0;
    }-*/;

    public static native final int KEYBOARD_NUMBER_PAD() /*-{
		return Ti.UI.KEYBOARD_NUMBER_PAD ? Ti.UI.KEYBOARD_NUMBER_PAD : 0;
    }-*/;

    public static native final int KEYBOARD_PHONE_PAD() /*-{
		return Ti.UI.KEYBOARD_PHONE_PAD ? Ti.UI.KEYBOARD_PHONE_PAD : 0;
    }-*/;

    public static native final int KEYBOARD_URL() /*-{
		return Ti.UI.KEYBOARD_URL ? Ti.UI.KEYBOARD_URL : 0;
    }-*/;

    public static native final int LANDSCAPE_LEFT() /*-{
		return Ti.UI.LANDSCAPE_LEFT ? Ti.UI.LANDSCAPE_LEFT : 0;
    }-*/;

    public static native final int LANDSCAPE_RIGHT() /*-{
		return Ti.UI.LANDSCAPE_RIGHT ? Ti.UI.LANDSCAPE_RIGHT : 0;
    }-*/;

    public static native final int NOTIFICATION_DURATION_LONG() /*-{
		return Ti.UI.NOTIFICATION_DURATION_LONG ? Ti.UI.NOTIFICATION_DURATION_LONG
				: 0;
    }-*/;

    public static native final int NOTIFICATION_DURATION_SHORT() /*-{
		return Ti.UI.NOTIFICATION_DURATION_SHORT ? Ti.UI.NOTIFICATION_DURATION_SHORT
				: 0;
    }-*/;

    public static native final int PICKER_TYPE_COUNT_DOWN_TIMER() /*-{
		return Ti.UI.PICKER_TYPE_COUNT_DOWN_TIMER ? Ti.UI.PICKER_TYPE_COUNT_DOWN_TIMER
				: 0;
    }-*/;

    public static native final int PICKER_TYPE_DATE() /*-{
		return Ti.UI.PICKER_TYPE_DATE ? Ti.UI.PICKER_TYPE_DATE : 0;
    }-*/;

    public static native final int PICKER_TYPE_DATE_AND_TIME() /*-{
		return Ti.UI.PICKER_TYPE_DATE_AND_TIME ? Ti.UI.PICKER_TYPE_DATE_AND_TIME
				: 0;
    }-*/;

    public static native final int PICKER_TYPE_PLAIN() /*-{
		return Ti.UI.PICKER_TYPE_PLAIN ? Ti.UI.PICKER_TYPE_PLAIN : 0;
    }-*/;

    public static native final int PICKER_TYPE_TIME() /*-{
		return Ti.UI.PICKER_TYPE_TIME ? Ti.UI.PICKER_TYPE_TIME : 0;
    }-*/;

    public static native final int PORTRAIT() /*-{
		return Ti.UI.PORTRAIT ? Ti.UI.PORTRAIT : 0;
    }-*/;

    public static native final int RETURNKEY_DEFAULT() /*-{
		return Ti.UI.RETURNKEY_DEFAULT ? Ti.UI.RETURNKEY_DEFAULT : 0;
    }-*/;

    public static native final int RETURNKEY_DONE() /*-{
		return Ti.UI.RETURNKEY_DONE ? Ti.UI.RETURNKEY_DONE : 0;
    }-*/;

    public static native final int RETURNKEY_EMERGENCY_CALL() /*-{
		return Ti.UI.RETURNKEY_EMERGENCY_CALL ? Ti.UI.RETURNKEY_EMERGENCY_CALL
				: 0;
    }-*/;

    public static native final int RETURNKEY_GO() /*-{
		return Ti.UI.RETURNKEY_GO ? Ti.UI.RETURNKEY_GO : 0;
    }-*/;

    public static native final int RETURNKEY_GOOGLE() /*-{
		return Ti.UI.RETURNKEY_GOOGLE ? Ti.UI.RETURNKEY_GOOGLE : 0;
    }-*/;

    public static native final int RETURNKEY_JOIN() /*-{
		return Ti.UI.RETURNKEY_JOIN ? Ti.UI.RETURNKEY_JOIN : 0;
    }-*/;

    public static native final int RETURNKEY_NEXT() /*-{
		return Ti.UI.RETURNKEY_NEXT ? Ti.UI.RETURNKEY_NEXT : 0;
    }-*/;

    public static native final int RETURNKEY_ROUTE() /*-{
		return Ti.UI.RETURNKEY_ROUTE ? Ti.UI.RETURNKEY_ROUTE : 0;
    }-*/;

    public static native final int RETURNKEY_SEARCH() /*-{
		return Ti.UI.RETURNKEY_SEARCH ? Ti.UI.RETURNKEY_SEARCH : 0;
    }-*/;

    public static native final int RETURNKEY_SEND() /*-{
		return Ti.UI.RETURNKEY_SEND ? Ti.UI.RETURNKEY_SEND : 0;
    }-*/;

    public static native final int RETURNKEY_YAHOO() /*-{
		return Ti.UI.RETURNKEY_YAHOO ? Ti.UI.RETURNKEY_YAHOO : 0;
    }-*/;

    public static native final int SIZE() /*-{
		return Ti.UI.SIZE ? Ti.UI.SIZE : 0;
    }-*/;

    public static native final int TEXT_ALIGNMENT_CENTER() /*-{
		return Ti.UI.TEXT_ALIGNMENT_CENTER ? Ti.UI.TEXT_ALIGNMENT_CENTER : 0;
    }-*/;

    public static native final int TEXT_ALIGNMENT_LEFT() /*-{
		return Ti.UI.TEXT_ALIGNMENT_LEFT ? Ti.UI.TEXT_ALIGNMENT_LEFT : 0;
    }-*/;

    public static native final int TEXT_ALIGNMENT_RIGHT() /*-{
		return Ti.UI.TEXT_ALIGNMENT_RIGHT ? Ti.UI.TEXT_ALIGNMENT_RIGHT : 0;
    }-*/;

    public static native final int TEXT_AUTOCAPITALIZATION_ALL() /*-{
		return Ti.UI.TEXT_AUTOCAPITALIZATION_ALL ? Ti.UI.TEXT_AUTOCAPITALIZATION_ALL
				: 0;
    }-*/;

    public static native final int TEXT_AUTOCAPITALIZATION_NONE() /*-{
		return Ti.UI.TEXT_AUTOCAPITALIZATION_NONE ? Ti.UI.TEXT_AUTOCAPITALIZATION_NONE
				: 0;
    }-*/;

    public static native final int TEXT_AUTOCAPITALIZATION_SENTENCES() /*-{
		return Ti.UI.TEXT_AUTOCAPITALIZATION_SENTENCES ? Ti.UI.TEXT_AUTOCAPITALIZATION_SENTENCES
				: 0;
    }-*/;

    public static native final int TEXT_AUTOCAPITALIZATION_WORDS() /*-{
		return Ti.UI.TEXT_AUTOCAPITALIZATION_WORDS ? Ti.UI.TEXT_AUTOCAPITALIZATION_WORDS
				: 0;
    }-*/;

    public static native final int TEXT_VERTICAL_ALIGNMENT_BOTTOM() /*-{
		return Ti.UI.TEXT_VERTICAL_ALIGNMENT_BOTTOM ? Ti.UI.TEXT_VERTICAL_ALIGNMENT_BOTTOM
				: 0;
    }-*/;

    public static native final int TEXT_VERTICAL_ALIGNMENT_CENTER() /*-{
		return Ti.UI.TEXT_VERTICAL_ALIGNMENT_CENTER ? Ti.UI.TEXT_VERTICAL_ALIGNMENT_CENTER
				: 0;
    }-*/;

    public static native final int TEXT_VERTICAL_ALIGNMENT_TOP() /*-{
		return Ti.UI.TEXT_VERTICAL_ALIGNMENT_TOP ? Ti.UI.TEXT_VERTICAL_ALIGNMENT_TOP
				: 0;
    }-*/;

    public static native final int UNKNOWN() /*-{
		return Ti.UI.UNKNOWN ? Ti.UI.UNKNOWN : 0;
    }-*/;

    public static native final int UPSIDE_PORTRAIT() /*-{
		return Ti.UI.UPSIDE_PORTRAIT ? Ti.UI.UPSIDE_PORTRAIT : 0;
    }-*/;

    public static native final int LIST_ACCESSSSORY_TYPE_CHECKMARK() /*-{
		return Ti.UI.LIST_ACCESSSSORY_TYPE_CHECKMARK ? Ti.UI.LIST_ACCESSSSORY_TYPE_CHECKMARK
				: 0;
    }-*/;

    public static native final int LIST_ACCESSSSORY_TYPE_DETAIL() /*-{
		return Ti.UI.LIST_ACCESSSSORY_TYPE_DETAIL ? Ti.UI.LIST_ACCESSSSORY_TYPE_DETAIL
				: 0;
    }-*/;

    public static native final int LIST_ACCESSSSORY_TYPE_DISCLOSURE() /*-{
		return Ti.UI.LIST_ACCESSSSORY_TYPE_DISCLOSURE ? Ti.UI.LIST_ACCESSSSORY_TYPE_DISCLOSURE
				: 0;
    }-*/;

    public static native final int LIST_ACCESSSSORY_TYPE_NONE() /*-{
		return Ti.UI.LIST_ACCESSSSORY_TYPE_NONE ? Ti.UI.LIST_ACCESSSSORY_TYPE_NONE
				: 0;
    }-*/;

    public static native final int LIST_ITEM_TEMPLATE_CONTACTS() /*-{
		return Ti.UI.LIST_ITEM_TEMPLATE_CONTACTS ? Ti.UI.LIST_ITEM_TEMPLATE_CONTACTS
				: 0;
    }-*/;

    public static native final int LIST_ITEM_TEMPLATE_DEFAULT() /*-{
		return Ti.UI.LIST_ITEM_TEMPLATE_DEFAULT ? Ti.UI.LIST_ITEM_TEMPLATE_DEFAULT
				: 0;
    }-*/;

    public static native final int LIST_ITEM_TEMPLATE_SETTINGS() /*-{
		return Ti.UI.LIST_ITEM_TEMPLATE_SETTINGS ? Ti.UI.LIST_ITEM_TEMPLATE_SETTINGS
				: 0;
    }-*/;

    public static native final int LIST_ITEM_TEMPLATE_SUBTITLE() /*-{
		return Ti.UI.LIST_ITEM_TEMPLATE_SUBTITLE ? Ti.UI.LIST_ITEM_TEMPLATE_SUBTITLE
				: 0;
    }-*/;

    public static native final String UNIT_CM() /*-{
		return Ti.UI.UNIT_CM ? Ti.UI.UNIT_CM : "";
    }-*/;

    public static native final String UNIT_DIP() /*-{
		return Ti.UI.UNIT_DIP ? Ti.UI.UNIT_DIP : "";
    }-*/;

    public static native final String UNIT_IN() /*-{
		return Ti.UI.UNIT_IN ? Ti.UI.UNIT_IN : "";
    }-*/;

    public static native final String UNIT_MM() /*-{
		return Ti.UI.UNIT_MM ? Ti.UI.UNIT_MM : "";
    }-*/;

    public static native final String UNIT_PX() /*-{
		return Ti.UI.UNIT_PX ? Ti.UI.UNIT_PX : "";
    }-*/;

    public static native final int URL_ERROR_BAR_URL() /*-{
		return Ti.UI.URL_ERROR_BAR_URL ? Ti.UI.URL_ERROR_BAR_URL : 0;
    }-*/;

    public static native final int URL_ERROR_CONNECT() /*-{
		return Ti.UI.URL_ERROR_CONNECT ? Ti.UI.URL_ERROR_CONNECT : 0;
    }-*/;

    public static native final int URL_ERROR_FILE() /*-{
		return Ti.UI.URL_ERROR_FILE ? Ti.UI.URL_ERROR_FILE : 0;
    }-*/;

    public static native final int URL_ERROR_FILE_NOT_FOUND() /*-{
		return Ti.UI.URL_ERROR_FILE_NOT_FOUND ? Ti.UI.URL_ERROR_FILE_NOT_FOUND
				: 0;
    }-*/;

    public static native final int URL_ERROR_HOST_LOOKUP() /*-{
		return Ti.UI.URL_ERROR_HOST_LOOKUP ? Ti.UI.URL_ERROR_HOST_LOOKUP : 0;
    }-*/;

    public static native final int URL_ERROR_SSL_FAILED() /*-{
		return Ti.UI.URL_ERROR_SSL_FAILED ? Ti.UI.URL_ERROR_SSL_FAILED : 0;
    }-*/;

    public static native final int URL_ERROR_TIMEOUT() /*-{
		return Ti.UI.URL_ERROR_TIMEOUT ? Ti.UI.URL_ERROR_TIMEOUT : 0;
    }-*/;

    public static native final int URL_ERROR_UNKNOWN() /*-{
		return Ti.UI.URL_ERROR_UNKNOWN ? Ti.UI.URL_ERROR_UNKNOWN : 0;
    }-*/;

    public static native final int URL_ERROR_UNSUPPORTED_SCHEME() /*-{
		return Ti.UI.URL_ERROR_UNSUPPORTED_SCHEME ? Ti.UI.URL_ERROR_UNSUPPORTED_SCHEME
				: 0;
    }-*/;

}
