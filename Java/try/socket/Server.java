import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;


public class Server{
	
	private static final int port=12345;
	
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket=new ServerSocket(port);
		while(true){
            Socket clientSocket=serverSocket.accept();
            Thread t=new Thread(new Chat(clientSocket));
            t.start();
        }
	}
	
}

class Chat implements Runnable{
	Socket socket;
	private String msg;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
	
	public Chat(Socket socket){
		try{
			this.socket=socket;
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	 public void run(){
            Boolean flag=true;
			while(flag){
				try {
					msg = dataInputStream.readUTF(); 
                    if(!msg.equals("end")){
                        System.out.println(socket.getInetAddress()+": "+msg);
                        dataOutputStream.writeUTF("Server has reveived :  "+msg);
                        dataOutputStream.flush();
                    }
                    else{
                        socket.close();
                        dataInputStream.close();
                        dataOutputStream.close();
                        flag=false;
                    }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
	 }
		
	
}