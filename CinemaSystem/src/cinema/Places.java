package cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Places {

    private List<Place> placesInCinema;
    private Place place;



    public  static  List<Place> generatePlaceList (int row, int placeInRow){
        List<Place> placeList = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < placeInRow ; j++) {
                Place place = new Place(i,j);
                place.setPlaceStatus(PlaceStatus.WOLNE);
                placeList.add(place);
            }
        }

        return placeList;
    }



    public Places(List<Place> placesInCinema) {
        this.placesInCinema = placesInCinema;
    }



    public List<Place> getPlacesInCinema() {
        return placesInCinema;
    }

    public void setPlacesInCinema(List<Place> placesInCinema) {
        this.placesInCinema = placesInCinema;
    }


    public int getPlaceId(Place place){
        return placesInCinema.indexOf(place);
    }


    public boolean checkPlaceInPlaces(Place place){
        if(placesInCinema.contains(place)){
            return true;
        }
        return false;
    }

    public void setPlaceInSeance(int row, int placeInRow) {
        if (row >= 0 && placeInRow >= 0) {
            Place place = new Place(row, placeInRow);

            int index = getPlaceId(place);
            if (placesInCinema.size() > index)
                placesInCinema.get(index).setPlaceStatus(PlaceStatus.ZAJETE);
        }
    }



    @Override
    public String toString() {
        return "Places{" +
                "placesInCinema=" + placesInCinema +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Places places = (Places) o;
        return Objects.equals(placesInCinema, places.placesInCinema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placesInCinema);
    }
}
