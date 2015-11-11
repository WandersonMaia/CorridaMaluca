public class CorridaB {

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

		for (int i = 1; i <= 1000; i++) {

			for (int j = 0; j < 1; j++) {

				bicicleta.correr(1);
				tratorNuclear.correr(1);
				skateAtomico.correr(1);
				motoViper.correr(1);
				tanqueFeroz.correr(1);
				fuscaHerb.correr(1);
				
				
			}

			
			System.out.println("\nBicleta percorreu "
					+ bicicleta.getDistanciaPercorrida() + " km em "
					+ bicicleta.getTempoPercorridoHoras()+" horas");

			
			System.out.println("Trator percorreu "
					+ tratorNuclear.getDistanciaPercorrida() + " km em "
					+ tratorNuclear.getTempoPercorridoHoras()+" horas");
			
			
			System.out.println("Skate  percorreu "
					+ skateAtomico.getDistanciaPercorrida() + " km em "
					+ skateAtomico.getTempoPercorridoHoras()+" horas");			
			
			
			System.out.println("Moto percorreu "
					+ motoViper.getDistanciaPercorrida() + " km em "
					+ motoViper.getTempoPercorridoHoras()+" horas");
				
			
			System.out.println("Tanque percorreu "
					+ tanqueFeroz.getDistanciaPercorrida() + " km em "
					+ tanqueFeroz.getTempoPercorridoHoras()+" horas");
			
			
			System.out.println("Fusca percorreu "
					+ fuscaHerb.getDistanciaPercorrida() + " km em "
					+ fuscaHerb.getTempoPercorridoHoras()+" horas\n");
			
			
			
			if(bicicleta.getTempoPercorridoHoras() < tratorNuclear.getTempoPercorridoHoras() 
				&&  bicicleta.getTempoPercorridoHoras() < skateAtomico.getDistanciaPercorrida()
				&&  bicicleta.getTempoPercorridoHoras() < motoViper.getTempoPercorridoHoras()
				&&  bicicleta.getTempoPercorridoHoras() < tanqueFeroz.getTempoPercorridoHoras()
				&&  bicicleta.getTempoPercorridoHoras() < fuscaHerb.getTempoPercorridoHoras())
			{			
				System.out.println(bicicleta.getDistanciaPercorrida() + " km "
						+"Bicleta GANHOU");
			} 
			
			else if(tratorNuclear.getTempoPercorridoHoras() < skateAtomico.getDistanciaPercorrida()
				&&  tratorNuclear.getTempoPercorridoHoras() < motoViper.getTempoPercorridoHoras()
				&&  tratorNuclear.getTempoPercorridoHoras() < tanqueFeroz.getTempoPercorridoHoras()
				&&  tratorNuclear.getTempoPercorridoHoras() < fuscaHerb.getTempoPercorridoHoras())
			{
				
				System.out.println(tratorNuclear.getDistanciaPercorrida() + " km "
						+"Trator GANHOU");
			}
			
			else if(  skateAtomico.getTempoPercorridoHoras() < motoViper.getTempoPercorridoHoras()
					&&  skateAtomico.getTempoPercorridoHoras() < tanqueFeroz.getTempoPercorridoHoras()
					&&  skateAtomico.getTempoPercorridoHoras() < fuscaHerb.getTempoPercorridoHoras())
			{
					
					System.out.println(skateAtomico.getDistanciaPercorrida() + " km "
							+"Skate Atomico GANHOU");
			}
			
			else if( motoViper.getTempoPercorridoHoras() < tanqueFeroz.getTempoPercorridoHoras()
					&&  motoViper.getTempoPercorridoHoras() < fuscaHerb.getTempoPercorridoHoras())
			{
					
					System.out.println(motoViper.getDistanciaPercorrida() + " km "
							+"moto Viper GANHOU");
			}
			
			else if( tanqueFeroz.getTempoPercorridoHoras() < fuscaHerb.getTempoPercorridoHoras())
			{
					
					System.out.println(tanqueFeroz.getDistanciaPercorrida() + " km "
							+"tanque Feroz GANHOU");
			}
			
			else					
					System.out.println(fuscaHerb.getDistanciaPercorrida() + " km "
							+"fusca Herb GANHOU");
			
			
		}

		System.out.println("Acabou a corrida!");
	}

 }
