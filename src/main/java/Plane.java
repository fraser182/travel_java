public class Plane {

    private PlaneType planeModel;

    public Plane(PlaneType planeModel) {
        this.planeModel = planeModel;
    }

    public PlaneType getPlaneModel() {
        return this.planeModel;
    }

    public int getCapacityFromEnum() {
        return this.planeModel.getCapacity();
    }

    public int getTotalMassAvailableFromEnum() {
        return this.planeModel.getTotalMassAvailable();
    }
}
