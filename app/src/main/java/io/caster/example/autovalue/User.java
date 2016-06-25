package io.caster.example.autovalue;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import com.ryanharter.auto.value.parcel.ParcelAdapter;
import io.caster.library.internal.AccountInfo;

@AutoValue public abstract class User implements Parcelable {

  public abstract String firstName();
  public abstract String lastName();
  @ParcelAdapter(AccountInfoTypeAdapter.class) public abstract AccountInfo accountInfo();

  public String fullName() {
    return firstName() + " " + lastName();
  }

  public static User named(String firstName, String lastName) {
    return new AutoValue_User(firstName, lastName);
  }
}
