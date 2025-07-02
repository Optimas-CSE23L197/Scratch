public class Condition {
    public static void main(String[] args) {
        int x = 10;
        if (x == x) { // unlink c this line cause compailer error in java
            System.out.println("x is true");
        } else {
            System.out.println("x is false");
        }

        if (!5 > x > 6) { // unlink c this line cause compailer error in java
            System.out.println("x is true");
        } else {
            System.out.println("x is false");
        }
    }
}

/*
 * condition in java:
 * in java int value treat as int value not boolean value
 * so when we pass a int value in if condition it will give compailer error
 * in java condition only accept boolean value
 * 
 * !5 > x > 6; this is not a valid condition in java
 * because we compare boolean value with int value also not accepted in java
 * 
 */
