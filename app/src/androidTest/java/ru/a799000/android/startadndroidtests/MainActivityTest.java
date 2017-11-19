package ru.a799000.android.startadndroidtests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;


/**
 * Created by user on 28.07.2017.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void changeText() throws Exception {
        String text = "my test text";

        // type text to editText
        onView(withId(R.id.editText)).perform(typeText(text));

        // click button
        onView(withId(R.id.button)).perform(click());

        // check text in textView is Android
        onView(withId(R.id.textView)).check(matches(withText(text)));
    }

    @Test
    public void changeTextEmpty() throws Exception {
        // click button
        onView(withId(R.id.button)).perform(click());

        // check text in textView is Android
        onView(withId(R.id.textView)).check(matches(withText(R.string.empty_text)));
    }

}