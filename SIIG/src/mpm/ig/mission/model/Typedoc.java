package mpm.ig.mission.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "typedoc", catalog = "siig")
public class Typedoc implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idType;
	private String libelle;
	private String description;
	private Set<Document> documents = new HashSet<Document>(0);

	public Typedoc() {
	}

	public Typedoc(int idType) {
		this.idType = idType;
	}

	public Typedoc(int idType, String libelle, String description,
			Set<Document> documents) {
		this.idType = idType;
		this.libelle = libelle;
		this.description = description;
		this.documents = documents;
	}

	@Id
	@Column(name = "idType", unique = true, nullable = false)
	public int getIdType() {
		return this.idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	@Column(name = "libelle", length = 254)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typedoc")
	public Set<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

}
