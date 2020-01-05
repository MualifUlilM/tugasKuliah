package com.pbo.uas;

class Manager extends Pegawai{
    double tunjangan;
    
    // @Overloading
    public void setData(String nama, String jabatan, double gaji, double tunjangan) {
        super.setData(nama, jabatan, gaji);
        this.tunjangan = tunjangan;
    }
    double getGaji(){
        return (gaji*2)+tunjangan;
    }

    @Override
    void getInfo() {
        // TODO Auto-generated method stub
        super.getInfo();
        System.out.println("Tunjangan : "+tunjangan);
    }
}