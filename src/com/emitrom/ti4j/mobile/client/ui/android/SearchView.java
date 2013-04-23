package com.emitrom.ti4j.mobile.client.ui.android;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.handlers.EventHandler;
import com.emitrom.ti4j.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

public class SearchView extends View {

    public SearchView() {
        jsObj = creaPeer();
    }

    protected SearchView(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Text to show when the search view field is not focused.
     * <p>
     * Default: no hint text
     */
    public native void setHintText(String value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.hinText = value;
    }-*/;

    /**
     * Text to show when the search view field is not focused.
     * <p>
     * Default: no hint text
     */
    public native int getHinText()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.hintText;
    }-*/;

    /**
     * Iconifies or expands the search view
     * 
     * see Android Documentation for more details.
     */
    public native void setIconified(boolean value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.iconified = value;
    }-*/;

    /**
     * Iconifies or expands the search view
     * 
     * see Android Documentation for more details.
     */
    public native boolean isIconified()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.iconified;
    }-*/;

    /**
     * Sets the default or resting state of the search view
     * <p>
     * see Android Documentation for more details.
     * <p>
     * Default: true
     */
    public native void setIconifiedByDefault(boolean value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.iconifiedByDefault = value;
    }-*/;

    /**
     * Sets the default or resting state of the search view
     * <p>
     * see Android Documentation for more details.
     * <p>
     * Default: true
     */
    public native boolean isIconifiedByDefault()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.iconifiedByDefault;
    }-*/;

    /**
     * Whether to display the submit button when necessary or never display.
     */
    public native void setSubmitEnabled(boolean value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.submitEnabled = value;
    }-*/;

    /**
     * Whether to display the submit button when necessary or never display.
     */
    public native boolean isSubmitEnabled()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.submitEnabled;
    }-*/;

    /**
     * Value of the search view.
     * <p>
     * This value cannot be set until after the search view is created.
     */
    public native void setValue(String value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.value = value;
    }-*/;

    /**
     * Causes the search view to lose focus.
     */
    public native void blur()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.blur();
    }-*/;

    /**
     * Causes the search view to lose focus.
     */
    public native void focus()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.focus();
    }-*/;

    /**
     * Value of the search view.
     * <p>
     * This value cannot be set until after the search view is created.
     */
    public native String getValue()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

    public void addBlurHandler(EventHandler handler) {
        this.addEventHandler("blur", handler);
    }

    public void addCancelHandler(EventHandler handler) {
        this.addEventHandler("cancel", handler);
    }

    public void addChangeHandler(EventHandler handler) {
        this.addEventHandler("change", handler);
    }

    public void addFocusHandler(EventHandler handler) {
        this.addEventHandler("focus", handler);
    }

    public void addSubmitHandler(EventHandler handler) {
        this.addEventHandler("submit", handler);
    }

    public static SearchView cast(ProxyObject peer) {
        return new SearchView(peer.getJsObj());
    }

    private native JavaScriptObject creaPeer()/*-{
		return Ti.UI.Android.createSearchView();
    }-*/;

}
