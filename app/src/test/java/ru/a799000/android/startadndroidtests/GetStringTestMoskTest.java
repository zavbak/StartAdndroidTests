package ru.a799000.android.startadndroidtests;

import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by user on 28.07.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class GetStringTestMoskTest {

    GetStringTestMosk mGetStringTestMosk;
    Context moskContext;

    @Before
    public void setUp() throws Exception {
        moskContext = Mockito.mock(Context.class);
        Mockito.when(moskContext.getString(R.string.str_test_mosk_1)).thenReturn("Hello mosk 1");
        mGetStringTestMosk = new GetStringTestMosk(moskContext);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void Test() throws Exception {
        System.out.println("context get string mosk 1 = " + moskContext.getString(R.string.str_test_mosk_1));
    }



}