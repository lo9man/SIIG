package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import mpm.ig.mission.model.Typedoc;
import mpm.ig.mission.model.Typemission;
import mpm.ig.mission.service.Interface.TypeDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("typedoc")
@Scope("session")
public class TypeDocBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// Service Auto-injected
	@Autowired
	TypeDocService typeService;

	int idType;
	private String libelle;
	private String description;
	private List<SelectItem> mesTypes = new ArrayList<SelectItem>();
	private List<Typemission> typeListe;

	// Constructor
	public TypeDocBean() {
		super();
	}

	@PostConstruct
	public void init() {
		getListIemsType();
	}

	public String ajouterType() {

		Typedoc type = new Typedoc();
		type.setIdType(idType);
		type.setLibelle(this.libelle);
		type.setDescription(this.description);

		if (typeService != null) {
			typeService.addType(type);
			return "LoginOK_Client";
		} else {
			return "LoginNO";
		}

	}

	public List<Typedoc> getMaList() {
		List<Typedoc> liste = typeService.listType();
		return liste;
	}

	public void getListIemsType() {

		String first = "--- Types ---";
		this.mesTypes.add(new SelectItem(first));
		for (Typedoc val : getMaList()) {
			this.mesTypes
					.add(new SelectItem(val.getIdType(), val.getLibelle()));
		}
	}

	// -------------------------------------getters &
	// setters---------------------------------------

	public TypeDocService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeDocService typeService) {
		this.typeService = typeService;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SelectItem> getMesTypes() {
		return mesTypes;
	}

	public void setMesTypes(List<SelectItem> mesTypes) {
		this.mesTypes = mesTypes;
	}

	public List<Typemission> getTypeListe() {
		return typeListe;
	}

	public void setTypeListe(List<Typemission> typeListe) {
		this.typeListe = typeListe;
	}

}
