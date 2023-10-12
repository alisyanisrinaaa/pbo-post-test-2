package tokopakaian;

public class Baju extends Item { // Kelas Baju yang merupakan turunan dari kelas Item
    private final String size; // Ukuran Baju

    // Constructor inisialisasi objek Baju
    public Baju(String id, String name, int price, String size) {
        super(id, name, price); // Memanggil constructor kelas Item
        this.size = size; //Menginisialisasi ukuran baju
    }

    // Metode getter untuk mendapatkan ukuran baju
    public final String getSize() { 
        return size; 
    }

    // Implementasi displayItemDetails dari class Item
    @Override
    public void displayItemDetails() {
        System.out.println(" <<<<<< Detail Baju >>>>>>");
        System.out.println("ID Baju : " + getId()); // Menampilkan ID Baju
        System.out.println("Nama Baju : " + getName()); // Menampilkan Nama Baju
        System.out.println("Harga Baju : Rp. " + getPrice()); // Menampilkan Harga Baju
        System.out.println("Ukuran Baju : " + getSize()); // Menampilkan Ukuran Baju
        System.out.println();
    }
}