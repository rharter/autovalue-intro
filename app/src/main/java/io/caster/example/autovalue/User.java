package io.caster.example.autovalue;

import com.google.auto.value.AutoValue;

@AutoValue public abstract class User {
  public abstract String salutation();
  public abstract String firstName();
  public abstract String lastName();
  public abstract int age();
  public abstract boolean registered();

  public String fullName() {
    return firstName() + " " + lastName();
  }

  public abstract Builder toBuilder();

  public User with(int age) {
    return toBuilder().age(age).build();
  }

  public static Builder builder() {
    return new AutoValue_User.Builder()
        .registered(false);
  }

  @AutoValue.Builder public static abstract class Builder {
    public abstract Builder salutation(String salutation);
    public abstract Builder firstName(String firstName);
    public abstract Builder lastName(String lastName);
    public abstract Builder age(int age);
    public abstract Builder registered(boolean registered);
    public abstract User build();
  }
}
