package bt.gov.ditt.dairy.model;

import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name = "application_table")
public class AnimalDetailsFarmer {
	@Id
	@Column(name="Animal_Tag_Number")
	private String animalRegistrationNumber;
	
	@Column(name="CID_Number")
	private String cid_number;
	
	@Column(name="Farmer_Name")
	private String owner_name;
	
	@Column(name="Village_Name")
	private String owner_village;
	
	@Column(name="Gewog_Name")
	private String owner_gewog;
	
	@Column(name="Dzongkhag_Name")
	private String owner_dzongkhag;
	
	@Column(name="DAM_Number")
	private String damNumber;
	
	@Column(name="DAM_Exotic")
	private float damExotic;
	
	@Column(name="DAM_Name")
	private String damName;
	
	@Column(name="Sire_Number")
	private String sireNumber;
	
	@Column(name="Sire_Name")
	private String sireName;
	
	@Column(name="Sire_Exotic")
	private float sireExotic;
	
	@Column(name="Housing_Type")
	private String housing_type_option;
	
	@Column(name="Name_Of_Animal")
	private String animalname;
	
	@Column(name="Mobile_Number")
	private String mobile_number;
	
	@Column(name="Date_Of_Birth")
	private Date birthdate;
	
	@Column(name="Age")
	private int animalAge;
	
	@Column(name="Migration")
	private String migration;
	
	@Column(name="Migration_Location")
	private String migrationRegion;
	
	@Column(name="Sex")
	private String sex;
	
	@Column(name="Animal_Category")
	private String category;
	
	@Column(name="BCS")
	private int bcs;
	
	@Column(name="DAM_Breed_Type")
	private int damBreedId;
	
//	@Column(name="Dam_NBI")
//	private Integer damNbi;
	
	@Column(name="Sire_Breed_Type")
	private int sireBreedId;
//	
//	@Column(name="Sire_NBI")
//	private Integer sireNbi;
	
	@Column(name="Breed_Type")
	private int animalBreedType;
	
	@Column(name="CHPP")
	private String chbpp;
	
	@Column(name="Exotic_Blood_Percent")
	private float animalExotic;
	
	
	

	public AnimalDetailsFarmer() {
		super();
		// TODO Auto-generated constructor stub
	}




	public AnimalDetailsFarmer(String animalRegistrationNumber, String cid_number, String owner_name,
			String owner_village, String owner_gewog, String owner_dzongkhag, String damNumber, float damExotic,
			String damName, String sireNumber, String sireName, float sireExotic, String housing_type_option,
			String animalname, String mobile_number, Date birthdate, int animalAge, String migration,
			String migrationRegion, String sex, String category, int bcs, int damBreedId, int sireBreedId,
			int animalBreedType, String chbpp, float animalExotic) {
		super();
		this.animalRegistrationNumber = animalRegistrationNumber;
		this.cid_number = cid_number;
		this.owner_name = owner_name;
		this.owner_village = owner_village;
		this.owner_gewog = owner_gewog;
		this.owner_dzongkhag = owner_dzongkhag;
		this.damNumber = damNumber;
		this.damExotic = damExotic;
		this.damName = damName;
		this.sireNumber = sireNumber;
		this.sireName = sireName;
		this.sireExotic = sireExotic;
		this.housing_type_option = housing_type_option;
		this.animalname = animalname;
		this.mobile_number = mobile_number;
		this.birthdate = birthdate;
		this.animalAge = animalAge;
		this.migration = migration;
		this.migrationRegion = migrationRegion;
		this.sex = sex;
		this.category = category;
		this.bcs = bcs;
		this.damBreedId = damBreedId;
		this.sireBreedId = sireBreedId;
		this.animalBreedType = animalBreedType;
		this.chbpp = chbpp;
		this.animalExotic = animalExotic;
	}




	public String getAnimalRegistrationNumber() {
		return animalRegistrationNumber;
	}




	public void setAnimalRegistrationNumber(String animalRegistrationNumber) {
		this.animalRegistrationNumber = animalRegistrationNumber;
	}




	public String getCid_number() {
		return cid_number;
	}




	public void setCid_number(String cid_number) {
		this.cid_number = cid_number;
	}




	public String getOwner_name() {
		return owner_name;
	}




	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}




	public String getOwner_village() {
		return owner_village;
	}




	public void setOwner_village(String owner_village) {
		this.owner_village = owner_village;
	}




	public String getOwner_gewog() {
		return owner_gewog;
	}




	public void setOwner_gewog(String owner_gewog) {
		this.owner_gewog = owner_gewog;
	}




	public String getOwner_dzongkhag() {
		return owner_dzongkhag;
	}




	public void setOwner_dzongkhag(String owner_dzongkhag) {
		this.owner_dzongkhag = owner_dzongkhag;
	}




	public String getDamNumber() {
		return damNumber;
	}




	public void setDamNumber(String damNumber) {
		this.damNumber = damNumber;
	}




	public float getDamExotic() {
		return damExotic;
	}




	public void setDamExotic(float damExotic) {
		this.damExotic = damExotic;
	}




	public String getDamName() {
		return damName;
	}




	public void setDamName(String damName) {
		this.damName = damName;
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




	public String getHousing_type_option() {
		return housing_type_option;
	}




	public void setHousing_type_option(String housing_type_option) {
		this.housing_type_option = housing_type_option;
	}




	public String getAnimalname() {
		return animalname;
	}




	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}




	public String getMobile_number() {
		return mobile_number;
	}




	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}




	public Date getBirthdate() {
		return birthdate;
	}




	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}




	public int getAnimalAge() {
		return animalAge;
	}




	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
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




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}




	public int getBcs() {
		return bcs;
	}




	public void setBcs(int bcs) {
		this.bcs = bcs;
	}




	public int getDamBreedId() {
		return damBreedId;
	}




	public void setDamBreedId(int damBreedId) {
		this.damBreedId = damBreedId;
	}




	public int getSireBreedId() {
		return sireBreedId;
	}




	public void setSireBreedId(int sireBreedId) {
		this.sireBreedId = sireBreedId;
	}




	public int getAnimalBreedType() {
		return animalBreedType;
	}




	public void setAnimalBreedType(int animalBreedType) {
		this.animalBreedType = animalBreedType;
	}




	public String getChbpp() {
		return chbpp;
	}




	public void setChbpp(String chbpp) {
		this.chbpp = chbpp;
	}




	public float getAnimalExotic() {
		return animalExotic;
	}




	public void setAnimalExotic(float animalExotic) {
		this.animalExotic = animalExotic;
	}
	
	
}
