package com.example.mehta.ands6a1;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
import org.junit.runners.MethodSorters;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ActivityLoginTest {

    @Rule
    public ActivityTestRule<ActivityLogin> mActivityRule
            = new ActivityTestRule<>(ActivityLogin.class);

    @Test
    public void validLogin() {
        /* This TEST checks for VALID user scenario */
        onView(withId(R.id.txtEmail))
                .perform(typeText("sudesh@gmail.com"), closeSoftKeyboard());

        onView(withId(R.id.txtPassword))
                .perform(typeText("abcd123"), closeSoftKeyboard());

        onView(withText("Login")).perform(click());

        onView(withId(R.id.lblLoginStatus))
                .check(matches(withText("Login Success")));
    }

    @Test
    public void invalidLogin() {
         /* This TEST checks for INVALID user scenario */
        onView(withId(R.id.txtEmail))
                .perform(typeText("sudesh@gmail.com"), closeSoftKeyboard());

        onView(withId(R.id.txtPassword))
                .perform(typeText("abcd12"), closeSoftKeyboard());

        onView(withText("Login")).perform(click());

        onView(withId(R.id.lblLoginStatus))
                .check(matches(withText("Login Fail. Email or Password is wrong")));
    }
}
