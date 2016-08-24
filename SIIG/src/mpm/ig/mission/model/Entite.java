package mpm.ig.mission.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "entite", catalog = "siig")
public class Entite implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idEntite;
	private Ville ville;
	private String intitule;
	private Set<Destination> destinations = new HashSet<Destination>(0);

	public Entite() {
	}

	public Entite(int idEntite) {
		this.idEntite = idEntite;
	}

	public Entite(int idEntite, Ville ville) {
		this.idEntite = idEntite;
		this.ville = ville;
	}

	public Entite(int idEntite, Ville ville, String intitule,
			Set<Destination> destinations) {
		this.idEntite = idEntite;
		this.ville = ville;
		this.intitule = intitule;
		this.destinations = destinations;
	}

	@Id
	@Column(name = "idEntite", unique = true, nullable = false)
	public int getIdEntite() {
		return this.idEntite;
	}

	public void setIdEntite(int idEntite) {
		this.idEntite = idEntite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVille", nullable = false)
	public Ville getVille() {
		return this.ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	@Column(name = "intitule", length = 254)
	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "entite")
	public Set<Destination> getDestinations() {
		return this.destinations;
	}

	public void setDestinations(Set<Destination> destinations) {
		this.destinations = destinations;
	}

}
