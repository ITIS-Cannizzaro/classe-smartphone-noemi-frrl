

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
			 marca = "nokia";
			 modello = "3310";
			 prezzoDiLancio = 1347;
			 numPollici = 7.8;
			 ram = 12;
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
		public String toString() {
			return "Smartphone 1: marca=" + marca + ", modello=" + modello + ", prezzoDiLancio=" + prezzoDiLancio
					+ ", numPollici=" + numPollici + ", ram=" + ram + "fascia prezzo" + ottieniFasciaPrezzo() + "tipologia telefono"+ ottieniTipologiaSmartphone();
		}
	}


	
