/*
* This is the source code of iGap for Android
* It is licensed under GNU AGPL v3.0
* You should have received a copy of the license in this archive (see LICENSE).
* Copyright © 2017 , iGap - www.iGap.net
* iGap Messenger | Free, Fast and Secure instant messaging application
* The idea of the RooyeKhat Media Company - www.RooyeKhat.co
* All rights reserved.
*/


package com.iGap.request;

import com.iGap.proto.ProtoClientGetRoom;

public class RequestClientGetRoom {

    public enum CreateRoomMode {

        requestFromServer,
        requestFromOwner,
        justInfo
    }

    public void clientGetRoom(long roomId, CreateRoomMode mode) {
        ProtoClientGetRoom.ClientGetRoom.Builder clientGetRoom = ProtoClientGetRoom.ClientGetRoom.newBuilder();
        clientGetRoom.setRoomId(roomId);

        String identity = "";

        if (mode != null) {
            identity = mode.toString();
        }

        RequestWrapper requestWrapper = new RequestWrapper(602, clientGetRoom, identity + "*" + roomId);
        try {
            RequestQueue.sendRequest(requestWrapper);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}