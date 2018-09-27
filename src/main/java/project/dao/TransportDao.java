package project.dao;

import project.model.Transport;

import java.util.ArrayList;

/**
 * Created by Roman on 18.09.2018.
 */
public interface TransportDao {
    public void addTransport(Transport maps);
    public void updateTransport(Transport maps);
    public  void removeTransport(int id);
    public Transport getTransportById(int id);
    public ArrayList<Transport> getAllTransport();
}
