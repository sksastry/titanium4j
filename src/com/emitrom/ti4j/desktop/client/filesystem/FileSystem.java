/************************************************************************
 * FileSystem.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.filesystem;

import java.util.List;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * A module for accessing the Filesystem.
 * 
 */
public class FileSystem extends ProxyObject {

    public static final int MODE_APPEND = FileSystem.MODE_APPEND();
    public static final int MODE_READ = FileSystem.MODE_READ();
    public static final int MODE_WRITE = FileSystem.MODE_WRITE();

    private FileSystem() {

    }

    /**
     * Executes an asynchronous copy operation and returns an AsyncCopy object.
     * 
     * @param path
     *            ,The source path to include in the copy operation.
     * @param destination
     *            , A path representing the destination directory of the
     *            asynchronous copy.
     * @param callback
     *            , Callback invoked after every successful file copy.
     *            Filesystem.AsyncCopy will pass this callback two arguments,
     *            the first will be the index in the original list of source
     *            arguments, the second will be the total number of files in the
     *            list.
     */

    public static native AsyncCopy asyncCopy(String path, String destination, AsyncCopyCallback callback)/*-{
		return Ti.FileSystem
				.asyncCopy(
						path,
						destination,
						function(index, total) {
							callback.@com.emitrom.ti4j.desktop.client.filesystem.AsyncCopyCallback::onAsyncCopy(II)(index,total);
						});
    }-*/;

    /**
     * Executes an asynchronous copy operation and returns an AsyncCopy object.
     * 
     * @param path
     *            ,The source path to include in the copy operation.
     * @param destination
     *            , A File Object representing the destination directory of the
     *            asynchronous copy.
     * @param callback
     *            , Callback invoked after every successful file copy.
     *            Filesystem.AsyncCopy will pass this callback two arguments,
     *            the first will be the index in the original list of source
     *            arguments, the second will be the total number of files in the
     *            list.
     */
    public static native AsyncCopy asyncCopy(String path, File destination, AsyncCopyCallback callback)/*-{
		return Ti.FileSystem
				.asyncCopy(
						path,
						destination,
						function(index, total) {
							callback.@com.emitrom.ti4j.desktop.client.filesystem.AsyncCopyCallback::onAsyncCopy(II)(index,total);
						});
    }-*/;

    /**
     * Executes an asynchronous copy operation and returns an AsyncCopy object.
     * 
     * @param paths
     *            ,The source paths to include in the copy operation.
     * @param destination
     *            , A path representing the destination directory of the
     *            asynchronous copy.
     * @param callback
     *            , Callback invoked after every successful file copy.
     *            Filesystem.AsyncCopy will pass this callback two arguments,
     *            the first will be the index in the original list of source
     *            arguments, the second will be the total number of files in the
     *            list.
     */

    public static native AsyncCopy asyncCopy(JsArrayString paths, String destination, AsyncCopyCallback callback)/*-{
		return Ti.FileSystem
				.asyncCopy(
						paths,
						destination,
						function(index, total) {
							callback.@com.emitrom.ti4j.desktop.client.filesystem.AsyncCopyCallback::onAsyncCopy(II)(index,total);
						});
    }-*/;

    /**
     * Executes an asynchronous copy operation and returns an AsyncCopy object.
     * 
     * @param paths
     *            ,The source paths to include in the copy operation.
     * @param destination
     *            , A file object representing the destination directory of the
     *            asynchronous copy.
     * @param callback
     *            , Callback invoked after every successful file copy.
     *            Filesystem.AsyncCopy will pass this callback two arguments,
     *            the first will be the index in the original list of source
     *            arguments, the second will be the total number of files in the
     *            list.
     */

    public static native AsyncCopy asyncCopy(JsArrayString paths, File destination, AsyncCopyCallback callback)/*-{
		return Ti.FileSystem
				.asyncCopy(
						paths,
						destination,
						function(index, total) {
							callback.@com.emitrom.ti4j.desktop.client.filesystem.AsyncCopyCallback::onAsyncCopy(II)(index,total);
						});
    }-*/;

    /**
     * Executes an asynchronous copy operation and returns an AsyncCopy object.
     * 
     * @param paths
     *            ,The source paths to include in the copy operation.
     * @param destination
     *            , A path representing the destination directory of the
     *            asynchronous copy.
     * @param callback
     *            , Callback invoked after every successful file copy.
     *            Filesystem.AsyncCopy will pass this callback two arguments,
     *            the first will be the index in the original list of source
     *            arguments, the second will be the total number of files in the
     *            list.
     */

    public static native AsyncCopy asyncCopy(List<File> paths, String destination, AsyncCopyCallback callback)/*-{
		return Ti.FileSystem
				.asyncCopy(
						paths,
						destination,
						function(index, total) {
							callback.@com.emitrom.ti4j.desktop.client.filesystem.AsyncCopyCallback::onAsyncCopy(II)(index,total);
						});
    }-*/;

    /**
     * Executes an asynchronous copy operation and returns an AsyncCopy object.
     * 
     * @param paths
     *            ,The source paths to include in the copy operation.
     * @param destination
     *            , A file object representing the destination directory of the
     *            asynchronous copy.
     * @param callback
     *            , Callback invoked after every successful file copy.
     *            Filesystem.AsyncCopy will pass this callback two arguments,
     *            the first will be the index in the original list of source
     *            arguments, the second will be the total number of files in the
     *            list.
     */

    public static native AsyncCopy asyncCopy(List<File> paths, File destination, AsyncCopyCallback callback)/*-{
		return Ti.FileSystem
				.asyncCopy(
						paths,
						destination,
						function(index, total) {
							callback.@com.emitrom.ti4j.desktop.client.filesystem.AsyncCopyCallback::onAsyncCopy(II)(index,total);
						});
    }-*/;

    /**
     * Create a temporary directory. This directory is guaranteed to be
     * writable. If it still exists when the application exits, it will be
     * deleted.
     * 
     * @return
     */
    public static native File createTempDirectory()/*-{
		var obj = Ti.FileSystem.createTempDirectory();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the Desktop directory for the current user. OS X and Windows will
     * always have a valid Desktop directory. Some Linux systems may not have
     * one, in which case the home directory will be returned.
     * 
     * @return
     */
    public static native File getDesktopDirectory()/*-{
		var obj = Ti.FileSystem.getDesktopDirectory();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the data directory of the application. The data directory is
     * per-user directory for storing application data. It is guaranteed to be
     * writable and stable between releases.
     * 
     * @return
     */
    public static native File getApplicationDataDirectory()/*-{
		var obj = Ti.FileSystem.getApplicationDataDirectory();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the directory containing the application. The application
     * directory may contain the application contents directory (OS X) or be the
     * application contents directory (Windows and Linux). The application
     * directory may not be writable and applications should not attempt to
     * write to it.
     * 
     * @return
     */
    public static native File getApplicationDirectory()/*-{
		var obj = Ti.FileSystem.getApplicationDirectory();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the documents directory for the current user. OS X and Windows
     * will always have a valid Documents directory. Some Linux systems may not
     * have one, in which case the home directory will be returned.
     * 
     * @return
     */
    public static native File getDocumentsDirectory()/*-{
		var obj = Ti.FileSystem.getDocumentsDirectory();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Create a Filesystem.File object given a variable-length argument list of
     * Filesystem.File or a path strings. The list will be joined together to
     * form one long path string.
     * 
     * @param base
     *            , The base to this file. This may be a file or directory.
     * @return
     */
    public static native File getFile(String base)/*-{
		var obj = Ti.FileSystem.getFile(base);
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * 
     * Create a Filesystem.File object given a variable-length argument list of
     * Filesystem.File or a path strings. The list will be joined together to
     * form one long path string.
     * 
     * @param base
     *            , The base to this file. This may be a file or directory.
     * @param joins
     *            , A variable length argument list of Files or paths that are
     *            joined to the base in an platform-specific way.
     * @return
     */
    public static native File getFile(String base, String... joins)/*-{
		var obj = Ti.FileSystem.getFile.apply(base, joins);
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * 
     * Create a Filesystem.File object given a variable-length argument list of
     * Filesystem.File or a path strings. The list will be joined together to
     * form one long path string.
     * 
     * @param base
     *            , The base to this file. This may be a file or directory.
     * @param joins
     *            , A variable length argument list of Files or paths that are
     *            joined to the base in an platform-specific way.
     * @return
     */
    private static native File getFile(String base, File... joins)/*-{
		return Ti.FileSystem.getFile(base, joins);
    }-*/;

    /**
     * Create a Filesystem.File object given a variable-length argument list of
     * Filesystem.File or a path strings. The list will be joined together to
     * form one long path string.
     * 
     * @param base
     *            , The base to this file. This may be a file or directory.
     * @return
     */
    public static native File getFile(File base)/*-{
		var obj = Ti.FileSystem
				.getFile(base.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * 
     * Create a Filesystem.File object given a variable-length argument list of
     * Filesystem.File or a path strings. The list will be joined together to
     * form one long path string.
     * 
     * @param base
     *            , The base to this file. This may be a file or directory.
     * @param joins
     *            , A variable length argument list of Files or paths that are
     *            joined to the base in an platform-specific way.
     * @return
     */
    public static native File getFile(File base, String... joins)/*-{
		var obj = Ti.FileSystem.getFile.apply(
				base.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
				joins);
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * 
     * Create a Filesystem.File object given a variable-length argument list of
     * Filesystem.File or a path strings. The list will be joined together to
     * form one long path string.
     * 
     * @param base
     *            , The base to this file. This may be a file or directory.
     * @param joins
     *            , A variable length argument list of Files or paths that are
     *            joined to the base in an platform-specific way.
     * @return
     */
    public static native File getFile(File base, File... joins)/*-{
		var obj = Ti.FileSystem.getFile(base, joins);
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Create a Filesystem.Filestream object given a Filesystem.File or a path.
     * Filesystem.Filestream is the preferred way of writing to files.
     * 
     * @param file
     *            , A path used for the construction of this
     *            Filesystem.Filestream.
     * @return
     */
    public static native FileStream getFileStream(String file)/*-{
		var obj = Ti.FileSystem.getFileStream(file);
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Create a Filesystem.Filestream object given a Filesystem.File or a path.
     * Filesystem.Filestream is the preferred way of writing to files.
     * 
     * @param file
     *            , A file used for the construction of this
     *            Filesystem.Filestream.
     * @return
     */
    public static native FileStream getFileStream(File file)/*-{
		var obj = Ti.FileSystem
				.getFileStream(file.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the line ending most commonly used by the current operating
     * system. This is useful for writing files with the platform compatibility
     * in mind. File.Filestream.writeLine will use this value when completing
     * lines.
     * 
     * @return
     */
    public static native String getLineEnding()/*-{
		return Ti.FileSystem.getLineEnding();
    }-*/;

    /**
     * Return the directory commonly used for storing applications on this
     * platform. On Linux systems, there can be many places for storing
     * executables, so it is not recommended using this value to locate them.
     * 
     * @return
     */
    public static native File getProgramsDirectotry()/*-{
		var obj = Ti.FileSystem.getProgramsDirectotry();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the path to this application's resources directory. This diretory
     * is the 'Resources' subdirectory of the application contents directory.
     * The application directory may not be writable and applications should not
     * attempt to write to it.
     * 
     * @return
     */
    public static native File getResourcesDirectory()/*-{
		var obj = Ti.FileSystem.getResourcesDirectory();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the path separator used by the operating system.
     * 
     * @return
     */
    public static native List<File> getRootDirectories()/*-{
		var obj = Ti.FileSystem.getRuntimeHomeDirectory();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the directory of the current Ti runtime files.
     * 
     * @return
     */
    public static native File getRuntimeHomeDirectory()/*-{
		var obj = Ti.FileSystem.getRuntimeHomeDirectory();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the path separator used by the operating system.
     * 
     * @return
     */
    public static native String getSeparator()/*-{
		return Ti.FileSystem.getSeparator();
    }-*/;

    /**
     * Return the home directory of the current user.
     * 
     * @return
     */
    public static native File getUsersDirectory()/*-{
		var obj = Ti.FileSystem.getUsersDirectory();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static native int MODE_APPEND()/*-{
		return Ti.FileSystem.MODE_APPEND;
    }-*/;

    private static native int MODE_READ()/*-{
		return Ti.FileSystem.MODE_READ;
    }-*/;

    private static native int MODE_WRITE()/*-{
		return Ti.FileSystem.MODE_WRITE;
    }-*/;

}
