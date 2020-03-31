import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped

public class HouseController implements Serializable {
    private List<House> houseList;

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public HouseController(){
        houseList = new ArrayList<>();
        houseList.add(new House("127m",12_000_000));
        houseList.add(new House("153m",20_000_000));
        houseList.add(new House("103m",9_500_000));
    }

}
