package bt.gov.ditt.dairy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "application_table")
public class AiFarmAnimalPedigreeDetails {
	@Id
	@Column(name = "Animal_Tag_Number")
	private String animalTagNumber;
	private String CID_Number;
	private String NLHD_Number;
	@Column(name = "Farmer_Name")
	private String farmOrFarmerName;
	@Column(name = "Village_Name")
	private String village;
	@Column(name = "Gewog_Name")
	private String gewog;
	@Column(name = "Dzongkhag_Name")
	private String dzongkhag;
	@Column(name = "Mobile_Number")
	private String mobileNumber;
	@Column(name = "Name_Of_Animal")
	private String animalName;
	@Column(name = "Age")
	private String animalAge;
	@Column(name = "Sex")
	private String animalSex;
	@Column(name = "Animal_Category")
	private String animalCategory;
	@Column(name = "CHPP")
	private String chbpp;
	@Column(name = "Migration")
	private String migration;
	@Column(name = "Migration_Location")
	private String migrationRegion;
	@Column(name = "BCS")
	private int bcs;
	@Column(name = "Housing_Type")
	private String housingType;
	@Column(name = "DAM_Number")
	private String damNumber;
	@Column(name = "DAM_Name")
	private String damName;
	@Column(name = "DAM_Exotic")
	private float damExotic;
	@Column(name = "DAM_Breed_Type")
	private int damType;
	@Column(name = "Sire_Number")
	private String sireNumber;
	@Column(name = "Sire_Name")
	private String sireName;
	@Column(name = "Sire_Exotic")
	private float sireExotic;
	@Column(name = "Sire_Breed_Type")
	private int sireType;
	
	private float Exotic_Blood_Percent;
	
	@ManyToOne(targetEntity = BreedType.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "Breed_Type",referencedColumnName = "Breed_Type_Id",insertable=false,updatable=false)
	  private BreedType selfBreedType;
	
	@ManyToOne(targetEntity = BreedType.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "DAM_Breed_Type",referencedColumnName = "Breed_Type_Id",insertable=false,updatable=false)
	  private BreedType damBreedJoin;
	
	@ManyToOne(targetEntity = BreedType.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "Sire_Breed_Type",referencedColumnName = "Breed_Type_Id",insertable=false,updatable=false)
	  private BreedType sireBreedJoin;
	
	
	public AiFarmAnimalPedigreeDetails() {
		super();

	}
	
	


	public AiFarmAnimalPedigreeDetails(String cID_Number, String nLHD_Number, String animalTagNumber,
			String farmOrFarmerName, String village, String gewog, String dzongkhag, String mobileNumber,
			String animalName, String animalAge, String animalSex, String animalCategory, String chbpp,
			String migration, String migrationRegion, int bcs, String housingType, String damNumber, String damName,
			float damExotic, int damType, String sireNumber, String sireName, float sireExotic, int sireType,
			float exotic_Blood_Percent, BreedType selfBreedType, BreedType damBreedJoin, BreedType sireBreedJoin) {
		super();
		CID_Number = cID_Number;
		NLHD_Number = nLHD_Number;
		this.animalTagNumber = animalTagNumber;
		this.farmOrFarmerName = farmOrFarmerName;
		this.village = village;
		this.gewog = gewog;
		this.dzongkhag = dzongkhag;
		this.mobileNumber = mobileNumber;
		this.animalName = animalName;
		this.animalAge = animalAge;
		this.animalSex = animalSex;
		this.animalCategory = animalCategory;
		this.chbpp = chbpp;
		this.migration = migration;
		this.migrationRegion = migrationRegion;
		this.bcs = bcs;
		this.housingType = housingType;
		this.damNumber = damNumber;
		this.damName = damName;
		this.damExotic = damExotic;
		this.damType = damType;
		this.sireNumber = sireNumber;
		this.sireName = sireName;
		this.sireExotic = sireExotic;
		this.sireType = sireType;
		Exotic_Blood_Percent = exotic_Blood_Percent;
		this.selfBreedType = selfBreedType;
		this.damBreedJoin = damBreedJoin;
		this.sireBreedJoin = sireBreedJoin;
	}





	public String getCID_Number() {
		return CID_Number;
	}


	public void setCID_Number(String cID_Number) {
		CID_Number = cID_Number;
	}


	public String getNLHD_Number() {
		return NLHD_Number;
	}


	public void setNLHD_Number(String nLHD_Number) {
		NLHD_Number = nLHD_Number;
	}


	public String getAnimalTagNumber() {
		return animalTagNumber;
	}


	public void setAnimalTagNumber(String animalTagNumber) {
		this.animalTagNumber = animalTagNumber;
	}


	public String getFarmOrFarmerName() {
		return farmOrFarmerName;
	}


	public void setFarmOrFarmerName(String farmOrFarmerName) {
		this.farmOrFarmerName = farmOrFarmerName;
	}


	public String getVillage() {
		return village;
	}


	public void setVillage(String village) {
		this.village = village;
	}


	public String getGewog() {
		return gewog;
	}


	public void setGewog(String gewog) {
		this.gewog = gewog;
	}


	public String getDzongkhag() {
		return dzongkhag;
	}


	public void setDzongkhag(String dzongkhag) {
		this.dzongkhag = dzongkhag;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getAnimalName() {
		return animalName;
	}


	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	public String getAnimalAge() {
		return animalAge;
	}


	public void setAnimalAge(String animalAge) {
		this.animalAge = animalAge;
	}


	public String getAnimalSex() {
		return animalSex;
	}


	public void setAnimalSex(String animalSex) {
		this.animalSex = animalSex;
	}


	public String getAnimalCategory() {
		return animalCategory;
	}


	public void setAnimalCategory(String animalCategory) {
		this.animalCategory = animalCategory;
	}


	public String getChbpp() {
		return chbpp;
	}


	public void setChbpp(String chbpp) {
		this.chbpp = chbpp;
	}


	public String getMigration() {
		return migration;
	}


	public void setMigration(String migration) {
		this.migration = migration;
	}


	public String getMigrationRegion() {
		return migrationRegion;
	}


	public void setMigrationRegion(String migrationRegion) {
		this.migrationRegion = migrationRegion;
	}


	public int getBcs() {
		return bcs;
	}


	public void setBcs(int bcs) {
		this.bcs = bcs;
	}


	public String getHousingType() {
		return housingType;
	}


	public void setHousingType(String housingType) {
		this.housingType = housingType;
	}


	public String getDamNumber() {
		return damNumber;
	}


	public void setDamNumber(String damNumber) {
		this.damNumber = damNumber;
	}


	public String getDamName() {
		return damName;
	}


	public void setDamName(String damName) {
		this.damName = damName;
	}


	public float getDamExotic() {
		return damExotic;
	}


	public void setDamExotic(float damExotic) {
		this.damExotic = damExotic;
	}


	public int getDamType() {
		return damType;
	}


	public void setDamType(int damType) {
		this.damType = damType;
	}


	public String getSireNumber() {
		return sireNumber;
	}


	public void setSireNumber(String sireNumber) {
		this.sireNumber = sireNumber;
	}


	public String getSireName() {
		return sireName;
	}


	public void setSireName(String sireName) {
		this.sireName = sireName;
	}


	public float getSireExotic() {
		return sireExotic;
	}


	public void setSireExotic(float sireExotic) {
		this.sireExotic = sireExotic;
	}


	public int getSireType() {
		return sireType;
	}


	public void setSireType(int sireType) {
		this.sireType = sireType;
	}


	public float getExotic_Blood_Percent() {
		return Exotic_Blood_Percent;
	}


	public void setExotic_Blood_Percent(float exotic_Blood_Percent) {
		Exotic_Blood_Percent = exotic_Blood_Percent;
	}


	public BreedType getSelfBreedType() {
		return selfBreedType;
	}


	public void setSelfBreedType(BreedType selfBreedType) {
		this.selfBreedType = selfBreedType;
	}


	public BreedType getDamBreedJoin() {
		return damBreedJoin;
	}


	public void setDamBreedJoin(BreedType damBreedJoin) {
		this.damBreedJoin = damBreedJoin;
	}


	public BreedType getSireBreedJoin() {
		return sireBreedJoin;
	}


	public void setSireBreedJoin(BreedType sireBreedJoin) {
		this.sireBreedJoin = sireBreedJoin;
	}


	
}
