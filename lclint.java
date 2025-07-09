import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class lclint {
    public static void main(String[] args) {
        try {
            Socket ss=new Socket("localhost",7000);
            DataOutputStream dataOutputStream=new DataOutputStream(ss.getOutputStream());
            DataInputStream dataInputStream =new DataInputStream(ss.getInputStream());
            Scanner scanner =new Scanner(System.in);
            while (true)
            {

                String message =scanner.nextLine();
                dataOutputStream.writeUTF(message);
                dataOutputStream.flush();
                String server=dataInputStream.readUTF();
                System.out.println("server:"+server);
                if(message.equals("ok"))
                {
                    break;
                }

            }scanner.close();
            dataOutputStream.close();
            dataInputStream.close();
            ss.close();
        }
        catch (Exception e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
}
