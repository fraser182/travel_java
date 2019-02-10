public enum PlaneType {

    BOEING747(400, 18400),
    BOEING787(300, 13800),
    AIRBUSA380(5, 230);

    private final int capacity;
    private final int totalMassAvailable;


    PlaneType(int capacity, int totalMassAvailable) {
        this.capacity = capacity;
        this.totalMassAvailable = totalMassAvailable;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalMassAvailable() {
        return totalMassAvailable;
    }


}
