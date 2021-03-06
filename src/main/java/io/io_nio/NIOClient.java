package io.io_nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NIOClient {

    public static void main(String[] args) {
        // 远程地址创建
        InetSocketAddress remote = new InetSocketAddress("localhost", 9999);
        SocketChannel channel = null;
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try {
            channel = SocketChannel.open();
            // 连接远程服务器。
            channel.connect(remote);

            Scanner reader = new Scanner(System.in);
            while (true) {
                System.out.print("put message for send to server > ");
                String line = reader.nextLine();
                if (line.equals("exit")) {
                    break;
                }

                buffer.put(line.getBytes(StandardCharsets.UTF_8));
                buffer.flip();
                channel.write(buffer);
                buffer.clear();

                // 读取服务器返回的数据
                int readLength = channel.read(buffer);
                if (readLength == -1) {
                    break;
                }
                buffer.flip();
                byte[] datas = new byte[buffer.remaining()];
                buffer.get(datas);
                System.out.println("from server : " + new String(datas, StandardCharsets.UTF_8));
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != channel) {
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
