
public class TanqueFeroz extends Veiculo{
	public void correr(int distancia) {
		super.correr(distancia);
		
		
		if(getDistanciaPercorrida() % 200 == 0){
			System.out.println("tamanhoTanque TANQUE anterior: "+ getTamanhoTanque());
			setTamanhoTanque (0.995f*getTamanhoTanque() );
			System.out.println("tamanhoTanque TANQUE  Atual: "+ getTamanhoTanque());
			
		}
		
	}
}
