
package Lab05;
public class DeliveryChargeTest {
 public static void main(String[] args){
        
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();
        
        System.out.println("BaseCharge: " + calculator.calculateCharge(1000.0));
        System.out.println("BaseCharge & WeightCharge: " + calculator.calculateCharge(1000.0, 10.0));
        System.out.println("BaseCharge, WeightCharge & DistanceCharge: " + calculator.calculateCharge(1000.0, 10.0, 5.0));
        System.out.println("BaseCharge & ExpressDelivery: " + calculator.calculateCharge(1000.0, true));
    } 
}
 // This is compile-time polymorphism because Java selects
// the correct overloaded method during compilation.