package com.smart.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "pay", schema = "middle_process", catalog = "")
public class PayEntity {
    private String id;
    private Timestamp payStartTime;
    private BigDecimal payMoney;
    private String userId;
    private String businessId;
    private String orderId;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pay_start_time", nullable = false)
    public Timestamp getPayStartTime() {
        return payStartTime;
    }

    public void setPayStartTime(Timestamp payStartTime) {
        this.payStartTime = payStartTime;
    }

    @Basic
    @Column(name = "pay_money", nullable = false, precision = 2)
    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    @Basic
    @Column(name = "user_id", nullable = false, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "business_id", nullable = false, length = 32)
    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    @Basic
    @Column(name = "order_id", nullable = false, length = 32)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PayEntity payEntity = (PayEntity) o;

        if (id != null ? !id.equals(payEntity.id) : payEntity.id != null) return false;
        if (payStartTime != null ? !payStartTime.equals(payEntity.payStartTime) : payEntity.payStartTime != null)
            return false;
        if (payMoney != null ? !payMoney.equals(payEntity.payMoney) : payEntity.payMoney != null) return false;
        if (userId != null ? !userId.equals(payEntity.userId) : payEntity.userId != null) return false;
        if (businessId != null ? !businessId.equals(payEntity.businessId) : payEntity.businessId != null) return false;
        if (orderId != null ? !orderId.equals(payEntity.orderId) : payEntity.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (payStartTime != null ? payStartTime.hashCode() : 0);
        result = 31 * result + (payMoney != null ? payMoney.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (businessId != null ? businessId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }
}
