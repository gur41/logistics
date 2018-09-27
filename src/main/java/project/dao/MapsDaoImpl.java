package project.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.model.Maps;

import java.util.ArrayList;

/**
 * Created by Roman on 18.09.2018.
 */
public class MapsDaoImpl implements MapsDao {

    private static final Logger logger = LoggerFactory.getLogger(MapsDao.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addMap(Maps maps) {
        Session session = this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(maps);
        logger.info("Map is added");
    }

    @Override
    public void updateMap(Maps maps) {
        Session session = this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(maps);
        logger.info("Map is updated");
    }

    @Override
    public void removeMap(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Maps maps = (Maps) session.load(Maps.class, id);
        if(maps!=null){
            session.delete(maps);
            logger.info("Map is deleted");
        }
        else
        logger.info("Map dosen't exist");

    }

    @Override
    public Maps getMapById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Maps maps = (Maps) session.load(Maps.class,id);
        if(maps!=null) {
            logger.info("Map ii getted");
            return maps;
        }
        else {
            logger.info("dosen't exist");
            return null;
        }

    }

    @Override
    public ArrayList<Maps> getAllMap() {
        Session session = this.sessionFactory.getCurrentSession();
        ArrayList<Maps> mapsArrayList = (ArrayList<Maps>)session.createQuery("from Maps").list();
        logger.info("list is selected");
        return mapsArrayList;
    }
}
