package Models;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "id",
        "image_id",
        "sub_id",
        "created_at"

})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Favourites {
    @JsonProperty("id")
    String id;

    @JsonProperty("image_id")
    String image_id;

    @JsonProperty("sub_id")
    String sub_id;

    @JsonProperty("created_at")
    String created_at;



    public String getGender() {
        return id;
    }

    public String getId() {
        return image_id;
    }

    public String getName() {
        return sub_id;
    }

    public String getStatus() {
        return created_at;
    }
}
