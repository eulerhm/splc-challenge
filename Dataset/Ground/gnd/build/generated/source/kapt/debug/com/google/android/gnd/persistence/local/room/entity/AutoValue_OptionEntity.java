package com.google.android.gnd.persistence.local.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;

// Generated by com.google.auto.value.processor.AutoValueProcessor
final class AutoValue_OptionEntity extends OptionEntity {

  @NonNull
  @ColumnInfo(name = "id")
  private final String id;

  @NonNull
  @ColumnInfo(name = "code")
  private final String code;

  @NonNull
  @ColumnInfo(name = "label")
  private final String label;

  @NonNull
  @ColumnInfo(name = "field_id")
  private final String fieldId;

  private AutoValue_OptionEntity(
      String id,
      String code,
      String label,
      String fieldId) {
    this.id = id;
    this.code = code;
    this.label = label;
    this.fieldId = fieldId;
  }

  @NonNull
  @ColumnInfo(name = "id")
  @Override
  public String getId() {
    return id;
  }

  @NonNull
  @ColumnInfo(name = "code")
  @Override
  public String getCode() {
    return code;
  }

  @NonNull
  @ColumnInfo(name = "label")
  @Override
  public String getLabel() {
    return label;
  }

  @NonNull
  @ColumnInfo(name = "field_id")
  @Override
  public String getFieldId() {
    return fieldId;
  }

  @Override
  public String toString() {
    return "OptionEntity{"
        + "id=" + id + ", "
        + "code=" + code + ", "
        + "label=" + label + ", "
        + "fieldId=" + fieldId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OptionEntity) {
      OptionEntity that = (OptionEntity) o;
      return this.id.equals(that.getId())
          && this.code.equals(that.getCode())
          && this.label.equals(that.getLabel())
          && this.fieldId.equals(that.getFieldId());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= id.hashCode();
    h$ *= 1000003;
    h$ ^= code.hashCode();
    h$ *= 1000003;
    h$ ^= label.hashCode();
    h$ *= 1000003;
    h$ ^= fieldId.hashCode();
    return h$;
  }

  static final class Builder extends OptionEntity.Builder {
    private String id;
    private String code;
    private String label;
    private String fieldId;
    Builder() {
    }
    @Override
    public OptionEntity.Builder setId(String id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public OptionEntity.Builder setCode(String code) {
      if (code == null) {
        throw new NullPointerException("Null code");
      }
      this.code = code;
      return this;
    }
    @Override
    public OptionEntity.Builder setLabel(String label) {
      if (label == null) {
        throw new NullPointerException("Null label");
      }
      this.label = label;
      return this;
    }
    @Override
    public OptionEntity.Builder setFieldId(String fieldId) {
      if (fieldId == null) {
        throw new NullPointerException("Null fieldId");
      }
      this.fieldId = fieldId;
      return this;
    }
    @Override
    public OptionEntity build() {
      String missing = "";
      if (this.id == null) {
        missing += " id";
      }
      if (this.code == null) {
        missing += " code";
      }
      if (this.label == null) {
        missing += " label";
      }
      if (this.fieldId == null) {
        missing += " fieldId";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_OptionEntity(
          this.id,
          this.code,
          this.label,
          this.fieldId);
    }
  }

}