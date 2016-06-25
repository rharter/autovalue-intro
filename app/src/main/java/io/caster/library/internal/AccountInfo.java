package io.caster.library.internal;

import java.util.Date;

public final class AccountInfo {
  public String tokenId;
  public Date expiration;

  public AccountInfo(String tokenId, Date expiration) {
    this.tokenId = tokenId;
    this.expiration = expiration;
  }
}
