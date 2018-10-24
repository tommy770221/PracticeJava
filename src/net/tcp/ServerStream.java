package net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Tommy on 2018/10/23.
 */
public class ServerStream implements Runnable {

    private Socket socket=null;
    private int number;

    public ServerStream(Socket socket, int number){
        this.socket=socket;
        this.number=number;
    }

    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw =new PrintWriter(socket.getOutputStream(),true);
            while(true){
               String line=br.readLine();
               System.out.println("客戶端 :" +number +" "+line);
               pw.println(line.toUpperCase());
               if("bye".equals(line)){
                   System.out.println("客戶端 :" +number +"已斷開連接!");
                   break;
               }
            }
            br.close();
            pw.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
