package io.caster.example.autovalue;

import android.os.Parcel;
import com.ryanharter.auto.value.parcel.TypeAdapter;
import io.caster.library.internal.AccountInfo;
import java.util.Date;

public class AccountInfoTypeAdapter implements TypeAdapter<AccountInfo> {
  @Override public AccountInfo fromParcel(Parcel in) {
    return new AccountInfo(in.readString(), new Date(in.readLong()));
  }

  @Override public void toParcel(AccountInfo value, Parcel dest) {
    dest.writeString(value.tokenId);
    dest.writeLong(value.expiration.getTime());
  }
}
