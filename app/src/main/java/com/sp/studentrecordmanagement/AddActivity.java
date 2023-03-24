package com.sp.studentrecordmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    EditText etAddRno, etAddName;
    Button btnAddSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        etAddRno = findViewById(R.id.etAddRno);
        etAddName = findViewById(R.id.etAddName);
        btnAddSave = findViewById(R.id.btnAddSave);

        btnAddSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rno = etAddRno.getText().toString();
                String name = etAddName.getText().toString();
                String s=etAddRno.getText().toString();
                if(s.length() == 0)
                {

                    etAddRno.setError("Rno is empty");
                    etAddRno.requestFocus();
                    return;
                }
                String s1=etAddName.getText().toString();
                if(s1.length() == 0)
                {

                    etAddName.setError("Name is empty");
                    etAddName.requestFocus();
                    return;
                }

                MainActivity.db.addStudent(Integer.parseInt(rno),name);
                etAddRno.setText("");
                etAddName.setText("");
                etAddRno.requestFocus();
            }
        });
    }
}
