package mpm.ig.mission.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "missionpj", catalog = "siig")
public class Missionpj implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idPj;
	private Mission mission;
	private Typepj typepj;
	private String titre;
	private Date dateAjout;
	private String description;

	public Missionpj() {
	}

	public Missionpj(int idPj, Mission mission, Typepj typepj) {
		this.idPj = idPj;
		this.mission = mission;
		this.typepj = typepj;
	}

	public Missionpj(int idPj, Mission mission, Typepj typepj, String titre,
			Date dateAjout, String description) {
		this.idPj = idPj;
		this.mission = mission;
		this.typepj = typepj;
		this.titre = titre;
		this.dateAjout = dateAjout;
		this.description = description;
	}

	@Id
	@Column(name = "idPj", unique = true, nullable = false)
	public int getIdPj() {
		return this.idPj;
	}

	public void setIdPj(int idPj) {
		this.idPj = idPj;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMission", nullable = false)
	public Mission getMission() {
		return this.mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idType", nullable = false)
	public Typepj getTypepj() {
		return this.typepj;
	}

	public void setTypepj(Typepj typepj) {
		this.typepj = typepj;
	}

	@Column(name = "titre", length = 254)
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateAjout", length = 19)
	public Date getDateAjout() {
		return this.dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
