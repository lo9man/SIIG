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
@Table(name = "user", catalog = "siig")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idUser;
	private Integer ppr;
	private String cin;
	private String nom;
	private String prenom;
	private Set<Membreequipe> membreequipes = new HashSet<Membreequipe>(0);
	private Set<Account> accounts = new HashSet<Account>(0);

	public User() {
	}

	public User(int idUser) {
		this.idUser = idUser;
	}

	public User(int idUser, Integer ppr, String cin, String nom, String prenom,
			Set<Membreequipe> membreequipes, Set<Account> accounts) {
		this.idUser = idUser;
		this.ppr = ppr;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.membreequipes = membreequipes;
		this.accounts = accounts;
	}

	@Id
	@Column(name = "idUser", unique = true, nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Column(name = "ppr", precision = 8, scale = 0)
	public Integer getPpr() {
		return this.ppr;
	}

	public void setPpr(Integer ppr) {
		this.ppr = ppr;
	}

	@Column(name = "cin", length = 254)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Column(name = "nom", length = 254)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", length = 254)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Membreequipe> getMembreequipes() {
		return this.membreequipes;
	}

	public void setMembreequipes(Set<Membreequipe> membreequipes) {
		this.membreequipes = membreequipes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

}
