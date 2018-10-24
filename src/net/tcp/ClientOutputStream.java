package net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Tommy on 2018/10/23.
 */
public class ClientOutputStream implements Runnable {

    private Socket socket=null;

    public ClientOutputStream(Socket socket){
            super();
            this.socket=socket;
    }
    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
            while(true){
                System.out.println(Thread.currentThread().getName()+" is start");
                String line = br.readLine();
                pw.println(line);
                if("bye".equals(line)){
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
