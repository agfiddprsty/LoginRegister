package com.fiid.agfid.profile;

/**
 * Created by AGFID on 28/07/2018.
 */

public class User {
    private int id;
    private String username, email, kelas, sekolah, nama;

    public User(int id, String nama, String username, String email, String kelas, String sekolah)/**KALO MAU TAMBAH KELAS DAN SEKOLAH DI STRING,, TERUS BUKA COMMENT DI MAINACTIVITY, LOGINACTIVITY, SHAREDPREFMANAGER, PROFILE, USER TQ*/ {
        this.id = id;
        this.nama = nama;
        this.kelas = kelas;
        this.username = username;
        this.email = email;
        this.sekolah = sekolah;
    }

    public int getId(){

        return id;
    }

    public String getNama(){
        return nama;
    }

    public String getKelas(){
        return kelas;
    }

    public  String getSekolah(){
        return sekolah;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }


}
