package com.example.thelock;

import com.firebase.client.Firebase;

public class BikeInfo {
    Firebase url;

    public BikeInfo(){
        url = new Firebase("https://bikedb-81c06.firebaseio.com");
    }

    public void setName(String name){
        Firebase nameFirebase = url.child("name");
        nameFirebase.setValue(name);
    }

    public void setStatus(Boolean lockStatus, String alertStatus){
        Firebase lockFirebase = url.child("lockStatus");
        lockFirebase.setValue(lockStatus.toString());

        Firebase alertFirebase = url.child("alertStatus");
        alertFirebase.setValue(alertStatus);

    }

    public String getName(){
        Firebase nameFirebase = url.child("name");
//        nameFirebase.ge();
        return "";
    }
}
