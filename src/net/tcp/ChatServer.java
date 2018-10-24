package net.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Tommy on 2018/10/23.
 */
public class ChatServer {

    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(8888);
        int number=1;

        while(true){
            Socket socket1=socket.accept();
            System.out.println("客戶端 : "+number+" 連接成功!");
            new Thread(new ServerStream(socket1,number)).start();
            number++;
        }



    }


}
