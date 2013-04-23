/**************************************************************************
   MediaItemType.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing an entry in the ipod's music library.
 */
public class MediaItemType extends ProxyObject {

    public MediaItemType() {
        jsObj = JsoHelper.createObject();
    }

    public MediaItemType(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The type of the media. one of the 'MUSIC_MEDIA_TYPE_* constants
     *         on {@link com.emitrom.ti4j.mobile.client.media.Media}.
     */
    public native double getMediaType() /*-{
		var jso = jso.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.mediaType;
    }-*/;

    public native void setMediaType(double value) /*-{
		var jso = jso.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.mediaType = value;
    }-*/;

    /**
     * @return The title id3 tag contents.
     */
    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * @return The album title id3 tag contents.
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
     * @return The artist id3 tag contents.
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
     * @return The album artist id3 tag contents.
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
     * @return The genre id3 tag contents.
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
     * @return The composer id3 tag contents.
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
     * @return Whether or not the media is part of a compilation album.
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
     * @return The playback length.
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
     * @return The track number of the album.
     */
    public native double getAlbumTrackNumber() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.albumTrackNumber;
    }-*/;

    public native void setAlbumTrackNumber(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.albumTrackNumber = value;
    }-*/;

    /**
     * @return The total number of tracks on the album.
     */
    public native double getAlbumTrackCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.albumTrackCount;
    }-*/;

    public native void setAlbumTrackCount(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.albumTrackCount = value;
    }-*/;

    /**
     * @return The disc number of the album.
     */
    public native double getDiscNumber() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.discNumber;
    }-*/;

    public native void setDiscNumber(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.discNumber = value;
    }-*/;

    /**
     * @return The total number of discs comprising the album.
     */
    public native double getDiscCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.discCount;
    }-*/;

    public native void setDiscCount(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.discCount = value;
    }-*/;

    /**
     * @return The lyrics id3 tag contents.
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
     * @return The podcast title. only valid for media of type
     *         `music_media_type_podcast`.
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
     * @return The total number of plays.
     */
    public native double getPlayCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.playCount;
    }-*/;

    public native void setPlayCount(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.playCount = value;
    }-*/;

    /**
     * @return The total number of skips.
     */
    public native double getSkipCount() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.skipCount;
    }-*/;

    public native void setSkipCount(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.skipCount = value;
    }-*/;

    /**
     * @return The user rating.
     */
    public native double getRating() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.rating;
    }-*/;

    public native void setRating(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.rating = value;
    }-*/;

}
