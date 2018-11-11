package pkgEnum;

import java.util.EnumMap;

public enum eGameDifficulty {

	Easy(100), Medium(500), Hard(1000);

	private final int iDifficulty;

	// Reverse-lookup map for getting a day from an abbreviation
	private static final EnumMap<eGameDifficulty, Integer> lookup = new EnumMap<eGameDifficulty, Integer>(
			eGameDifficulty.class);

	static {
		for (eGameDifficulty d : eGameDifficulty.values()) {
			lookup.put(d, d.getiDifficulty());
		}
	}

	private eGameDifficulty(int iDifficulty) {
		this.iDifficulty = iDifficulty;
	}

	public int getiDifficulty() {
		return iDifficulty;
	}

//	private eGameDifficulty get(String strName) {
//		for (eGameDifficulty eGD : eGameDifficulty.values()) {
//			System.out.println(eGD.name().toUpperCase());
//			if (eGD.name().toUpperCase().equals(strName.toUpperCase())) {
//				return eGD;
//			}
//		}
//		return null;
//	}
	
	public eGameDifficulty get(int iValueToCheck) {
		eGameDifficulty eGDSelected = null;
		for (eGameDifficulty eGD : eGameDifficulty.values()) {
			if (iValueToCheck >= eGD.iDifficulty) {
				eGDSelected = eGD;
			}
		} return eGDSelected;
	}

//	@Override
//	public String toString() {
//		return this.name().substring(0, 1).toUpperCase() + this.name().substring(1,end);
//	}

}
