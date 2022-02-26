class Bank
{
  int amount=500;
  synchronized void withdraw(int amount)
     {  
         
         if(this.amount<amount)
            {
              
              try
                {
                  wait();
                }
              catch(Exception e)
                 {
                   System.out.println(e);
                 }
             }
          this.amount-=amount;
          
          if(this.amount>amount)
            {
              System.out.println("Withdraw completed");
              System.out.println("Balance amount:"+this.amount);
              
            }
            else
            {
              System.out.println("Low balance");
              System.out.println("Not able to withdraw");
              
            }
     }
              
     void deposit(int amount)
     {
     synchronized(this)
       {
         
         this.amount+=amount;
         System.out.println("Deposit completed..");
         System.out.println("Balance amount:"+this.amount);
         notify();
       }
 }
class Deposit extends Thread
{
  Bank b;
  Deposit(Bank b)
    {
      this.b=b;
    }
  public void run()
    {
       b.Deposit(10000);
    }
}
class Withdraw extends Thread
{
  Bank b;
  Withdraw(Bank b)
    {
      this.b=b;
    }
  public void run()
    {
       b.Withdraw(15000);
    }

}
class Bankdetails
{
 public static void main(String args[])
  {
    Bank b= new Bank();
    Deposit d=new Deposit();
    Withdraw w=new Withdraw();
    d.start();
    w.start();
  }
}
}
