public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public
    int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public
    int remainingMinutesInOven(int timeInOven) {
        return expectedMinutesInOven() - timeInOven;        
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public
    int preparationTimeInMinutes(int nLayers) {
        return 2*nLayers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public
    int totalTimeInMinutes(int nLayers, int timeInOven) {
        return preparationTimeInMinutes(nLayers) + timeInOven;
    }
}
