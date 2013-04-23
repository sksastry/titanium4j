package com.emitrom.ti4j.mobile.client.contacts;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class AddressEntry extends ProxyObject {

    protected AddressEntry(JavaScriptObject obj) {
        jsObj = obj;
    }

    public AddressEntry() {
        jsObj = JsoHelper.createObject();
    }

    public String getCountrycode() {
        return JsoHelper.getAttribute(jsObj, "CountryCode");
    }

    public void setCountrycode(String value) {
        JsoHelper.setAttribute(jsObj, "CountryCode", value);
    }

    public String getStreet() {
        return JsoHelper.getAttribute(jsObj, "Street");
    }

    public void setStreet(String value) {
        JsoHelper.setAttribute(jsObj, "Street", value);
    }

    public String getCity() {
        return JsoHelper.getAttribute(jsObj, "City");
    }

    public void setCity(String value) {
        JsoHelper.setAttribute(jsObj, "City", value);
    }

    public String getCounty() {
        return JsoHelper.getAttribute(jsObj, "County");
    }

    public void setCounty(String value) {
        JsoHelper.setAttribute(jsObj, "County", value);
    }

    public String getZip() {
        return JsoHelper.getAttribute(jsObj, "Zip");
    }

    public void setZip(String value) {
        JsoHelper.setAttribute(jsObj, "Zip", value);
    }

    public String getState() {
        return JsoHelper.getAttribute(jsObj, "State");
    }

    public void setState(String value) {
        JsoHelper.setAttribute(jsObj, "State", value);
    }

    public String getCountry() {
        return JsoHelper.getAttribute(jsObj, "Country");
    }

    public void setCountry(String value) {
        JsoHelper.setAttribute(jsObj, "Country", value);
    }

    static List<AddressEntry> fromJsArray(JavaScriptObject obj) {
        List<AddressEntry> toReturn = new ArrayList<AddressEntry>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new AddressEntry(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

    static JavaScriptObject fromList(ArrayList<AddressEntry> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (AddressEntry entry : values) {
            peers.push(entry.getJsObj());
        }
        return peers;
    }
}
