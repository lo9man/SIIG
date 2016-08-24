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
@Table(name = "ville", catalog = "siig")
public class Ville implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idVille;
	private String intitule;
	private Set<Destination> destinations = new HashSet<Destination>(0);
	private Set<Entite> entites = new HashSet<Entite>(0);

	public Ville() {
	}

	public Ville(int idVille) {
		this.idVille = idVille;
	}

	public Ville(int idVille, String intitule, Set<Destination> destinations,
			Set<Entite> entites) {
		this.idVille = idVille;
		this.intitule = intitule;
		this.destinations = destinations;
		this.entites = entites;
	}

	@Id
	@Column(name = "idVille", unique = true, nullable = false)
	public int getIdVille() {
		return this.idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	@Column(name = "intitule", length = 254)
	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ville")
	public Set<Destination> getDestinations() {
		return this.destinations;
	}

	public void setDestinations(Set<Destination> destinations) {
		this.destinations = destinations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ville")
	public Set<Entite> getEntites() {
		return this.entites;
	}

	public void setEntites(Set<Entite> entites) {
		this.entites = entites;
	}

}
