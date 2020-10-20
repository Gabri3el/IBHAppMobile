package br.com.ibh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebView;

import br.com.ibh.R;

public class Live extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);
        String frameVideo = "https://www.facebook.com/igrejabatistahumaita/live/";
        //String frameVideo = "<html><body>Assista a Live: <br> <iframe width=\"340\" height=\"290\" src=\"https://www.youtube.com/embed/live_stream?channel=UC7V-y3p347cThXi-PmHQ25w\" frameborder=\"0\" allowfullscreen=\"true\"></iframe></body></html>";

        WebView webView = (WebView)findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadData(frameVideo, "text/html", "utf-8");
    }
}