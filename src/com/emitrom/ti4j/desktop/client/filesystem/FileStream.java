/************************************************************************
 * FileStream.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.desktop.client.bytes.Bytes;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A object for reading and writing data to files.
 * 
 */
public class FileStream extends ProxyObject {

    public static final int MODE_APPEND = FileStream.MODE_APPEND();
    public static final int MODE_READ = FileStream.MODE_READ();
    public static final int MODE_WRITE = FileStream.MODE_WRITE();

    protected FileStream(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Close obj Filsystem.Filstream. Return true if the stream closed without
     * any problems and false otherwise.
     * 
     * @return
     */
    public final native boolean close()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.close();
    }-*/;

    /**
     * Return true if obj Fileystem.Filestream is open and false otherwise.
     * 
     * @return
     */
    public final native boolean isOpen()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.isOpen();
    }-*/;

    /**
     * Open obj Filesystem.Filestream. Return true if the operation is
     * successful or false otherwise.
     * 
     * @return
     */
    public final native boolean open()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var fs = obj.open();
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(fs);
    }-*/;

    /**
     * Open obj Filesystem.Filestream. Return true if the operation is
     * successful or false otherwise.
     * 
     * @param mode
     *            ,The mode to use for opening obj Filesystem.Filestream. This
     *            is either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If
     *            not supplied the stream will be open in MODE_READ.
     * @return
     */
    public final native FileStream open(int mode)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var fs = obj.open(mode);
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(fs);
    }-*/;

    /**
     * 
     ** Open obj Filesystem.Filestream. Return true if the operation is
     * successful or false otherwise.
     * 
     * @param mode
     *            ,The mode to use for opening obj Filesystem.Filestream. This
     *            is either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If
     *            not supplied the stream will be open in MODE_READ.
     * 
     * @param binary
     *            , Whether or not to open obj stream in binary mode. If not
     *            supplied obj will be false.
     * @return
     */
    public final native FileStream open(int mode, boolean binary)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var fs = obj.open(mode, binary);
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(fs);
    }-*/;

    /**
     * 
     * 
     ** Open obj Filesystem.Filestream. Return true if the operation is
     * successful or false otherwise.
     * 
     * @param mode
     *            ,The mode to use for opening obj Filesystem.Filestream. This
     *            is either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If
     *            not supplied the stream will be open in MODE_READ.
     * 
     * @param binary
     *            , Whether or not to open obj stream in binary mode. If not
     *            supplied obj will be false.
     * 
     * @param append
     *            ,Whether or not to open obj stream in append mode. If not
     *            supplied obj will be false.
     * @return
     */
    public final native FileStream open(int mode, boolean binary, boolean append)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var fs = obj.open(mode, binary, append);
		return @com.emitrom.ti4j.desktop.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(fs);
    }-*/;

    /**
     * Read data from a Filesystem.Filestream into a Bytes object and return it.
     * This method will throw an exception if the operation fails.
     * 
     * @param size
     *            , Number of bytes to read from the file.
     * @return
     */
    public final native Bytes read(int size)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var b = obj.read(size);
		return @com.emitrom.ti4j.desktop.client.bytes.Bytes::new(Lcom/google/gwt/core/client/JavaScriptObject;)(b);
    }-*/;

    /**
     * Reads one line from obj Filesystem.Filestream. The stream must be open
     * before using obj method (or an exception will be thrown). Each call will
     * return a Bytes object until the end of the stream, when null will be
     * returned.
     * 
     * @return
     */
    public final native Bytes readLine()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var b = obj.readLine();
		return @com.emitrom.ti4j.desktop.client.bytes.Bytes::new(Lcom/google/gwt/core/client/JavaScriptObject;)(b);
    }-*/;

    /**
     * Return true if obj Filesystem.Filestream is ready for IO operations or
     * false otherwise.
     * 
     * @return
     */
    public final native boolean isReady()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.ready();
    }-*/;

    /**
     * Set the current read/write position with in the file.
     * 
     * @param offset
     *            , new position relative to the absolute position specifed by
     *            the dir parameter
     * 
     * @param dir
     *            , specifies an absolute position in the file where offset will
     *            be applied
     */
    public final native void seek(int offset, int dir)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		obj.seek(offset, dir);
    }-*/;

    /**
     * Returns current position in file relative to the beginning
     * 
     * @return
     */
    public final native int tell()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.tell();
    }-*/;

    /**
     * Writes a line to obj Filesystem.Filestream. Return true if obj operation
     * succeeds and false otherwise.
     * 
     * @param data
     *            , The data to write to obj Filesystem.Filestream.
     * @return
     */
    public final native boolean write(String data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.write(data);
    }-*/;

    /**
     * Writes a line to obj Filesystem.Filestream. Return true if obj operation
     * succeeds and false otherwise.
     * 
     * @param data
     *            , The data to write to obj Filesystem.Filestream.
     * @return
     */
    public final native boolean write(double data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.write(data);
    }-*/;

    /**
     * Writes a line to obj Filesystem.Filestream. Return true if obj operation
     * succeeds and false otherwise.
     * 
     * @param data
     *            , The data to write to obj Filesystem.Filestream.
     * @return
     */
    public final native boolean write(Bytes data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.write(data.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Writes a line to obj Filesystem.Filestream. The data will be followed by
     * the platform dependent line-ending sequence. Return true if obj operation
     * succeeds and false otherwise.
     * 
     * @param data
     *            , The data to write to obj Filesystem.Filestream.
     * @return
     */
    public final native boolean writeLine(String data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.writeLine(data);
    }-*/;

    /**
     * Writes a line to obj Filesystem.Filestream. The data will be followed by
     * the platform dependent line-ending sequence. Return true if obj operation
     * succeeds and false otherwise.
     * 
     * @param data
     *            , The data to write to obj Filesystem.Filestream.
     * @return
     */
    public final native boolean writeLine(double data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.writeLine(data);
    }-*/;

    /**
     * Writes a line to obj Filesystem.Filestream. The data will be followed by
     * the platform dependent line-ending sequence. Return true if obj operation
     * succeeds and false otherwise.
     * 
     * @param data
     *            , The data to write to obj Filesystem.Filestream.
     * @return
     */
    public final native boolean writeLine(Bytes data)/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj
				.writeLine(data.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    private static native int MODE_APPEND()/*-{
		return Ti.FileSystem.FileStream.MODE_APPEND;
    }-*/;

    private static native int MODE_READ()/*-{
		return Ti.FileSystem.FileStream.MODE_READ;
    }-*/;

    private static native int MODE_WRITE()/*-{
		return Ti.FileSystem.FileStream.MODE_WRITE();
    }-*/;

}
