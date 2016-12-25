package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_banner_image database table.
 * 
 */
@Entity
@Table(name="mc_banner_image")
@NamedQuery(name="McBannerImage.findAll", query="SELECT m FROM McBannerImage m")
public class McBannerImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="banner_image_id")
	private Integer bannerImageId;

	@Column(name="banner_id")
	private Integer bannerId;

	private String image;

	@Column(name="language_id")
	private Integer languageId;

	private String link;

	@Column(name="sort_order")
	private Integer sortOrder;

	private String title;

	public McBannerImage() {
	}

	public Integer getBannerImageId() {
		return this.bannerImageId;
	}

	public void setBannerImageId(Integer bannerImageId) {
		this.bannerImageId = bannerImageId;
	}

	public Integer getBannerId() {
		return this.bannerId;
	}

	public void setBannerId(Integer bannerId) {
		this.bannerId = bannerId;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}