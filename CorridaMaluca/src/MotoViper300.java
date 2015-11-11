
public class MotoViper300 extends Veiculo{
	public void correr(int distancia) {
		super.correr(distancia);
		
		
		if(getDistanciaPercorrida() % 250 == 0){
			System.out.println("Velocidade moto anterior: "+ getVelocidade());
			setVelocidade(getVelocidade()*1.023f);
			System.out.println("Velocidade moto Atual: "+ getVelocidade());
			
		}
		
	}
}
