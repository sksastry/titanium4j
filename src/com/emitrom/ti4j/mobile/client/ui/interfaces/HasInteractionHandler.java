/************************************************************************
  HasInteractionHandler.java is part of Ti4j 3.1.0  Copyright 2013 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.interfaces;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.BlurHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.ClickHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.DoubleClickHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.DoubleTapHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.FocusHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.LongClickHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.LongPressHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.SingleTapHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.SwipeHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchEndHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchMoveHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchStartHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TwoFingerTapHandler;

public interface HasInteractionHandler {

    public CallbackRegistration addClickHandler(ClickHandler handler) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.ClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.ClickHandler::onClick(Lcom/emitrom/ti4j/mobile/client/core/events/ui/DashboardItemClickEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.ClickEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addDoubleClickHandler(DoubleClickHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.DoubleClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.DoubleClickHandler::onDoubleClick(Lcom/emitrom/ti4j/mobile/client/core/events/ui/DoubleClickEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.DoubleClickEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addDoubleTapHandler(DoubleTapHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.DoubleTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.DoubleTapHandler::onDoubleTap(Lcom/emitrom/ti4j/mobile/client/core/events/ui/DoubleTapEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.DoubleTapEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addLongClickHandler(LongClickHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.LongClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.LongClickHandler::onLongClick(Lcom/emitrom/ti4j/mobile/client/core/events/ui/LongClickEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.LongClickEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addLongPressHandler(LongPressHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.LongPressEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.LongPressHandler::onLongPress(Lcom/emitrom/ti4j/mobile/client/core/events/ui/LongPressEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.LongPressEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;


    public CallbackRegistration addSingleTapHandler(SingleTapHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.SingleTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.SingleTapHandler::onSingleTap(Lcom/emitrom/ti4j/mobile/client/core/events/ui/SingleTapEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.SingleTapEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addSwipeHandler(SwipeHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.SwipeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.SwipeHandler::onSwipe(Lcom/emitrom/ti4j/mobile/client/core/events/ui/SwipeEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.SwipeEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addTouchCancelHandler(InteractionHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchCancelEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchCancelHandler::onCancel(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TouchCancelEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchCancelEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
	}-*/;


    public CallbackRegistration addTouchEndHandler(TouchEndHandler handler) /*-{
			var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
			var listener = function(e) {
								var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchEndEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
								handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchEndHandler::onTouchEnd(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TouchEndEvent;)(eventObject);
							};
			var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchEndEvent::EVENT_NAME;
			var v = jso
					.addEventListener(
							name,
							listener);
			var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
			return toReturn;
							
		}-*/;

    public CallbackRegistration addTouchMoveHandler(TouchMoveHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchMoveEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchMoveHandler::onTouchMove(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TouchMoveEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchMoveEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addTouchStartHandler(TouchStartHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchStartEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchStartHandler::onTouchStart(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TouchStartEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchStartEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addTwoFingerTapHandler(TwoFingerTapHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TwoFingerTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TwoFingerTapHandler::onTwoFingerTap(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TwoFingerTapEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TwoFingerTapEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addFocusHandler(FocusHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.FocusEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.FocusHandler::onFocus(Lcom/emitrom/ti4j/mobile/client/core/events/ui/FocusEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.FocusEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
    }-*/;
    
    public CallbackRegistration addBlurHandler(BlurHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.BlurEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.BlurHandler::onBlur(Lcom/emitrom/ti4j/mobile/client/core/events/ui/BlurEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.BlurEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
    }-*/;

}