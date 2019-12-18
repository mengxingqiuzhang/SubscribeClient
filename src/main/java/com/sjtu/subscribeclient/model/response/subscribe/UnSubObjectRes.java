package com.sjtu.subscribeclient.model.response.subscribe;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class UnSubObjectRes extends BaseRes {

    private String id;

    public UnSubObjectRes(String status, String message, String id) {
        this.op = "UNSUB_OBJECT";
        this.status = status;
        this.message = message;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
