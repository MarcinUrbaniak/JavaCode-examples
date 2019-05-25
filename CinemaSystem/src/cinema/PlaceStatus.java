package cinema;

public enum PlaceStatus {
    WOLNE(0),
    ZAJETE(1);

    public final int placeStatus;


    PlaceStatus(int placeStatus) {
        this.placeStatus = placeStatus;
    }

    public int getPlaceStatus() {
        return placeStatus;
    }
}
