package com.emitrom.ti4j.mobile.client.ui;

/**
 * A set of constants for the styles available for Titanium.UI.ActivityIndicator
 * objects.
 * 
 */
public class ActivityIndicatorStyle {

    public static final int ACTIVITY_INDICATOR_STYLE_BIG = BIG();
    public static final int ACTIVITY_INDICATOR_STYLE_BIG_DARK = BIG_DARK();
    public static final int ACTIVITY_INDICATOR_STYLE_DARK = DARK();
    public static final int ACTIVITY_INDICATOR_STYLE_PLAIN = PLAIN();

    public static native final int BIG() /*-{
		return Ti.UI.ActivityIndicatorStyle.BIG ? Ti.UI.ActivityIndicatorStyle.BIG
				: 0;
    }-*/;

    public static native final int BIG_DARK() /*-{
		return Ti.UI.ActivityIndicatorStyle.BIG_DARK ? Ti.UI.ActivityIndicatorStyle.BIG_DARK
				: 0;
    }-*/;

    public static native final int DARK() /*-{
		return Ti.UI.ActivityIndicatorStyle.DARK ? Ti.UI.ActivityIndicatorStyle.DARK
				: 0;
    }-*/;

    public static native final int PLAIN() /*-{
		return Ti.UI.ActivityIndicatorStyle.PLAIN ? Ti.UI.ActivityIndicatorStyle.PLAIN
				: 0;
    }-*/;

}
