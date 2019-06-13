package cn.gridlife.multichanelbygradle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.btn_go);
        button.setOnClickListener(v->{
            startActivity(new Intent(this,ShowActivity.class));
        });
//        if(BuildConfig.FLAVOR_log.equals("withLog")){
//            Toast.makeText(this, "withLog", Toast.LENGTH_SHORT).show();
//        }else if (BuildConfig.FLAVOR_log.equals("noLog")){
//            Toast.makeText(this, "noLog", Toast.LENGTH_SHORT).show();
//        }
    }
}
