package com.google.cloud.run.kafkascaler.scalingconfig;

import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Spec extends Spec {

  private final ScaleTargetRef scaleTargetRef;

  private final ImmutableList<Metric> metrics;

  @Nullable
  private final Behavior behavior;

  private AutoValue_Spec(
      ScaleTargetRef scaleTargetRef,
      ImmutableList<Metric> metrics,
      @Nullable Behavior behavior) {
    this.scaleTargetRef = scaleTargetRef;
    this.metrics = metrics;
    this.behavior = behavior;
  }

  @Override
  public ScaleTargetRef scaleTargetRef() {
    return scaleTargetRef;
  }

  @Override
  public ImmutableList<Metric> metrics() {
    return metrics;
  }

  @Nullable
  @Override
  public Behavior behavior() {
    return behavior;
  }

  @Override
  public String toString() {
    return "Spec{"
        + "scaleTargetRef=" + scaleTargetRef + ", "
        + "metrics=" + metrics + ", "
        + "behavior=" + behavior
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Spec) {
      Spec that = (Spec) o;
      return this.scaleTargetRef.equals(that.scaleTargetRef())
          && this.metrics.equals(that.metrics())
          && (this.behavior == null ? that.behavior() == null : this.behavior.equals(that.behavior()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= scaleTargetRef.hashCode();
    h$ *= 1000003;
    h$ ^= metrics.hashCode();
    h$ *= 1000003;
    h$ ^= (behavior == null) ? 0 : behavior.hashCode();
    return h$;
  }

  static final class Builder extends Spec.Builder {
    private ScaleTargetRef scaleTargetRef;
    private ImmutableList<Metric> metrics;
    private Behavior behavior;
    Builder() {
    }
    @Override
    public Spec.Builder scaleTargetRef(ScaleTargetRef scaleTargetRef) {
      if (scaleTargetRef == null) {
        throw new NullPointerException("Null scaleTargetRef");
      }
      this.scaleTargetRef = scaleTargetRef;
      return this;
    }
    @Override
    public Spec.Builder metrics(ImmutableList<Metric> metrics) {
      if (metrics == null) {
        throw new NullPointerException("Null metrics");
      }
      this.metrics = metrics;
      return this;
    }
    @Override
    public Spec.Builder behavior(Behavior behavior) {
      this.behavior = behavior;
      return this;
    }
    @Override
    public Spec build() {
      if (this.scaleTargetRef == null
          || this.metrics == null) {
        StringBuilder missing = new StringBuilder();
        if (this.scaleTargetRef == null) {
          missing.append(" scaleTargetRef");
        }
        if (this.metrics == null) {
          missing.append(" metrics");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Spec(
          this.scaleTargetRef,
          this.metrics,
          this.behavior);
    }
  }

}
