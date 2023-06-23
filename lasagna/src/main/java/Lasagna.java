public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    
    public int remainingMinutesInOven(int ovenMinutes) {
        return expectedMinutesInOven() - ovenMinutes;
    }
    public int preparationTimeInMinutes(int layerQnt) {
        return layerQnt * 2;
    }

    public int totalTimeInMinutes(int layerQnt, int ovenMinutes) {
        return preparationTimeInMinutes(layerQnt) + ovenMinutes;
    }
}
