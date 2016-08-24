package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.Date;

import mpm.ig.mission.model.Document;
import mpm.ig.mission.model.Typedoc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import com.sun.java.util.jar.pack.Package.File;


@Component("docBean")
@Scope("session")
public class DocmentBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idDoc;
	private String titre;
	private Date debut = new Date();	//initialiser la date
	private String description;
	private Typedoc typeDoc;
	private byte[] doc;


	
	public String enregistrerDoc(){
		Document document = new Document();
		document.setIdDoc(idDoc);
		document.setTitre(this.titre);
		document.setDescription(this.description);
		document.setDoc(this.doc);
		if(typeDoc.equals("type1")){
			document.setIdDoc(1);}
		else {
			document.setIdDoc(2);
		}
		
		return "LoginOK_Client";
	}


	
	public int getIdDoc() {
		return idDoc;
	}



	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}



	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDebut() {
		return debut;
	}


	public void setDebut(Date debut) {
		this.debut = debut;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Typedoc getTypeDoc() {
		return typeDoc;
	}


	public void setTypeDoc(Typedoc typeDoc) {
		this.typeDoc = typeDoc;
	}


	public byte[] getDoc() {
		return doc;
	}


	public void setDoc(byte[] doc) {
		this.doc = doc;
	}

	
	
	

	
}
