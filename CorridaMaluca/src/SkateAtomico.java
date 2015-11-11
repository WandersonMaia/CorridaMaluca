
public class SkateAtomico extends Veiculo{
	
	public void correr(int distancia) {
		super.correr(distancia);
		
		
		if(getDistanciaPercorrida() % 1000 == 0){
			System.out.println("Velocidade skate anterior: "+ getVelocidade());
			setVelocidade(getVelocidade()*1.05f);
			System.out.println("Velocidade skate Atual: "+ getVelocidade());
			
		}
		
	}

}
