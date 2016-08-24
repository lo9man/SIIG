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
@Table(name = "consultation", catalog = "siig")
public class Consultation implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idConsultation;
	private User user;
	private Document document;
	private Date dateConsultation;

	public Consultation() {
	}

	public Consultation(int idConsultation, User user, Document document) {
		this.idConsultation = idConsultation;
		this.user = user;
		this.document = document;
	}

	public Consultation(int idConsultation, User user, Document document,
			Date dateConsultation) {
		this.idConsultation = idConsultation;
		this.user = user;
		this.document = document;
		this.dateConsultation = dateConsultation;
	}

	@Id
	@Column(name = "idConsultation", unique = true, nullable = false)
	public int getIdConsultation() {
		return this.idConsultation;
	}

	public void setIdConsultation(int idConsultation) {
		this.idConsultation = idConsultation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDoc", nullable = false)
	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateConsultation", length = 19)
	public Date getDateConsultation() {
		return this.dateConsultation;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

}
