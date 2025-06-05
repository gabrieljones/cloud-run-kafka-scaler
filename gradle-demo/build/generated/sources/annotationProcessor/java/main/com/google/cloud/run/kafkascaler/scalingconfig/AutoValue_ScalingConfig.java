package com.google.cloud.run.kafkascaler.scalingconfig;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ScalingConfig extends ScalingConfig {

  private final Spec spec;

  private AutoValue_ScalingConfig(
      Spec spec) {
    this.spec = spec;
  }

  @Override
  public Spec spec() {
    return spec;
  }

  @Override
  public String toString() {
    return "ScalingConfig{"
        + "spec=" + spec
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ScalingConfig) {
      ScalingConfig that = (ScalingConfig) o;
      return this.spec.equals(that.spec());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= spec.hashCode();
    return h$;
  }

  static final class Builder extends ScalingConfig.Builder {
    private Spec spec;
    Builder() {
    }
    @Override
    public ScalingConfig.Builder spec(Spec spec) {
      if (spec == null) {
        throw new NullPointerException("Null spec");
      }
      this.spec = spec;
      return this;
    }
    @Override
    public ScalingConfig build() {
      if (this.spec == null) {
        String missing = " spec";
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ScalingConfig(
          this.spec);
    }
  }

}
