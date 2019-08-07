package com.list;


import java.util.Objects;

/**
 * User: Karl
 * Date: 2017/8/23
 * Time: 15:48
 */
public class MessagePool{
    private Long id;
    private Integer type;
    private String status;
    private String data;
    private Long dockingId;

    public MessagePool() {
    }

    public MessagePool(Integer type, String status, String data, Long dockingId) {
        this.type = type;
        this.status = status;
        this.data = data;
        this.dockingId = dockingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessagePool)) return false;
        MessagePool that = (MessagePool) o;
        return Objects.equals(getType(), that.getType()) &&
                Objects.equals(getStatus(), that.getStatus()) &&
                Objects.equals(getData(), that.getData()) &&
                Objects.equals(getDockingId(), that.getDockingId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getType(), getStatus(), getData(), getDockingId());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getDockingId() {
        return dockingId;
    }

    public void setDockingId(Long dockingId) {
        this.dockingId = dockingId;
    }
}
