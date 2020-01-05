package com.pbo.uas;

public class Programmer extends Pegawai{
    @Override
    public void setData(String nama, String jabatan) {
        super.setData(nama, jabatan); //referensi dari fungsi/method dari kelas induk
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}