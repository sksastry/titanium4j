package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.blob.Blob;
import com.emitrom.ti4j.mobile.client.filesystem.File;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A button bar or tabbed bar item can have an image or a title, but not both.
 * Buttons with images and buttons with text can be mixed in the same bar,
 * however.
 * 
 * If both image and title properties are specified for a given item, the image
 * property takes precedence and the title property is ignored.
 * 
 */
public class BarItemType extends ProxyObject {

    public BarItemType() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * A succint label associated with the bar item for the device's
     * accessibility service.
     */
    public void setAccessibilityLabel(String value) {
        JsoHelper.setAttribute(jsObj, "accessibilityLabel", value);
    }

    /**
     * Whether the button is enabled initially.
     * <p>
     * Default: true
     */
    public void setEnabled(boolean value) {
        JsoHelper.setAttribute(jsObj, "enabled", value);
    }

    /**
     * Button icon. If specified, takes precedence over title.
     */
    public void setImage(File value) {
        JsoHelper.setAttribute(jsObj, "image", value.getJsObj());
    }

    /**
     * Button icon. If specified, takes precedence over title.
     */
    public void setImage(Blob value) {
        JsoHelper.setAttribute(jsObj, "image", value.getJsObj());
    }

    /**
     * BButton title, used if no image is specified.
     */
    public void setTitle(String value) {
        JsoHelper.setAttribute(jsObj, "title", value);
    }

    /**
     * BButton title, used if no image is specified.
     */
    public void setWidth(double value) {
        JsoHelper.setAttribute(jsObj, "width", value);
    }

    static JavaScriptObject fromList(ArrayList<BarItemType> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (BarItemType entry : values) {
            peers.push(entry.getJsObj());
        }
        return peers;
    }
}
