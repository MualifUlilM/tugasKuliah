/*
Nama : Mualif Ulil Misbakh;
Nim : 18.01.53.0009;
Mata Kuliah : Pemrograman Berorientasi Objek(PBO);
Ujian : UAS
*/

import com.pbo.uas.*;

class main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        pegawai.setData("Ulil", "Staff umum");
        pegawai.getInfo();
        System.out.println("================================");
        Manager manager = new Manager();
        manager.setData("Mualif", "Manager Litbang", 200000);
        manager.getInfo();
        System.out.println("================================");
        Executive executive = new Executive();
        executive.setData("Misbakh", "Executive Manager", manager.getGaji());
        executive.getInfo();
        System.out.println("================================");
        Sekretaris sekretaris = new Sekretaris();
        sekretaris.setData("John Doe", "Sekretaris",250000);
        sekretaris.getInfo();
        System.out.println("================================");
        Programmer programmer = new Programmer();
        programmer.setData("UlilM", "Programmer");
    }
}