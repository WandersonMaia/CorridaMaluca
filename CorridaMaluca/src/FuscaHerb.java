
public class FuscaHerb extends Veiculo{

	public void correr(int distancia) {
		super.correr(distancia);
		
		
		if(getDistanciaPercorrida() % 100 == 0){
			System.out.println("Autonomia Trator anterior: "+ getAutonomia());
			setAutonomia (0.995f*getAutonomia());
			System.out.println("Autonomia Trator Atual: "+ getVelocidade());
			
		}
		
	}

}
