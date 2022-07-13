package com.google.android.gnd.model.task;

// Generated by com.google.auto.value.processor.AutoOneOfProcessor
final class AutoOneOf_Step {
  private AutoOneOf_Step() {} // There are no instances of this type.

  static Step field(Field field) {
    if (field == null) {
      throw new NullPointerException();
    }
    return new Impl_field(field);
  }

  static Step unknown(Object unknown) {
    if (unknown == null) {
      throw new NullPointerException();
    }
    return new Impl_unknown(unknown);
  }

  // Parent class that each implementation will inherit from.
  private abstract static class Parent_ extends Step {
    @Override
    public Field getField() {
      throw new UnsupportedOperationException(getType().toString());
    }
    @Override
    public Object getUnknown() {
      throw new UnsupportedOperationException(getType().toString());
    }
  }

  // Implementation when the contained property is "field".
  private static final class Impl_field extends Parent_ {
    private final Field field;
    Impl_field(Field field) {
      this.field = field;
    }
    @Override
    public Field getField() {
      return field;
    }
    @Override
    public String toString() {
      return "Step{field=" + this.field + "}";
    }
    @Override
    public boolean equals(Object x) {
      if (x instanceof Step) {
        Step that = (Step) x;
        return this.getType() == that.getType()
            && this.field.equals(that.getField());
      } else {
        return false;
      }
    }
    @Override
    public int hashCode() {
      return field.hashCode();
    }
    @Override
    public Step.Type getType() {
      return Step.Type.FIELD;
    }
  }

  // Implementation when the contained property is "unknown".
  private static final class Impl_unknown extends Parent_ {
    private final Object unknown;
    Impl_unknown(Object unknown) {
      this.unknown = unknown;
    }
    @Override
    public Object getUnknown() {
      return unknown;
    }
    @Override
    public String toString() {
      return "Step{unknown=" + this.unknown + "}";
    }
    @Override
    public boolean equals(Object x) {
      if (x instanceof Step) {
        Step that = (Step) x;
        return this.getType() == that.getType()
            && this.unknown.equals(that.getUnknown());
      } else {
        return false;
      }
    }
    @Override
    public int hashCode() {
      return unknown.hashCode();
    }
    @Override
    public Step.Type getType() {
      return Step.Type.UNKNOWN;
    }
  }

}