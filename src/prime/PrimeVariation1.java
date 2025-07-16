package prime;
//print 1st 50 prime numbers
public class PrimeVariation1 {
    public static void main(String[] args) {

        int count = 1;
        int num = 2;

        //level 1 loop
        while (count<51)
        {

            int i = 2;
            //level 2 loop
            while (i < num) {
                if (num % i == 0)
                    break;

                i++;
            }
            if (i == num) {
                System.out.println(num + " is prime , count "+count);
                count++;
            }
            num++;
        }
    }
}
