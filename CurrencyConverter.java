public class CurrencyConverter {
    //currencies value to naira
    int Dollar = 415;
    int Euro = 458;
    int Pound = 546;
    int CanadianDollar = 328;
    int Rand = 27;
    int Cedi = 56;
    int Yuan = 65;
    int Rupee = 5;
    int Yen = 3;
    int Riyal = 110;
    int Dinar = 1362;
    int Dirham = 112;

    public void printCurrencies() {
        System.out.println("Dollar: " + Dollar);
        System.out.println("Euro: " + Euro);
        System.out.println("Pound: " + Pound);
        System.out.println("CanadianDollar: " + CanadianDollar);
        System.out.println("Rand: " + Rand);
        System.out.println("Cedi: " + Cedi);
        System.out.println("Yuan: " + Yuan);
        System.out.println("Rupee: " + Rupee);
        System.out.println("Yen: " + Yen);
        System.out.println("Riyal: " + Riyal);
        System.out.println("Dinar: " + Dinar);
        System.out.println("Dirham: " + Dirham);
    }
    public double Coverter(double amount){
        return amount * Dollar;
    }
    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
    }
}

