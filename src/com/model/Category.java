package model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Category implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 层级
     */
    private Integer cateLevel;

    /**
     * 序列
     */
    private Integer seq;

    /**
     * 中文名
     */
    private String nameZh;

    /**
     * 英文名
     */
    private String nameEn;

    /**
     * 父类id
     */
    private Integer parentId;

    /**
     * 描述
     */
    private String description;

    /**
     * 产线状态
     */
    private Short status;

    /**
     * 是否显示
     */
    private Integer displayFlag;

    /**
     * 关键字
     */
    private String keyWords;

    /**
     * 产线税号
     */
    private String categoryTaxCode;

    private Date createTime;

    private Date updateTime;

    private Integer creatorId;

    private Integer operatorId;

    /**
     * 行业显示标记{0:no,1:yes}
     */
    private Boolean industryFlag;

    /**
     * HOT标记
     */
    private Boolean hotFlag;

    /**
     * 公司专属产线标识
     */
    private Boolean companyFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCateLevel() {
        return cateLevel;
    }

    public void setCateLevel(Integer cateLevel) {
        this.cateLevel = cateLevel;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getDisplayFlag() {
        return displayFlag;
    }

    public void setDisplayFlag(Integer displayFlag) {
        this.displayFlag = displayFlag;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getCategoryTaxCode() {
        return categoryTaxCode;
    }

    public void setCategoryTaxCode(String categoryTaxCode) {
        this.categoryTaxCode = categoryTaxCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Boolean getIndustryFlag() {
        return industryFlag;
    }

    public void setIndustryFlag(Boolean industryFlag) {
        this.industryFlag = industryFlag;
    }

    public Boolean getHotFlag() {
        return hotFlag;
    }

    public void setHotFlag(Boolean hotFlag) {
        this.hotFlag = hotFlag;
    }

    public Boolean getCompanyFlag() {
        return companyFlag;
    }

    public void setCompanyFlag(Boolean companyFlag) {
        this.companyFlag = companyFlag;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Category other = (Category) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCateLevel() == null ? other.getCateLevel() == null : this.getCateLevel().equals(other.getCateLevel()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()))
            && (this.getNameZh() == null ? other.getNameZh() == null : this.getNameZh().equals(other.getNameZh()))
            && (this.getNameEn() == null ? other.getNameEn() == null : this.getNameEn().equals(other.getNameEn()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDisplayFlag() == null ? other.getDisplayFlag() == null : this.getDisplayFlag().equals(other.getDisplayFlag()))
            && (this.getKeyWords() == null ? other.getKeyWords() == null : this.getKeyWords().equals(other.getKeyWords()))
            && (this.getCategoryTaxCode() == null ? other.getCategoryTaxCode() == null : this.getCategoryTaxCode().equals(other.getCategoryTaxCode()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreatorId() == null ? other.getCreatorId() == null : this.getCreatorId().equals(other.getCreatorId()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getIndustryFlag() == null ? other.getIndustryFlag() == null : this.getIndustryFlag().equals(other.getIndustryFlag()))
            && (this.getHotFlag() == null ? other.getHotFlag() == null : this.getHotFlag().equals(other.getHotFlag()))
            && (this.getCompanyFlag() == null ? other.getCompanyFlag() == null : this.getCompanyFlag().equals(other.getCompanyFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCateLevel() == null) ? 0 : getCateLevel().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        result = prime * result + ((getNameZh() == null) ? 0 : getNameZh().hashCode());
        result = prime * result + ((getNameEn() == null) ? 0 : getNameEn().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDisplayFlag() == null) ? 0 : getDisplayFlag().hashCode());
        result = prime * result + ((getKeyWords() == null) ? 0 : getKeyWords().hashCode());
        result = prime * result + ((getCategoryTaxCode() == null) ? 0 : getCategoryTaxCode().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getIndustryFlag() == null) ? 0 : getIndustryFlag().hashCode());
        result = prime * result + ((getHotFlag() == null) ? 0 : getHotFlag().hashCode());
        result = prime * result + ((getCompanyFlag() == null) ? 0 : getCompanyFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cateLevel=").append(cateLevel);
        sb.append(", seq=").append(seq);
        sb.append(", nameZh=").append(nameZh);
        sb.append(", nameEn=").append(nameEn);
        sb.append(", parentId=").append(parentId);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", displayFlag=").append(displayFlag);
        sb.append(", keyWords=").append(keyWords);
        sb.append(", categoryTaxCode=").append(categoryTaxCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", industryFlag=").append(industryFlag);
        sb.append(", hotFlag=").append(hotFlag);
        sb.append(", companyFlag=").append(companyFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}