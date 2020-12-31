package com.astzz.loadeasedashboard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DriverDetailActivity extends AppCompatActivity implements View.OnClickListener {


    TextView  driver_name, rating, pd_name, pd_dob,gender_txt, pd_email, pd_ph_num, car_type, year_of_prod, num_plate;
    Button confirm;
    EditText block_ed_tx;
    ImageView cnic_pic, vechicle_pic, Licence_pic,circ_img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_detail);

        Ids();
    }

    public void Ids() {
        circ_img = findViewById(R.id.profile_image);
         driver_name = findViewById(R.id.name_txt);
        rating = findViewById(R.id.rated);
        gender_txt = findViewById(R.id.gender_txt);
        pd_name = findViewById(R.id.names_txt);
        pd_dob = findViewById(R.id.dob_txt);
        pd_email = findViewById(R.id.email_txt);
        pd_ph_num = findViewById(R.id.ph_num);
        car_type = findViewById(R.id.car_typ_txt);
        year_of_prod = findViewById(R.id.year_prod_txt);
        num_plate = findViewById(R.id.num_plate_txt);

        confirm = findViewById(R.id.confirm_btn);confirm.setOnClickListener(this);
        block_ed_tx = findViewById(R.id.ed_txt_block);

        cnic_pic = findViewById(R.id.cnic_pic);cnic_pic.setOnClickListener(this);
        Licence_pic = findViewById(R.id.Licence_pic_img);Licence_pic.setOnClickListener(this);
        vechicle_pic = findViewById(R.id.Vehicle_pic_img);vechicle_pic.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if(id== R.id.confirm_btn){
            ExitAlert();
        }
    }
    private void ExitAlert() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Alert");
        dialog.setIcon(R.drawable.ic_baseline_block_24);
        dialog.setCancelable(false);
        dialog.setMessage("Are you sure you want to block ?");

        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(DriverDetailActivity.this, "This person is blocked", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        dialog.show();
    }
}