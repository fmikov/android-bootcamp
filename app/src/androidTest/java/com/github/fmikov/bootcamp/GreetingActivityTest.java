package com.github.fmikov.bootcamp;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class GreetingActivityTest {


    @Test
    public void greetingActivityIntentTest(){
        Intent myIntent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        myIntent.putExtra("name", "heyo"); //Optional parameters
        ActivityScenario.launch(myIntent).close();
        ApplicationProvider.getApplicationContext().startActivity(myIntent);
        onView(ViewMatchers.withId(R.id.greetingMessage)).check(matches(ViewMatchers.withText("Greetings heyo")));


        Intents.release();

    }
}
