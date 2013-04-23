package com.emitrom.ti4j.mobile.client.network;

public interface PushNotificationCallback {
    public void onReceived(PushNotificationData data);

    public void onError(PushNotificationError error);

    public void onSuccess(PushNotificationSuccess success);
}
