package com.example.android.miwok;

/**
 * Created by Bassam on 2/9/2017.
 */

public class Word {

    public static final short NO_IMAGE_RESOURCE = -1;
    private String UserDefaultTranslation;
    private String MiwokTranslation;
    private int ImageResourceId;
    private int AudioResourceId;

    //Class Constructors

    public Word(String UserDefaultTranslation, String MiwokTranslation, int AudioResourceId) {
        this.UserDefaultTranslation = UserDefaultTranslation;
        this.MiwokTranslation = MiwokTranslation;
        this.AudioResourceId = AudioResourceId;
        this.ImageResourceId = NO_IMAGE_RESOURCE;
    }

    public Word(String UserDefaultTranslation, String MiwokTranslation, int ImageResourceId, int AudioResourceId) {
        this.UserDefaultTranslation = UserDefaultTranslation;
        this.MiwokTranslation = MiwokTranslation;
        this.AudioResourceId = AudioResourceId;
        this.ImageResourceId = ImageResourceId;
    }

    public int getAudioResourceId() {
        return AudioResourceId;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public String getUserDefaultTranslation() {
        return UserDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return MiwokTranslation;
    }

    @Override
    public String toString() {
        return "Word{" +
                "UserDefaultTranslation='" + UserDefaultTranslation + '\'' +
                ", MiwokTranslation='" + MiwokTranslation + '\'' +
                ", ImageResourceId=" + ImageResourceId +
                ", AudioResourceId=" + AudioResourceId +
                '}';
    }
}
