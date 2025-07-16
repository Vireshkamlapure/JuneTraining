package MiniProject.BadmintonScheduler;

public class Batch {
    public String slot;
    public int spots;

    public Batch(){

    }

    public Batch(String slot , int spots){
        this.slot = slot;
        this.spots = spots;
    }

    public void display(){
        System.out.print("Slot : " + slot);
        System.out.print("Spopts :" + spots);
        System.out.println();
    }


}
