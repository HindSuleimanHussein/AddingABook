package com.example.myapplication;

import android.util.Log;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.myapplication.newPackage.Book;
import com.example.myapplication.newPackage.BookDs;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private Button save;
    private CheckBox arabicBox, englishBox;
    private String checkBox, typeOfBook, title, pageOnString;

    private int page;
    private RadioButton programmingRadio, medRadio, scienceRadio, culturalRadio;
    private EditText bookTitle, pages;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        arabicBox=findViewById(R.id.checkBoxArab);
        englishBox=findViewById(R.id.checkBoxEng);
        save=findViewById(R.id.saved);
        programmingRadio=findViewById(R.id.programmingRadio);
        medRadio=findViewById(R.id.medicineRadio);
        scienceRadio=findViewById(R.id.scienceRadio);
        culturalRadio=findViewById(R.id.culturalRadio);
        bookTitle=findViewById(R.id.bookTitle);
        pages=findViewById(R.id.bookPages);
         

        title=bookTitle.getText().toString();

        BookDs bookDs=new BookDs();

        programmingRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfBook="Programming";
            }
        });

        medRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfBook="Medicine";
            }
        });

        culturalRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfBook="Cultural Studies";
            }
        });

        scienceRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfBook="Science";
            }
        });

        if(arabicBox.isChecked() && englishBox.isChecked()){
            checkBox="In English and Arabic";

        }

        else if(arabicBox.isChecked() && !(englishBox.isChecked())){
            checkBox="In Arabic";

        }

        else if(!(arabicBox.isChecked()) && englishBox.isChecked()){
            checkBox="In English";

        }


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = null;
                page=Integer.parseInt(pages.getText().toString());
                bookDs.books.add(new Book(title, typeOfBook, page, checkBox));


                Toast.makeText(MainActivity2.this, "Saved", Toast.LENGTH_SHORT).show();
            }


        });




    }




}