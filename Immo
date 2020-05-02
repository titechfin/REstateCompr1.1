

public class Immo {
	
	double prise;
	double squareMeter;
	double otherKosts;
	double nettoRent;
	double annualEntry;
	double maintenanceCosts; // Unterhaltskosten
	double taxBurden; // Steuerlast
//	double amortisationCost; //Abschriebung
	double rentalReturn; // Mietreinertrag
	String immoName;




	public Immo(double prise , double squareMeter, double otherKosts, double nettoRent, double maintenanceCosts,double taxBurden, String immoName) {
		this.prise=prise;
		this.squareMeter=squareMeter;
		this.otherKosts=otherKosts;
		this.nettoRent=nettoRent;
		this.annualEntry=annualEntry;
		this.rentalReturn=rentalReturn;
		this.maintenanceCosts=maintenanceCosts;
		this.taxBurden=taxBurden;
		this.immoName=immoName;
	}



	//BruttoRendite
	//https://www.interhyp.de/bauen-kaufen/kapitalanlage/rendite-berechnen-fuer-die-immobilie.html
	public double bruttoReturn(double prise,double nettoRent ){
		double bruttoReturn ;
		bruttoReturn = 100 * nettoRent / prise;

		return  bruttoReturn;
	}
	public double nettoReturn(double prise,double otherKosts , double annualEntry ){
		double nettoReturn ;
		double investCost = prise + otherKosts;
		nettoReturn = annualEntry / investCost * 100;

		return  nettoReturn;
	}

	//We implement this function later
	public  double objectReturn(double nettoRent, double maintenanceCosts, double taxBurden ){
		double objectReturn;
		objectReturn= nettoRent - maintenanceCosts - taxBurden;

		return  objectReturn;
	}





	public double getPrise(){

		return prise;

	}
	public String getName(){
		return  immoName;
	}


	public String toString() {


		return  " Summary of  "+immoName+"  - Netto Return:  "+nettoReturn(prise, otherKosts, annualEntry) + " Brutto Return: " +bruttoReturn(prise,nettoRent) + " //";
	}
		

}
