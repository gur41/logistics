package project.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Route {
    private Integer idRoute;
    private String nameOfRoute;
    private Integer startPoint;
    private Integer endPoint;
    private Collection<Maps> mapsByIdRoute;
    private Points pointsByStartPoint;
    private Points pointsByEndPoint;
    private Points pointsByStartPointOfRoute;
    private Points pointsByEndPointOfRoute;

    public Route() {
    }

    @Id
    @Column(name = "id_route")
    public Integer getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(Integer idRoute) {
        this.idRoute = idRoute;
    }

    @Basic
    @Column(name = "name_of_route")
    public String getNameOfRoute() {
        return nameOfRoute;
    }

    public void setNameOfRoute(String nameOfRoute) {
        this.nameOfRoute = nameOfRoute;
    }

    @Basic
    @Column(name = "start_point")
    public Integer getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Integer startPoint) {
        this.startPoint = startPoint;
    }

    @Basic
    @Column(name = "end_point")
    public Integer getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Integer endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return Objects.equals(idRoute, route.idRoute) &&
                Objects.equals(nameOfRoute, route.nameOfRoute) &&
                Objects.equals(startPoint, route.startPoint) &&
                Objects.equals(endPoint, route.endPoint);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idRoute, nameOfRoute, startPoint, endPoint);
    }

    @OneToMany(mappedBy = "routeByRoute")
    public Collection<Maps> getMapsByIdRoute() {
        return mapsByIdRoute;
    }

    public void setMapsByIdRoute(Collection<Maps> mapsByIdRoute) {
        this.mapsByIdRoute = mapsByIdRoute;
    }

    @ManyToOne
    @JoinColumn(name = "start_point", referencedColumnName = "id_point", insertable=false, updatable=false)
    public Points getPointsByStartPoint() {
        return pointsByStartPoint;
    }

    public void setPointsByStartPoint(Points pointsByStartPoint) {
        this.pointsByStartPoint = pointsByStartPoint;
    }

    @ManyToOne
    @JoinColumn(name = "end_point", referencedColumnName = "id_point", insertable=false, updatable=false)
    public Points getPointsByEndPoint() {
        return pointsByEndPoint;
    }

    public void setPointsByEndPoint(Points pointsByEndPoint) {
        this.pointsByEndPoint = pointsByEndPoint;
    }

    @ManyToOne
    @JoinColumn(name = "start_point_of_route", referencedColumnName = "id_point", insertable=false, updatable=false)
    public Points getPointsByStartPointOfRoute() {
        return pointsByStartPointOfRoute;
    }

    public void setPointsByStartPointOfRoute(Points pointsByStartPointOfRoute) {
        this.pointsByStartPointOfRoute = pointsByStartPointOfRoute;
    }

    @ManyToOne
    @JoinColumn(name = "end_point_of_route", referencedColumnName = "id_point", insertable=false, updatable=false)
    public Points getPointsByEndPointOfRoute() {
        return pointsByEndPointOfRoute;
    }

    public void setPointsByEndPointOfRoute(Points pointsByEndPointOfRoute) {
        this.pointsByEndPointOfRoute = pointsByEndPointOfRoute;
    }
}
