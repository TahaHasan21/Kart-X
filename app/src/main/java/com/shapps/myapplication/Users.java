package com.shapps.myapplication;

public class Users {
   private String uid;
   private String name;
   private String img;
   private String address;
   private String phone;


    public Users(String uid, String name, String img) {
        this.uid = uid;
        this.name = name;
        this.img = img;
    }

    public Users(String address){
        this.address = address;
    }

    public String getUid(){
       return this.uid;
   }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }



    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImg(String img) {
        this.img = img;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
