package com.sjtu.subscribeclient;

public class SubscribeClient {

    public static void main(String[] args) {
        String host = "localhost";
        int port = 5672;
        String username = "guest";
        String password = "guest";

        User user = new User("test0000", "testSJTU", "test user");

        // System.out.println(rabbitConnection.getConnectMsg());

        Rabbit.connect(host, port, username, password);

        // Rabbit.sendMsg("1234", user);
        // Rabbit.sendMsg("5678", user);
        //System.out.println(Rabbit.getOneMsg(user));

        Rabbit.close();

    }
}
