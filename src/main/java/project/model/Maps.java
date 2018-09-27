package project.model;

import javax.persistence.*;

/**
 * Created by Roman on 18.09.2018.
 */
@Entity
public class Maps {
    private Integer startPoint;
    private Integer endPoint;
    private String distance;
    private Integer idTransport;
    private Double costForHour;
    private int idMaps;
    private Points pointsByStartPoint;
    private Points pointsByEndPoint;
    private Transport transportByIdTransport;
    private Integer route;
    private Route routeByRoute;

    public Maps() {
    }

    public void setIdMaps(Integer idMaps) {
        this.idMaps = idMaps;
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

    @Basic
    @Column(name = "distance")
    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "id_transport")
    public Integer getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(Integer idTransport) {
        this.idTransport = idTransport;
    }

    @Basic
    @Column(name = "cost_for_hour")
    public Double getCostForHour() {
        return costForHour;
    }

    public void setCostForHour(Double costForHour) {
        this.costForHour = costForHour;
    }

    @Id
    @Column(name = "id_maps")
    public int getIdMaps() {
        return idMaps;
    }

    public void setIdMaps(int idMaps) {
        this.idMaps = idMaps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Maps maps = (Maps) o;

        if (idMaps != maps.idMaps) return false;
        if (startPoint != null ? !startPoint.equals(maps.startPoint) : maps.startPoint != null) return false;
        if (endPoint != null ? !endPoint.equals(maps.endPoint) : maps.endPoint != null) return false;
        if (distance != null ? !distance.equals(maps.distance) : maps.distance != null) return false;
        if (idTransport != null ? !idTransport.equals(maps.idTransport) : maps.idTransport != null) return false;
        if (costForHour != null ? !costForHour.equals(maps.costForHour) : maps.costForHour != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = startPoint != null ? startPoint.hashCode() : 0;
        result = 31 * result + (endPoint != null ? endPoint.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (idTransport != null ? idTransport.hashCode() : 0);
        result = 31 * result + (costForHour != null ? costForHour.hashCode() : 0);
        result = 31 * result + idMaps;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "start_point", referencedColumnName = "id_point", insertable=false, updatable=false )
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
    @JoinColumn(name = "id_transport", referencedColumnName = "id_transport", insertable=false, updatable=false)
    public Transport getTransportByIdTransport() {
        return transportByIdTransport;
    }

    public void setTransportByIdTransport(Transport transportByIdTransport) {
        this.transportByIdTransport = transportByIdTransport;
    }

    @Basic
    @Column(name = "route")
    public Integer getRoute() {
        return route;
    }

    public void setRoute(Integer route) {
        this.route = route;
    }

    @ManyToOne
    @JoinColumn(name = "route", referencedColumnName = "id_route", insertable=false, updatable=false)
    public Route getRouteByRoute() {
        return routeByRoute;
    }

    public void setRouteByRoute(Route routeByRoute) {
        this.routeByRoute = routeByRoute;
    }
}
