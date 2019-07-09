package com.smart.entity;

import javax.persistence.*;

@Entity
@Table(name = "goods_evaluations", schema = "goods_base", catalog = "")
public class GoodsEvaluationsEntity {
    private String id;
    private int userId;
    private String userName;
    private Object userGrade;
    private String userImageUrl;
    private String userVideoUrl;
    private String userDescription;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 255)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_Grade", nullable = false)
    public Object getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(Object userGrade) {
        this.userGrade = userGrade;
    }

    @Basic
    @Column(name = "user_image_url", nullable = true, length = 64)
    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    @Basic
    @Column(name = "user_video_url", nullable = true, length = 64)
    public String getUserVideoUrl() {
        return userVideoUrl;
    }

    public void setUserVideoUrl(String userVideoUrl) {
        this.userVideoUrl = userVideoUrl;
    }

    @Basic
    @Column(name = "user_description", nullable = true, length = 255)
    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEvaluationsEntity that = (GoodsEvaluationsEntity) o;

        if (userId != that.userId) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userGrade != null ? !userGrade.equals(that.userGrade) : that.userGrade != null) return false;
        if (userImageUrl != null ? !userImageUrl.equals(that.userImageUrl) : that.userImageUrl != null) return false;
        if (userVideoUrl != null ? !userVideoUrl.equals(that.userVideoUrl) : that.userVideoUrl != null) return false;
        if (userDescription != null ? !userDescription.equals(that.userDescription) : that.userDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userGrade != null ? userGrade.hashCode() : 0);
        result = 31 * result + (userImageUrl != null ? userImageUrl.hashCode() : 0);
        result = 31 * result + (userVideoUrl != null ? userVideoUrl.hashCode() : 0);
        result = 31 * result + (userDescription != null ? userDescription.hashCode() : 0);
        return result;
    }
}
