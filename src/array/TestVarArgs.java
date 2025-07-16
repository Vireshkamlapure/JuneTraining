package array;

public class TestVarArgs {
    public static void main(String[] args) {
        NumberSum numberSum = new NumberSum();
//        int[] inputs = {10,20,30};
//        numberSum.sum(inputs);

        //variable arguments
        numberSum.sum(10,20,30,40);
    }
}
