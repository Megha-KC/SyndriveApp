package universe.sk.syndriveapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditProfileActivity extends AppCompatActivity {

    EditText etName, etDOB, etBloodGroup, etPassword, etNewPassword, etConfirmNewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.drawable.profile);
        actionBar.setTitle(" Edit Profile");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        etName = findViewById(R.id.etName);
        etDOB = findViewById(R.id.etDOB);
        etBloodGroup = findViewById(R.id.etBloodGroup);
        etPassword = findViewById(R.id.etPassword);
        etNewPassword = findViewById(R.id.etNewPassword);
        etConfirmNewPassword = findViewById(R.id.etConfirmNewPassword);


    }
}
