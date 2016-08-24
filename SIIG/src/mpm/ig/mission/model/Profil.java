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
@Table(name = "profil", catalog = "siig")
public class Profil implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idP;
	private String code;
	private String libelle;
	private Set<Account> accounts = new HashSet<Account>(0);

	public Profil() {
	}

	public Profil(int idP) {
		this.idP = idP;
	}

	public Profil(int idP, String code, String libelle, Set<Account> accounts) {
		this.idP = idP;
		this.code = code;
		this.libelle = libelle;
		this.accounts = accounts;
	}

	@Id
	@Column(name = "idP", unique = true, nullable = false)
	public int getIdP() {
		return this.idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	@Column(name = "code", length = 254)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "libelle", length = 254)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profil")
	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

}
