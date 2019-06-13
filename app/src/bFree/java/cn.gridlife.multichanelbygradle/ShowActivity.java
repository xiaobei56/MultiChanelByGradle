package cn.gridlife.multichanelbygradle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ShowActivity extends AppCompatActivity {

    private static final String TAG = "ShowActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        if(BuildConfig.FLAVOR_log.equals("withLog")){
            Log.i(TAG, "onCreate: withLog");
//            Toast.makeText(this, "withLog", Toast.LENGTH_SHORT).show();
        }else if (BuildConfig.FLAVOR_log.equals("noLog")){
            Log.d(TAG, "onCreate: noLog");
//            Toast.makeText(this, "noLog", Toast.LENGTH_SHORT).show();
        }else if(BuildConfig.DEBUG){
            Log.w(TAG, "onCreate: DEBUG" );
//            Toast.makeText(this, "Debug 模式", Toast.LENGTH_SHORT).show();
        }else if(BuildConfig.BUILD_TYPE.equals("DEBUG")){
            Log.e(TAG, "onCreate: BuildConfig.BUILD_TYPE.equals(\"DEBUG\")" );
//            Toast.makeText(this, "Debug 模式", Toast.LENGTH_SHORT).show();
        }
    }
}
