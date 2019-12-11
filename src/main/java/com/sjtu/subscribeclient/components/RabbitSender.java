package com.sjtu.subscribeclient.components;

import com.sjtu.subscribeclient.common.Constants;
import com.sjtu.subscribeclient.User;

import java.io.IOException;

public class RabbitSender {
    public static void sendObjRequest(String msg) throws IOException {
        RabbitConnection.channel.basicPublish(Constants.SEND_EXCHANGE ,Constants.OBJECT_KEY, null, msg.getBytes("utf-8"));
    }

    public static void sendSubRequest(String msg) throws IOException {
        RabbitConnection.channel.basicPublish(Constants.SEND_EXCHANGE, Constants.SUBSCRIBE_KEY, null, msg.getBytes("utf-8"));
    }
}
