package mpm.ig.mission.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "destination", catalog = "siig")
public class Destination implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idDestination;
	private Entite entite;
	private Ville ville;
	private Mission mission;
	private String description;

	public Destination() {
	}

	public Destination(int idDestination, Entite entite, Ville ville,
			Mission mission) {
		this.idDestination = idDestination;
		this.entite = entite;
		this.ville = ville;
		this.mission = mission;
	}

	public Destination(int idDestination, Entite entite, Ville ville,
			Mission mission, String description) {
		this.idDestination = idDestination;
		this.entite = entite;
		this.ville = ville;
		this.mission = mission;
		this.description = description;
	}

	@Id
	@Column(name = "idDestination", unique = true, nullable = false)
	public int getIdDestination() {
		return this.idDestination;
	}

	public void setIdDestination(int idDestination) {
		this.idDestination = idDestination;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEntite", nullable = false)
	public Entite getEntite() {
		return this.entite;
	}

	public void setEntite(Entite entite) {
		this.entite = entite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVille", nullable = false)
	public Ville getVille() {
		return this.ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMission", nullable = true)
	public Mission getMission() {
		return this.mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
