package lxf.incast.entity;

/**
 * 
 * @author 我有一个小梦想
 * 
 * @date 2019年3月22日 上午9:58:45
 */
public class Molecule {
	private Integer molecule_ID;
	private String fingerprint;
	private String cyp_3a4;
	private String cyp_2c9;
	private String cyp_2d6;
	private String ames_Toxicity;
	private String fathead_Minnow_Toxicity;
	private String tetrahymena_Pyriformis_Toxicity;
	private String honey_Bee;
	private String cell_Permeability;
	private String logP;
	private String renal_Organic_Cation_Transporter;
	private String cLtotal;
	private String hia;
	private String biodegradation;
	private String vdd;
	private String p_Glycoprotein_Inhibition;
	private String nOAEL;
	private String solubility;
	private String bbb;
	public Integer getMolecule_ID() {
		return molecule_ID;
	}
	public void setMolecule_ID(Integer molecule_ID) {
		this.molecule_ID = molecule_ID;
	}
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	public String getCyp_3a4() {
		return cyp_3a4;
	}
	public void setCyp_3a4(String cyp_3a4) {
		this.cyp_3a4 = cyp_3a4;
	}
	public String getCyp_2c9() {
		return cyp_2c9;
	}
	public void setCyp_2c9(String cyp_2c9) {
		this.cyp_2c9 = cyp_2c9;
	}
	public String getCyp_2d6() {
		return cyp_2d6;
	}
	public void setCyp_2d6(String cyp_2d6) {
		this.cyp_2d6 = cyp_2d6;
	}
	public String getAmes_Toxicity() {
		return ames_Toxicity;
	}
	public void setAmes_Toxicity(String ames_Toxicity) {
		this.ames_Toxicity = ames_Toxicity;
	}
	public String getFathead_Minnow_Toxicity() {
		return fathead_Minnow_Toxicity;
	}
	public void setFathead_Minnow_Toxicity(String fathead_Minnow_Toxicity) {
		this.fathead_Minnow_Toxicity = fathead_Minnow_Toxicity;
	}
	public String getTetrahymena_Pyriformis_Toxicity() {
		return tetrahymena_Pyriformis_Toxicity;
	}
	public void setTetrahymena_Pyriformis_Toxicity(String tetrahymena_Pyriformis_Toxicity) {
		this.tetrahymena_Pyriformis_Toxicity = tetrahymena_Pyriformis_Toxicity;
	}
	public String getHoney_Bee() {
		return honey_Bee;
	}
	public void setHoney_Bee(String honey_Bee) {
		this.honey_Bee = honey_Bee;
	}
	public String getCell_Permeability() {
		return cell_Permeability;
	}
	public void setCell_Permeability(String cell_Permeability) {
		this.cell_Permeability = cell_Permeability;
	}
	public String getLogP() {
		return logP;
	}
	public void setLogP(String logP) {
		this.logP = logP;
	}
	public String getRenal_Organic_Cation_Transporter() {
		return renal_Organic_Cation_Transporter;
	}
	public void setRenal_Organic_Cation_Transporter(String renal_Organic_Cation_Transporter) {
		this.renal_Organic_Cation_Transporter = renal_Organic_Cation_Transporter;
	}
	public String getcLtotal() {
		return cLtotal;
	}
	public void setcLtotal(String cLtotal) {
		this.cLtotal = cLtotal;
	}
	public String getHia() {
		return hia;
	}
	public void setHia(String hia) {
		this.hia = hia;
	}
	public String getBiodegradation() {
		return biodegradation;
	}
	public void setBiodegradation(String biodegradation) {
		this.biodegradation = biodegradation;
	}
	public String getVdd() {
		return vdd;
	}
	public void setVdd(String vdd) {
		this.vdd = vdd;
	}
	public String getP_Glycoprotein_Inhibition() {
		return p_Glycoprotein_Inhibition;
	}
	public void setP_Glycoprotein_Inhibition(String p_Glycoprotein_Inhibition) {
		this.p_Glycoprotein_Inhibition = p_Glycoprotein_Inhibition;
	}
	public String getnOAEL() {
		return nOAEL;
	}
	public void setnOAEL(String nOAEL) {
		this.nOAEL = nOAEL;
	}
	public String getSolubility() {
		return solubility;
	}
	public void setSolubility(String solubility) {
		this.solubility = solubility;
	}
	public String getBbb() {
		return bbb;
	}
	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	@Override
	public String toString() {
		return "Molecule [molecule_ID=" + molecule_ID + ", fingerprint=" + fingerprint + ", cyp_3a4=" + cyp_3a4
				+ ", cyp_2c9=" + cyp_2c9 + ", cyp_2d6=" + cyp_2d6 + ", ames_Toxicity=" + ames_Toxicity
				+ ", fathead_Minnow_Toxicity=" + fathead_Minnow_Toxicity + ", tetrahymena_Pyriformis_Toxicity="
				+ tetrahymena_Pyriformis_Toxicity + ", honey_Bee=" + honey_Bee + ", cell_Permeability="
				+ cell_Permeability + ", logP=" + logP + ", renal_Organic_Cation_Transporter="
				+ renal_Organic_Cation_Transporter + ", cLtotal=" + cLtotal + ", hia=" + hia + ", biodegradation="
				+ biodegradation + ", vdd=" + vdd + ", p_Glycoprotein_Inhibition=" + p_Glycoprotein_Inhibition
				+ ", nOAEL=" + nOAEL + ", solubility=" + solubility + ", bbb=" + bbb + "]";
	}

	
}