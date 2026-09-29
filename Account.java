public class Account {
    public int balance;
    public Account(){

        balance=15000;
    }
    public Account(int b){

        balance=b;
    }
    public int withdraw(int w){
        return (balance-w);

    }
    public int deposit(int d){
        return (balance+d);

    }
    public static void main(String []args){
        Account a1=new Account();
        System.out.println(a1.withdraw(3000));
        System.out.println(a1.deposit(5000));
        Account a2=new Account(20000);
        System.out.println(a2.withdraw(2500));
        System.out.println(a2.deposit(4000));
    }
}

