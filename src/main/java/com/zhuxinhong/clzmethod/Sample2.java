package com.zhuxinhong.clzmethod;

/**
 * Created by zhuxh on 17/1/23.
 */
public class Sample2 {

    public static void main(String[] args) {
        Server s = new SimpleServer(1000);
    }
}

abstract class Server {

    public static final int DEFAULT_PORT = 40000;

    public Server() {
        int port = getPort();
        System.out.println("端口号:" + port);
    }

    protected abstract int getPort();
}

class SimpleServer extends Server {

    private int port = 100;

    public SimpleServer(int _port) {
        port = _port;
    }

    @Override
    protected int getPort() {
        return Math.random() > 0.5 ? port : DEFAULT_PORT;
    }
}