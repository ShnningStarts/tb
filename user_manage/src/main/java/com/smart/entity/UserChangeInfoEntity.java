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
@Table(name = "user_change_info", schema = "user_base", catalog = "")
public class UserChangeInfoEntity implements Serializable {
    long SerialVersionUID=1l;
    private String id;
    private String changeIp;
    private String changeWhat;
    private Timestamp changeTime;
    private String oldValue;
    private UserBaseEntity userBaseByUserId;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "change_ip", nullable = false, length = 32)
    public String getChangeIp() {
        return changeIp;
    }

    public void setChangeIp(String changeIp) {
        this.changeIp = changeIp;
    }

    @Basic
    @Column(name = "change_what", nullable = false, length = 32)
    public String getChangeWhat() {
        return changeWhat;
    }

    public void setChangeWhat(String changeWhat) {
        this.changeWhat = changeWhat;
    }

    @Basic
    @Column(name = "change_time", nullable = false)
    public Timestamp getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Timestamp changeTime) {
        this.changeTime = changeTime;
    }

    @Basic
    @Column(name = "old_value", nullable = true, length = 128)
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserChangeInfoEntity that = (UserChangeInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (changeIp != null ? changeIp.hashCode() : 0);
        result = 31 * result + (changeWhat != null ? changeWhat.hashCode() : 0);
        result = 31 * result + (changeTime != null ? changeTime.hashCode() : 0);
        result = 31 * result + (oldValue != null ? oldValue.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public UserBaseEntity getUserBaseByUserId() {
        return userBaseByUserId;
    }

    public void setUserBaseByUserId(UserBaseEntity userBaseByUserId) {
        this.userBaseByUserId = userBaseByUserId;
    }
}
