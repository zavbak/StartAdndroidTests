package ru.a799000.android.startadndroidtests;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 28.07.2017.
 */
public class PrefernseHelperTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("\r\nsetUp");
        Log.v("anit","\r\nsetUp");
    }

    @After
    public void tearDown() throws Exception {

    }


    boolean compare(SettingsModel sm1,SettingsModel sm2){
        if(!sm1.getHello().equals(sm2.getHello())){
            return false;
        }

        if(sm1.getCount()!=sm2.getCount() ){
            return false;
        }

        return true;

    }

    @Test
    public void save() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        SharedPreferences sharedPreferences = appContext.getSharedPreferences("test", 0);

        SettingsModel sm1 = new SettingsModel();
        sm1.setHello("Hello");
        sm1.setCount(10);

        System.out.println("\r\n" + sm1.toString());

        PrefernseHelper prefernseHelper = new PrefernseHelper(sharedPreferences);
        prefernseHelper.saveValue(sm1);

        SettingsModel sm2 = prefernseHelper.readValue();
        System.out.println("\r\n" + sm2.toString());

        assertTrue(compare(sm1,sm2));


    }



}