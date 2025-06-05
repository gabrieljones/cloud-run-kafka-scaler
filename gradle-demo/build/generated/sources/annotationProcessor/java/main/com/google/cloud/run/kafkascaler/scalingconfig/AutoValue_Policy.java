package com.google.cloud.run.kafkascaler.scalingconfig;

import java.time.Duration;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Policy extends Policy {

  private final Policy.Type type;

  private final int value;

  private final Duration periodSeconds;

  private AutoValue_Policy(
      Policy.Type type,
      int value,
      Duration periodSeconds) {
    this.type = type;
    this.value = value;
    this.periodSeconds = periodSeconds;
  }

  @Override
  public Policy.Type type() {
    return type;
  }

  @Override
  public int value() {
    return value;
  }

  @Override
  public Duration periodSeconds() {
    return periodSeconds;
  }

  @Override
  public String toString() {
    return "Policy{"
        + "type=" + type + ", "
        + "value=" + value + ", "
        + "periodSeconds=" + periodSeconds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Policy) {
      Policy that = (Policy) o;
      return this.type.equals(that.type())
          && this.value == that.value()
          && this.periodSeconds.equals(that.periodSeconds());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= value;
    h$ *= 1000003;
    h$ ^= periodSeconds.hashCode();
    return h$;
  }

  static final class Builder extends Policy.Builder {
    private Policy.Type type;
    private int value;
    private Duration periodSeconds;
    private byte set$0;
    Builder() {
    }
    @Override
    public Policy.Builder type(Policy.Type type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public Policy.Builder value(int value) {
      this.value = value;
      set$0 |= (byte) 1;
      return this;
    }
    @Override
    public Policy.Builder periodSeconds(Duration periodSeconds) {
      if (periodSeconds == null) {
        throw new NullPointerException("Null periodSeconds");
      }
      this.periodSeconds = periodSeconds;
      return this;
    }
    @Override
    public Policy build() {
      if (set$0 != 1
          || this.type == null
          || this.periodSeconds == null) {
        StringBuilder missing = new StringBuilder();
        if (this.type == null) {
          missing.append(" type");
        }
        if ((set$0 & 1) == 0) {
          missing.append(" value");
        }
        if (this.periodSeconds == null) {
          missing.append(" periodSeconds");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Policy(
          this.type,
          this.value,
          this.periodSeconds);
    }
  }

}
