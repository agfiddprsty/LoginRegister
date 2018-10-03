package com.fiid.agfid.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.Intent;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import android.media.MediaScannerConnection;
import android.content.DialogInterface;
import android.widget.TextView;


public class ProfileActivity extends AppCompatActivity {

    Bitmap myBitmap;
    Uri picUri;

    private ArrayList permissionsToRequest;
    private ArrayList permissionsRejected = new ArrayList();
    private ArrayList permissions = new ArrayList();

    private final static int ALL_PERMISSIONS_RESULT = 107;

    TextView  textViewNama, textViewEmail, textViewKelas, textViewSekolah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //if the user is not logged in
        //starting the login activity
        if (!SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }


        textViewNama = findViewById(R.id.textViewNama);
        textViewKelas = findViewById(R.id.textViewKelas);/**INI DI BUKA BROO*/
        textViewSekolah = findViewById(R.id.textViewSekolah);

        //getting the current user
        User user = SharedPrefManager.getInstance(this).getUser();

        textViewNama.setText(user.getNama());/**INI DI BUKA BROO*/
        textViewKelas.setText(user.getKelas());
        textViewSekolah.setText(user.getSekolah());

        //when the user presses logout button
        //calling the logout method
        findViewById(R.id.buttonLogout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                SharedPrefManager.getInstance(getApplicationContext()).logout();
            }
        });
    }
}
