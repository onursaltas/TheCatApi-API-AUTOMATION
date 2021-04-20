package Tests;

import Models.Favourites;
import Services.FavouriteService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TheCatApiTests {

    FavouriteService favouriteService = new FavouriteService();
    @Test
    public void numberOfLocationEarth(){
        List<Favourites> favouritesList = favouriteService.getAllFavourites();
        List<String> favouriteSubId = new ArrayList<>();
        int count=0;
        for (Favourites favourites : favouritesList){
                count++;
                favouriteSubId.add(favourites.getId());

        }
        for (String item : favouriteSubId){
            System.out.println(item);
        }
    }
}
