package com.smart.entity;

import javax.persistence.*;

@Entity
@Table(name = "role", schema = "user_base", catalog = "")
public class RoleEntity {
    private String userId;
    private String id;
    private int normalUser;
    private int admin;
    private int business;

    @Basic
    @Column(name = "user_id", nullable = false, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "normal_user", nullable = false)
    public int getNormalUser() {
        return normalUser;
    }

    public void setNormalUser(int normalUser) {
        this.normalUser = normalUser;
    }

    @Basic
    @Column(name = "admin", nullable = false)
    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    @Basic
    @Column(name = "business", nullable = false)
    public int getBusiness() {
        return business;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (normalUser != that.normalUser) return false;
        if (admin != that.admin) return false;
        if (business != that.business) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + normalUser;
        result = 31 * result + admin;
        result = 31 * result + business;
        return result;
    }
}
