package Latihan_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        LinkedList<String> namaHewan = new LinkedList<>();
        namaHewan.add("Sapi");
        namaHewan.add("Kelinci");
        namaHewan.add("Kambing");
        namaHewan.add("Unta");
        namaHewan.add("Domba");

        LinkedList<String> deleteHewan = new LinkedList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        for (String show : deleteHewan) {
            while (namaHewan.remove(show)) {
            }
        }

        System.out.println("Isi objek Hewan setelah dilakukan penghapusan:");
        for (String h : namaHewan) {
            System.out.println(h);

        }
    }
}