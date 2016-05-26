package io.caster.example.autovalue;

import org.junit.Test;

public class UserTest {

  @Test public void testUser() {
    User user = User.builder()
        .salutation("Mr.")
        .firstName("Ryan")
        .lastName("Harter")
        .age(30)
        .build();

    User twin = user.toBuilder().firstName("John").build();
  }

}