
public class Veiculo {

	private String nome;
	
	private float velocidade;
	
	private float autonomia;
	
	private float tempoAbastecimento;
	
	private float distanciaPercorrida;
	
	private float tanqueGasolina;
	
	private float tempoPercorridoHoras;
	
	private float tamanhoTanque;
	
	private int voltas;
	
	public void correr(int distancia) {
//		System.out.println("Correndo a distancia de"+ distancia);
		
		distanciaPercorrida += distancia;
		
		tempoPercorridoHoras += distancia/velocidade;
		
		tanqueGasolina -= distancia/autonomia;
		
		if(tanqueGasolina<=0){
			System.out.print("Abastancendo...");
			
			tanqueGasolina = tamanhoTanque;
			
			float tempoAbast = tempoAbastecimento;
			
			tempoPercorridoHoras += tempoAbast;
			
			System.out.println("Feito!");
		}
	}
	
	public float getDistanciaPercorrida() {
		return distanciaPercorrida;
	}



	public void setDistanciaPercorrida(float distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}



	public float getTanqueGasolina() {
		return tanqueGasolina;
	}



	public void setTanqueGasolina(float tanqueGasolina) {
		this.tanqueGasolina = tanqueGasolina;
	}



	public float getTempoPercorridoHoras() {
		return tempoPercorridoHoras;
	}



	public void setTempoPercorridoHoras(float tempoPercorridoHoras) {
		this.tempoPercorridoHoras = tempoPercorridoHoras;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public float getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}

	public float getTempoAbastecimento() {
		return tempoAbastecimento;
	}

	public void setTempoAbastecimento(float tempoAbastecimento) {
		this.tempoAbastecimento = tempoAbastecimento;
	}

	public float getTamanhoTanque() {
		return tamanhoTanque;
	}

	public void setTamanhoTanque(float tamanhoTanque) {
		this.tamanhoTanque = tamanhoTanque;
	}
	
	
	public int getVoltas() {
		return voltas;
	}

	public void setVoltas(int voltas) {
		this.voltas = voltas;
	}

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		System.out.printf("%d%d%d", 1,2,3);
	}
	
}
