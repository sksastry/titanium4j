/**************************************************************************
   AclsEntity.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.acls;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;

/**
 * Represents an object used for Acls
 */
public class AclsEntity extends ProxyObject {

    public AclsEntity() {
        jsObj = JsoHelper.createObject();
    }

    public native void setName(String value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.name = value;
    }-*/;

    public native void setId(String value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.id = value;
    }-*/;

    public native void setReaderIds(String value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.reader_ids = value;
    }-*/;

    public native void setWriterIds(String value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.writer_ids = value;
    }-*/;

    public native void setUserId(String value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.user_id = value;
    }-*/;

    public native void setPublicRead(boolean value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.public_read = value;
    }-*/;

    public native void setPublicWrite(boolean value)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.public_write = value;
    }-*/;
}
