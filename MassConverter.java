
package git_unit_converter_project;
public class MassConverter {
    
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    
    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }
    
    public static double gramsToOunces(double grams) {
        return grams * 0.035274;
    }
    
    public static double ouncesToGrams(double ounces) {
        return ounces / 0.035274;
    }
    
    public static double metricTonsToKilograms(double metricTons) {
        return metricTons * 1000;
    }
    
    public static double kilogramsToMetricTons(double kilograms) {
        return kilograms / 1000;
    }
    
    public static double milligramsToGrams(double milligrams) {
        return milligrams / 1000;
    }
    
    public static double gramsToMilligrams(double grams) {
        return grams * 1000;
    }
}
