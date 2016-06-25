package io.caster.example.autovalue;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

@SuppressLint("Assert")
public class MainActivity extends AppCompatActivity {

  User myUser;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    myUser = User.named("Ryan", "Harter");

    Intent intent = new Intent(this, MainActivity.class);
    intent.putExtra("user", myUser);

    startActivity(intent);
  }
}
