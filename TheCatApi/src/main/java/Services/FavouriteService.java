package Services;

import Models.Favourites;

import java.util.List;

public class FavouriteService extends BaseService {

    public List<Favourites> getAllFavourites() {
        List<Favourites> favouritesList = setupRequestSpecification()
                .when()
                .get("v1/favourites")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("results", Favourites.class);
        return favouritesList;
    }



}
