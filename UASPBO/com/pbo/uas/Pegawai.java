package com.pbo.uas;

public class Pegawai{
    protected String nama, jabatan;
    protected double gaji = 2000000;

    public void setData(String nama, String jabatan){
        this.nama = nama;
        this.jabatan = jabatan;
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