package mpm.ig.mission.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mission", catalog = "siig")
public class Mission implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMission;
	private Typemission typemission;
	private String titre;
	private Date debut;
	private Date fin;
	private String objet;
	private String detail;
	private String etat;
	private Set<Membreequipe> membreequipes = new HashSet<Membreequipe>(0);
	private Set<Missionpj> missionpjs = new HashSet<Missionpj>(0);
	private Set<Destination> destinations = new HashSet<Destination>(0);

	public Mission() {
	}

	public Mission(int idMission) {
		this.idMission = idMission;
	}

	public Mission(int idMission, Typemission typemission, String titre,
			Date debut, Date fin, String objet, String detail, String etat,
			Set<Membreequipe> membreequipes, Set<Missionpj> missionpjs,
			Set<Destination> destinations) {
		this.idMission = idMission;
		this.typemission = typemission;
		this.titre = titre;
		this.debut = debut;
		this.fin = fin;
		this.objet = objet;
		this.detail = detail;
		this.etat = etat;
		this.membreequipes = membreequipes;
		this.missionpjs = missionpjs;
		this.destinations = destinations;
	}

	@Id
	@Column(name = "idMission", unique = true, nullable = false)
	public int getIdMission() {
		return this.idMission;
	}

	public void setIdMission(int idMission) {
		this.idMission = idMission;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idType")
	public Typemission getTypemission() {
		return this.typemission;
	}

	public void setTypemission(Typemission typemission) {
		this.typemission = typemission;
	}

	@Column(name = "titre", length = 254)
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "debut", length = 19)
	public Date getDebut() {
		return this.debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fin", length = 19)
	public Date getFin() {
		return this.fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	@Column(name = "objet", length = 254)
	public String getObjet() {
		return this.objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	@Column(name = "detail", length = 254)
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Column(name = "etat", length = 254)
	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mission")
	public Set<Membreequipe> getMembreequipes() {
		return this.membreequipes;
	}

	public void setMembreequipes(Set<Membreequipe> membreequipes) {
		this.membreequipes = membreequipes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mission")
	public Set<Missionpj> getMissionpjs() {
		return this.missionpjs;
	}

	public void setMissionpjs(Set<Missionpj> missionpjs) {
		this.missionpjs = missionpjs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mission")
	public Set<Destination> getDestinations() {
		return this.destinations;
	}

	public void setDestinations(Set<Destination> destinations) {
		this.destinations = destinations;
	}

}
