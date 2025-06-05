package com.google.cloud.run.kafkascaler.scalingconfig;

import java.time.Duration;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MetricTarget extends MetricTarget {

  private final MetricTarget.Type type;

  @Nullable
  private final Integer averageUtilization;

  @Nullable
  private final Integer averageValue;

  private final int activationThreshold;

  private final double tolerance;

  private final Duration windowSeconds;

  private AutoValue_MetricTarget(
      MetricTarget.Type type,
      @Nullable Integer averageUtilization,
      @Nullable Integer averageValue,
      int activationThreshold,
      double tolerance,
      Duration windowSeconds) {
    this.type = type;
    this.averageUtilization = averageUtilization;
    this.averageValue = averageValue;
    this.activationThreshold = activationThreshold;
    this.tolerance = tolerance;
    this.windowSeconds = windowSeconds;
  }

  @Override
  public MetricTarget.Type type() {
    return type;
  }

  @Nullable
  @Override
  public Integer averageUtilization() {
    return averageUtilization;
  }

  @Nullable
  @Override
  public Integer averageValue() {
    return averageValue;
  }

  @Override
  public int activationThreshold() {
    return activationThreshold;
  }

  @Override
  public double tolerance() {
    return tolerance;
  }

  @Override
  public Duration windowSeconds() {
    return windowSeconds;
  }

  @Override
  public String toString() {
    return "MetricTarget{"
        + "type=" + type + ", "
        + "averageUtilization=" + averageUtilization + ", "
        + "averageValue=" + averageValue + ", "
        + "activationThreshold=" + activationThreshold + ", "
        + "tolerance=" + tolerance + ", "
        + "windowSeconds=" + windowSeconds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MetricTarget) {
      MetricTarget that = (MetricTarget) o;
      return this.type.equals(that.type())
          && (this.averageUtilization == null ? that.averageUtilization() == null : this.averageUtilization.equals(that.averageUtilization()))
          && (this.averageValue == null ? that.averageValue() == null : this.averageValue.equals(that.averageValue()))
          && this.activationThreshold == that.activationThreshold()
          && Double.doubleToLongBits(this.tolerance) == Double.doubleToLongBits(that.tolerance())
          && this.windowSeconds.equals(that.windowSeconds());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= (averageUtilization == null) ? 0 : averageUtilization.hashCode();
    h$ *= 1000003;
    h$ ^= (averageValue == null) ? 0 : averageValue.hashCode();
    h$ *= 1000003;
    h$ ^= activationThreshold;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(tolerance) >>> 32) ^ Double.doubleToLongBits(tolerance));
    h$ *= 1000003;
    h$ ^= windowSeconds.hashCode();
    return h$;
  }

  static final class Builder extends MetricTarget.Builder {
    private MetricTarget.Type type;
    private Integer averageUtilization;
    private Integer averageValue;
    private int activationThreshold;
    private double tolerance;
    private Duration windowSeconds;
    private byte set$0;
    Builder() {
    }
    @Override
    public MetricTarget.Builder type(MetricTarget.Type type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public MetricTarget.Builder averageUtilization(Integer averageUtilization) {
      this.averageUtilization = averageUtilization;
      return this;
    }
    @Override
    public MetricTarget.Builder averageValue(Integer averageValue) {
      this.averageValue = averageValue;
      return this;
    }
    @Override
    public MetricTarget.Builder activationThreshold(int activationThreshold) {
      this.activationThreshold = activationThreshold;
      set$0 |= (byte) 1;
      return this;
    }
    @Override
    public MetricTarget.Builder tolerance(double tolerance) {
      this.tolerance = tolerance;
      set$0 |= (byte) 2;
      return this;
    }
    @Override
    public MetricTarget.Builder windowSeconds(Duration windowSeconds) {
      if (windowSeconds == null) {
        throw new NullPointerException("Null windowSeconds");
      }
      this.windowSeconds = windowSeconds;
      return this;
    }
    @Override
    public MetricTarget build() {
      if (set$0 != 3
          || this.type == null
          || this.windowSeconds == null) {
        StringBuilder missing = new StringBuilder();
        if (this.type == null) {
          missing.append(" type");
        }
        if ((set$0 & 1) == 0) {
          missing.append(" activationThreshold");
        }
        if ((set$0 & 2) == 0) {
          missing.append(" tolerance");
        }
        if (this.windowSeconds == null) {
          missing.append(" windowSeconds");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MetricTarget(
          this.type,
          this.averageUtilization,
          this.averageValue,
          this.activationThreshold,
          this.tolerance,
          this.windowSeconds);
    }
  }

}
