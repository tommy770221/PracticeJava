package net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Tommy on 2018/10/23.
 */
public class TCPServer {

    public static void main(String[] args) throws IOException{

        ServerSocket serverSocket=new ServerSocket(8888);

        Socket socket=serverSocket.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line=null;
        while ((line=br.readLine())!=null){
            if("over".equals(line)){
                break;
            }
            System.out.println(line);
            bw.write(line.toUpperCase());
            bw.flush();
        }

        bw.close();
        br.close();

    }
}
