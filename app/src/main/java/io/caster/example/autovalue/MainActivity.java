package io.caster.example.autovalue;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

@SuppressLint("Assert")
public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    User john1 = User.with("John", "Smith");
    User john2 = User.with("John", "Smith");

    assert(john1.equals(john2)); // succeeds!
  }
}
