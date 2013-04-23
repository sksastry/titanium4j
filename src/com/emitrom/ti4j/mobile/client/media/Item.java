/**************************************************************************
   Item.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client.media;

import com.emitrom.ti4j.mobile.client.blob.Blob;
import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A representation of a media item returned by the music picker as part of the
 * 'items' array in the dictionary passed to its `'success' function.
 * 
 * Available on iOs only.
 */
public class Item extends EventDispatcher {

    protected Item() {
    }

    private Item(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The artist for the album of the item
     */
    public native String getAlbumArtist() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.albumArtist;
    }-*/;

    public native void setAlbumArtist(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.albumArtist = value;
    }-*/;

    /**
     * @return The album title of the item
     */
    public native String getAlbumTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.albumTitle;
    }-*/;

    public native void setAlbumTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.albumTitle = value;
    }-*/;

    /**
     * @return The number of tracks for the album of the item
     */
    public native int getAlbumTrackCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.albumTrackCount;
    }-*/;

    public native void setAlbumTrackCount(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.albumTrackCount = value;
    }-*/;

    /**
     * @return The track number of the item
     */
    public native int getAlbumTrackNumber() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.albumTrackNumber;
    }-*/;

    public native void setAlbumTrackNumber(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.albumTrackNumber = value;
    }-*/;

    /**
     * @return The artist of the item
     */
    public native String getArtist() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.artist;
    }-*/;

    public native void setArtist(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.artist = value;
    }-*/;

    /**
     * @return A blob object containing the image for the item's artwork, or
     *         null if none
     */
    public native Blob getArtwork() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.artwork;
		var toReturn = @com.emitrom.ti4j.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setArtwork(Blob value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.artwork = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The composer of the item
     */
    public native String getComposer() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.composer;
    }-*/;

    public native void setComposer(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.composer = value;
    }-*/;

    /**
     * @return The total number of discs of the item
     */
    public native int getDiscCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.discCount;
    }-*/;

    public native void setDiscCount(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.discCount = value;
    }-*/;

    /**
     * @return The disc number of the item
     */
    public native int getDiscNumber() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.discNumber;
    }-*/;

    public native void setDiscNumber(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.discNumber = value;
    }-*/;

    /**
     * @return The genre of the item
     */
    public native String getGenre() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.genre;
    }-*/;

    public native void setGenre(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.genre = value;
    }-*/;

    /**
     * @return True if the item is part of a compilation album
     */
    public native boolean isCompilation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.isCompilation;
    }-*/;

    public native void setIsCompilation(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.isCompilation = value;
    }-*/;

    /**
     * @return The lyrics of the item
     */
    public native String getLyrics() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.lyrics;
    }-*/;

    public native void setLyrics(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.lyrics = value;
    }-*/;

    /**
     * @return The type of the item
     */
    public native int getMediaType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.mediaType;
    }-*/;

    public native void setMediaType(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.mediaType = value;
    }-*/;

    /**
     * @return The number of times the item has been played
     */
    public native int getPlayCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.playCount;
    }-*/;

    public native void setPlayCount(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.playCount = value;
    }-*/;

    /**
     * @return The length (in seconds) of the item
     */
    public native double getPlaybackDuration() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.playbackDuration;
    }-*/;

    public native void setPlaybackDuration(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.playbackDuration = value;
    }-*/;

    /**
     * @return The title of a podcast item.
     */
    public native String getPodcastTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.podcastTitle;
    }-*/;

    public native void setPodcastTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.podcastTitle = value;
    }-*/;

    /**
     * @return The rating of the item
     */
    public native int getRating() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.rating;
    }-*/;

    public native void setRating(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.rating = value;
    }-*/;

    /**
     * @return The number of times the item has been skipped
     */
    public native int getSkipCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.skipCount;
    }-*/;

    public native void setSkipCount(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.skipCount = value;
    }-*/;

    /**
     * @return The title of the item
     */
    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;
}
