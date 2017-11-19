package ru.a799000.android.startadndroidtests;

import android.content.Context;

/**
 * Created by user on 28.07.2017.
 */

public class GetStringTestMosk {

    Context mContext;

    public GetStringTestMosk(Context context) {
        mContext = context;
    }

    String getMosk1(){
        return mContext.getString(R.string.str_test_mosk_1);
    }

    String getMosk2(){
        return mContext.getString(R.string.str_test_mosk_2);
    }
    String getMosk3(){
        return mContext.getString(R.string.str_test_mosk_3);
    }

}
