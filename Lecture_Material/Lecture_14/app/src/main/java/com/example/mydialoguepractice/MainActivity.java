package com.example.mydialoguepractice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public String[] Colors={"Red","Green","Blue"};
    ArrayList<Integer> selectedItems=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialogueOne(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("First Alert Box Title");
        builder.setMessage("This is my first try for the Dialogue BOX ");
        builder.setCancelable(false);
        
        builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Positive Button Clicked",Toast.LENGTH_SHORT).show();
                //finish();
            }
        });
        
        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Negative Button Clicked",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        AlertDialog dialog=builder.create();
        dialog.show();
    }

    public void dialogueTwo(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);


        builder.setCancelable(false);
        builder.setTitle("Second Alert Box Title").setItems(Colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Color Selected is "+Colors[which],Toast.LENGTH_SHORT).show();
            }
        });


        builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Positive Button Clicked",Toast.LENGTH_SHORT).show();
                //finish();
            }
        });

        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Negative Button Clicked",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        AlertDialog dialog=builder.create();
        dialog.show();
    }

    public void dialogueThree(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(false);

        builder.setTitle("Third Dialogue box").setMultiChoiceItems(Colors, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if (isChecked) {
                    selectedItems.add(which);
                } else if (selectedItems.contains(which)) {
                    selectedItems.remove(Integer.valueOf(which));
                }
            }
        });

        builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String msg = "";
                for (int i = 0; i < selectedItems.size(); i++)
                {
                    msg = msg + "\n" + (i + 1) + " : " + Colors[ selectedItems.get(i)];
                }
                Toast.makeText(getApplicationContext(), "Total " + selectedItems.size() + " Items Selected.\n" + msg, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String msg = "";
                for (int i = 0; i < selectedItems.size(); i++)
                {
                    msg = msg + "\n" + (i + 1) + " : " + Colors[ selectedItems.get(i)];
                }
                Toast.makeText(getApplicationContext(), "Total " + selectedItems.size() + " Items Selected.\n" + msg, Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        AlertDialog dialog=builder.create();
        dialog.show();
    }

    public void dialogueFour(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

        builder.setTitle("Fourth Dialogue box");
        LayoutInflater inflater=this.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.customized_layout,null));

        builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Positive Button Clicked",Toast.LENGTH_SHORT).show();
                //finish();
            }
        });

        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Negative Button Clicked",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        AlertDialog dialog=builder.create();
        dialog.show();
    }
}