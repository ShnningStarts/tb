package com.smart.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.sun.imageio.plugins.tiff.TIFFStreamMetadata;
import javassist.SerialVersionUID;
import org.springframework.data.domain.Persistable;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.concurrent.locks.ReentrantLock;


@Entity
@Table(name = "user_base", schema = "user_base", catalog = "")


public class UserBaseEntity implements Serializable, Persistable {
    long SerialVersionUID=1l;
    private String salt;
    private String id;
    private String name;
    private String userName;
    private String  createTime;
    private String  brithday;
    private String email;
    private String  numberPhone;
    private String identVard;
    private String sex;
    private String password;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 45)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "create_time", nullable = false)

    public String  getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String  createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "brithday", nullable = false)
    public String  getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 70)
    @JsonBackReference
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "number_phone", nullable = false, length = 11)
    public String  getNumberPhone() {
        return numberPhone;
    }



    public void setNumberPhone(String  numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Basic
    @Column(name = "ident_vard", nullable = false, length = 18)
    public String getIdentVard() {
        return identVard;
    }

    public void setIdentVard(String identVard) {
        this.identVard = identVard;
    }

    @Basic
    @Column(name = "sex", nullable = false, length = 255)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserBaseEntity that = (UserBaseEntity) o;


        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public boolean isNew() {
        return false;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (brithday != null ? brithday.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (identVard != null ? identVard.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
