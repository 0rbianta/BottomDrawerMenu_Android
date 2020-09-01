package com.example.bottomdrawermenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private Boolean drawer_active=true;
    private CardView drawer_inside;
    private WebView example_web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer_inside=findViewById(R.id.drawer_inside);
        example_web_view=findViewById(R.id.example_web_view);
        example_web_view.getSettings().setJavaScriptEnabled(true);
        example_web_view.setWebViewClient(new WebViewClient());
        example_web_view.loadUrl("https://github.com/login");
    }

    public void drawer_click(View v){

        if(drawer_active){
            drawer_active=false;
            drawer_inside.setVisibility(View.VISIBLE);
        }else{
            drawer_active=true;
            drawer_inside.setVisibility(View.GONE);
        }

    }

}