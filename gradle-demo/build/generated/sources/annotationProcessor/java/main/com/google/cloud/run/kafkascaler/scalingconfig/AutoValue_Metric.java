package com.google.cloud.run.kafkascaler.scalingconfig;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Metric extends Metric {

  private final Metric.Type type;

  @Nullable
  private final Resource resource;

  @Nullable
  private final External external;

  private AutoValue_Metric(
      Metric.Type type,
      @Nullable Resource resource,
      @Nullable External external) {
    this.type = type;
    this.resource = resource;
    this.external = external;
  }

  @Override
  public Metric.Type type() {
    return type;
  }

  @Nullable
  @Override
  public Resource resource() {
    return resource;
  }

  @Nullable
  @Override
  public External external() {
    return external;
  }

  @Override
  public String toString() {
    return "Metric{"
        + "type=" + type + ", "
        + "resource=" + resource + ", "
        + "external=" + external
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Metric) {
      Metric that = (Metric) o;
      return this.type.equals(that.type())
          && (this.resource == null ? that.resource() == null : this.resource.equals(that.resource()))
          && (this.external == null ? that.external() == null : this.external.equals(that.external()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= (resource == null) ? 0 : resource.hashCode();
    h$ *= 1000003;
    h$ ^= (external == null) ? 0 : external.hashCode();
    return h$;
  }

  static final class Builder extends Metric.Builder {
    private Metric.Type type;
    private Resource resource;
    private External external;
    Builder() {
    }
    @Override
    public Metric.Builder type(Metric.Type type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public Metric.Builder resource(Resource resource) {
      this.resource = resource;
      return this;
    }
    @Override
    public Metric.Builder external(External external) {
      this.external = external;
      return this;
    }
    @Override
    public Metric build() {
      if (this.type == null) {
        String missing = " type";
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Metric(
          this.type,
          this.resource,
          this.external);
    }
  }

}
