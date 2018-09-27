package project.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Roman on 18.09.2018.
 */
@Entity
public class Transport {
    private int idTransport;
    private String transportName;
    private Integer speed;
    private Double coefficient;
    private Integer maxWeight;
    private Collection<Maps> mapsByIdTransport;

    public void setIdTransport(Integer idTransport) {
        this.idTransport = idTransport;
    }

    @Id
    @Column(name = "id_transport")
    public int getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(int idTransport) {
        this.idTransport = idTransport;
    }

    @Basic
    @Column(name = "transport_name")
    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    @Basic
    @Column(name = "speed")
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "coefficient")
    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    @Basic
    @Column(name = "max_weight")
    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transport transport = (Transport) o;

        if (idTransport != transport.idTransport) return false;
        if (transportName != null ? !transportName.equals(transport.transportName) : transport.transportName != null)
            return false;
        if (speed != null ? !speed.equals(transport.speed) : transport.speed != null) return false;
        if (coefficient != null ? !coefficient.equals(transport.coefficient) : transport.coefficient != null)
            return false;
        if (maxWeight != null ? !maxWeight.equals(transport.maxWeight) : transport.maxWeight != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTransport;
        result = 31 * result + (transportName != null ? transportName.hashCode() : 0);
        result = 31 * result + (speed != null ? speed.hashCode() : 0);
        result = 31 * result + (coefficient != null ? coefficient.hashCode() : 0);
        result = 31 * result + (maxWeight != null ? maxWeight.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "transportByIdTransport")
    public Collection<Maps> getMapsByIdTransport() {
        return mapsByIdTransport;
    }

    public void setMapsByIdTransport(Collection<Maps> mapsByIdTransport) {
        this.mapsByIdTransport = mapsByIdTransport;
    }
}
