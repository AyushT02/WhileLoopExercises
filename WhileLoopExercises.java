import java.util.*;
public class WhileLoopExercises
{
    public static void while1() {
        System.out.println("Enter a number greater than 0: ");
        Scanner in = new Scanner(System.in);
        int inputNum = in.nextInt();
        while(inputNum <= 0) {
         System.out.println("INVALID");
         System.out.println("Enter a number greater than 0: ");
         Scanner out = new Scanner(System.in);
         int inputNum1 = out.nextInt();
         if(inputNum1 > 0) {
         System.out.println("valid");
         break;
        }
        }
    }
    public static void while2() {
        System.out.println("Enter a response: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        while(!str.equals("Yes") || !str.equals("No")) {
        if(str.equals("Yes") || str.equals("No")){
                System.out.println("valid response");
                break;
            }
            System.out.println("Enter a response");
            Scanner out = new Scanner(System.in);
            String str1 = out.nextLine();
        if(str1.equals("Yes") || str1.equals("No")) {
                System.out.println("valid response");
                break;
        }
    }
}
public static void while3() {
        System.out.println("Rock, Paper, Scissors: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        while(!str.equals("R") || !str.equals("P") || !str.equals("S")) {
            if(str.equals("R") || str.equals("P") || str.equals("S")) {
                System.out.println("valid response");
                break;
            }
            System.out.println("Enter a valid response: ");
            Scanner out = new Scanner(System.in);
            String str1 = out.nextLine();
            if(str1.equals("R") || str1.equals("P") || str1.equals("S")){
                System.out.println("valid response");
                break;
            }
        }
}
public static void while4() {
        System.out.println("Enter a series of Strings: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String t = "the";
        String the = t;
        the.equalsIgnoreCase(t);
        String end = "THE END";
        int indexEnd = str.indexOf(end);
        if (indexEnd == -1) {
            indexEnd = str.length();
        }
        String firstpart = str.substring(0,indexEnd);
        String[] firstPartArray = firstpart.split("", -1);
        int firstPartArrayLength = firstPartArray.length;
        int i = 0;
        while(i < firstPartArrayLength) {
            System.out.println(firstPartArray[i]);
            i++;
        }
        String findStr = "the";
        int lastIndex = 0;
        int count = 0;
        while(lastIndex != -1) {    
            lastIndex = firstpart.indexOf(findStr,lastIndex);    
            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }
        System.out.println(count);
}
public static void while5() {
    System.out.println("Enter a starting balance: ");
    Scanner start = new Scanner(System.in);
    double startBalance = start.nextDouble();
    System.out.println("Enter a target balance: ");
    Scanner target = new Scanner(System.in);
    double targetBalance = target.nextDouble();
    System.out.println("Enter an interest rate: ");
    Scanner interest = new Scanner(System.in);
    double interestRate = interest.nextDouble();
    double startBalance1 = startBalance * interestRate;
    double intR = startBalance1 * interestRate;
    double time = targetBalance/intR;
    while(startBalance < targetBalance) {
        System.out.println(time);
        break;
    }
}
    public static void main() {
        while1();
        while2();
        while3();
        while4();
        while5();
    }
}
