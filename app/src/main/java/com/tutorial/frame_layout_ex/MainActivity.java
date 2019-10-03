package com.tutorial.frame_layout_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
Framelayout is a ViewGroup subclass which is used to specify the position of View instances it contains on the top of each other to
display only single View inside the FrameLayout.

In simple manner, we can say FrameLayout is designed to block out an area on the screen to display a single item.

FrameLayout will act as a placeholder on the screen and it is used to hold a single child view.

In FrameLayout, the child views are added in a stack and the most recently added child will show on the top.
We can add multiple children views to FrameLayout and control their position by using gravity attributes in FrameLayout.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
