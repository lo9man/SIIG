package mpm.ig.mission.presentation;

import java.io.Serializable;

import mpm.ig.mission.model.Missionpj;
import mpm.ig.mission.service.Interface.MissionPjService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("missionpjBean")
@Scope("session")

public class MissionPjBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//Service Auto-injected
			@Autowired
			MissionPjService pjService;
			
		int idPj;
		private String titre;
		private String type;
		private String description;
		private byte[] pj;
		
		//Constructor
		public MissionPjBean(){
			super();
		}
		
		public String ajouterPj() {
			
			Missionpj pj = new Missionpj();
			pj.setIdPj(idPj);
			pj.setTitre(this.titre);	
			pj.setDescription(this.description);

			
			if(pjService != null){
				pjService.addPj(pj);
				return "LoginOK_Client";
			} else {
				return "LoginNO";
			}

		}

		public int getIdPj() {
			return idPj;
		}

		public void setIdPj(int idPj) {
			this.idPj = idPj;
		}

		public String getTitre() {
			return titre;
		}

		public void setTitre(String titre) {
			this.titre = titre;
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

		public byte[] getPj() {
			return pj;
		}

		public void setPj(byte[] pj) {
			this.pj = pj;
		}

		
}
