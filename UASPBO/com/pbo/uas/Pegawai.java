package com.pbo.uas;

public class Pegawai{
    protected String nama, jabatan;
    protected double gaji;

    public void setData(String nama, String jabatan, double gaji){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    double getGaji(){
        return gaji;
    }

    public void getInfo(){
        System.out.println("Nama : "+ nama);
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Gaji : "+gaji);
    }
}