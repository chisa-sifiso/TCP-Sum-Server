/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package severtcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket ss = new ServerSocket(8888);
        ss.getLocalPort();
        Socket s = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrinterWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
         
        String line = "";
        String data = "";
        while((line = br.readLine()) != null){ 
            data += line + "\n";
        }
        System.out.println(data);
        String[] strArray = data.split(" ");
        int sum = 0;
            sum = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1]);
            System.out.println(strArray);
 
        System.out.println("connected the client " + s.getLocalPort());
        bw.write(sum);
        bw.close();
        bw.flush();
        br.close();
        s.close();
        ss.close();

    }
}
