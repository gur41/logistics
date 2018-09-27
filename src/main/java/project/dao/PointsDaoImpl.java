package project.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.model.Points;

import java.util.ArrayList;

/**
 * Created by Roman on 18.09.2018.
 */
public class PointsDaoImpl implements PointsDao {

    private static final Logger logger = LoggerFactory.getLogger(PointsDao.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addPoint(Points maps) {
        Session session = this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(maps);
        logger.info("Point is added");
    }

    @Override
    public void updatePoint(Points maps) {
        Session session = this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(maps);
        logger.info("Point is updated");
    }

    @Override
    public void removePoint(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Points maps = (Points) session.load(Points.class, id);
        if(maps!=null){
            session.delete(maps);
            logger.info("Point is deleted");
        }
        else
            logger.info("Point dosen't exist");

    }

    @Override
    public Points getPointById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Points maps = (Points) session.load(Points.class,id);
        if(maps!=null) {
            logger.info("Point ii getted");
            return maps;
        }
        else {
            logger.info("dosen't exist");
            return null;
        }

    }

    @Override
    public ArrayList<Points> getAllPoint() {
        Session session = this.sessionFactory.getCurrentSession();
        ArrayList<Points> mapsArrayList = (ArrayList<Points>)session.createQuery("from Points").list();
        logger.info("list is selected");
        return mapsArrayList;
    }
}
