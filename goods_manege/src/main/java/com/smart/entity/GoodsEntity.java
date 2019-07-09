package com.smart.entity;

import javax.persistence.*;

@Entity
@Table(name = "goods", schema = "goods_base", catalog = "")
public class GoodsEntity {
    private String id;
    private String goodsName;
    private String goodsCategoryId;
    private String goodsImagesUrl;
    private String goodsDescription;
    private String goodsDetail;
    private String goodsTypeId;
    private String goodsEvaluationId;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "goods_name", nullable = false, length = 64)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "goods_category_id", nullable = false, length = 32)
    public String getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(String goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    @Basic
    @Column(name = "goods_images_url", nullable = false, length = 64)
    public String getGoodsImagesUrl() {
        return goodsImagesUrl;
    }

    public void setGoodsImagesUrl(String goodsImagesUrl) {
        this.goodsImagesUrl = goodsImagesUrl;
    }

    @Basic
    @Column(name = "goods_description", nullable = false, length = 255)
    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    @Basic
    @Column(name = "goods_detail", nullable = false, length = 255)
    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    @Basic
    @Column(name = "goods_type_id", nullable = false, length = 255)
    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    @Basic
    @Column(name = "goods_evaluation_id", nullable = false, length = 255)
    public String getGoodsEvaluationId() {
        return goodsEvaluationId;
    }

    public void setGoodsEvaluationId(String goodsEvaluationId) {
        this.goodsEvaluationId = goodsEvaluationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEntity that = (GoodsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (goodsCategoryId != null ? !goodsCategoryId.equals(that.goodsCategoryId) : that.goodsCategoryId != null)
            return false;
        if (goodsImagesUrl != null ? !goodsImagesUrl.equals(that.goodsImagesUrl) : that.goodsImagesUrl != null)
            return false;
        if (goodsDescription != null ? !goodsDescription.equals(that.goodsDescription) : that.goodsDescription != null)
            return false;
        if (goodsDetail != null ? !goodsDetail.equals(that.goodsDetail) : that.goodsDetail != null) return false;
        if (goodsTypeId != null ? !goodsTypeId.equals(that.goodsTypeId) : that.goodsTypeId != null) return false;
        if (goodsEvaluationId != null ? !goodsEvaluationId.equals(that.goodsEvaluationId) : that.goodsEvaluationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (goodsCategoryId != null ? goodsCategoryId.hashCode() : 0);
        result = 31 * result + (goodsImagesUrl != null ? goodsImagesUrl.hashCode() : 0);
        result = 31 * result + (goodsDescription != null ? goodsDescription.hashCode() : 0);
        result = 31 * result + (goodsDetail != null ? goodsDetail.hashCode() : 0);
        result = 31 * result + (goodsTypeId != null ? goodsTypeId.hashCode() : 0);
        result = 31 * result + (goodsEvaluationId != null ? goodsEvaluationId.hashCode() : 0);
        return result;
    }
}
