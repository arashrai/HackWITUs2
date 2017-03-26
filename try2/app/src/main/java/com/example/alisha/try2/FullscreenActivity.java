package com.example.alisha.try2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.example.neil.apptimizer.R;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.FileAsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.AccessController;
import java.util.Arrays;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.ByteArrayEntity;
import cz.msebera.android.httpclient.message.BasicHeader;
import cz.msebera.android.httpclient.protocol.HTTP;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends Activity {

    ImageView image;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_fullscreen);
    }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            postCoords("BACK_BUTTON", 0, 0);
//        }
//        return super.onKeyDown(keyCode, event);
//    }
//
//    // Overriding onTouchEvent to test user IO
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        int action = MotionEventCompat.getActionMasked(event);
//        float x_coord, y_coord;
//        String DEBUG_TAG = "Touch Event";
//        switch (action) {
//            case (MotionEvent.ACTION_DOWN):
//                Log.d(DEBUG_TAG, "Action was DOWN");
//                x_coord = event.getRawX();
//                y_coord = event.getRawY();
//                postCoords("ACTION_DOWN", x_coord, y_coord);
//                return true;
//            default:
//                return super.onTouchEvent(event);
//        }
//
//    }
//
//    public void postCoords(String action, float x, float y) {
//
//        JSONObject jsonParams = new JSONObject();
//        try {
//            jsonParams.put("event", action);
//            jsonParams.put("x", x);
//            jsonParams.put("y", y);
//        } catch (JSONException e) {
//            Log.e("MYAPP", "unexpected JSON exception", e);
//        }
//
//        AsyncHttpClient client = new AsyncHttpClient();
//        ByteArrayEntity entity = null;
//        try {
//            entity = new ByteArrayEntity(jsonParams.toString().getBytes("UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
//
//        client.post(null, "http://10.200.169.68:5000/hack", entity, "application/json", new FileAsyncHttpResponseHandler(this) {
//            @Override
//            public void onStart() {
//                // called before request is started
//                Log.d("ke", "onStart");
//            }
//
//            @Override
//            public void onSuccess(int statusCode, Header[] headers, File file) {
//                Bitmap b = BitmapFactory.decodeFile(file.getAbsolutePath());
//                image = (ImageView) findViewById(R.id.list_item);
//                image.setImageBitmap(b);
////                longPoll();
//            }
//
//            @Override
//            public void onFailure(int statusCode, Header[] headers, Throwable throwable, File file) {
//                System.out.write(534535);
//                System.out.println(Arrays.toString(new int[]{23}));
//                Log.e("ke", "SDds", throwable);
//            }
//
//            @Override
//            public void onRetry(int retryNo) {
//                // called when request is retried
//                Log.d("ke", "retry");
//            }
//        });
//    }

//    public void longPoll() {
//
//        AsyncHttpClient client = new AsyncHttpClient();
//        for(int x = 0; x < 10000; x++) {
//            SystemClock.sleep(200);
//            client.get(null, "http://10.200.169.68:5000/hack", null, "application/json", new FileAsyncHttpResponseHandler(this) {
//
//                @Override
//                public void onFailure(int statusCode, Header[] headers, Throwable throwable, File file) {
//
//                }
//
//                @Override
//                public void onSuccess(int statusCode, Header[] headers, File file) {
//                    Bitmap b = BitmapFactory.decodeFile(file.getAbsolutePath());
//                    image = (ImageView) findViewById(R.id.list_item);
//                    image.setImageBitmap(b);
//                }
//            });
//        }
//    }
}
