package com.google.cloud.run.kafkascaler.scalingconfig;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_External extends External {

  private final MetricName metric;

  private final MetricTarget target;

  private AutoValue_External(
      MetricName metric,
      MetricTarget target) {
    this.metric = metric;
    this.target = target;
  }

  @Override
  public MetricName metric() {
    return metric;
  }

  @Override
  public MetricTarget target() {
    return target;
  }

  @Override
  public String toString() {
    return "External{"
        + "metric=" + metric + ", "
        + "target=" + target
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof External) {
      External that = (External) o;
      return this.metric.equals(that.metric())
          && this.target.equals(that.target());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= metric.hashCode();
    h$ *= 1000003;
    h$ ^= target.hashCode();
    return h$;
  }

  static final class Builder extends External.Builder {
    private MetricName metric;
    private MetricTarget target;
    Builder() {
    }
    @Override
    public External.Builder metric(MetricName metric) {
      if (metric == null) {
        throw new NullPointerException("Null metric");
      }
      this.metric = metric;
      return this;
    }
    @Override
    public External.Builder target(MetricTarget target) {
      if (target == null) {
        throw new NullPointerException("Null target");
      }
      this.target = target;
      return this;
    }
    @Override
    public External build() {
      if (this.metric == null
          || this.target == null) {
        StringBuilder missing = new StringBuilder();
        if (this.metric == null) {
          missing.append(" metric");
        }
        if (this.target == null) {
          missing.append(" target");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_External(
          this.metric,
          this.target);
    }
  }

}
