package com.lesliefish.nia.c02.echo;

public class EchoTester {
    public static void test() throws Exception {
        try {
            // 子线程里执行客户端程序
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(2000); // 等2秒 为了确保服务器开启
                        for (int i = 0; i < 10; ++i) {
                            // 每次循环创建一个客户端和服务器交互
                            new EchoClient("127.0.0.1", 8888).start();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            // 启动服务器
            new EchoServer(8888).startServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
