
public class Contacts {

	private String nom;
	private String prenom;
	private int nmrTel;
	private String email;
	private String groupe;
	
	Contacts(String nom,String prenom, int nmrTel, String email, String groupe){
		this.nom = nom;
		this.prenom = prenom;
		this.nmrTel = nmrTel;
		this.email = email;
		this.groupe = groupe;
	}
	
	public String getNom(){
		return nom;
	}
    public void setNom(String nom){
    	this.nom = nom;
    }

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNmrTel() {
		return nmrTel;
	}

	public void setNmrTel(int nmrTel) {
		this.nmrTel = nmrTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
}
