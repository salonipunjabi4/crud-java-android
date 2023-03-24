package com.sp.studentrecordmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateActivity extends AppCompatActivity {

    EditText etUpdateRno, etUpdateName;
    Button btnUpdateSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        etUpdateRno=findViewById(R.id.etUpdateRno);
        etUpdateName = findViewById(R.id.etUpdateName);
        btnUpdateSave = findViewById(R.id.btnUpdateSave);
        btnUpdateSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rno = etUpdateRno.getText().toString();
                String name = etUpdateName.getText().toString();
                String s=etUpdateRno.getText().toString();
                if(s.length() == 0)
                {

                    etUpdateRno.setError("Rno is empty");
                    etUpdateRno.requestFocus();
                    return;
                }
                String s1=etUpdateName.getText().toString();
                if(s1.length() == 0)
                {

                    etUpdateName.setError("Name is empty");
                    etUpdateName.requestFocus();
                    return;
                }
                MainActivity.db.updateStudent(Integer.parseInt(rno),name);
                etUpdateRno.setText("");
                etUpdateName.setText("");
                etUpdateRno.requestFocus();
            }
        });
    }
}
