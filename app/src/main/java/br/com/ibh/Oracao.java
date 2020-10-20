package br.com.ibh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import br.com.ibh.R;

public class Oracao extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracao);
        webView = (WebView) findViewById(R.id.orar);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfoAKSzqPmQmjNaSDLRKhniTLa06iKJ_axNLNaPq9XlHajNLw/viewform?usp=sf_link");
    }
}