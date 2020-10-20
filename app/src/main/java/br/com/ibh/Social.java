package br.com.ibh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import br.com.ibh.R;

public class Social extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        webView = (WebView) findViewById(R.id.soci);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/igrejabatistahumaita");

    }
}