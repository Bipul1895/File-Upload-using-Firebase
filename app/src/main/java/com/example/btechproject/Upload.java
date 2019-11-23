package com.example.btechproject;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload(){
    //empty constructor required
    }

    public Upload(String name, String imageUrl){

        if(name.trim().equals("")){
            mName="No Name";
        }

        mName=name;
        mImageUrl=imageUrl;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }
}
