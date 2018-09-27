package project.service;






import project.model.Maps;

import java.util.ArrayList;

/**
 * Created by Roman on 18.09.2018.
 */
public interface MapsService {

    public void addMap(Maps maps);
    public void updateMap(Maps maps);
    public  void removeMap(int id);
    public Maps getMapById(int id);
    public ArrayList<Maps> getAllMap();

}
