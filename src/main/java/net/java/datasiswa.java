package net.java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class datasiswa {
    private Long id;
    private String nama_siswa;
    private String tahun_lahir;
    private String alamat;
    private BigInteger nomer_hp;

    protected datasiswa() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_siswa() {
        return nama_siswa;
    }

    public void setNama_siswa(String nama_siswa) {
        this.nama_siswa = nama_siswa;
    }

    public String getTahun_lahir() {
        return tahun_lahir;
    }

    public void setTahun_lahir(String tahun_lahir) {
        this.tahun_lahir = tahun_lahir;
    }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public BigInteger getNomer_hp() {
        return nomer_hp;
    }

    public void setNomer_hp(BigInteger nomer_hp) {
        this.nomer_hp = nomer_hp;
    }
}