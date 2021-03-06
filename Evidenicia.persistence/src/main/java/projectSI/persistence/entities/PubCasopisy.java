package projectSI.persistence.entities;

// Generated 26.11.2015 21:36:01 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubCasopisy generated by hbm2java
 */
@Entity
@Table(name = "pub_casopisy", catalog = "unistatsdb")
public class PubCasopisy implements java.io.Serializable {

	private static final long serialVersionUID = -860264296013025412L;
	
	private Integer id;
	private String nazov;
	private String podnazov;
	private String vydavatel;
	private String krajina;
	private String issn;

	public PubCasopisy() {
	}

	public PubCasopisy(String nazov, String podnazov, String vydavatel,
			String krajina, String issn) {
		this.nazov = nazov;
		this.podnazov = podnazov;
		this.vydavatel = vydavatel;
		this.krajina = krajina;
		this.issn = issn;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nazov", nullable = false)
	public String getNazov() {
		return this.nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	@Column(name = "podnazov", nullable = false)
	public String getPodnazov() {
		return this.podnazov;
	}

	public void setPodnazov(String podnazov) {
		this.podnazov = podnazov;
	}

	@Column(name = "vydavatel", nullable = false)
	public String getVydavatel() {
		return this.vydavatel;
	}

	public void setVydavatel(String vydavatel) {
		this.vydavatel = vydavatel;
	}

	@Column(name = "krajina", nullable = false, length = 50)
	public String getKrajina() {
		return this.krajina;
	}

	public void setKrajina(String krajina) {
		this.krajina = krajina;
	}

	@Column(name = "ISSN", nullable = false, length = 20)
	public String getIssn() {
		return this.issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

}
