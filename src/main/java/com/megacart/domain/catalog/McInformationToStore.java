package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_information_to_store database table.
 * 
 */
@Entity
@Table(name="mc_information_to_store")
@NamedQuery(name="McInformationToStore.findAll", query="SELECT m FROM McInformationToStore m")
public class McInformationToStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McInformationToStorePK id;

	public McInformationToStore() {
	}

	public McInformationToStorePK getId() {
		return this.id;
	}

	public void setId(McInformationToStorePK id) {
		this.id = id;
	}

}