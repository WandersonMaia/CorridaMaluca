
public class TratorNuclear extends Veiculo{

	
	public void correr(int distancia) {
		super.correr(distancia);
		
		
		if(getDistanciaPercorrida() % 50 == 0){
			System.out.println("Autonomia Trator anterior: "+ getAutonomia());
			setAutonomia (0.99f*getAutonomia());
			System.out.println("Autonomia Trator Atual: "+ getAutonomia());
			
		}
		
	}
}
