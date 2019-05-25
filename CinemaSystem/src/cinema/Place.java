package cinema;

import java.util.Objects;

public class Place {


    int row, placeInRow;
    PlaceStatus placeStatus;


    public Place(int row, int placeInRow) {
        this.row = row;
        this.placeInRow = placeInRow;
        this.placeStatus = PlaceStatus.WOLNE;

    }




    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPlaceInRow() {
        return placeInRow;
    }

    public void setPlaceInRow(int placeInRow) {
        this.placeInRow = placeInRow;
    }

    public PlaceStatus getPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceStatus(PlaceStatus placeStatus) {
        this.placeStatus = placeStatus;
    }

    @Override
    public String toString() {
        return "Place{" +
                "row=" + row +
                ", placeInRow=" + placeInRow +
                ", placeStatus=" + placeStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return row == place.row &&
                placeInRow == place.placeInRow &&
                placeStatus == place.placeStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, placeInRow, placeStatus);
    }
}
