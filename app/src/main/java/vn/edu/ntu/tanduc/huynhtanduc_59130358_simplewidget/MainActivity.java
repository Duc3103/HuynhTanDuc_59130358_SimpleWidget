package vn.edu.ntu.tanduc.huynhtanduc_59130358_simplewidget;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btnXN;
    EditText Name,Date,ST;
    RadioGroup rdgGT;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addview();
        addevent();
    }
    private void  addview (){
        btnXN = findViewById(R.id.btnXN);
        Name = findViewById(R.id.Name);
        Date = findViewById(R.id.Date);
        ST = findViewById(R.id.ST);
        rdgGT = findViewById(R.id.rdbGioitinh);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
    }
    private void  addevent (){
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Show();
            }
        });
    }
    private  void  Show(){
        String text = "";
        text += Name.getText().toString();
        text += "\nNgay Sinh: " + Date.getText().toString();
        switch (rdgGT.getCheckedRadioButtonId())
        {
            case R.id.rdbNam:
                text += "\nGiới Tính: Nam";
                break;
            case R.id.rdbNu:
                text += "\nGiới Tính: Nữ";
                break;
        }
        text += "\nSở Thích :";
        if (checkBox1.isChecked())
            text += checkBox1.getText().toString();
        if (checkBox2.isChecked())
            text += checkBox2.getText().toString();
        if (checkBox3.isChecked())
            text += checkBox3.getText().toString();
        if (checkBox4.isChecked())
            text += checkBox4.getText().toString();
        if (checkBox5.isChecked())
            text += checkBox5.getText().toString();
        text += ST.getText().toString();
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
