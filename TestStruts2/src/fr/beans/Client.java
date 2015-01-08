/**
 * 
 */
package fr.beans;

/**
 * @author dao303
 *
 */
public class Client {

	private int num;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private String codepostal;
	private String motdepasse;
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the codepostal
	 */
	public String getCodepostal() {
		return codepostal;
	}
	/**
	 * @param codepostal the codepostal to set
	 */
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	/**
	 * @return the motdepasse
	 */
	public String getMotdepasse() {
		return motdepasse;
	}
	/**
	 * @param motdepasse the motdepasse to set
	 */
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [num=" + num + ", nom=" + nom + ", prenom=" + prenom
				+ ", adresse=" + adresse + ", ville=" + ville + ", codepostal="
				+ codepostal + ", motdepasse=" + motdepasse + "]";
	}



}
