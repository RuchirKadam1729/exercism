public class Lasagna {
    private static final int
    EXPECTED_MINUTES_IN_OVEN = 40,
    PREPARATION_TIME_PER_LAYER = 2;
    
    public
    int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }
    public
    int remainingMinutesInOven(int timeInOven) {
        return expectedMinutesInOven() - timeInOven;        
    }
    public
    int preparationTimeInMinutes(int nLayers) {
        return PREPARATION_TIME_PER_LAYER*nLayers;
    }
    public
    int totalTimeInMinutes(int nLayers, int timeInOven) {
        return preparationTimeInMinutes(nLayers) + timeInOven;
    }
}
