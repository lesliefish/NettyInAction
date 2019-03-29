package com.lesliefish.nia.c01.echo;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

public class EchoServer {
    private int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public void startServer() {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try{

        }
    }
}
