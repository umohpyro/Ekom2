package com.webconsultng.ekom2;

public class Model {
    private int profilePix;
    private String txt1,txt2,txtTime;

    public Model(int profilePix, String txt1, String txt2, String txtTime) {
        this.profilePix = profilePix;
        this.txt1 = txt1;
        this.txt2 = txt2;
        this.txtTime = txtTime;
    }

    @Override
    public String toString() {
        return "Model{" +
                "profilePix=" + profilePix +
                ", txt1='" + txt1 + '\'' +
                ", txt2='" + txt2 + '\'' +
                ", txtTime='" + txtTime + '\'' +
                '}';
    }

    public int getProfilePix() {
        return profilePix;
    }

    public void setProfilePix(int profilePix) {
        this.profilePix = profilePix;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxtTime() {
        return txtTime;
    }

    public void setTxtTime(String txtTime) {
        this.txtTime = txtTime;
    }
}
