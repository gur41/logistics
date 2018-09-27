package project.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.model.Transport;

import java.util.ArrayList;

/**
 * Created by Roman on 18.09.2018.
 */
public class TransportDaoImpl implements TransportDao {

    private static final Logger logger = LoggerFactory.getLogger(TransportDao.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addTransport(Transport maps) {
        Session session = this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(maps);
        logger.info("Transport is added");
    }

    @Override
    public void updateTransport(Transport maps) {
        Session session = this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(maps);
        logger.info("Transport is updated");
    }

    @Override
    public void removeTransport(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Transport maps = (Transport) session.load(Transport.class, id);
        if(maps!=null){
            session.delete(maps);
            logger.info("Transport is deleted");
        }
        else
            logger.info("Transport dosen't exist");

    }

    @Override
    public Transport getTransportById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Transport maps = (Transport) session.load(Transport.class,id);
        if(maps!=null) {
            logger.info("Transport ii getted");
            return maps;
        }
        else {
            logger.info("dosen't exist");
            return null;
        }

    }

    @Override
    public ArrayList<Transport> getAllTransport() {
        Session session = this.sessionFactory.getCurrentSession();
        ArrayList<Transport> mapsArrayList = (ArrayList<Transport>)session.createQuery("from Transport").list();
        logger.info("list is selected");
        return mapsArrayList;
    }
}
