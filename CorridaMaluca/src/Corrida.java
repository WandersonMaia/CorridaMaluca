public class Corrida {

	public static void main(String[] args) {
		Veiculo bicicleta = new BicicletaVoador();
		bicicleta.setNome("Bicicleta Voadora");
		bicicleta.setAutonomia(27);
		bicicleta.setTamanhoTanque(15);
		bicicleta.setVelocidade(40);
		bicicleta.setTempoAbastecimento(CorridaUtil.obterTempoEmHoras(20));
		bicicleta.setTanqueGasolina(bicicleta.getTamanhoTanque());

		Veiculo tratorNuclear = new TratorNuclear();
		tratorNuclear.setNome("Trator Plutonio");
		tratorNuclear.setAutonomia(12);
		tratorNuclear.setTamanhoTanque(100);
		tratorNuclear.setVelocidade(55);
		tratorNuclear.setTempoAbastecimento(CorridaUtil.obterTempoEmHoras(120));
		tratorNuclear.setTanqueGasolina(tratorNuclear.getTamanhoTanque());
				
		Veiculo skateAtomico = new SkateAtomico();
		skateAtomico.setNome("State Plutonio");
		skateAtomico.setAutonomia(45);
		skateAtomico.setTamanhoTanque(5);
		skateAtomico.setVelocidade(68);
		skateAtomico.setTempoAbastecimento(CorridaUtil.obterTempoEmHoras(60));
		skateAtomico.setTanqueGasolina(tratorNuclear.getTamanhoTanque());
		
		Veiculo motoViper = new MotoViper300();
		motoViper.setNome("Moto Viper 300");
		motoViper.setAutonomia(20);
		motoViper.setTamanhoTanque(10);
		motoViper.setVelocidade(35);
		motoViper.setTempoAbastecimento(CorridaUtil.obterTempoEmHoras(6));
		motoViper.setTanqueGasolina(tratorNuclear.getTamanhoTanque());
		
		Veiculo tanqueFeroz = new TanqueFeroz();
		tanqueFeroz.setNome("Tanque Feroz");
		tanqueFeroz.setAutonomia(18);
		tanqueFeroz.setTamanhoTanque(120);
		tanqueFeroz.setVelocidade(70);
		tanqueFeroz.setTempoAbastecimento(CorridaUtil.obterTempoEmHoras(90));
		tanqueFeroz.setTanqueGasolina(tratorNuclear.getTamanhoTanque());
		
		Veiculo fuscaHerb = new FuscaHerb();
		fuscaHerb.setNome("Fusca Herb");
		fuscaHerb.setAutonomia(4);
		fuscaHerb.setTamanhoTanque(20);
		fuscaHerb.setVelocidade(35);
		fuscaHerb.setTempoAbastecimento(CorridaUtil.obterTempoEmHoras(1));
		fuscaHerb.setTanqueGasolina(tratorNuclear.getTamanhoTanque());
		
		for (int i = 0; i < 75; i++) {
			
			for (int j = 0; j < 67; j++) {
				
				bicicleta.correr(1);
				tratorNuclear.correr(1);
				skateAtomico.correr(1);
				motoViper.correr(1);
				tanqueFeroz.correr(1);
				fuscaHerb.correr(1);
			}
			
			bicicleta.setVoltas(i);
			tratorNuclear.setVoltas(i);
			skateAtomico.setVoltas(i);
			motoViper.setVoltas(i);
			tanqueFeroz.setVoltas(i);
			fuscaHerb.setVoltas(i);
		}

		System.out.println("Bicleta percorreu "
				+ bicicleta.getDistanciaPercorrida() + " km em "
				+ bicicleta.getTempoPercorridoHoras()+" horas");
		System.out.println("Bicleta tanque: "+bicicleta.getTanqueGasolina());

		
		System.out.println("Trator percorreu "
				+ tratorNuclear.getDistanciaPercorrida() + " km em "
				+ tratorNuclear.getTempoPercorridoHoras()+" horas");
		System.out.println("Trator tanque: "+tratorNuclear.getTanqueGasolina());

		System.out.println("Acabou a corrida!");
		
		
		System.out.println("Skate  percorreu "
				+ skateAtomico.getDistanciaPercorrida() + " km em "
				+ skateAtomico.getTempoPercorridoHoras()+" horas");
		System.out.println("Skate Tanque : "+skateAtomico.getTanqueGasolina());

		System.out.println("Acabou a corrida!");
		
		
		System.out.println("Moto percorreu "
				+ motoViper.getDistanciaPercorrida() + " km em "
				+ motoViper.getTempoPercorridoHoras()+" horas");
		System.out.println("Moto Tanque : "+motoViper.getTanqueGasolina());

		System.out.println("Acabou a corrida!");
		
		
		System.out.println("Tanque percorreu "
				+ tanqueFeroz.getDistanciaPercorrida() + " km em "
				+ tanqueFeroz.getTempoPercorridoHoras()+" horas");
		System.out.println("Tanque Tanque : "+tanqueFeroz.getTanqueGasolina());

		System.out.println("Acabou a corrida!");
		
		
		System.out.println("Fusca percorreu "
				+ fuscaHerb.getDistanciaPercorrida() + " km em "
				+ fuscaHerb.getTempoPercorridoHoras()+" horas");
		System.out.println("Fusca Tanque : "+fuscaHerb.getTanqueGasolina());

		System.out.println("Acabou a corrida!");
	}

	
}
