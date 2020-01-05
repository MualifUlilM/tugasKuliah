package com.pbo.uas;

public class Manager extends Pegawai{
    double tunjangan;
    
    // @Overloading
    public void setData(String nama, String jabatan, double gaji, double tunjangan) {
        super.setData(nama, jabatan, gaji);
        this.tunjangan = tunjangan;
    }
    public double getGaji(){
        return (gaji*2)+tunjangan;
    }

    @Override
    public void getInfo() {
        // TODO Auto-generated method stub
        super.getInfo();
        System.out.println("Tunjangan : "+tunjangan);
    }
}