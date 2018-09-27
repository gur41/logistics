package project.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.dao.PointsDao;
import project.model.Points;

import java.util.ArrayList;

/**
 * Created by Roman on 19.09.2018.
 */
@Service
public class PointsServiceImpl implements PointsService {
    private PointsDao mapsDao;

    public void setPointsDao(PointsDao mapsDao) {
        this.mapsDao = mapsDao;
    }

    @Override
    @Transactional
    public void addPoint(Points maps) {
        this.mapsDao.addPoint(maps);
    }

    @Override
    @Transactional
    public void updatePoint(Points maps) {
        this.mapsDao.updatePoint(maps);
    }

    @Override
    @Transactional
    public void removePoint(int id) {
        this.mapsDao.removePoint(id);
    }

    @Override
    @Transactional
    public Points getPointById(int id) {
        return this.mapsDao.getPointById(id);
    }

    @Override
    @Transactional
    public ArrayList<Points> getAllPoint() {
        return this.mapsDao.getAllPoint();
    }
}

