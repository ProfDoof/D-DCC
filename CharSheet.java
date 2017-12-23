public class CharSheet {

	//Character Sheet Banner
	private String playerName = "";
	private String charName = "";
	private String charClass = "";
	private int charLevel = 0;
	private String charBackground = "";
	private String charRace = "";
	private String charAlignment = "";
	private int charExp = 0;
	
	//Character Stats
	private int statStr = 0;
	private int statAgi = 0;
	private int statCon = 0;
	private int statInt = 0;
	private int statWis = 0;
	private int statCha = 0;
	
	//Passive Perception
	private int pasPerc = 0;
	
	//Skill CC boolean
	private boolean skAcro = false;
	private boolean skAnim = false;
	private boolean skArca = false;
	private boolean skAthl = false;
	private boolean skDece = false;
	private boolean skHist = false;
	private boolean skInsi = false;
	private boolean skInti = false;
	private boolean skInve = false;
	private boolean skMedi = false;
	private boolean skNatu = false;
	private boolean skPerc = false;
	private boolean skPerf = false;
	private boolean skPers = false;
	private boolean skReli = false;
	private boolean skSoH  = false;
	private boolean skStel = false;
	private boolean skSurv = false;
	
	//Skill Values
	private int skvAcro = 0;
	private int skvAnim = 0;
	private int skvArca = 0;
	private int skvAthl = 0;
	private int skvDece = 0;
	private int skvHist = 0;
	private int skvInsi = 0;
	private int skvInti = 0;
	private int skvInve = 0;
	private int skvMedi = 0;
	private int skvNatu = 0;
	private int skvPerc = 0;
	private int skvPerf = 0;
	private int skvPers = 0;
	private int skvReli = 0;
	private int skvSoH  = 0;
	private int skvStel = 0;
	private int skvSurv = 0;

	//Miscellaneous Information
	private int AC = 0;
	private int Initiative = 0;
	private int Speed = 0;
	private int HPMax = 0;
	private int HPCur = 0;
	private int HPTem = 0;
	private int HDTot = 0;
	private int HDRem = 0;

	//Weapons
	private String weaponOne = "";
	private int weaponOneAtk = 0;
	private String weaOneDmg = "";
	private String weaponTwo = "";
	private int weaponTwoAtk = 0;
	private String weaTwoDmg = "";
	private String weaponThree = "";
	private int weaponThreeAtk = 0;
	private String weaThreeDmg = "";

	//Armor
	private String armor = "";
	private int armorAC = 0;
	private boolean shield = false;	

	//Character Traits
	private String persTraits = "";
	private String Ideals = "";
	private String Bonds = "";
	private String Flaws = "";
	private String FandT = "";

	//Money
	private int CP = 0;
	private int SP = 0;
	private int EP = 0;
	private int GP = 0;


	//Getters and Setters
	//Setters and Getters for the Character Banner
	public void setCharName(String input) { charName = input; }
	public String getCharName() { return charName; }

	public void setPlayerName(String input) { playerName = input; }
	public String getPlayerName() { return playerName; }

	public void setCharClass(String input) { charClass = input; }
	public String getCharClass() { return charClass; }

	public void setCharLevel(int input) { charLevel = input; }
	public int getCharLevel() { return charLevel; }

	public void setCharBackground(String input) { charBackground = input; }
	public String getCharBackground() { return charBackground; }

	public void setCharRace(String input) { charRace = input; }
	public String getCharRace() { return charRace; }

	public void setCharAlignment(String input) { charAlignment = input; }
	public String getCharAlignment() { return charAlignment; }

	//Setters and Getters for Statistics
	public void setCharExp(int input) { charExp = input; }
	public int getCharExp() { return charExp; }

	public void setStatStr(int input) { statStr = input; }
	public int getStatStr() { return statStr; }

	public void setStatAgi(int input) { statAgi = input; }
	public int getStatAgi() { return statAgi; }

	public void setStatCon(int input) { statCon = input; }
	public int getStatCon() { return statCon; }

	public void setStatInt(int input) { statInt = input; }
	public int getStatInt() { return statInt; }

	public void setStatWis(int input) { statWis = input; }
	public int getStatWis() { return statWis; }

	public void setStatCha(int input) { statCha = input; }
	public int getStatCha() { return statCha; }

	public void setPasPerc(int input) { pasPerc = input; }
	public int getPasPerc() { return pasPerc; }

	//Setters and Getters for Skill Booleans
	public void setSkAcro(boolean input) { skAcro = input; }
	public boolean getSkAcro() { return skAcro; }

	public void setSkAnim(boolean input) { skAnim = input; }
	public boolean getSkAnim() { return skAnim; }

	public void setSkArca(boolean input) { skArca = input; }
	public boolean getSkArca() { return skArca; }

	public void setSkAthl(boolean input) { skAthl = input; }
	public boolean getSkAthl() { return skAthl; }

	public void setSkDece(boolean input) { skDece = input; }
	public boolean getSkDece() { return skDece; }

	public void setSkHist(boolean input) { skHist = input; }
	public boolean getSkHist() { return skHist; }

	public void setSkInsi(boolean input) { skInsi = input; }
	public boolean getSkInsi() { return skInsi; }

	public void setSkInti(boolean input) { skInti = input; }
	public boolean getSkInti() { return skInti; }

	public void setSkInve(boolean input) { skInve = input; }
	public boolean getSkInve() { return skInve; }

	public void setSkMedi(boolean input) { skMedi = input; }
	public boolean getSkMedi() { return skMedi; }

	public void setSkNatu(boolean input) { skNatu = input; }
	public boolean getSkNatu() { return skNatu; }

	public void setSkPerc(boolean input) { skPerc = input; }
	public boolean getSkPerc() { return skPerc; }

	public void setSkPerf(boolean input) { skPerf = input; }
	public boolean getSkPerf() { return skPerf; }

	public void setSkPers(boolean input) { skPers = input; }
	public boolean getSkPers() { return skPers; }

	public void setSkReli(boolean input) { skReli = input; }
	public boolean getSkReli() { return skReli; }

	public void setSkSoH(boolean input) { skSoH = input; }
	public boolean getSkSoH() { return skSoH; }

	public void setSkStel(boolean input) { skStel = input; }
	public boolean getSkStel() { return skStel; }

	public void setSkSurv(boolean input) { skSurv = input; }
	public boolean getSkSurv() { return skSurv; }

	//Setters and Getters for Skill Values
	public void setSkvSurv(int input) { skvSurv = input; }
	public int getSkvSurv() { return skvSurv; }

	public void setSkvStel(int input) { skvStel = input; }
	public int getSkvStel() { return skvStel; }

	public void setSkvSoH(int input) { skvSoH = input; }
	public int getSkvSoH() { return skvSoH; }

	public void setSkvReli(int input) { skvReli = input; }
	public int getSkvReli() { return skvReli; }

	public void setSkvPers(int input) { skvPers = input; }
	public int getSkvPers() { return skvPers; }

	public void setSkvPerf(int input) { skvPerf = input; }
	public int getSkvPerf() { return skvPerf; }

	public void setSkvPerc(int input) { skvPerc = input; }
	public int getSkvPerc() { return skvPerc; }

	public void setSkvNatu(int input) { skvNatu = input; }
	public int getSkvNatu() { return skvNatu; }

	public void setSkvMedi(int input) { skvMedi = input; }
	public int getSkvMedi() { return skvMedi; }

	public void setSkvInve(int input) { skvInve = input; }
	public int getSkvInve() { return skvInve; }

	public void setSkvInti(int input) { skvInti = input; }
	public int getSkvInti() { return skvInti; }

	public void setSkvInsi(int input) { skvInsi = input; }
	public int getSkvInsi() { return skvInsi; }

	public void setSkvHist(int input) { skvHist = input; }
	public int getSkvHist() { return skvHist; }

	public void setSkvDece(int input) { skvDece = input; }
	public int getSkvDece() { return skvDece; }

	public void setSkvAthl(int input) { skvAthl = input; }
	public int getSkvAthl() { return skvAthl; }

	public void setSkvArca(int input) { skvArca = input; }
	public int getSkvArca() { return skvArca; }

	public void setSkvAnim(int input) { skvAnim = input; }
	public int getSkvAnim() { return skvAnim; }

	public void setSkvAcro(int input) { skvAcro = input; }
	public int getSkvAcro() { return skvAcro; }

	//Setters and Getters for Miscellaneous Information
	public int getAC() { return AC; }
	public void setAC(int input) { AC = input; }

	public int getInitiative() { return Initiative; }
	public void setInitiative(int input) { Initiative = input; }

	public int getSpeed() { return Speed; }
	public void setSpeed(int input) { Speed = input; }

	public int getHPMax() { return HPMax; }
	public void setHPMax(int input) { HPMax = input; }

	public int getHPCur() { return HPCur; }
	public void setHPCur(int input) { HPCur = input; }

	public int getHPTem() { return HPTem; }
	public void setHPTem(int input) { HPTem = input; }

	public int getHDTot() { return HDTot; }
	public void setHDTot(int input) { HDTot = input; }

	public int getHDRem() { return HDRem; }
	public void setHDRem(int input) { HDRem = input; }

	//getters and setters for weapons
	public String getWeaponOne() { return weaponOne; }
	public void setWeaponOne(String input) { weaponOne = input; }

	public String getWeaponTwo() { return weaponTwo; }
	public void setWeaponTwo(String input) { weaponTwo = input; }

	public String getWeaponThree() { return weaponThree; }
	public void setWeaponThree(String input) { weaponThree = input; }

	public int getWeaponOneAtk() { return weaponOneAtk; }
	public void setWeaponOneAtk(int input) { weaponOneAtk = input; }

	public int getWeaponTwoAtk() { return weaponTwoAtk; }
	public void setWeaponTwoAtk(int input) { weaponTwoAtk = input; }

	public int getWeaponThreeAtk() { return weaponThreeAtk; }
	public void setWeaponThreeAtk(int input) { weaponThreeAtk = input; }

	public String getWeaponOneDmg() { return weaOneDmg; }
	public void setWeaponOneDmg(String input) { weaOneDmg = input; }

	public String getWeaponTwoDmg() { return weaTwoDmg; }
	public void setWeaponTwoDmg(String input) { weaTwoDmg = input; }

	public String getWeaponThreeDmg() { return weaThreeDmg; }
	public void setWeaponThreeDmg(String input) { weaThreeDmg = input; }

	//Getters and Setters for Armor
	public String getArmor() { return armor; }
	public void setArmor(String input) { armor = input; }

	public int getArmorAC() { return armorAC; }
	public void setArmorAC(int input) { armorAC = input; }

	public boolean getShieldBool() { return shield; }
	public void setShieldBool(boolean input) { shield = input; }

	//Getters and Setters for Traits
	public void addPersTraits(String input) { persTraits = persTraits + "\n" + input; }
	public void cleanPersTraits() { persTraits = ""; }

	public void addIdeals(String input) { Ideals = Ideals + "\n" + input; }
	public void cleanIdeals() { Ideals = ""; }

	public void addBonds(String input) { Bonds = Bonds + "\n" + input; }
	public void cleanBonds() { Bonds = ""; }

	public void addFlaws(String input) { Flaws = Flaws + "\n" + input; }
	public void cleanFlaws() { Flaws = ""; }

	public void addFandT(String input) { FandT = FandT + "\n" + input; }
	public void cleanFandT() { FandT = ""; }

	//Getters and Setters for Money
	public void addCP(int input) { CP = CP + input; }
	public void cleanCP() { CP = 0; }

	public void addSP(int input) { SP = SP + input; }
	public void cleanSP() { SP = 0; }

	public void addEP(int input) { EP = EP + input; }
	public void cleanEP() { EP = 0; }

	public void addGP(int input) { GP = GP + input; }
	public void cleanGP() { GP = 0; }
}