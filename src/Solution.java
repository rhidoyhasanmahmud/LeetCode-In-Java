import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Long> geoIds = new ArrayList<>();
        List<GeoDto> geoDtoList = new ArrayList<>();
        GeoDto geoDto = new GeoDto();
        List<Long> childIds = new ArrayList<>();
        childIds.add(2L);
        childIds.add(3L);
        geoDto.setId(1L);
        geoDto.setChildId(childIds);

        GeoDto geoDto2 = new GeoDto();
        List<Long> childIds2 = new ArrayList<>();
        childIds2.add(5L);
        childIds2.add(6L);
        geoDto2.setId(4L);
        geoDto2.setChildId(childIds);

        /*
        --------------------------
            1,2,3,4,5,6,7
            --------------------- Cluster
            1 -> 2,3,4,5 [Region]
            --------------------- [Area]
            2 -> []
            3 -> []
            4 -> []
            5 -> [6,7]
            --------------------- [Territory]
            6 -> []
            7 -> []
         */
    }
}

class GeoDto {
    private Long id;
    private List<Long> childId;

    public List<Long> getChildId() {
        return childId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setChildId(List<Long> childId) {
        this.childId = childId;
    }

    public Long getId() {
        return id;
    }
}