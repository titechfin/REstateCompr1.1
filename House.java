
public class House extends Immo {

	double prise;
	double squareMeter;
	double otherKosts;
	double nettoRent;
	double annualEntry;
	double rentalReturn;
	double maintenanceCosts;
	double taxBurden;
	String immoName;


	public House(double prise, double squareMeter, double otherKosts, double nettoRent, double maintenanceCosts, double taxBurden,  String immoName) {
		super(prise,squareMeter,otherKosts,nettoRent, maintenanceCosts, taxBurden, immoName);
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
	public double bruttoReturn(double prise,double nettoRent ){
		double bruttoReturn ;
		bruttoReturn = 100 * nettoRent / prise;

		return  bruttoReturn;
	}

	public  double objectReturn(double rentalReturn, double maintenanceCosts, double taxBurden ){
		double objectReturn;
		objectReturn= rentalReturn - maintenanceCosts - taxBurden;
		return  objectReturn;
	}

	public double getPrise(){

		return prise;

	}

	public double nettoReturn(double prise,double otherKosts , double annualEntry ){
		double nettoReturn ;
		double investCost = prise + otherKosts;
		nettoReturn = annualEntry / investCost * 100;

		return  nettoReturn;
	}


	public String toString() {


		return  " Summary of  "+immoName+"  - Netto Return:  "+nettoReturn(prise, otherKosts, annualEntry) + " Brutto Return: " +bruttoReturn(prise,nettoRent) + " //";
	}


}
