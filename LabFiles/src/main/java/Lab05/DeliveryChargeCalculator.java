
package Lab05;
public class DeliveryChargeCalculator {
    static double distancecharge = 100.0;
    static double weightcharge = 50.0;
    static double expresscharge = 500.0;
    
    public double calculateCharge(double baseCharge){
        return baseCharge;
    }
    public double calculateCharge(double baseCharge, double distanceKm){
        return baseCharge + (distanceKm * distancecharge);
    }
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg){
        return baseCharge + (distanceKm * distancecharge) + (weightKg * weightcharge);
    }
    public double calculateCharge(double baseCharge, boolean expressDelivery){
        if (expressDelivery){
            return baseCharge + expresscharge;
        }
        else{
            return baseCharge;
        }
    }
}
