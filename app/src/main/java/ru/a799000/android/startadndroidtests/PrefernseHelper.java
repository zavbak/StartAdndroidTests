package ru.a799000.android.startadndroidtests;

import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Alex on 28.07.2017.
 */

public class PrefernseHelper {
    SharedPreferences mSharedPreferences;
    Gson mGson;

    String KEY = SettingsModel.class.getName();

    public PrefernseHelper(SharedPreferences sharedPreferences) {
        mSharedPreferences = sharedPreferences;
        mGson = new GsonBuilder().create();
    }


    public void saveValue(SettingsModel settingsModel) {
        mSharedPreferences.edit()
                .putString(KEY, mGson.toJson(settingsModel))
                .commit();
    }

    public SettingsModel readValue() {
        return mGson.fromJson(mSharedPreferences.getString(KEY, ""), SettingsModel.class);
    }

}
