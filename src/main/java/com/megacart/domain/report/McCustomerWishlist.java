package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_customer_wishlist database table.
 * 
 */
@Entity
@Table(name="mc_customer_wishlist")
@NamedQuery(name="McCustomerWishlist.findAll", query="SELECT m FROM McCustomerWishlist m")
public class McCustomerWishlist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCustomerWishlistPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	public McCustomerWishlist() {
	}

	public McCustomerWishlistPK getId() {
		return this.id;
	}

	public void setId(McCustomerWishlistPK id) {
		this.id = id;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

}