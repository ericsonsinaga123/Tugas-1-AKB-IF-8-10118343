package supriyadiericsonsinaga.com.tugas1_10118343;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.TextView;

public class HalamanUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        TextView MainAcivity =(TextView)findViewById(R.id.txkeluar);
        MainAcivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void ocClick(View v) {
                Intent o =new Intent(HalamanUtama.this, MainAcivity.class);
                startActivity(o);
            }
        });
        TextView HalamanUtama = (TextView)findViewById(R.id.txprofile);
        HalamanUtama.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent p = new Intent(HalamanUtama.this, com.example.Tugas1_10118343.Profile.class);
            }
        });

    }
}
