package HW_9.License;

public class LicensePlateMaker {

    private String prefics;
    private int previousNumber;

    public LicensePlateMaker(String prefics, int previousNumber) {
        this.prefics = prefics;
        this.previousNumber = previousNumber;
    }

    public LicensePlate makeNextPlate() {
        int nextNumber = previousNumber + 1;
        previousNumber = nextNumber;
        return new LicensePlate(prefics + "-" + nextNumber, previousNumber);
    }

}


