package prime;
//print 1st 50 alternate prime  numbers
public class PrimeVariation3 {
    public static void main(String[] args) {

        int count = 1;
        int num = 2;
        int printCount =1;

        //level 1 loop
        while (count<=100)
        {

            int i = 2;
            //level 2 loop
            while (i < num) {
                if (num % i == 0)
                    break;

                i++;
            }
            if (i == num) {
                if(count%2!=0) {
                    System.out.println(num + " is prime , count " + printCount);
                    printCount++;
                }
                count++;
            }
            num++;
        }
    }
}
