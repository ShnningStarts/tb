package com.smart.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "express", schema = "middle_process", catalog = "")
public class ExpressEntity {
    private String id;
    private Object state;
    private String currentAddress;
    private String sendTelephone;
    private String sendAdd;
    private String reciveAddress;
    private String reciveTelephone;
    private Timestamp passedTime;
    private Timestamp finishTime;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "state", nullable = false)
    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    @Basic
    @Column(name = "current_address", nullable = false, length = 64)
    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    @Basic
    @Column(name = "send_telephone", nullable = false, length = 11)
    public String getSendTelephone() {
        return sendTelephone;
    }

    public void setSendTelephone(String sendTelephone) {
        this.sendTelephone = sendTelephone;
    }

    @Basic
    @Column(name = "send_add", nullable = false, length = 255)
    public String getSendAdd() {
        return sendAdd;
    }

    public void setSendAdd(String sendAdd) {
        this.sendAdd = sendAdd;
    }

    @Basic
    @Column(name = "recive_address", nullable = false, length = 64)
    public String getReciveAddress() {
        return reciveAddress;
    }

    public void setReciveAddress(String reciveAddress) {
        this.reciveAddress = reciveAddress;
    }

    @Basic
    @Column(name = "recive_telephone", nullable = false, length = 11)
    public String getReciveTelephone() {
        return reciveTelephone;
    }

    public void setReciveTelephone(String reciveTelephone) {
        this.reciveTelephone = reciveTelephone;
    }

    @Basic
    @Column(name = "passed_time", nullable = false)
    public Timestamp getPassedTime() {
        return passedTime;
    }

    public void setPassedTime(Timestamp passedTime) {
        this.passedTime = passedTime;
    }

    @Basic
    @Column(name = "finish_time", nullable = false)
    public Timestamp getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Timestamp finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExpressEntity that = (ExpressEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (currentAddress != null ? !currentAddress.equals(that.currentAddress) : that.currentAddress != null)
            return false;
        if (sendTelephone != null ? !sendTelephone.equals(that.sendTelephone) : that.sendTelephone != null)
            return false;
        if (sendAdd != null ? !sendAdd.equals(that.sendAdd) : that.sendAdd != null) return false;
        if (reciveAddress != null ? !reciveAddress.equals(that.reciveAddress) : that.reciveAddress != null)
            return false;
        if (reciveTelephone != null ? !reciveTelephone.equals(that.reciveTelephone) : that.reciveTelephone != null)
            return false;
        if (passedTime != null ? !passedTime.equals(that.passedTime) : that.passedTime != null) return false;
        if (finishTime != null ? !finishTime.equals(that.finishTime) : that.finishTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (currentAddress != null ? currentAddress.hashCode() : 0);
        result = 31 * result + (sendTelephone != null ? sendTelephone.hashCode() : 0);
        result = 31 * result + (sendAdd != null ? sendAdd.hashCode() : 0);
        result = 31 * result + (reciveAddress != null ? reciveAddress.hashCode() : 0);
        result = 31 * result + (reciveTelephone != null ? reciveTelephone.hashCode() : 0);
        result = 31 * result + (passedTime != null ? passedTime.hashCode() : 0);
        result = 31 * result + (finishTime != null ? finishTime.hashCode() : 0);
        return result;
    }
}
