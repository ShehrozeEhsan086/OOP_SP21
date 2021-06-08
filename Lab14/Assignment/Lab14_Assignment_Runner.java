package lab14_assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab14_Assignment_Runner {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        int arrayListNum;
        boolean status = true;
        System.out.println("Welcome to HCL Bank.");
        while(status){
            System.out.println();
            System.out.print("MENU:\n[1] Add Data\n[2] Show Data\n[3] Deposit\n[4] Withdraw\n[5] Transfer\n[6] Balance Inquiry\n[0] Exit\nEnter your choice: ");
            int choice = userInput.nextInt();
            int accountNumber;
            double balance;
            double amount;
            switch (choice){
                case 1:
                    accounts.clear();
                    System.out.println("Enter account details for 10 accounts.");
                    for(int i=0;i<10;i++){
                        System.out.print("Enter Account Number: ");
                        accountNumber = userInput.nextInt();
                        System.out.print("Enter Account balance: ");
                        balance = userInput.nextDouble();
                        accounts.add(new Account(accountNumber,balance));
                    }
                    write(accounts);
                    break;
                case 2:
                    read(accounts);
                    break;
                case 3:
                    System.out.print("Enter account number you want to deposit money into: ");
                    accountNumber = userInput.nextInt();
                    arrayListNum = findAccount(accountNumber);
                    System.out.print("Enter the amount you want to deposit: ");
                    amount = userInput.nextDouble();
                    accounts.get(arrayListNum).deposit(amount);
                    write(accounts);
                    break;
                case 4:
                    System.out.print("Enter account number you want to withdraw from: ");
                    accountNumber = userInput.nextInt();
                    arrayListNum = findAccount(accountNumber);
                    System.out.print("Enter the amount you want to withdraw: ");
                    amount = userInput.nextDouble();
                    accounts.get(arrayListNum).withdraw(amount);
                    write(accounts);
                    break;
                case 5:
                    System.out.print("Enter the account number you want to transfer from: ");
                    int firstAccount = userInput.nextInt();
                    arrayListNum = findAccount(firstAccount);
                    System.out.print("Enter the account number you want to transfer to: ");
                    int secondAccount_ = userInput.nextInt();
                    int secondArrayListNum = findAccount(secondAccount_);
                    System.out.print("Enter the amount you want to transfer: ");
                    amount = userInput.nextDouble();
                    accounts.get(arrayListNum).transfer(amount,accounts.get(secondArrayListNum));
                    write(accounts);
                    break;
                case 6:
                    System.out.print("Enter account number: ");
                    accountNumber = userInput.nextInt();
                    arrayListNum = findAccount(accountNumber);
                    System.out.println("Account Balance: Rs:"+accounts.get(arrayListNum).balanceInquiry());
                    break;
                case 0:
                    status = false;
                    break;
            }
        }
    }

    public static void write(ArrayList<Account> accounts){
        ObjectOutputStream fileWriter = null;
        try{
            fileWriter = new ObjectOutputStream(new FileOutputStream("Account"));
            int i = 0;
            while(true){
                if(i==10){
                    break;
                }
                fileWriter.writeObject(accounts.get(i));
                i++;
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void read(ArrayList<Account> accounts){
        ObjectInputStream fileReader = null;
        try {
            fileReader = new ObjectInputStream(new FileInputStream("Account"));
            int i = 0;
            while (i<10) {
                Account accountRead = (Account) fileReader.readObject();
                System.out.println();
                System.out.println("Account Number: " + accountRead.getAccountNumber());
                System.out.println("Account Balance: Rs:" + accountRead.getBalance());
                accounts.add(accountRead);
                i++;
            }
        }catch (EOFException e){
            System.out.println("End of File.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int findAccount(int accountNumber){
        Account temp = null;
        ObjectInputStream fileReader = null;
        int i = 0;
        try{
            fileReader = new ObjectInputStream(new FileInputStream("Account"));

            while(true){
                Account accountRead = (Account) fileReader.readObject();
                if(accountRead.getAccountNumber()==accountNumber){
                    temp = accountRead;
                    break;
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }
}
