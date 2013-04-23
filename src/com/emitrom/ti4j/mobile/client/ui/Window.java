/**************************************************************************
 * Window.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
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

import java.util.ArrayList;

import com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.UIEventHandler;
import com.emitrom.ti4j.mobile.client.platform.Platform;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;

/**
 * The window is an empty drawing surface or container.
 */
public class Window extends View {

    public Window() {
        createPeer();
    }

    public Window(String title) {
        this();
        setTitle(title);
    }

    Window(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Title for the back button. only available in iphone. jso is only
     *         valid when the window is a child of a tab. Availaboe on iOs only
     */
    public native String getBackButtonTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backButtonTitle;
    }-*/;

    public native void setBackButtonTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backButtonTitle = value;
    }-*/;

    /**
     * @return Url to an image to show as the back button. only available in
     *         iphone. jso is only valid when the window is a child of a tab.
     *         Availaboe on iOs only
     */
    public native String getBackButtonTitleImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backButtonTitleImage;
    }-*/;

    public native void setBackButtonTitleImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backButtonTitleImage = value;
    }-*/;

    /**
     * @return Web named color or hex value for the color of the nav bar. only
     *         available in iphone. Availaboe on iOs only
     */
    public native String getBarColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.barColor;
    }-*/;

    public native void setBarColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.barColor = value;
    }-*/;

    /**
     * @return Url to a local image to place as the background of the nav bar.
     *         only available in iphone. Availaboe on iOs only
     */
    public native String getBarImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.barImage;
    }-*/;

    public native void setBarImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.barImage = value;
    }-*/;

    /**
     * @return (android only.) boolean indicates if the application should exit
     *         when the android back button is pressed while the window is being
     *         shown. you can only set jso as a createwindow({...}) option.
     *         setting it after window creation will no effect.
     * @platforms android
     */
    public native boolean exitOnClose() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.exitOnClose;
    }-*/;

    public native void setExitOnClose(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.exitOnClose = value;
    }-*/;

    /**
     * @return Boolean indicates if the window is fullscreen (no device chrome)
     */
    public native boolean isFullscreen() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.fullscreen;
    }-*/;

    public native void setFullscreen(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.fullscreen = value;
    }-*/;

    /**
     * @return View to show in the left nav bar area. only available in iphone.
     *         Availaboe on iOs only
     */
    public native View getLeftNavButton() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.leftNavButton;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setLeftNavButton(View value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.leftNavButton = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return Boolean to indicate if the window should be opened modal in front
     *         of other windows. android note: the combination of
     *         'fullscreen:true' and 'modal:true' will not work as expected.
     *         android modal windows are translucent, and, in android, the
     *         contents of a translucent window cannot appear above the status
     *         bar. i.e., even though you say 'fullscreen:true', the status bar
     *         will still be visible *if* it was visible in the previous window.
     *         navBarBidden' and 'modal' do work fine together, however.
     */
    public native boolean isModal() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.modal;
    }-*/;

    public native void setModal(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.modal = value;
    }-*/;

    /**
     * @return For modal windows, hide the nav bar (true) or show the nav bar
     *         (false, default).
     */
    public native boolean isNavBarHidden() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.navBarHidden;
    }-*/;

    public native void setNavBarHidden(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.navBarHidden = value;
    }-*/;

    /**
     * @return Array of orientation mode constants defined in
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI}. On android,
     *         orientation modes that can be set are dependant on the android
     *         sdk level of the device itself. it should be noted that, the
     *         definition of portrait or landscape mode can vary based on the
     *         physical orientation of the device. For example, on some devices
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI.LANDSCAPE_LEFT}
     *         represents the top of the device being at the 270 degree position
     *         but other devices may (based on camera position for example)
     *         treat jso position as
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI.LANDSCAPE_RIGHT} . In
     *         general, applications for android that need to be aware of
     *         orientation should try and limit their orientation logic to
     *         handling either portrait or landscape rather than worrying about
     *         the reverse modes. jso approach will allow the orientation modes
     *         to adopt a more natural feel for the specific device.
     * 
     *         the following list breaks down the orientation behavior on
     *         android:<br/>
     * 
     *         1) ( {@link com.emitrom.ti4j.mobile.client.ui.UI.PORTRAIT} or
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI.UPSIDE_PORTRAIT} )
     *         and ( {@link com.emitrom.ti4j.mobile.client.ui.UI.LANDSCAPE_LEFT}
     *         or {@link com.emitrom.ti4j.mobile.client.ui.UI.LANDSCAPE_RIGHT} )
     *         - enables full sensor which lets the operating system control the
     *         orientation of the screen based on the sensor inside the device.<br/>
     *         2)
     *         {@linkcom.ekambi.gwt.appcelerator.mobile.client.ui.UI.UPSIDE_PORTRAIT}
     *         or {@link com.emitrom.ti4j.mobile.client.ui.UI.UPSIDE_PORTRAIT} -
     *         enables sensor portrait mode on android 2.3 and above. sensor
     *         portrait mode on android means the screen will shift between both
     *         portrait modes according to the sensor inside the device. if the
     *         android version is less than 2.3, then normal portrait mode is
     *         locked.
     * 
     * <br/>
     *         3) {@link com.emitrom.ti4j.mobile.client.ui.UI.LANDSCAPE_LEFT} or
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI.LANDSCAPE_RIGHT} -
     *         enables sensor landscape mode on android 2.3 and above. sensor
     *         landscape mode on android means the screen will shift between
     *         both landscape modes according to the sensor inside the device.
     *         if the android version is less than 2.3, then normal landscape
     *         mode is locked.
     * 
     * <br/>
     *         4) {@link com.emitrom.ti4j.mobile.client.ui.UI.PORTRAIT} - locks
     *         screen orientation to portrait mode 5)
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI.LANDSCAPE} - locks
     *         screen orientation to landscape mode 6) empty array - resets the
     *         orientation to default sensor control
     */
    public native JsArrayInteger getOrientationModes() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.orientationModes;
    }-*/;

    public void setOrientationModes(int... modes) {
        JsArrayInteger values = JsArrayInteger.createArray().cast();
        for (int mode : modes) {
            values.push(mode);
        }
        setOrientationModes(values);
    }

    public native void setOrientationModes(JsArrayInteger value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.orientationModes = value;
    }-*/;

    /**
     * @return Current orientation of the window. value will be one of the
     *         orientation constants defined in
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI}.
     */
    public native int getOrientation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.orientation;
    }-*/;

    public native void setOrientation(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.orientation = value;
    }-*/;

    /**
     * @return View to show in the right nav bar area. only available in iphone.
     *         Availaboe on iOs only
     */
    public native View getRightNavButton() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.rightNavButton;
		return @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setRightNavButton(View value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.rightNavButton = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return Boolean to indicate if the tab bar should be hidden. jso is only
     *         valid when the window is a child of a tab.
     */
    public native boolean isTabBarHidden() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.tabBarHidden;
    }-*/;

    public native void setTabBarHidden(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.tabBarHidden = value;
    }-*/;

    /**
     * @return Title of the window.
     */
    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * @return View to show in the title area. only available in iphone.
     *         Available on iOs only
     */
    public native View getTitleControl() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.titleControl;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setTitleControl(View value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titleControl = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return Url to a image that show in the title area. only available in
     *         iphone. Availaboe on iOs only
     */
    public native String getTitleImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.titleImage;
    }-*/;

    public native void setTitleImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titleImage = value;
    }-*/;

    /**
     * @return Title prompt for the window. only available in iphone.
     */
    public native String getTitlePrompt() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.titlePrompt;
    }-*/;

    public native void setTitlePrompt(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titlePrompt = value;
    }-*/;

    /**
     * @return The key in the locale file to use for the title property
     */
    public native String getTitleId() /*-{
		return jso.titleid;
    }-*/;

    public native void setTitleId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titleid = value;
    }-*/;

    /**
     * @return The key in the locale file to use for the titleprompt property
     */
    public native String getTitlePromptId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.titlepromptid;
    }-*/;

    public native void setTitlePromptId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titlepromptid = value;
    }-*/;

    /**
     * @return Array of button objects to show in the toolbar of the window.
     *         only available in iphone. jso is only valid when the window is a
     *         child of a tab. Availaboe on iOs only
     */
    public ArrayList<View> getToolbar() {
        ArrayList<View> views = new ArrayList<View>();
        JsArray<JavaScriptObject> values = _getToolbar();
        for (int i = 0; i < values.length(); i++) {
            views.add(new Button(values.get(i)));
        }
        return views;
    }

    private native JsArray<JavaScriptObject> _getToolbar() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.toolbar;
    }-*/;

    /**
     * @iOS only
     * @param views
     */
    public void setToolbar(ArrayList<View> views) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (View view : views) {
            values.push(view.getJsObj());
        }
        _setToolbar(values);
    }

    /**
     * @iOS only
     * @param views
     */
    public void setToolbar(View... views) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (View view : views) {
            values.push(view.getJsObj());
        }
        _setToolbar(values);
    }

    private native void _setToolbar(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.toolbar = value;
    }-*/;

    /**
     * @return Boolean to indicate if the nav bar is translucent. only available
     *         in iphone. Availaboe on iOs only
     */
    public native boolean isTranslucent() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.translucent;
    }-*/;

    public native void setTranslucent(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.translucent = value;
    }-*/;

    /**
     * 
     * WARNING
     * 
     * jso method should be used with caution. It has been found to cause severe
     * memory leak issues when not handled correctly. The creation of a
     * sub-context if not managed correctly can cause the application to run
     * into memory starvation and consequently unexpected crashes.
     * 
     * If used, make sure you properly close the windows when not using them
     * anymore. jso will release all associated resources.
     * 
     * @return Url to a javascript file with the windows instructions. jso
     *         window will create a new javascript sub-context that will run in
     *         its own thread and global variable space.
     */
    public native String getUrl() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.url;
    }-*/;

    public native void setUrl(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.url = value;
    }-*/;

    /**
     * @return android
     */
    public native int getWindowSoftInputMode() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.windowSoftInputMode;
    }-*/;

    public native void setWindowSoftInputMode(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.windowSoftInputMode = value;
    }-*/;

    /**
     * Close the window
     */
    public native void close() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.close();
    }-*/;

    /**
     * Close the window
     */
    public native void close(boolean animated) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.close({
			animate : animated
		});
    }-*/;

    /**
     * Close the window
     * 
     * @param options
     *            close the window with optional animation or display properties
     */
    public native void close(Animation options) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.close(options.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Open the window
     */
    public native void open() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.open();
    }-*/;

    /**
     * Open the window
     */
    public native void open(boolean animated) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.open({
			animate : animated
		});
    }-*/;

    /**
     * Open the window
     * 
     * @param options
     *            open the window with optional animation or display properties
     */
    public native void open(Animation options) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.open(options.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * add a grid to this window with the given spacing and color
     * 
     * @param spacing
     *            , spacing of the grid lines
     * @param color
     *            , color of the lines
     */
    public void grid(int spacing, String color) {
        if (color == null || color.equalsIgnoreCase("")) {
            color = "#dedede";
        }

        double numHorizontal = Math.ceil(Platform.get().getDisplayCaps().getPlatformHeight() / spacing);
        double numVertical = Math.ceil(Platform.get().getDisplayCaps().getPlatformWidth() / spacing);

        for (int i = 0; i < numHorizontal; i++) {
            View hLine = new View();
            hLine.setHeight(1);
            hLine.setWidth("100%");
            hLine.setBackgroundColor(color);
            hLine.setTop(i * spacing);
            hLine.setLeft(0);
            this.add(hLine);
        }

        for (int i = 0; i < numVertical; i++) {
            View hLine = new View();
            hLine.setHeight(1);
            hLine.setWidth("100%");
            hLine.setBackgroundColor(color);
            hLine.setLeft(i * spacing);
            hLine.setTop(0);
            this.add(hLine);
        }
    }

    /**
     * add a grid to this window
     * 
     * @param spacing
     *            , spacing of the grid lines
     */
    public void grid(int spacing) {
        grid(spacing, "#dedede");
    }

    public void addAndroidBackHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.ANDROID_BACK, handler);
    }

    public void addAndroidCameraHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.ANDROID_CAMERA, handler);
    }

    public void addAndroidFocusHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.ANDROID_FOCUS, handler);
    }

    public void addAndroidSearchHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.ANDROID_SEARCH, handler);
    }

    public void addAndroidVolumeDownHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.ANDROID_VOL_DOWN, handler);
    }

    public void addAndroidVolumeUpHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.ANDROID_VOL_UP, handler);
    }

    public void addAndroidBlurHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.BLUR, handler);
    }

    public void addCloseHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.CLOSE, handler);
    }

    public void addFocusHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.FOCUS, handler);
    }

    public void addOpenHandler(UIEventHandler handler) {
        this.addEventHandler(UIEvent.OPEN, handler);
    }

    @Override
    public void createPeer() {
        jsObj = UI.createWindow();
    }

}
