package com.cau1.student.tqd_cau1;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    Button bt_DangNhap;
    CheckBox ck_Luu;
    AlertDialog.Builder dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_DangNhap=(Button)findViewById(R.id.buttonDangNhap);
        ck_Luu=(CheckBox)findViewById(R.id.checkBoxLuu);
        dialog=new AlertDialog.Builder(this);
        dialog.setTitle("Thông báo");
        bt_DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ck_Luu.isChecked()){
                    dialog.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }
                else
                {
                    dialog.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
                dialog.show();
            }
        });
    }
}
