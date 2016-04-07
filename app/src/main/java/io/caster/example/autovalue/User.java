package io.caster.example.autovalue;

import com.google.auto.value.AutoValue;

@AutoValue public abstract class User {
  public abstract String firstName();
  public abstract String lastName();

  public String fullName() {
    return firstName() + " " + lastName();
  }

  public static User with(String firstName, String lastName) {
    return new AutoValue_User(firstName, lastName);
  }
}
