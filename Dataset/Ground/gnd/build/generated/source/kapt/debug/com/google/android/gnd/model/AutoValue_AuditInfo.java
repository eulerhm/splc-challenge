package com.google.android.gnd.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java8.util.Optional;

// Generated by com.google.auto.value.processor.AutoValueProcessor
final class AutoValue_AuditInfo extends AuditInfo {

  private final User user;

  private final Date clientTimestamp;

  private final Optional<Date> serverTimestamp;

  private AutoValue_AuditInfo(
      User user,
      Date clientTimestamp,
      Optional<Date> serverTimestamp) {
    this.user = user;
    this.clientTimestamp = clientTimestamp;
    this.serverTimestamp = serverTimestamp;
  }

  @NonNull
  @Override
  public User getUser() {
    return user;
  }

  @NonNull
  @Override
  public Date getClientTimestamp() {
    return clientTimestamp;
  }

  @NonNull
  @Override
  public Optional<Date> getServerTimestamp() {
    return serverTimestamp;
  }

  @Override
  public String toString() {
    return "AuditInfo{"
        + "user=" + user + ", "
        + "clientTimestamp=" + clientTimestamp + ", "
        + "serverTimestamp=" + serverTimestamp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuditInfo) {
      AuditInfo that = (AuditInfo) o;
      return this.user.equals(that.getUser())
          && this.clientTimestamp.equals(that.getClientTimestamp())
          && this.serverTimestamp.equals(that.getServerTimestamp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= user.hashCode();
    h$ *= 1000003;
    h$ ^= clientTimestamp.hashCode();
    h$ *= 1000003;
    h$ ^= serverTimestamp.hashCode();
    return h$;
  }

  static final class Builder extends AuditInfo.Builder {
    private User user;
    private Date clientTimestamp;
    private Optional<Date> serverTimestamp;
    Builder() {
    }
    @Override
    public AuditInfo.Builder setUser(User user) {
      if (user == null) {
        throw new NullPointerException("Null user");
      }
      this.user = user;
      return this;
    }
    @Override
    public AuditInfo.Builder setClientTimestamp(Date clientTimestamp) {
      if (clientTimestamp == null) {
        throw new NullPointerException("Null clientTimestamp");
      }
      this.clientTimestamp = clientTimestamp;
      return this;
    }
    @Override
    public AuditInfo.Builder setServerTimestamp(Optional<Date> serverTimestamp) {
      if (serverTimestamp == null) {
        throw new NullPointerException("Null serverTimestamp");
      }
      this.serverTimestamp = serverTimestamp;
      return this;
    }
    @Override
    public AuditInfo build() {
      String missing = "";
      if (this.user == null) {
        missing += " user";
      }
      if (this.clientTimestamp == null) {
        missing += " clientTimestamp";
      }
      if (this.serverTimestamp == null) {
        missing += " serverTimestamp";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AuditInfo(
          this.user,
          this.clientTimestamp,
          this.serverTimestamp);
    }
  }

}