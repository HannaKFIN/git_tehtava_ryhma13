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

	}

} // Mainin loppu

class Lelu
{
	String nimi;
	int paino;
	
	// Muodostimet:
	// Oletusmuodostin:
	public Lelu() {
		nimi = "";
		paino = 0;
	}
	// Parametrinen muodostin:
	public Lelu(String n, int p) {
		nimi = n;
		paino = p;
	}
	
	// Tähän vielä metodi, joka tulostaa olion tiedot:
	public void tulostaTiedot()
	{
		System.out.println("Lelu: " + nimi +", Paino: " + paino + "kg, ");
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
	
	public Vieteriauto(String n, int p, int s) {
		nimi = n;
		paino = p;
		nopeus = s;
	}
	// Kiihdyta metodi vieteriautolle
	public void kiihdyta() {
		nopeus += 1;
	}
	public void tulostaTiedot() {
		System.out.println("Lelu: " + nimi +", Paino:"  + paino + "kg, " + "Nopeus: " + nopeus + "km/h");
	}
}