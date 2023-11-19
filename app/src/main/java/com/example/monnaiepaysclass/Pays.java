package com.example.monnaiepaysclass;

public class Pays {
    private int imagePays;
    private  String monnaie;
    private String codeISO;

    public Pays(int imagePays,String monnaie,String codeISO){
        this.imagePays=imagePays;
        this.monnaie=monnaie;
        this.codeISO=codeISO;
    }



    public int getImagePays(){
        return imagePays;
    }
    public String getMonnaie(){
        return monnaie;
    }
    public String getCodeISO(){
        return codeISO;
    }

    public void setImagePays(int imagePays) {
        this.imagePays = imagePays;
    }

    public void setMonnaie(String monnaie) {
        this.monnaie = monnaie;
    }

    public void setCodeISO(String codeISO) {
        this.codeISO = codeISO;
    }


}
