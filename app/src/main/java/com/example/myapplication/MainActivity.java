package com.example.myapplication;



import android.content.Intent;
import android.transition.Explode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.transition.Scene;
import android.transition.Transition;
import androidx.transition.TransitionManager;
import com.example.myapplication.newPackage.Book;
import com.example.myapplication.newPackage.BookDs;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnShow;
    private Spinner spnTypes;
    private TextView textResult;
    private Button buttonScene;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShow=findViewById(R.id.btnShow);
        spnTypes=findViewById(R.id.spnTypes);
        textResult=findViewById(R.id.textResult);
        buttonScene=findViewById(R.id.addMore);


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type = spnTypes.getSelectedItem().toString();
                BookDs bookDs=new BookDs();
                List<Book> listBooks = bookDs.getBooksByTypes(type);

                String str=" ";
                for(Book b: listBooks){
                    str+=b.getTitle().toString() + "\n";
                }
                textResult.setText(str);
            }
        });

        buttonScene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }


}