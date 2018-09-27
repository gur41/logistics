package project.service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.dao.MapsDao;
import project.model.Maps;

import java.util.ArrayList;

/**
 * Created by Roman on 18.09.2018.
 */
@Service
public class MapsServiceImpl implements MapsService {
    private MapsDao mapsDao;

    public void setMapsDao(MapsDao mapsDao) {
        this.mapsDao = mapsDao;
    }

    @Override
    @Transactional
    public void addMap(Maps maps) {
        this.mapsDao.addMap(maps);
    }

    @Override
    @Transactional
    public void updateMap(Maps maps) {
        this.mapsDao.updateMap(maps);
    }

    @Override
    @Transactional
    public void removeMap(int id) {
        this.mapsDao.removeMap(id);
    }

    @Override
    @Transactional
    public Maps getMapById(int id) {
        return this.mapsDao.getMapById(id);
    }

    @Override
    @Transactional
    public ArrayList<Maps> getAllMap() {
        return this.mapsDao.getAllMap();
    }
}
