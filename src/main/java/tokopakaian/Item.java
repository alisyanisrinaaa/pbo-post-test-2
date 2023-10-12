package tokopakaian;

// Class abstrak item merupakan class dasar untuk seluruh item pakaian
abstract class Item {
    private final String id; // ID item
    private final String name; // Nama item
    private final int price; // Harga item

    // Constructor untuk inisialisasi objek Item
    public Item(String id, String name, int price) {
        this.id = id; // Menginisialisasi ID Item
        this.name = name; // Menginisialisasi Nama Item
        this.price = price; // Menginisialisasi Harga Item
    }
    
    //Metode getter untuk mendapatkan ID, Nama, dan Harga
    public String getId() { 
        return id; 
    }

    public String getName() { 
        return name; 
    }

    public int getPrice() { 
        return price; 
    }

    // Metode abstrak untuk menampilkan detail item
    public abstract void displayItemDetails();
}
