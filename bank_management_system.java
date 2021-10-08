import java.util.*;
import java.io.*;

public class bank_management_system {
    static String pass = " ";

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the User");
        String nm = in.nextLine();
        char ch = ' ';
        try {
            FileReader fr = new FileReader(nm);
            read(nm);
        } catch (Exception e) {
            System.out.println("Username does not exist. Do you want to create one? (y/n)");
            ch = in.next().charAt(0);
        }
        if (ch == 'y') {
            File mf = new File(nm);
            mf.createNewFile();
            create(nm);
        } else if (ch == 'n') {
            System.out.println("Account not created. Program exits");
            System.exit(0);
        }

    }

    public static void read(String nm) throws IOException {
        FileWriter fw = new FileWriter(nm);//TO write in main file
        FileWriter fwf = new FileWriter(nm + "pass");//To write in password file
        FileReader fr = new FileReader(nm);//To read the main file
        Scanner in = new Scanner(fr);//Scanner object to read main file
        Scanner ob = new Scanner(System.in);//Scanner object to take input
        FileReader frp = new FileReader(nm + "pass");//To read password file
        Scanner inp = new Scanner(frp);//Scanner object to read password file
        File f = new File(nm);
        File fp=new File(nm+"pass");
        String p = inp.next();
        int ch = 0;
        System.out.println("Enter Password");
        String pword;
        double bal = 0.0;
        for (int i = 1; i > 0; i++) {
            pword = ob.nextLine();
            if (p.equals(pword)) {
                System.out.println(
                        "Access Granted. What would you like to do?\nCheck Balance(1)\nWithdraw Money(2)\nChange Password(3)\nDelete Account(4)");
                try {
                    ch = in.nextInt();
                } catch (Exception e) {
                    System.out.println("Please enter a valid choice!");
                }
                break;
            } else
                System.out.println("Password incorrect. Please try again");
        }
        bal = Double.valueOf(in.nextLine());
        switch (ch) {
            case 1:
                System.out.println("Your account balance is" + bal);
                break;
            case 2:

                if (bal < 5000) {
                    System.out.println("Sorry, your balance is less than 5000 Rs. You cannot withdraw money.");
                } else {
                    System.out.println("Enter amount to be withdrawn");
                    double amt = ob.nextInt();
                    if (bal < amt)
                        System.out.println("Sorry, your account does not have that much money");
                    else {
                        bal = bal - amt;
                        System.out.println("Money Withdrawn\nCurrent balance is Rs " + bal);
                        fw.write(Double.toString(bal));
                    }
                }
                break;
            case 3:
                System.out.println("Please enter your password to confirm");
                for (int i = 1; i > 0; i++) {
                    pword = ob.nextLine();
                    if (p.equals(pword)) {
                        System.out.println("Password confirmed. Enter new Password");
                        pword = ob.nextLine();
                        System.out.println("Saving new password. Please wait.....");
                        fwf.write(pword);
                        System.out.println("Password successfully changed.");
                        break;
                    } else {
                        System.out.println("Password incorrect. Please try again");
                    }
                }
                break;
                case 4:
                System.out.println("Please enter your password to confirm");
                for (int i = 1; i > 0; i++) {
                    pword = ob.nextLine();
                    if (p.equals(pword)) {
                        System.out.println("Are you sure you want to delete your account. All the data will be permanently deleted and you will not be able to recover it again! (y/n)");
                        char choice=ob.nextLine().charAt(0);
                        if(choice=='y')
                        {
                             f.delete();
                            System.out.println("Account successfully deleted.");
                        }

                        break;
                    } else {
                        System.out.println("Password incorrect. Please try again");
                    }
                }

        }
        frp.close();
        fr.close();
        fw.close();
        fwf.close();
        in.close();
        ob.close();
        inp.close();
    }

    public static void create(String nm) throws IOException {
        Scanner in = new Scanner(System.in);
        String name = nm + "pass";
        File mf = new File(name);
        mf.createNewFile();
        System.out.println("Enter password");
        pass = in.next();
        FileWriter frp = new FileWriter(name);
        // BufferedWriter br = new BufferedWriter(fr);
        // PrintWriter pw = new PrintWriter(br);
        System.out.println("Confirm your password");
        String cnfrm = in.nextLine();
        for (int i = 1; i > 0; i++) {
            cnfrm = in.nextLine();
            if (cnfrm.equals(pass)) {
                frp.write(pass);
                break;
            } else
                System.out.println("Try again");
        }
        FileWriter fr = new FileWriter(nm);
        fr.write("0.0");
        frp.close();
        System.out.println("Account has been created. Redirecting to the home page...........");
        main(null);
    }
}