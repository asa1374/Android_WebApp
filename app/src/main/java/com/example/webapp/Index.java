package com.example.webapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context _this = Index.this;
        LinearLayout frame = new LinearLayout(_this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        frame.setLayoutParams(params);
        WebView webView = new WebView(_this);
        webView.setLayoutParams(params);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("file:///android_asset/html/index.html");
        frame.addView(webView);
        setContentView(frame);
    }
}
