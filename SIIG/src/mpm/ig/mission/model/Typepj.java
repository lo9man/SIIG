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
@Table(name = "typepj", catalog = "siig")
public class Typepj implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idType;
	private String type;
	private String description;
	private Set<Missionpj> missionpjs = new HashSet<Missionpj>(0);

	public Typepj() {
	}

	public Typepj(int idType) {
		this.idType = idType;
	}

	public Typepj(int idType, String type, String description,
			Set<Missionpj> missionpjs) {
		this.idType = idType;
		this.type = type;
		this.description = description;
		this.missionpjs = missionpjs;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typepj")
	public Set<Missionpj> getMissionpjs() {
		return this.missionpjs;
	}

	public void setMissionpjs(Set<Missionpj> missionpjs) {
		this.missionpjs = missionpjs;
	}

}
