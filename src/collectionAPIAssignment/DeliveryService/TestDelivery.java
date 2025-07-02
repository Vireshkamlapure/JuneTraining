//Exception handling also covered.
package collectionAPIAssignment.DeliveryService;
import java.util.HashSet;
public class TestDelivery  {

    String city ;
    HashSet<String> deliveryCities = new HashSet<>();

    void addCity(String cityName) throws DuplicateCityException{
        this.city = cityName.toLowerCase();
        if (deliveryCities.contains(city))
            throw new DuplicateCityException(city+"is already available.");
        deliveryCities.add(city);
    }
    void displayAllCities(){
        for(String city : deliveryCities){
            System.out.println(city);
        }
    }

    void removeCity(String city){
        deliveryCities.remove(city);
    }

    void checkDelivery(String city){
        if (deliveryCities.contains(city))
            System.out.println("Delivery Available in "+city);
        System.out.println("Delivery is not Available in "+city);
    }

}
