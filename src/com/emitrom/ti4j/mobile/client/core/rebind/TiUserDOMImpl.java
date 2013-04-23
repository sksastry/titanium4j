/**************************************************************************
   TiUserDOMImpl.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.core.rebind;

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.impl.DOMImpl;

public class TiUserDOMImpl extends DOMImpl {

  @Override
  public Element eventGetFromElement(Event evt) {
    return null;
  }

  @Override
  public Element eventGetToElement(Event evt) {
    return null;
  }

  @Override
  public Element getChild(Element elem, int index) {
    return null;
  }

  @Override
  public int getChildCount(Element elem) {
    return 0;
  }

  @Override
  public int getChildIndex(Element parent, Element child) {
    return 0;
  }

  @Override
  public void insertChild(Element parent, Element child, int index) {
  }

  @Override
  public void releaseCapture(Element elem) {
  }

  @Override
  public void setCapture(Element elem) {
  }

  @Override
  public void sinkBitlessEvent(Element elem, String eventTypeName) {
  }

  @Override
  public void sinkEvents(Element elem, int eventBits) {
  }

  @Override
  protected void initEventSystem() {
  }

}
