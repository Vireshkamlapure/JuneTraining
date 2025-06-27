package MiniProject.BadmintonScheduler;

public class User {
    public String name;
    public int bookedBatchIndex;

    public User(String name){
        this.name = name;
        bookedBatchIndex = -1;
    }

    public boolean bookSlot(String name , int bookedBatchIndex){
        if (this.bookedBatchIndex == -1) {
            this.name = name;
            this.bookedBatchIndex = bookedBatchIndex;
            return true;
        }
        return false;
    }

    public void cancelSlot(){
        System.out.println("The user : " + this.name);
        System.out.println("Canceling your booking for "+(this.bookedBatchIndex));
        this.bookedBatchIndex = -1;
    }
}
