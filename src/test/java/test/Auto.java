package test;
public class Auto {
	//Atributos
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
				

		if (motor.registro != registro) {
			return "Las piezas no son originales";
		}
		
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null && asientos[i].registro != registro){
				return "Las piezas no son originales";
			}
		}
		
		return "Auto original";
	}
		
				
}
