package com.smart.entity;

import javassist.SerialVersionUID;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "user_loggin_info", schema = "user_base", catalog = "")
public class UserLogginInfoEntity implements Serializable {
    Long SerialVersionUID=1l;
    private String id;
    private String logginIp;
    private Timestamp logginInTime;
    private Timestamp logginOutTime;
    private String userId;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "loggin_ip", nullable = false, length = 255)
    public String getLogginIp() {
        return logginIp;
    }

    public void setLogginIp(String logginIp) {
        this.logginIp = logginIp;
    }

    @Basic
    @Column(name = "loggin_in_time", nullable = false)
    public Timestamp getLogginInTime() {
        return logginInTime;
    }

    public void setLogginInTime(Timestamp logginInTime) {
        this.logginInTime = logginInTime;
    }

    @Basic
    @Column(name = "loggin_out_time", nullable = false)
    public Timestamp getLogginOutTime() {
        return logginOutTime;
    }

    public void setLogginOutTime(Timestamp logginOutTime) {
        this.logginOutTime = logginOutTime;
    }

    @Basic
    @Column(name = "user_id", nullable = false, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLogginInfoEntity that = (UserLogginInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (logginIp != null ? logginIp.hashCode() : 0);
        result = 31 * result + (logginInTime != null ? logginInTime.hashCode() : 0);
        result = 31 * result + (logginOutTime != null ? logginOutTime.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
