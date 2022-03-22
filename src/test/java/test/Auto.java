
package test;
public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	
	static int cantidadCreados;
	
	int cantidadAsientos() {
		
		int numeroasientos=0;
		
		for (Asiento asiento : this.asientos) {
			
			if(asiento != null) {
				numeroasientos++;
			}
		}
		
		return numeroasientos;
	}
	
	String verificarIntegridad() {
				
		boolean original=true;
		int ultmres=0;
		
		for (int i = 0; i < this.asientos.length -1; i++) {
			
			Asiento asiento1=new Asiento();
			Asiento asiento2=new Asiento();
			
			asiento1=this.asientos[i];
			asiento2=this.asientos[i+1];
			
			if(asiento1.registro!=asiento2.registro) {
				original =false;				
				break;
			}
			
			ultmres=asiento1.registro;
			
		}
		
		if(!original) {
			
			return("Las piezas no son  originales");
				
		}
		
		if((this.registro == this.motor.registro) && (this.motor.registro== ultmres) ) {
			
			return "Auto original";
			
		}
		
		
		
		return "Las piezas no son  originales";
		
		
	}
		
				
}
