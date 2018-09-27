package project.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Roman on 18.09.2018.
 */
@Entity
public class Points {
    private int idPoint;
    private String nameOfPoint;
    private Collection<Maps> mapsByIdPoint;
    private Collection<Maps> mapsByIdPoint_0;
    private Collection<Route> routesByIdPoint;
    private Collection<Route> routesByIdPoint_0;

    public void setIdPoint(Integer idPoint) {
        this.idPoint = idPoint;
    }

    @Id
    @Column(name = "id_point")
    public int getIdPoint() {
        return idPoint;
    }

    public void setIdPoint(int idPoint) {
        this.idPoint = idPoint;
    }

    @Basic
    @Column(name = "name_of_point")
    public String getNameOfPoint() {
        return nameOfPoint;
    }

    public void setNameOfPoint(String nameOfPoint) {
        this.nameOfPoint = nameOfPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Points points = (Points) o;

        if (idPoint != points.idPoint) return false;
        if (nameOfPoint != null ? !nameOfPoint.equals(points.nameOfPoint) : points.nameOfPoint != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPoint;
        result = 31 * result + (nameOfPoint != null ? nameOfPoint.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "pointsByStartPoint")
    public Collection<Maps> getMapsByIdPoint() {
        return mapsByIdPoint;
    }

    public void setMapsByIdPoint(Collection<Maps> mapsByIdPoint) {
        this.mapsByIdPoint = mapsByIdPoint;
    }

    @OneToMany(mappedBy = "pointsByEndPoint")
    public Collection<Maps> getMapsByIdPoint_0() {
        return mapsByIdPoint_0;
    }

    public void setMapsByIdPoint_0(Collection<Maps> mapsByIdPoint_0) {
        this.mapsByIdPoint_0 = mapsByIdPoint_0;
    }

    @OneToMany(mappedBy = "pointsByStartPoint")
    public Collection<Route> getRoutesByIdPoint() {
        return routesByIdPoint;
    }

    public void setRoutesByIdPoint(Collection<Route> routesByIdPoint) {
        this.routesByIdPoint = routesByIdPoint;
    }

    @OneToMany(mappedBy = "pointsByEndPoint")
    public Collection<Route> getRoutesByIdPoint_0() {
        return routesByIdPoint_0;
    }

    public void setRoutesByIdPoint_0(Collection<Route> routesByIdPoint_0) {
        this.routesByIdPoint_0 = routesByIdPoint_0;
    }
}
