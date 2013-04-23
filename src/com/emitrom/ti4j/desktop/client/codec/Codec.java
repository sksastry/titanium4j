/************************************************************************
 * Codec.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.codec;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.desktop.client.bytes.Bytes;
import com.emitrom.ti4j.desktop.client.filesystem.File;

/**
 * A module for dealing with encoding and decoding.
 */
public class Codec extends ProxyObject {

    public final static int ADLER32 = Codec.ADLER32();
    public final static String CRC32 = Codec.CRC32();
    public final static String MD2 = Codec.MD2();
    public final static String MD4 = Codec.MD4();
    public final static String MD5 = Codec.MD5();
    public final static String SHA1 = Codec.SHA1();

    private Codec() {

    }

    /**
     * Compute the checksum of the given String with the given checksum
     * algorithm.
     * 
     * @param data
     *            ,The string to compute the checksum on. The checksum will be
     *            computed on the UTF-8 version of this String.
     * @return
     */
    public static native double checkSum(String data)/*-{
		return Ti.Codec.checkSum(data);
    }-*/;

    /**
     * Compute the checksum of the given String with the given checksum
     * algorithm.
     * 
     * @param data
     *            ,The string to compute the checksum on. The checksum will be
     *            computed on the UTF-8 version of this String.
     * 
     * @param checksumType
     *            ,The checksum algorithm to use. Either Codec.CRC32 (default)
     *            or Codec.ADLER32
     * @return
     */
    public static native double checkSum(String data, int checksumType)/*-{
		return Ti.Codec.checkSum(data, checksumType);
    }-*/;

    /**
     * Asynchronously write the contents of a directory to a zip file.
     * 
     * @param root
     *            , A directory root to write to the zip stream.
     * @param zipFile
     *            , The path or File object of the destination zip file.
     * @param callback
     *            , A function callback that receives the zip file when writing
     *            is finished
     * @return
     */

    public static native String createZip(String root, String zipFile, ZipCreateStringDestinationHandler callback)/*-{
		return Ti.Codec
				.createZip(
						root,
						zipFile,
						function(destination) {
							callback.@com.emitrom.ti4j.desktop.client.codec.ZipCreateStringDestinationHandler::onComplete(Ljava/lang/String;)(destination);
						});
    }-*/;

    /**
     * Asynchronously write the contents of a directory to a zip file.
     * 
     * @param root
     *            , A directory root to write to the zip stream.
     * @param zipFile
     *            , The path or File object of the destination zip file.
     * @param listener
     *            , A function callback that receives the zip file when writing
     *            is finished
     * @return
     */

    public static native String createZip(File root, File zipFile, ZipCreateFileDestinationHandler listener)/*-{
		return Ti.Codec
				.createZip(
						root,
						zipFile,
						function(destination) {
							var f = @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(destination);
							callback.@com.emitrom.ti4j.desktop.client.codec.ZipCreateFileDestinationHandler::onComplete(Lcom/emitrom/ti4j/desktop/client/filesystem/File;)(f);
						});
    }-*/;

    /**
     * Decode a Base64-encoded String.
     * 
     * @param data
     *            ,String to decode.
     * @return
     */
    public static native String decodeBase64(String data)/*-{
		return Ti.Codec.decodeBase64(data);
    }-*/;

    /**
     * Decode a hex binary-encoded String.
     * 
     * @return
     */
    public static native String decodeHexBinary()/*-{
		return Ti.Codec.decodeHexBinary();
    }-*/;

    /**
     * Digest a String into a hex binary HMAC. String data will first be
     * converted to UTF-8 data.
     * 
     * @param hashType
     *            ,The hash type of the HMAC
     * @param data
     *            , The data to encode.
     * @param key
     *            , The key to use for the HMAC.
     * @return
     */
    public static native String digestHMacToHex(int hashType, String data, String key)/*-{
		return Ti.Codec.digestHMacToHex(hashType, data, key);
    }-*/;

    /**
     * Encode some data using a digest algorithm to a hex binary String. String
     * data will first be converted to UTF-8 data.
     * 
     * @param hashType
     *            ,The hash type of the digest
     * @param data
     *            , The data to encode.
     * @return
     */
    public static native String digestToHex(int hashType, String data)/*-{
		return Ti.Codec.digestToHex(hashType, data);
    }-*/;

    /**
     * Encode some data using a digest algorithm to a hex binary String. String
     * data will first be converted to UTF-8 data.
     * 
     * @param hashType
     *            ,The hash type of the digest
     * @param data
     *            , The data to encode.
     * @return
     */
    public static native String digestToHex(int hashType, Bytes data)/*-{
		return Ti.Codec.digestToHex(hashType, data);
    }-*/;

    /**
     * Encode some data into Base64. String data will first be converted to
     * UTF-8 data.
     * 
     * @param data
     *            , The data to encode
     * @return
     */
    public static native String encodeBase64(String data)/*-{
		return Ti.Codec.encodeBase64(data);
    }-*/;

    /**
     * Encode some data into Base64. String data will first be converted to
     * UTF-8 data.
     * 
     * @param data
     *            , The data to encode
     * @return
     */
    public static native String encodeBase64(Bytes data)/*-{
		return Ti.Codec.encodeBase64(data);
    }-*/;

    /**
     * Encode some data into a hex binary String. String data will first be
     * converted to UTF-8 data. Arguments
     * 
     * @param data
     *            , data to encode
     * @return
     */
    public static native String encodeHexToBinary(String data)/*-{
		return Ti.Codec.encodeHexToBinary(data);
    }-*/;

    /**
     * Encode some data into a hex binary String. String data will first be
     * converted to UTF-8 data. Arguments
     * 
     * @param data
     *            , data to encode
     * @return
     */
    public static native String encodeHexToBinary(Bytes data)/*-{
		return Ti.Codec.encodeHexToBinary(data);
    }-*/;

    /**
     * Asynchronously extract the contents of a zip file.
     * 
     * @param zipFile
     *            , The path of the zip file being extracted.
     * @param dest
     *            , A directory into which the files will be extracted.
     * @param callback
     *            , A function callback that receives destination directory when
     *            completed.
     * @return
     */

    public static native String extractZip(String root, String zipFile, ZipExtractStringDestinationHandler callback)/*-{
		return Ti.Codec
				.extractZip(
						root,
						zipFile,
						function(destination) {
							callback.@com.emitrom.ti4j.desktop.client.codec.ZipExtractStringDestinationHandler::onExtract(Ljava/lang/String;)(destination);
						});
    }-*/;

    /**
     * Asynchronously extract the contents of a zip file.
     * 
     * @param zipFile
     *            , The File object of the zip file being extracted.
     * @param dest
     *            , A directory into which the files will be extracted.
     * @param callback
     *            , A function callback that receives destination directory when
     *            completed.
     * @return
     */
    public static native String extractZip(File zipFile, File dest, ZipExtractFileDestinationHandler callback)/*-{
		return Ti.Codec
				.extractZip(
						root,
						zipFile,
						function(destination) {
							var f = @com.emitrom.ti4j.desktop.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(destination);
							callback.@com.emitrom.ti4j.desktop.client.codec.ZipExtractFileDestinationHandler::onExtract(Lcom/emitrom/ti4j/desktop/client/filesystem/File;)(f);
						});
    }-*/;

    private static native int ADLER32()/*-{
		return Ti.Codec.ADLER32();
    }-*/;

    private static native String CRC32()/*-{
		return Ti.Codec.CRC32();
    }-*/;

    private static native String MD2()/*-{
		return Ti.Codec.MD2();
    }-*/;

    private static native String MD4()/*-{
		return Ti.Codec.MD4();
    }-*/;

    private static native String MD5()/*-{
		return Ti.Codec.MD5();
    }-*/;

    private static native String SHA1()/*-{
		return Ti.Codec.SHA1();
    }-*/;

}
