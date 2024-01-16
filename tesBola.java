package bola;
public class tesBola {
    public static void main(String[] args) {
        // Create an instance of the Bola class
        Bola bolaObjek = new Bola();

        // Set the initial radius
        double jariJari = 5.0;
        bolaObjek.setJariJari(jariJari);

        // Display initial properties
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());

        // Manipulate the object by setting a new radius
        double newJariJari = 7.0;
        bolaObjek.setJariJari(newJariJari);

        // Display properties after manipulation
        System.out.println("\nSetelah manipulasi:");
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());
    }
}
