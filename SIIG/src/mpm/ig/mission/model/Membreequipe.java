package mpm.ig.mission.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "membreequipe", catalog = "siig")
public class Membreequipe implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idMe;
	private User user;
	private Mission mission;
	private String fonction;

	public Membreequipe() {
	}

	public Membreequipe(int idMe, User user, Mission mission) {
		this.idMe = idMe;
		this.user = user;
		this.mission = mission;
	}

	public Membreequipe(int idMe, User user, Mission mission, String fonction) {
		this.idMe = idMe;
		this.user = user;
		this.mission = mission;
		this.fonction = fonction;
	}

	@Id
	@Column(name = "idMe", unique = true, nullable = false)
	public int getIdMe() {
		return this.idMe;
	}

	public void setIdMe(int idMe) {
		this.idMe = idMe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser", nullable = true)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMission", nullable = true)
	public Mission getMission() {
		return this.mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	@Column(name = "fonction", length = 254)
	public String getFonction() {
		return this.fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

}
