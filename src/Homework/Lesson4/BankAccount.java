package Homework.Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieSceta (double suma){
        balance+=suma;
        return balance;
    }
    double snyatieSoSceta (double suma){
        balance-=suma;
        return balance;
    }

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        MyAccount.id = 1;
        MyAccount.name = "Vladimir";
        MyAccount.balance = 147000.56;
        YourAccount.id = 2;
        YourAccount.name = "Elena";
        YourAccount.balance = 103456.78;
        HisAccount.id = 3;
        HisAccount.name = "Leks";
        HisAccount.balance = 1.01;
        System.out.println(MyAccount.balance);


        MyAccount.balance = MyAccount.popolnenieSceta(300000);
        System.out.println(MyAccount.balance);
        YourAccount.balance = YourAccount.snyatieSoSceta(15000);
        System.out.println(YourAccount.balance);





    }

}
