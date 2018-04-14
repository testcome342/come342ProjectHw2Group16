package Agate;
import Agate.Client;
import Agate.Campaign;
import java.util.*;

public class test {


    public static void main(String[] args) {
        System.out.println("1) Add a new client");
        System.out.println("2) Add a new campaign");
        System.out.println("5) Assign staff to work on a campaign");
        System.out.println("8) Create concept note");
        System.out.println("12) Add a new member of staff");
        System.out.print("Enter your choice :");
        Scanner input = new Scanner(System.in);
        int tercih = input.nextInt();
        switch(tercih) {
            case 1:
                Client a = new Client();
                a.CreateClient();
            break;
            
            default:
                System.out.println("Your choice not correct");
            break;
        }
    }   

       
       
}