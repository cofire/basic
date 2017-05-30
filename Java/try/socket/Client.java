import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.OutputStreamWriter;

public class Client{
	static Socket server;
	public static void main(String[] args) throws UnknownHostException, IOException{
		server = new Socket("localhost",12345);
		DataInputStream dataInputStream = new DataInputStream(server.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
		BufferedReader wt=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("input: 'end' to stop");
        
		while(true){
			
			String string=wt.readLine();
			dataOutputStream.writeUTF(string);
            dataOutputStream.flush();
            
			if(string.equals("end")){
                server.close();
                dataInputStream.close();      
                dataOutputStream.close();
                break;
            }
            
            string=dataInputStream.readUTF();
            System.out.println(string);
            
		}
		server.close();
	}
	
}