/**************************************************************************
   Checkin.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.checkins;

import com.emitrom.ti4j.mobile.client.cloud.core.AbstractCloudObject;
import com.emitrom.ti4j.core.client.JsoHelper;

public class Checkin extends AbstractCloudObject {

    public Checkin() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Id of the place to checkin to
     * 
     */
    public native void setPlaceId(String value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.place_id = value;
    }-*/;

    /**
     * event to checkin to
     * 
     */
    public native void setEventId(String value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.event_id = value;
    }-*/;

    /**
     * comma separated tags, e.g. hiking,swimming
     * 
     * @param value
     */
    public native void setTags(String value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.tags = value;
    }-*/;

    /**
     * event to checkin to
     * 
     */
    public native void setCheckinId(String value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.checkin_id = value;
    }-*/;

}
