package com.haya.something_selecter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

  private ImageView imageView;
  private Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    imageView = findViewById(R.id.imageView);
    button = findViewById(R.id.button);

    imageView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        imageView.setSelected(true);
      }
    });

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        imageView.setSelected(false);
      }
    });

  }
}