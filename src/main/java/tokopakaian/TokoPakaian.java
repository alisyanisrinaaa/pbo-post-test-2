package tokopakaian;

import java.util.ArrayList;

// Class TokoPakaian yang akan mengelola katalog item
public final class TokoPakaian {
    private static final ArrayList<Item> items = new ArrayList<>(); // Daftar Item Pakaian

    // Metode untuk menambahkan item ke katalog
    public static void addItem(Item item) {
        items.add(item);
    }

    // Metode untuk update item pada katalog berdasarkan ID
    public static void updateItem(String id, Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.set(i, item);
                break;
            }
        }
    }

    // Metode untuk menghapus item pada katalog berdasarkan ID
    public static void deleteItem(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                break;
            }
        }
    }

    // Metode untuk menampilkan seluruh item dalam katalog
    public static void displayItems() {
        System.out.println("");
        System.out.println("===== Katalog =====");
        System.out.println("Total items: " + items.size());
        System.out.println("");
        for (Item item : items) {
            item.displayItemDetails();
        }
    }
    
    // Metode untuk memeriksa apakah ID tertentu terdapat dalam katalog
    public static boolean getItem(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
