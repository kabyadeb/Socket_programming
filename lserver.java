import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.text.SimpleDateFormat;

public class lserver {
    public static void main(String[] args) throws Exception{
        try {
            ServerSocket serverSocket=new ServerSocket(7000);
            Socket ss=serverSocket.accept();
            System.out.println("Client connected");
            DataInputStream dataInputStream = new DataInputStream(ss.getInputStream());
            DataOutputStream dataOutputStream=new DataOutputStream(ss.getOutputStream());
            while(true)
            {
                String message = dataInputStream.readUTF();
                System.out.println("clint:"+message);
                if(message.equals("hi"))
                {
                    dataOutputStream.writeUTF("hello");
                    dataOutputStream.flush();
                }
                else if (message.equals("time"))
                {
                    String time = gettime();
                    dataOutputStream.writeUTF(time);
                    dataOutputStream.flush();
                }
                else if (message.equals("ok"))
                {
                    dataOutputStream.writeUTF("bye");
                    dataOutputStream.flush();
                    break;
                }
                else {
                    dataOutputStream.writeUTF("Unknown command");
                    dataOutputStream.flush();
                }
            }


        }
        catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }

    }
    private static String gettime(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return simpleDateFormat.format(date);
    }
}
