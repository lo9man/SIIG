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
@Table(name = "typemission", catalog = "siig")
public class Typemission implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idType;
	private String type;
	private String description;
	private Set<Mission> missions = new HashSet<Mission>(0);

	public Typemission() {
	}

	public Typemission(int idType) {
		this.idType = idType;
	}

	public Typemission(int idType, String type, String description,
			Set<Mission> missions) {
		this.idType = idType;
		this.type = type;
		this.description = description;
		this.missions = missions;
	}

	@Id
	@Column(name = "idType", unique = true, nullable = false)
	public int getIdType() {
		return this.idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	@Column(name = "type", length = 254)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typemission")
	public Set<Mission> getMissions() {
		return this.missions;
	}

	public void setMissions(Set<Mission> missions) {
		this.missions = missions;
	}

}
