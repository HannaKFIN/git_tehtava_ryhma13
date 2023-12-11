package git_tehtava_ryhma13;

public class Main {

	public static void main(String[] args) {
		
		// LELU-LUOKKA tehtävänanto:
		
//		Tee kantaluokka Lelu, jolla on kaksi attribuuttia (esim. nimi ja paino), oletusmuodostin, yksi muodostin kaikilla parametreilla ja metodi, joka tulostaa olion tiedot.
//
//		Tee toinen luokka - Vieteriauto, joka perii yllä tehdyn Lelu-kantaluokan.
//
//		Tee Vieteriauto-luokalle tarvittavat muodostimet.
//
//		Määrittele Vieteriauto-luokkaan attribuutti nopeus ja kiihdyta-metodi, joka kasvattaa nopeus-attribuutin arvoa yhdellä.
//
//		Tee Vieteriauto-luokalle metodi, joka tulostaa kaikki olion tiedot. Nimeä metodi saman nimiseksi kuin Lelu-luokan “tietojen tulostus” -metodi. Ylikirjoita (override) Vieteriauton “tietojen tulostus” -metodi.
//
//		Tee olio Lelu-luokasta ja tulosta sen tiedot.
//
//		Tee olio Vieteriauto-luokasta ja tulosta sen tiedot.
//
//		Muuta jokin kantaluokan attribuutti privateksi, publicin tai protectedin sijaan (esim. paino). Mitä tapahtuu?
//
//		Entä, jos muutat Lelu-luokan “tietojen tulostus” -metodin näkyvyydeksi private tai protected...?
//
//		Jos intoa vielä riittää, periytä Lelu-luokasta jokin toinen luokka.
		
		Lelu nalle = new Lelu("Nalle", 0.14);
		nalle.tulostaTiedot();
		
		Vieteriauto auto1 = new Vieteriauto("Auto1", 0.5, 0);
		System.out.println();
		
		auto1.tulostaTiedot();
		auto1.kiihdyta();
		auto1.tulostaTiedot();
		auto1.kiihdyta();
		auto1.tulostaTiedot();
		System.out.println();
		
		Juna juna1 = new Juna("Juna", 0.4, 4);
		juna1.tulostaTiedot();

	}

} // Mainin loppu

class Lelu
{
	// protectedilla attribuutit näkyvät perivälle luokalle, privatella eivät
	protected String nimi;
	protected double paino;
	
	// Muodostimet:
	// Oletusmuodostin:
	public Lelu() {
		nimi = "";
		paino = 0;
	}
	// Parametrinen muodostin:
	public Lelu(String n, double p) {
		nimi = n;
		paino = p;
	}
	
	// Tähän vielä metodi, joka tulostaa olion tiedot:
	protected void tulostaTiedot()
	{
		System.out.println("Lelu: " + nimi +", Paino: " + paino + "kg");
	}
}// Lelu luokan loppu

//Vieteriauto luokka

class Vieteriauto extends Lelu
{
	int nopeus;
	
	public Vieteriauto() {
		nimi  = "";
		paino = 0;
		nopeus = 0;
	}
	
	public Vieteriauto(String n, double p, int s) {
		nimi = n;
		paino = p;
		nopeus = s;
	}
	// Kiihdyta metodi vieteriautolle
	public void kiihdyta() {
		nopeus += 1;
	}
	@Override
	public void tulostaTiedot() {
		System.out.println("Lelu: " + nimi +", Paino:"  + paino + "kg, " + "Nopeus: " + nopeus + "km/h");
	}
	
}// Vieteriauto luokan loppu

class Juna extends Lelu
{
	
	int vaunujenMaara;
	
	// Oletusmuodostin:
	public Juna() {
		nimi = "";
		paino = 0;
		vaunujenMaara = 0;
	}
	// Parametrinen muodostin:
	public Juna(String n, double p, int vM) {
		nimi = n;
		paino = p;
		vaunujenMaara = vM;
	}
	@Override
	public void tulostaTiedot() {
		System.out.println("Lelu: " + nimi +", Paino:"  + paino + "kg, " + "Vaunujen määrä: " + vaunujenMaara + "kpl");
	}
	
}// Juna luokan loppu