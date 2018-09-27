package project.dao;




import project.model.Points;

import java.util.ArrayList;

/**
 * Created by Roman on 18.09.2018.
 */
public interface PointsDao {
    public void addPoint(Points maps);
    public void updatePoint(Points maps);
    public  void removePoint(int id);
    public Points getPointById(int id);
    public ArrayList<Points> getAllPoint();
}
