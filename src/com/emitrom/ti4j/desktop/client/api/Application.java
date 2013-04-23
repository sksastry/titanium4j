/************************************************************************
 * Application.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.api;

import java.util.List;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * An object representing a TideSDK application, either the currently running
 * application or one on disk.
 * 
 */
public class Application extends ProxyObject {

    Application(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Find the value for a given argument. You may either pass 'param' or
     * '--param' and this method will find the command-line value for '--param='
     * 
     * @return
     */
    public native String getArgumentValue(String argument)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getArgumentValue(argument);
    }-*/;

    /**
     * Retrieve a list of command-line arguments passed to this application.
     * This list will include the first argument, which is the path to the
     * executable.
     * 
     * @return
     */
    public native JsArrayString getArguments()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getArguments();
    }-*/;

    /**
     * Return a list of all available (installed and bundled) components for
     * this application. This is simply the list returned by
     * API.getInstalledComponents() plus any components bundled with the
     * application. Note that bundled components do not have a version
     * currently.
     * 
     * @return
     */
    public native JsArray<JavaScriptObject> getAvailableComponents()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getAvailableComponents();
    }-*/;

    /**
     * Return a list of all available (installed and bundled) modules for this
     * application. This is simply the list returned by
     * API.getInstalledModules() plus any components bundled with the
     * application. Note that bundled components do not have a version
     * currently.
     * 
     * @return
     */
    public native JsArray<JavaScriptObject> getAvailableModules()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getAvailableModules();
    }-*/;

    /**
     * Return a list of all available (installed and bundled) runtimes for this
     * application. This is simply the list returned by
     * API.getInstalledModules() plus any components bundled with the
     * application. Note that bundled components do not have a version
     * currently.
     * 
     * @return
     */
    public native JsArray<JavaScriptObject> getAvailableRuntimes()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getAvailableRuntimes();
    }-*/;

    /**
     * Return a list of all bundled components for this for this application.
     * Bundled components currently live inside the application contents
     * directory. in the following directories:
     * <ul>
     * <li>My App.app/Contents/modules</li>
     * <li>My App.app/Contents/runtime</li>
     * <li>My App.app/Contents/sdk</li>
     * <li>My App.app/Contents/mobilesdk</li>
     * </ul>
     * 
     * @return
     */
    public native JsArray<JavaScriptObject> getBundleComponents()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getBundleComponents();
    }-*/;

    public native JsArray<JavaScriptObject> getBundleModules()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getBundleModules();
    }-*/;

    /**
     * Return a list of all bundled modules for this for this application.
     * Bundled modules currently live inside the application contents directory
     * in the "My App.app/Contents/modules" directory.
     * 
     * @return
     */
    public native JsArray<JavaScriptObject> getBundleRuntimes()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getBundleRuntimes();
    }-*/;

    /**
     * Return a list of all resolved components for this for this application.
     * Resolved components may either be installed or bundled components. Note
     * that currently bundled components returned in this list do not have a
     * version.
     * 
     * @return
     */
    public native JsArray<JavaScriptObject> getComponents()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getComponents();
    }-*/;

    /**
     * Get the path to the application's user data directory. This path is
     * guaranteed to be writable (as opposed to the application directory which
     * should not be written to) and is suitable for storing any application
     * files.
     * 
     * @return
     */
    public native String getDataPath()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getDataPath();
    }-*/;

    /**
     * Get a list of this application's dependencies. Dependencies are defined
     * in the application manifest file.
     * 
     * @return
     */
    public native List<Dependency> getDependencies()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getDependencies();
    }-*/;

    /**
     * Get the path to this application's executable.
     * 
     * @return
     */
    public native int getExcecutablePath()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getExcecutablePath();
    }-*/;

    /**
     * Get this application globally unique identifier. This is currently
     * defined in the application manifest.
     * 
     * @return
     */
    public native String getGUID()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getGUID();
    }-*/;

    /**
     * Get this human readable id currently defined in both the application
     * manifest and the application's tiapp.xml file.
     * 
     * @return
     */
    public native String getID()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getID();
    }-*/;

    /**
     ** Get the contents of this application's manifest as an array of string
     * pairs (array of size 2). Each entry in the manifest is a simple key-value
     * pair. Comments are ignored.
     * 
     * @return
     */
    public native JsArrayString getManifest()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.getManifest();
    }-*/;

    /**
     * 
     * 
     * Get the path to this application's manifest
     * 
     * @return
     */
    public native String getManifestPath()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.getManifestPath();
    }-*/;

    /**
     * Return a list of all resolved modules for this for this application.
     * Resolved components may either be installed or bundled components. Note
     * that currently bundled components returned in this list do not have a
     * version.
     * 
     * @return
     */
    public native JsArray<JavaScriptObject> getModules()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getModules();
    }-*/;

    /**
     * Get this application's name.
     * 
     * @return
     */
    public native String getName()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getName();
    }-*/;

    /**
     * Retrieve the process identifier of this application. If this application
     * is not the currently running application, this method will returned
     * undefined.
     * 
     * @return
     */
    public native String getPID()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getPID();
    }-*/;

    /**
     * Get this application's path. Note that this is the top-level path of
     * application, not the path to the application contents directory. On OS X
     * currently, the application contents directory is "[app path]/Contents"
     * 
     * @return
     */
    public native String getPath()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getPath();
    }-*/;

    /**
     * Return the path to this application's resources directory. This directory
     * is the 'Resources' subdirectory of the application contents directory.
     * 
     * @return
     */
    public native String getResourcesPath()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getResourcesPath();
    }-*/;

    /**
     * Return the resolved runtime for this for this application. Resolved
     * components may either be installed or bundled components. Note that
     * currently bundled components returned from this method do not have a
     * version.
     * 
     * @return
     */
    public native Component getRuntime()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var toReturn = obj.getRuntime();
		return @com.emitrom.ti4j.desktop.client.api.Component::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

    /**
     * Get this application's version.
     * 
     * @return
     */
    public native String getVersion()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getVersion();
    }-*/;

    /**
     * Determine if the given argument is in the argument list. You may either
     * pass 'param' or '--param' and this method will find the command-line
     * argument.
     * 
     * @param argument
     * @return
     */
    public native boolean hasArgument(String argument)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.hasArgument(argument);
    }-*/;

    /**
     * Returns whether or not this is the currently running application.
     * 
     * @return
     */
    public native boolean isCurrent()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isCurrent();
    }-*/;

    /**
     * Attempt to resolve all the dependencies for this application. Resolved
     * components should be accessible through API.Application.getComponents
     * afterward. Note that the currently running applicaiton should already
     * have all of its dependencies resolved.
     * 
     * @return
     */
    public native JsArray<JavaScriptObject> resolveDependencies()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.resolveDependencies();
    }-*/;

}
