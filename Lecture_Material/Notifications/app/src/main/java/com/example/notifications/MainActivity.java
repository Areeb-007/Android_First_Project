package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    public Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2= findViewById(R.id.button2);



        btn= findViewById(R.id.button_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message =" This is a notification example.";
                NotificationCompat.Builder builder= new NotificationCompat.Builder(
                        MainActivity.this
                ).setSmallIcon(R.drawable.ic_notifications)
                        .setContentTitle("New Notification")
                        .setContentText(message)
                        .setAutoCancel(true);
                NotificationManager notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(0,builder.build());
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(MainActivity.this);
                String title = "Notifications";
                String message = "There is an other notification  as well...";
                Notification notification = new NotificationCompat.Builder(MainActivity.this, "CHANNEL_1_ID")
                        .setSmallIcon(R.drawable.ic_notifications)
                        .setContentTitle(title)
                        .setContentText(message)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .build();
                notificationManager.notify(1, notification);
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });

    }
}