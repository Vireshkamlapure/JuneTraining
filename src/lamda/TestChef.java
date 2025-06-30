package lamda;

public class TestChef {
    public static void main(String[] args) {

        Recipe recipe = new Chef();

        //Implementation by anonymous Inner class
        Recipe InstantRecipe = new Recipe() {
            @Override
            public void cook() {
                System.out.println("Instant Recipe");
            }
        };

        //Implementation by lambda
        Recipe labmdaRecipe = () -> {
            System.out.println("Lambda Instant Recipe ");
        };


    }
}
