public class Main {
    public static void main(String[] args) {
        double INTEREST_RATE = .17;
        double initialBalance = 5000;
        double compoundInterest;
        compoundInterest = initialBalance * INTEREST_RATE;
        System.out.println("The interest for month one is: " + compoundInterest);
        compoundInterest = (compoundInterest + initialBalance) * INTEREST_RATE;
        System.out.println("The interest for month two is: " + compoundInterest);
    }
}