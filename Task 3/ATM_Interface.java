

import java.util.HashMap;
import java.util.Scanner;

public class ATM_Interface {
    public static void main(String[] args) {
        ATM obj = new ATM();
    }    
}


class Data{
    float balance;
}


class ATM{
    float balance;
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Data> map = new HashMap<>();

    ATM(){
        System.out.println("------------------------------------------------------");
        System.out.println("Welcome To The ATM");
        another();
    }

    public void another(){
     System.out.println("------------------------------------------------------1255");
     System.out.println("Enter Your Pincode :-");   
     int pincode = sc.nextInt();

     if(map.containsKey(pincode) == true){
        Data obj = map.get(pincode);
        menu(obj);
     }
     else{
        System.out.println("------------------------------------------------------");
        System.out.println("Please Create Account First");
        System.out.println("Set Your Pincode:");
        int pin = sc.nextInt();
        Data obj = new Data();
        map.put(pin, obj);
        menu(obj);
     }


    }

    public void menu(Data obj){
        
        System.out.println("------------------------------------------------------");
        System.out.println("Please Enter A Valid Number :--");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Another Account");
        System.out.println("5. Exit");

        int x = sc.nextInt();

        if(x == 1){
            check_balance(obj);
        }
        else if(x == 2){
            deposit(obj);
        }
        else if(x == 3){
            withdraw(obj);
        }
        else if(x == 4){
            another();
        }
        else if(x == 5){
            System.out.println("------------------------------------------------------");
            System.out.println("Thank You !!!");
        }
        else{
            System.out.println("------------------------------------------------------");
            System.out.println("Invalid Input !!!");
            menu(obj);
        }
    }

    public void check_balance(Data obj){
            System.out.println("------------------------------------------------------");
            System.out.println("Your Balance : " + obj.balance);
            System.out.println("------------------------------------------------------");
            menu(obj);
    }

    public void deposit(Data obj){
        System.out.print("Enter Your Amount :- ");

        float a = sc.nextFloat();
        obj.balance = obj.balance + a;
        System.out.println("------------------------------------------------------");
        System.out.println("Amount Deposited Successfully");
        System.out.println("------------------------------------------------------");
        menu(obj);
    }

    public void withdraw(Data obj){
        System.out.print("Enter Amount To Withdraw :-");

        float a = sc.nextFloat();
        obj.balance = obj.balance - a;
        System.out.println("------------------------------------------------------");

        System.out.println("Amount Deducted Successfully");
        System.out.println("------------------------------------------------------");
        menu(obj);
    }

    

    




}