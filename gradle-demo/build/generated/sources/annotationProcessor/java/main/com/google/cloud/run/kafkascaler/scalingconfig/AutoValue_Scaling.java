package com.google.cloud.run.kafkascaler.scalingconfig;

import com.google.common.collect.ImmutableList;
import java.time.Duration;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Scaling extends Scaling {

  @Nullable
  private final Duration stabilizationWindowSeconds;

  private final ImmutableList<Policy> policies;

  @Nullable
  private final Scaling.SelectPolicy selectPolicy;

  private AutoValue_Scaling(
      @Nullable Duration stabilizationWindowSeconds,
      ImmutableList<Policy> policies,
      @Nullable Scaling.SelectPolicy selectPolicy) {
    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    this.policies = policies;
    this.selectPolicy = selectPolicy;
  }

  @Nullable
  @Override
  public Duration stabilizationWindowSeconds() {
    return stabilizationWindowSeconds;
  }

  @Override
  public ImmutableList<Policy> policies() {
    return policies;
  }

  @Nullable
  @Override
  public Scaling.SelectPolicy selectPolicy() {
    return selectPolicy;
  }

  @Override
  public String toString() {
    return "Scaling{"
        + "stabilizationWindowSeconds=" + stabilizationWindowSeconds + ", "
        + "policies=" + policies + ", "
        + "selectPolicy=" + selectPolicy
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Scaling) {
      Scaling that = (Scaling) o;
      return (this.stabilizationWindowSeconds == null ? that.stabilizationWindowSeconds() == null : this.stabilizationWindowSeconds.equals(that.stabilizationWindowSeconds()))
          && this.policies.equals(that.policies())
          && (this.selectPolicy == null ? that.selectPolicy() == null : this.selectPolicy.equals(that.selectPolicy()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (stabilizationWindowSeconds == null) ? 0 : stabilizationWindowSeconds.hashCode();
    h$ *= 1000003;
    h$ ^= policies.hashCode();
    h$ *= 1000003;
    h$ ^= (selectPolicy == null) ? 0 : selectPolicy.hashCode();
    return h$;
  }

  static final class Builder extends Scaling.Builder {
    private Duration stabilizationWindowSeconds;
    private ImmutableList<Policy> policies;
    private Scaling.SelectPolicy selectPolicy;
    Builder() {
    }
    @Override
    public Scaling.Builder stabilizationWindowSeconds(Duration stabilizationWindowSeconds) {
      this.stabilizationWindowSeconds = stabilizationWindowSeconds;
      return this;
    }
    @Override
    public Scaling.Builder policies(ImmutableList<Policy> policies) {
      if (policies == null) {
        throw new NullPointerException("Null policies");
      }
      this.policies = policies;
      return this;
    }
    @Override
    public Scaling.Builder selectPolicy(Scaling.SelectPolicy selectPolicy) {
      this.selectPolicy = selectPolicy;
      return this;
    }
    @Override
    public Scaling build() {
      if (this.policies == null) {
        String missing = " policies";
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Scaling(
          this.stabilizationWindowSeconds,
          this.policies,
          this.selectPolicy);
    }
  }

}
