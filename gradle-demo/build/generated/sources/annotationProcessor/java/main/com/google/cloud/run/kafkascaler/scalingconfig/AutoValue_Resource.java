package com.google.cloud.run.kafkascaler.scalingconfig;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Resource extends Resource {

  private final String name;

  private final MetricTarget target;

  private AutoValue_Resource(
      String name,
      MetricTarget target) {
    this.name = name;
    this.target = target;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public MetricTarget target() {
    return target;
  }

  @Override
  public String toString() {
    return "Resource{"
        + "name=" + name + ", "
        + "target=" + target
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Resource) {
      Resource that = (Resource) o;
      return this.name.equals(that.name())
          && this.target.equals(that.target());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= target.hashCode();
    return h$;
  }

  static final class Builder extends Resource.Builder {
    private String name;
    private MetricTarget target;
    Builder() {
    }
    @Override
    public Resource.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public Resource.Builder target(MetricTarget target) {
      if (target == null) {
        throw new NullPointerException("Null target");
      }
      this.target = target;
      return this;
    }
    @Override
    public Resource build() {
      if (this.name == null
          || this.target == null) {
        StringBuilder missing = new StringBuilder();
        if (this.name == null) {
          missing.append(" name");
        }
        if (this.target == null) {
          missing.append(" target");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Resource(
          this.name,
          this.target);
    }
  }

}
