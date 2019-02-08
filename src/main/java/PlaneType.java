public enum PlaneType {

    BOEING747(416, 50000),
    BOEING787(335, 42000),
    AIRBUSA380(853, 95000);

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
