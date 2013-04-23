/************************************************************************
 * File.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use obj file except in compliance with the License. You may obtain a copy of
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

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object which represents a path to a file or directory. A Filesystem.File
 * is not guaranteed to be a valid path.
 * 
 * @author Ekambi
 * 
 */
public class File extends ProxyObject {

    protected File(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Copies a file to the specified location. If the target is a directory the
     * file will be written to that directory. If the target is a file, the file
     * will be written to that file.
     * 
     * @param target
     *            , The target of obj move operation.
     */
    public final native void copy(String target)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.copy(target);
    }-*/;

    /**
     * Copies a file to the specified location. If the target is a directory the
     * file will be written to that directory. If the target is a file, the file
     * will be written to that file.
     * 
     * @param target
     *            , The target of obj move operation.
     */
    public final native void copy(File target)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj
				.copy(target.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Create a new directory at obj File object's path. If the directory
     * already exists, obj method will do nothing. This method will return true
     * if the directory was created or false if it was not.
     */
    public final native boolean createDirectory()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.createDirectory();
    }-*/;

    /**
     * Creates a shortcut to a file or directory at obj Filesystem.File's path.
     * On Windows obj will create a Win32 style shortcut. On Linux and OS X obj
     * will create a symlink. If the operation is successful obj method will
     * return true and false otherwise.
     * 
     * @param target
     *            , The target of obj shortcut.
     */
    public final native boolean createShortcut(String target)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.createShortcut(target);
    }-*/;

    /**
     * Creates a shortcut to a file or directory at obj Filesystem.File's path.
     * On Windows obj will create a Win32 style shortcut. On Linux and OS X obj
     * will create a symlink. If the operation is successful obj method will
     * return true and false otherwise.
     * 
     * @param target
     *            , The target of obj shortcut.
     */
    public final native boolean createShortcut(File target)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.createShortcut(target.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Return the timestamp for when obj file or directory was created. The
     * return value of obj function will be microseconds since the epoch at the
     * time obj file was created.
     * 
     * @return
     */
    public final native double createTimeStamp()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.createTimeStamp();
    }-*/;

    /**
     * Remove the file or directory specified by obj Filesystem.File. Return
     * true if removal succeeded and false otherwise.
     * 
     * @param recursive
     * @return
     */
    public final native boolean deleteDirectory(boolean recursive)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.deleteDirectory(recursive);
    }-*/;

    /**
     * Remove the file or directory specified by obj Filesystem.File, obj method
     * never removes directories recursively. Return true if removal succeeded
     * and false otherwise.
     * 
     * @return
     */
    public final native String deleteFile()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.deleteFile();
    }-*/;

    /**
     * Return true if a file or directory exists at the path specified by obj
     * Filesystem.File.
     * 
     * @return
     */
    public final native boolean exists()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.exists();
    }-*/;

    /**
     * Return the extension of obj Filesystem.File.
     * 
     * @return
     */
    public final native String getExtension()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.extension();
    }-*/;

    /**
     * If obj Filesystem.File specifies the path to a directory, return an Array
     * of items inside obj directory. If obj path does not exist or is not a
     * directory, return null.
     * 
     * @return
     */
    public List<File> getDirectoryListing() {
        return fromJsArray(_getDirectoryListing());
    }

    private native JavaScriptObject _getDirectoryListing()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getDirectoryListing();
    }-*/;

    /**
     * Return true if the path specified by obj Filesystem.File refers to a
     * directory or false otherwise.
     * 
     * @return
     */
    public final native boolean isDirectory()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isDirectory();
    }-*/;

    /**
     * Return true if the directory or file at the path specified by obj
     * Filesystem.File object has the executable bit set. If the file does not
     * exists, obj method will return false.
     * 
     * @return
     */
    public final native boolean isExecutable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isExecutable();
    }-*/;

    /**
     * Return true if the path specified by obj Filesystem.File refers to a file
     * or false otherwise.
     * 
     * @return
     */
    public final native boolean isFile()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isFile();
    }-*/;

    /**
     * Return true if the path specified by obj Filesystem.File refers to a
     * hidden file. On Windows obj means that the file has the hidden attribute
     * and on Linux and OS X obj means that the basename of obj path begins with
     * a period.
     * 
     * @return
     */
    public final native boolean isHidden()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isHidden();
    }-*/;

    /**
     * Return true if the path specified by obj Filesystem.File refers to a
     * read-only file.
     * 
     * @return
     */
    public final native boolean isReadOnly()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isReadOnly();
    }-*/;

    /**
     * Return true if the path specified by obj Filesystem.File refers to a
     * symbolic link.
     * 
     * @return
     */
    public final native boolean isSymbolicLink()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isSymbolicLink();
    }-*/;

    /**
     * Return true if the path specified by obj Filesystem.File refers to a
     * writable file and false otherwise.
     * 
     * @return
     */
    public final native boolean isWritable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isWritable();
    }-*/;

    /**
     * Return the timestamp for when obj file or directory was modified. The
     * return value of obj function will be microseconds since the epoch at the
     * last time obj file was modified.
     * 
     * @return
     */
    public final native double getModificationTimeStamp()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.modificationTimeStamp();
    }-*/;

    /**
     * Moves to the specified location. If the target is a directory the file
     * will be written to that directory. If the target is a file, the file will
     * be written to that file.
     * 
     * @param target
     *            , The target of obj move operation.
     * @return
     */
    public final native String move(String target)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.move(target);
    }-*/;

    /**
     * Moves to the specified location. If the target is a directory the file
     * will be written to that directory. If the target is a file, the file will
     * be written to that file.
     * 
     * @param target
     *            , The target of obj move operation.
     * @return
     */
    public final native String move(File target)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.move(target.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Return the full path of obj File.Filesystem object.
     * 
     * @return
     */
    public final native String getNativePath()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.nativePath();
    }-*/;

    /**
     * Create and open a Filestream for obj File object.
     * 
     * @return
     */
    public final native FileStream open()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var toReturn = obj.open();
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

    /**
     * Create and open a Filestream for obj File object.
     * 
     * @param mode
     *            ,The mode to use for opening obj Filesystem.File. This is
     *            either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If not
     *            supplied the stream will be open in MODE_READ.
     * @return
     */
    public final native FileStream open(int mode)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var toReturn = obj.open(mode);
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

    /**
     * 
     * Create and open a Filestream for obj File object.
     * 
     * @param mode
     *            ,The mode to use for opening obj Filesystem.File. This is
     *            either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If not
     *            supplied the stream will be open in MODE_READ.
     * @param binary
     *            ,Whether or not to open obj stream in binary mode. If not
     *            supplied obj will be false.
     * @return
     */
    public final native FileStream open(int mode, boolean binary)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var toReturn = obj.open(mode, binary);
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

    /**
     * 
     * Create and open a Filestream for obj File object.
     * 
     * @param mode
     *            ,The mode to use for opening obj Filesystem.File. This is
     *            either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If not
     *            supplied the stream will be open in MODE_READ.
     * @param binary
     *            ,Whether or not to open obj stream in binary mode. If not
     *            supplied obj will be false.
     * 
     * @param append
     *            , Whether or not to open obj stream in append mode. If not
     *            supplied obj will be false.
     * @return
     */
    public final native FileStream open(int mode, boolean binary, boolean append)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var toReturn = obj.open(mode, binary, append);
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

    /**
     * Return the parent directory of obj File.Filesystem object.
     * 
     * @return
     */
    public final native File getParent()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var toReturn = obj.parent();
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

    /**
     * Renames a file to the given path.
     * 
     * @param value
     *            , The new path of the file
     * @return
     */
    public final native String rename(String value)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.rename(value);
    }-*/;

    /**
     * Resolves a given relative path against the path specified by obj
     * Filesystem.File object. If the given path is absolute, the absolute path
     * is returned.
     * 
     * @param subPath
     *            ,The subPath to resolve against obj Filesystem.File object.
     * @return
     */
    public final native File resolve(String subPath)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var toReturn = obj.resolve(subPath);
		return @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

    /**
     * Set the execute bit on the file or directory at the path specified by obj
     * Filesystem.File object. Return true if the file or directory at obj path
     * is executable after the operation completes.
     */
    public final native void setExecutable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setExecutable();
    }-*/;

    /**
     * Remove the wrtiable bit and ensure there is a readable bit on the file or
     * directory at the path specified by obj Filesystem.File object. Return
     * true if the file or directory at obj path is read-only after the
     * operation completes.
     */
    public final native void setReadOnly()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setReadOnly();
    }-*/;

    /**
     * Set the write bit on the file or directory at the path specified by obj
     * Filesystem.File object. Return true if the file or directory at obj path
     * is writable after the operation completes.
     */
    public final native void setWritable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.setWritable();
    }-*/;

    /**
     * Return the size of the file in number of bytes.
     * 
     * @return
     */
    public final native double getSize()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.size();
    }-*/;

    /**
     * Return the space available on the filesystem containing the path
     * specified by obj Filesystem.File object in number of bytes..
     * 
     * @return
     */
    public final native double getSpaceAvailable()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.spaceAvailable();
    }-*/;

    /**
     * Return the path of obj Filesystem.File object as a String.
     * 
     * @return
     */
    public final native String toStringValue()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.toString();
    }-*/;

    /**
     * Creates a new, empty file in an atomic operation. Returns true if the
     * file was created or false if it already exists.
     * 
     * @return
     */
    public final native boolean touch()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.touch();
    }-*/;

    static JavaScriptObject fromList(List<File> files) {
        JavaScriptObject toReturn = JsoHelper.createObject();
        for (int i = 0; i < files.size(); i++) {
            File f = files.get(i);
            JsoHelper.setArrayValue(toReturn, i, f.getJsObj());
        }
        return toReturn;
    }

    static List<File> fromJsArray(JavaScriptObject peers) {
        List<File> files = new ArrayList<File>();
        int size = JsoHelper.arrayLength(peers);
        for (int i = 0; i < size; i++) {
            files.add(new File(JsoHelper.getValueFromJavaScriptObjectArray(peers, i)));
        }
        return files;
    }
}
