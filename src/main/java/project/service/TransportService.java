package project.service;

import project.model.Transport;

import java.util.ArrayList;

/**
 * Created by Roman on 20.09.2018.
 */
public interface TransportService {
    public void addTransport(Transport maps);
    public void updateTransport(Transport maps);
    public  void removeTransport(int id);
    public Transport getTransportById(int id);
    public ArrayList<Transport> getAllTransport();
}
