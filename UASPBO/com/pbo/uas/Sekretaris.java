package com.pbo.uas;

public class Sekretaris extends Pegawai{
    double upahLembur;

    public void setData(String nama, String jabatan, double upahLembur) {
        // TODO Auto-generated method stub
        super.setData(nama, jabatan);
        this.upahLembur = upahLembur;
    }

    double getGaji(){
        return gaji+upahLembur;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Upah Lembur : "+upahLembur);
    }
}