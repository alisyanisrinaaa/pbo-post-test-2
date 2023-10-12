package tokopakaian;

// Class Celana dari turunan class Item
public class Celana extends Item {
    private final String size; // Ukuran celana

    // COnstructor untuk inisialisasi objek Celana
    public Celana(String id, String name, int price, String size) {
        super(id, name, price); // Memanggil constructor class Item
        this.size = size; // Inisialisasi ukuran celana
    }

    // Metode getter untuk mendapatkan ukuran celana
    public final String getSize() { 
        return size; 
    }

    // Implementasi displayItemDetails dari class Item
    @Override
    public void displayItemDetails() {
        System.out.println(">>>>>> Detail Celana <<<<<<");
        System.out.println("ID Celana : " + getId()); // Menampilkan ID Celana
        System.out.println("Nama Celana : " + getName()); //Menampilkan Nama Celana 
        System.out.println("HArga Celana : Rp. " + getPrice()); //Menampilkan Harga Celana
        System.out.println("Ukuran Celana : " + getSize()); //Menampilkan Ukuran Celana
        System.out.println();
    }
}
