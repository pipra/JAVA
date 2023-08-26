package Chapter_8;

public class CashRegisterTester {
        public static void main (String[] args)
        {
            final Coin DOLLAR = new Coin(93.85, "Dollar");
            final Coin QUARTER = new Coin(.25, "Quarter");
            final Coin DIME = new Coin(0.10, "Dime");
            final Coin NICKEL = new Coin(0.05, "Nickel");
            final Coin PENNY = new Coin(0.01, "Penny");

            CashRegister register = new CashRegister();

            register.recordPurchase(200);
            register.recordPurchase(195);
            register.recordPurchase(1095);
            register.recordPurchase(870);

            register.recievePayment(100, DOLLAR);
            register.recievePayment(80, QUARTER);
            register.recievePayment(150, DIME);
            register.recievePayment(100, NICKEL);
            register.recievePayment(400, PENNY);

            double change = register.giveChange();

            System.out.printf("Change: %.2f\n", change);
            System.out.println("Expected Change: 0.61");
        }
}
