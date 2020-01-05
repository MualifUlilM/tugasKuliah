package com.pbo.uas;

public class Executive extends Pegawai{

    double gajiManager;
    public void setData(String nama, String jabatan, double gaji, double gajiManager) {
        // TODO Auto-generated method stub
        super.setData(nama, jabatan, gaji);
        this.gajiManager = gajiManager;
    }

    double totalGaji =((0.5*gajiManager)+gaji);

    double getGaji(){
        return totalGaji;
    }

    @Override
    public void getInfo() {
        // TODO Auto-generated method stub
        super.getInfo();
        System.out.println("Total Gaji : "+((0.5*gajiManager)+gaji));
    }
}