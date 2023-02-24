package com.github.fmikov.bootcamp;


import static androidx.test.espresso.Espresso.onView;

import android.widget.Button;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> testRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityIntentTest(){
        Intents.init();
        onView(ViewMatchers.withId(R.id.mainName))
                .perform(ViewActions.typeText("hey"))
                .perform(ViewActions.closeSoftKeyboard());
        onView(ViewMatchers.withId(R.id.mainGoButton)).perform(ViewActions.click());
        Intents.intended(IntentMatchers.hasComponent(GreetingActivity.class.getName()));

        Intents.release();

    }

}
