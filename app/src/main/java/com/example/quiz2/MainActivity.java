package com.example.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText txtName;
    private EditText txtSalary;
    private Spinner spnType;
    private ListView listView;
    private Button btnAdd;

    ArrayList<Employee> employees = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        txtName = findViewById(R.id.txtName);
        txtSalary = findViewById(R.id.txtSalary);
        spnType = findViewById(R.id.spnType);
        listView = findViewById(R.id.lstView);
        btnAdd = findViewById(R.id.btnAdd);

        listView.setAdapter(new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, employees));
    }



    public void addEmployee(View view) {
        String name = txtName.getText().toString();
        String salary = txtSalary.getText().toString();
        String type = spnType.getSelectedItem().toString();

        if (name.isEmpty() || salary.isEmpty()) {
        } else {
            Employee employee = new Employee(name, Double.parseDouble(salary), type);
            Toast.makeText(this, "Employee added successfully", Toast.LENGTH_SHORT).show();
            employees.add(employee);
            txtName.setText("");
            txtSalary.setText("");
            spnType.setSelection(0);
        }

    }








}