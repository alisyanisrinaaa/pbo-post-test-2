package main;

import tokopakaian.*; 

import java.util.Scanner;

// Class Utama Program
public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, size, id;
        int price;
        int choice;
        boolean exit = false;

        // Perulangan Program
        while (!exit) {
            // Menampilkan menu
            System.out.println(" === Silahkan Pilih Menu ===");
            System.out.println("1. Katalog");
            System.out.println("2. Tambah Item");
            System.out.println("3. Update Item");
            System.out.println("4. Delete Item");
            System.out.println("5. Exit");
            System.out.print("Choice : ");
            choice = scanner.nextInt();

            // Switch statement untuk memproses pilihan
            switch (choice) {
                case 1:
                    // Menampilkan katalog item pakaian
                    TokoPakaian.displayItems();
                    break;
                case 2:
                    // Menambah item baru pada katalog
                    System.out.println("");
                    System.out.println("===== Tambah Item =====");
                    System.out.println("1. Tambah Baju");
                    System.out.println("2. Tambah Celana");
                    System.out.print("Choice: ");
                    int itemChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (itemChoice == 1) { 
                        // Menambahkan Baju Baru
                        System.out.print("ID Baju : ");
                        id = scanner.nextLine().toUpperCase();
                        System.out.print("Nama Baju : ");
                        name = scanner.nextLine();
                        System.out.print("Harga Baju : ");
                        price = scanner.nextInt();
                        System.out.print("Ukuran Baju : ");
                        size = scanner.next();
                        System.out.println("");
                        TokoPakaian.addItem(new Baju(id, name, price, size));
                    } else if (itemChoice == 2) { 
                        // Menambahkan Celana Baru
                        System.out.println("");
                        System.out.print("ID Celana : ");
                        id = scanner.nextLine().toUpperCase();
                        System.out.print("Nama Celana : ");
                        name = scanner.nextLine();
                        System.out.print("Harga Celana : ");
                        price = scanner.nextInt();
                        System.out.print("Ukuran Celana : ");
                        size = scanner.next();
                        System.out.println("");
                        TokoPakaian.addItem(new Celana(id, name, price, size));
                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;
                case 3:
                    // Update Item yang ada di katalog
                    System.out.println("");
                    System.out.println("===== Update Item =====");
                    System.out.println("1. Update Baju");
                    System.out.println("2. Update Celana");
                    System.out.print("Choice: ");
                    itemChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (itemChoice == 1) {
                        // Update Baju
                        System.out.println("");
                        System.out.print("ID Baju : ");
                        id = scanner.nextLine().toUpperCase();
                        if (!TokoPakaian.getItem(id)) {
                            System.out.println("Item dengan ID " + id + " tidak ditemukan");
                            break;
                        } else if (TokoPakaian.getItem(id)) {
                            System.out.print("Nama Baju : ");
                            name = scanner.nextLine();
                            System.out.print("Harga Baju : ");
                            price = scanner.nextInt();
                            System.out.print("Ukuran Baju : ");
                            size = scanner.next();
                            TokoPakaian.updateItem(id, new Baju(id, name, price, size));
                            System.out.println("ID " + id + " berhasil di update");
                            System.out.println("");
                        } else {
                            System.out.println("Invalid choice");
                        }
                    } else if (itemChoice == 2) {
                        // Update Celana
                        System.out.println("");
                        System.out.print("ID Celana : ");
                        id = scanner.nextLine().toUpperCase();
                        if (!TokoPakaian.getItem(id)) {
                            System.out.println("Item dengan ID " + id + " tidak ditemukan");
                            break;
                        } else if (TokoPakaian.getItem(id)) {
                            System.out.print("Nama Celana : ");
                            name = scanner.nextLine();
                            System.out.print("Harga Celana : ");
                            price = scanner.nextInt();
                            System.out.print("Ukuran Celana : ");
                            size = scanner.next();
                            TokoPakaian.updateItem(id, new Celana(id, name, price, size));
                            System.out.println("Id " + id + " berhasil di update");
                            System.out.println("");
                        } else {
                            System.out.println("Invalid choice");
                        }
                    } else {
                        System.out.println("Invalid choice");
                    }

                    break;
                case 4:
                    // Menghapus item yang ada di katalog
                    System.out.println("");
                    System.out.println("===== Hapus Item =====");
                    System.out.print("Masukkan ID Baju atau Celana : ");
                    id = scanner.next().toUpperCase();
                    if (!TokoPakaian.getItem(id)) {
                        System.out.println("Item dengan ID" + id + " tidak ditemukan");
                        break;
                    } else if (TokoPakaian.getItem(id)) {
                        TokoPakaian.deleteItem(id);
                            System.out.println("Item dengan ID " + id + " dihapus");
                            System.out.println("");
                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;
                case 5:
                    // Keluar program
                    System.out.println("");
                    System.out.println("Terima Kasih ^____^ ");
                    System.out.println("");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
