package exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(4.0, 4.7);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
