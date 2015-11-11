
public class BicicletaVoador extends Veiculo{
	
	public void correr(int distancia) {
		super.correr(distancia);
		
		
		if(getDistanciaPercorrida() % 500 == 0){
			System.out.println("Tempo Abastecimento Bicileta anterior: "+ getTempoAbastecimento ());
			setTempoAbastecimento (getTempoAbastecimento()*1.05f);
			System.out.println("Tempo Abastecimento Bicicleta Atual: "+ getTempoAbastecimento());
			
		}
		
	}

}
