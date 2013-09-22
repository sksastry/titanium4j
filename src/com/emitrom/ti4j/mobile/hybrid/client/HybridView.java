package com.emitrom.ti4j.mobile.hybrid.client;

import com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.UIEventHandler;
import com.emitrom.ti4j.mobile.client.ui.WebView;
import com.emitrom.ti4j.mobile.client.ui.Window;

public class HybridView {

    private static HybridView INSTANCE;
    private WebView view;

    private static HybridView _get() {
        if (INSTANCE == null) {
            INSTANCE = new HybridView();
        }
        return INSTANCE;
    }

    public static HybridView getDefault() {
        return _get().setHostPage("index.html");
    }

    public static HybridView get(String url) {
        return _get().setHostPage(url);
    }

    private HybridView() {
        view = new WebView();
    }

    private HybridView setHostPage(String url) {
        assert url != null;
        view.setUrl(url);
        return this;
    }

    public HybridView setContainer(final Window parent) {
        assert parent != null;
        parent.addOpenHandler(new UIEventHandler() {
            @Override
            public void onEvent(UIEvent event) {
                parent.add(view);
            }
        });
        return this;
    }
}
