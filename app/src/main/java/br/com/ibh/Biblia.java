package br.com.ibh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import br.com.ibh.R;

public class Biblia extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblia);

        webView = (WebView) findViewById(R.id.palavra);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://biblia.blog.br/");
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {

            super.onBackPressed();
        }
    }
}