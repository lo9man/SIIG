package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import mpm.ig.mission.model.Typemission;
import mpm.ig.mission.service.Interface.TypeMissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("typemissionBean")
@Scope("session")

public class TypeMissionBean implements Serializable{

	private static final long serialVersionUID = 1L;

	//Service Auto-injected
			@Autowired
			TypeMissionService typeService;
			
		int idType;
		private String type;
		private String description;
		private List<SelectItem> mesTypes = new ArrayList<SelectItem>();
		private List<Typemission> typeListe;
		
		//Constructor
		public TypeMissionBean(){
			super();
		}
		
		@PostConstruct
		public void init() {
			getListIemsType();
		}
		
		public String ajouterType() {
			
			Typemission type = new Typemission();
			type.setIdType(idType);
			type.setType(this.type);
			type.setDescription(this.description);
			
			if(typeService != null){
				typeService.addType(type);
				return "LoginOK_Client";
			} else {
				return "LoginNO";
			}

		}
		
		public List<Typemission> getMaList() {
			List<Typemission> liste = typeService.listType();
			return liste;
		}

		public void getListIemsType() {
			
			String first = "--- Types ---";
			this.mesTypes.add(new SelectItem(first));
			for (Typemission val : getMaList()) {			
				this.mesTypes.add(new SelectItem(val.getIdType(), val.getType()));
			}
		}

		// -------------------------------------getters &
		// setters---------------------------------------
		
		public int getIdType() {
			return idType;
		}

		public void setIdType(int idType) {
			this.idType = idType;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public TypeMissionService getTypeService() {
			return typeService;
		}

		public void setTypeService(TypeMissionService typeService) {
			this.typeService = typeService;
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
