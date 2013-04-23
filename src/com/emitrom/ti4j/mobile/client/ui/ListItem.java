package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.ui.style.Font;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class ListItem extends ProxyObject {

    public ListItem() {
        jsObj = JsoHelper.createObject();
    }

    protected ListItem(JavaScriptObject obj) {
        this.jsObj = obj;
    }

    /**
     * Gets an accessory on the right side of an item.
     * <p>
     * Specify one of the following: Titanium.UI.LIST_ACCESSORY_TYPE_CHECKMARK,
     * Titanium.UI.LIST_ACCESSORY_TYPE_DETAIL,
     * Titanium.UI.LIST_ACCESSORY_TYPE_DISCLOSURE, or
     * Titanium.UI.LIST_ACCESSORY_TYPE_NONE.
     * <p>
     * Default: Titanium.UI.LIST_ACCESSORY_TYPE_NONE
     */
    public native String getAccessoryType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.accessoryType;
    }-*/;

    /**
     * Sets an accessory on the right side of an item.
     * <p>
     * Specify one of the following: Titanium.UI.LIST_ACCESSORY_TYPE_CHECKMARK,
     * Titanium.UI.LIST_ACCESSORY_TYPE_DETAIL,
     * Titanium.UI.LIST_ACCESSORY_TYPE_DISCLOSURE, or
     * Titanium.UI.LIST_ACCESSORY_TYPE_NONE.
     * <p>
     * Default: Titanium.UI.LIST_ACCESSORY_TYPE_NONE
     */
    public native void setAccessoryType(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.accessoryType = value;
    }-*/;

    /**
     * Determines whether this item can be selected.
     * <p>
     * Set to false to prevent the item from being selected.
     * <p>
     * On iOS, even if this property is set to false, you can interact with the
     * detail disclosure accessory (accessoryType set to
     * Titanium.UI.LIST_ACCESSORY_TYPE_DETAIL) and any child templates that are
     * controls, such as a button, slider, etc.
     */
    public native boolean allowsSelection() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.allowsSelection;
    }-*/;

    /**
     * Determines whether this item can be selected.
     * <p>
     * Set to false to prevent the item from being selected.
     * <p>
     * On iOS, even if this property is set to false, you can interact with the
     * detail disclosure accessory (accessoryType set to
     * Titanium.UI.LIST_ACCESSORY_TYPE_DETAIL) and any child templates that are
     * controls, such as a button, slider, etc.
     */
    public native void setAllowsSelection(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.allowsSelection = value;
    }-*/;

    /**
     * Background color of the view, as a color name or hex triplet.
     * <p>
     * For information about color values, see the "Colors" section of
     * Titanium.UI.
     * <p>
     * Default: Transparent
     */
    public native String getBackgroundColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundColor;
    }-*/;

    /**
     * Background color of the view, as a color name or hex triplet.
     * <p>
     * For information about color values, see the "Colors" section of
     * Titanium.UI.
     * <p>
     * Default: Transparent
     */
    public native void setBackgroundColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundColor = value;
    }-*/;

    /**
     * Default text color of the item when not selected, as a color name or hex
     * triplet.
     * <p>
     * For information about color values, see the "Colors" section of
     * Titanium.UI.
     * <p>
     * On Android, selectedColor is not supported, so the text is always
     * displayed in this color.
     * <p>
     * Only applies to the built-in templates.
     */
    public native String getColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.color;
    }-*/;

    /**
     * Default text color of the item when not selected, as a color name or hex
     * triplet.
     * <p>
     * For information about color values, see the "Colors" section of
     * Titanium.UI.
     * <p>
     * On Android, selectedColor is not supported, so the text is always
     * displayed in this color.
     * <p>
     * Only applies to the built-in templates.
     */
    public native void setColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.color = value;
    }-*/;

    /**
     * 
     * Font to use for the item title.
     * <p>
     * Only applies to the built-in templates.
     * <p>
     * Default: System default font.
     */
    public native Font getFont() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.font;
		return @com.emitrom.ti4j.mobile.client.ui.style.Font::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * 
     * Font to use for the item title.
     * <p>
     * Only applies to the built-in templates.
     * <p>
     * Default: System default font.
     */
    public native void setFont(Font value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.font = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * Row height in platform-specific units.
     * <p>
     * On Android, the value can be either a float value or a dimension string,
     * for example, '40dp'.
     * <p>
     * On iOS, the value can only be an absolute value.
     */
    public native void setHeight(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.height = value;
    }-*/;

    /**
     * Row height in platform-specific units.
     * <p>
     * On Android, the value can be either a float value or a dimension string,
     * for example, '40dp'.
     * <p>
     * On iOS, the value can only be an absolute value.
     */
    public native void setHeight(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.height = value;
    }-*/;

    public native void setImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.image = value;
    }-*/;

    public native String getImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.image;
    }-*/;

    public native void setItemId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.itemId = value;
    }-*/;

    public native String getItemId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.itemId;
    }-*/;

    public native void setSelectionStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selectionStyle = value;
    }-*/;

    public native int getSelectionStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.selectionStyle;
    }-*/;

    public native void setSubTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.subtitle = value;
    }-*/;

    public native String getSubTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.subtitle;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    static JavaScriptObject fromList(List<ListItem> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (ListItem item : values) {
            peers.push(item.getJsObj());
        }
        return peers;
    }

    static List<ListItem> fromJsArray(JavaScriptObject obj) {
        List<ListItem> toReturn = new ArrayList<ListItem>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ListItem(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

}
