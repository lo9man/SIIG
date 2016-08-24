package mpm.ig.mission.model;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "document", catalog = "siig")
public class Document implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idDoc;
	private Typedoc typedoc;
	private String titre;
	private Date dateAjout;
	private String description;
	private byte[] doc;
	private Set<Consultation> consultations = new HashSet<Consultation>(0);

	public Document() {
	}

	public Document(int idDoc, Typedoc typedoc) {
		this.idDoc = idDoc;
		this.typedoc = typedoc;
	}

	public Document(int idDoc, Typedoc typedoc, String titre, Date dateAjout,
			String description, byte[] doc, Set<Consultation> consultations) {
		this.idDoc = idDoc;
		this.typedoc = typedoc;
		this.titre = titre;
		this.dateAjout = dateAjout;
		this.description = description;
		this.doc = doc;
		this.consultations = consultations;
	}

	@Id
	@Column(name = "idDoc", unique = true, nullable = false)
	public int getIdDoc() {
		return this.idDoc;
	}

	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idType", nullable = false)
	public Typedoc getTypedoc() {
		return this.typedoc;
	}

	public void setTypedoc(Typedoc typedoc) {
		this.typedoc = typedoc;
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

	@Column(name = "doc")
	public byte[] getDoc() {
		return this.doc;
	}

	public void setDoc(byte[] doc) {
		this.doc = doc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
	public Set<Consultation> getConsultations() {
		return this.consultations;
	}

	public void setConsultations(Set<Consultation> consultations) {
		this.consultations = consultations;
	}

}
