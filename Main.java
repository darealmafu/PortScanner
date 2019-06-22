package zone.mafu;

import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ip:");
        String ip = sc.next();
        System.out.println("Scanning ports...");

        Socket soc;
        int portsOpen = 0;

        for(int i = 0; i < 65535; i++){
            try{
                soc = new Socket(ip, i);
                System.out.println("Port " + i + " is open on the device");
                portsOpen++;
            } catch (Exception e){
            }
        }

        if(portsOpen > 0) {
            System.out.println("All other ports are closed.");
        } else {
            System.out.println("No ports are open on the device.");
        }
    }
}
