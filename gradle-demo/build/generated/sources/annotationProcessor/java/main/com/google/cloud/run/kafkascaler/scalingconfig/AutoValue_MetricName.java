package com.google.cloud.run.kafkascaler.scalingconfig;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MetricName extends MetricName {

  private final String name;

  private AutoValue_MetricName(
      String name) {
    this.name = name;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return "MetricName{"
        + "name=" + name
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MetricName) {
      MetricName that = (MetricName) o;
      return this.name.equals(that.name());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    return h$;
  }

  static final class Builder extends MetricName.Builder {
    private String name;
    Builder() {
    }
    @Override
    public MetricName.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public MetricName build() {
      if (this.name == null) {
        String missing = " name";
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MetricName(
          this.name);
    }
  }

}
