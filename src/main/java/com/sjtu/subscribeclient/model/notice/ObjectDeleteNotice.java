package com.sjtu.subscribeclient.model.notice;

public class ObjectDeleteNotice extends BaseNotice {
    private String id;

    public ObjectDeleteNotice(String message, String id, String subType) {
        this.op = "OBJECT_DELETE_NOTICE";
        this.message = message;
        this.id = id;
        this.subType = subType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
