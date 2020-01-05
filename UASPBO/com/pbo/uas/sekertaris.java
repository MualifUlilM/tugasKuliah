package com.pbo.uas;

class Sekretaris extends Pegawai{
    double upahLembur;

    public void setData(String nama, String jabatan, double gaji, double upahLembur) {
        // TODO Auto-generated method stub
        super.setData(nama, jabatan, gaji);
        this.upahLembur = upahLembur;
    }

    double getGaji(){
        return gaji+upahLembur;
    }

    void getInfo(){
        System.out.println("Nama : "+ nama);
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Upah Lembur : "+upahLembur);
        System.out.println("Gaji : "+getGaji());
    }
}