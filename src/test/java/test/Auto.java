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
				

		int ultmres=0;
		int i=0;
		int j=1;
		
		while(j!=this.asientos.length) {
			
			if(asientos[j]==null) {
				j+=1;
			}
			else {
				if(asientos[j].registro != asientos[i].registro) {
					return("Las piezas no son  originales");					
				}
				else {
					i=j;
					j+=1;
				}
			}
		}
		
		ultmres=asientos[i].registro;
		
		if((this.registro == this.motor.registro) && (this.motor.registro== ultmres) ) {
			
			return "Auto original";
			
		}
				
		
		return "Las piezas no son  originales";	
		
	}
		
				
}
