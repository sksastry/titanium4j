package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;


public class OpenWindowParams extends ProxyObject {
	
	public OpenWindowParams() {
		jsObj = JavaScriptObject.createObject();
	}
	
	/**
	 * Unset the activity enter animation value
	 */
	public native final void setActivityEnterAnimation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.activityEnterAnimation = false;
	}-*/;
	
	/** 
	 * Android only
	 * Set the activity enter animation value to a number based on a anim.R file 
	 * @param val	Enter animation resource id
	 */
	public native final void setActivityEnterAnimation(int val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.activityEnterAnimation = val;
	}-*/;
	
	
	/**
	 * Android only
	 * Set the activity enter animation, based on a text lookup on the Android.R.anim object
	 * Refer to com.emitrom.ti4j.mobile.client.ui.android.Android for strings
	 * @param val
	 */
	public native final void setActivityEnterAnimation(String val) /*-{
		this.@com.emitrom.ti4j.mobile.client.ui.OpenWindowParams::setActivityEnterAnimation(Ljava/lang/String;Z)(val,true);
	}-*/;
	

	public native final void setActivityEnterAnimation(String val, boolean system) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var anim;
		if (system) {
			anim = Titanium.Android.R.anim[system];
		} else {
			anim = Titanium.App.Android.R.anim[system];
		}
		jso.activityEnterAnimation = anim;
	}-*/;
	
	/**
	 * Unset the activity enter animation value
	 */
	public native final void setActivityExitAnimation() /*-{
		this.@com.emitrom.ti4j.mobile.client.ui.OpenWindowParams::setActivityExitAnimation(Ljava/lang/String;Z)(val,true);
	}-*/;


	public native final void setActivityExitAnimation(String val, boolean system) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var anim;
		if (system) {
			anim = Titanium.Android.R.anim[system];
		} else {
			anim = Titanium.App.Android.R.anim[system];
		}
		jso.activityEnterAnimation = anim;
	}-*/;

	/** 
	 * Android only
	 * Set the activity enter animation value to a number based on a anim.R file 
	 * @param val	Enter animation resource id
	 */
	public native final void setActivityExitAnimation(int val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.activityExitAnimation = val;
	}-*/;

	/**
	 * Android only
	 * Set the activity exit animation, based on a text lookup on the Android.R.anim object
	 * Refer to com.emitrom.ti4j.mobile.client.ui.android.Android for strings
	 * @param val
	 */
	public native final void setActivityExitAnimation(String val) /*-{
		var r = @com.emitrom.ti4j.mobile.client.android.R::get();
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.activityExitAnimation = r.@com.emitrom.ti4j.mobile.client.android.R::getAnim(Ljava/lang/String;)(val);
	}-*/;
	
	
	public native final void setAnimated(boolean val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.animated = true;
	}-*/; 
	
	public native final void setBottom() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.bottom;
	}-*/;
	
	public native final void setBottom(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.bottom = val;
	}-*/;
	
	public native final void setFullscreen() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.fullscreen;
	}-*/;
	
	public native final void setFullscreen(boolean val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.fullscreen = val;
	}-*/;
	
	public native final void setHeight() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.height;
	}-*/;
	
	public native final void setHeight(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.height = val;
	}-*/;
	
	public native final void setHeight(String val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.height = val;
	}-*/;
	
	public native final void setLeft() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.left;
	}-*/;
	
	public native final void setLeft(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.left = val;
	}-*/;
	
	public native final void setLeft(String val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.left = val;
	}-*/;
	
	public native final void setModal() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.modal;
	}-*/;
	
	public native final void setModal(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.modal = val;
	}-*/;
	
	public native final void setModal(String val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.modal = val;
	}-*/;
	
	public native final void setModalStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.modalStyle;
	}-*/;
	
	public native final void setModalStyle(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.modalStyle = val;
	}-*/;
	
	public native final void setModalTransitionStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.modalTransitionStyle;
	}-*/;
	
	public native final void setModalTransitionStyle(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.modalTransitionStyle = val;
	}-*/;
	
	public native final void setNavBarHidden() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.navBarHidden;
	}-*/;
	
	public native final void setNavBarHidden(boolean val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.navBarHidden = val;
	}-*/; 
	
	public native final void setRight() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.right;
	}-*/;
	
	public native final void setRight(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.right = val;
	}-*/;
	
	public native final void setRight(String val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.right = val;
	}-*/;
	
	public native final void setTop() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.top;
	}-*/;
	
	public native final void setTop(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.top = val;
	}-*/;
	
	public native final void setTop(String val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.top = val;
	}-*/;
	
	public native final void setTransition() /*-{
		delete this.transition;
	}-*/;
	
	public native final void setTransition(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.transition = val;
	}-*/;
	
	public native final void setWidth() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		delete jso.width;
	}-*/;
	
	public native final void setWidth(double val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.width = val;
	}-*/;
	
	public native final void setWidth(String val) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.width = val;
	}-*/;

}
