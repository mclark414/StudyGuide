package com.example.android.studyguide;

/**
 * Created by mclark on 3/19/18.
 */

public class Question {
    public int location;
    public int ques;
    public int photoId;
    public boolean isTrue;

    public Question(int location, int ques, int photoId, boolean isTrue) {
        this.location = location;
        this.ques = ques;
        this.photoId = photoId;
        this.isTrue = isTrue;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getQues() {
        return ques;
    }

    public void setQues(int ques) {
        this.ques = ques;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}
