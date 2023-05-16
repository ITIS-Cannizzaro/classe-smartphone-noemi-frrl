
public class Smartphone {
	private String marca;
	private String modello;
	private double prezzoDiLancio;
	private double numPollici;
	private int ram;
	 
	public Smartphone(String marca, String modello,double prezzoDiLancio,double numPollici,int ram) {
		this.marca = marca;
		this.modello = modello;
		this.prezzoDiLancio = prezzoDiLancio;
		this.numPollici = numPollici;
		this.ram = ram;
	 }
	 public Smartphone() {
		 marca = "PIXEL";
		 modello = "6A";
		 prezzoDiLancio = 450.0;
		 numPollici  = 6.1;
		 ram = 6;
	 }
	 
	 public String getMarca() {
		 return this.marca;
	 }
	 
	 public String getModello() {
		 return this.modello;
	 }
	 
	 public double getPrezzoLancio() {
		 return this.prezzoDiLancio;
	 }
	 
	 public Double getNumPollici() {
		 return this.numPollici;
	 }
	 
	 public int getRam() {
		 return this.ram;
	 }
	 
	 public String ottieniFasciaPrezzo() { 
		 
		 if(prezzoDiLancio>500) {
			 return "fascia alta";
		 } else if(prezzoDiLancio<500 && prezzoDiLancio>200) {
			 return "fascia media";
		 } else {
			 return "fascia bassa";
		 }
	 }
	 
	 public String ottieniTipologiaSmartphone() {
		 
		 if(numPollici<5) {
			 return "mini";
		 }else if(numPollici<7 && numPollici>5) {
			 return "normal";
		 }else {
			 return "maxi";
		 }
		 
		 
	 }

	@Override
	public String toString() {
		return "Smartphone: marca=" + marca + ", modello=" + modello + ", prezzoDiLancio=" + prezzoDiLancio
				+ ", numPollici=" + numPollici + ", ram=" + ram + "fascia prezzo" + ottieniFasciaPrezzo() + "tipologia telefono"+ ottieniTipologiaSmartphone();
	}
	 
}
