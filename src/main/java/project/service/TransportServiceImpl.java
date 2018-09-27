package project.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.dao.TransportDao;
import project.model.Transport;


import java.util.ArrayList;

/**
 * Created by Roman on 19.09.2018.
 */
@Service
public class TransportServiceImpl implements TransportService {
    private TransportDao mapsDao;

    public void setTransportDao(TransportDao mapsDao) {
        this.mapsDao = mapsDao;
    }

    @Override
    @Transactional
    public void addTransport(Transport maps) {
        this.mapsDao.addTransport(maps);
    }

    @Override
    @Transactional
    public void updateTransport(Transport maps) {
        this.mapsDao.updateTransport(maps);
    }

    @Override
    @Transactional
    public void removeTransport(int id) {
        this.mapsDao.removeTransport(id);
    }

    @Override
    @Transactional
    public Transport getTransportById(int id) {
        return this.mapsDao.getTransportById(id);
    }

    @Override
    @Transactional
    public ArrayList<Transport> getAllTransport() {
        return this.mapsDao.getAllTransport();
    }
}

