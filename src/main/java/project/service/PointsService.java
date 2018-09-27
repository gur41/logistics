package project.service;





import project.model.Points;

import java.util.ArrayList;

/**
 * Created by Roman on 19.09.2018.
 */
public interface PointsService {
    public void addPoint(Points maps);
    public void updatePoint(Points maps);
    public  void removePoint(int id);
    public Points getPointById(int id);
    public ArrayList<Points> getAllPoint();
}
