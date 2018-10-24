package net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

/**
 * Created by Tommy on 2018/10/23.
 */
public class ClientInputStream implements Runnable{

    private Socket socket=null;

    public ClientInputStream(Socket socket){
        super();
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true){
                try {
                    String line= null;
                    line = br.readLine();
                    System.out.println(line);
                } catch (SocketException e) {
                    System.out.println("斷開連結");
                    break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
