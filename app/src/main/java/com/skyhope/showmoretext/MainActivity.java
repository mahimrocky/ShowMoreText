package com.skyhope.showmoretext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.skyhope.showmoretextview.ShowMoreTextView;

public class MainActivity extends AppCompatActivity {

    ShowMoreTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view_show_more);

        textView.setShowingLine(2);
        //textView.setShowingChar(30);

        textView.addShowMoreText("Continue");
        textView.addShowLessText("Less");
    }
}
