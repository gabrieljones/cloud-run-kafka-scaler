package com.google.cloud.run.kafkascaler.scalingconfig;

import java.time.Duration;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Behavior extends Behavior {

  @Nullable
  private final Scaling scaleDown;

  @Nullable
  private final Scaling scaleUp;

  @Nullable
  private final Duration cooldownSeconds;

  private AutoValue_Behavior(
      @Nullable Scaling scaleDown,
      @Nullable Scaling scaleUp,
      @Nullable Duration cooldownSeconds) {
    this.scaleDown = scaleDown;
    this.scaleUp = scaleUp;
    this.cooldownSeconds = cooldownSeconds;
  }

  @Nullable
  @Override
  public Scaling scaleDown() {
    return scaleDown;
  }

  @Nullable
  @Override
  public Scaling scaleUp() {
    return scaleUp;
  }

  @Nullable
  @Override
  public Duration cooldownSeconds() {
    return cooldownSeconds;
  }

  @Override
  public String toString() {
    return "Behavior{"
        + "scaleDown=" + scaleDown + ", "
        + "scaleUp=" + scaleUp + ", "
        + "cooldownSeconds=" + cooldownSeconds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Behavior) {
      Behavior that = (Behavior) o;
      return (this.scaleDown == null ? that.scaleDown() == null : this.scaleDown.equals(that.scaleDown()))
          && (this.scaleUp == null ? that.scaleUp() == null : this.scaleUp.equals(that.scaleUp()))
          && (this.cooldownSeconds == null ? that.cooldownSeconds() == null : this.cooldownSeconds.equals(that.cooldownSeconds()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (scaleDown == null) ? 0 : scaleDown.hashCode();
    h$ *= 1000003;
    h$ ^= (scaleUp == null) ? 0 : scaleUp.hashCode();
    h$ *= 1000003;
    h$ ^= (cooldownSeconds == null) ? 0 : cooldownSeconds.hashCode();
    return h$;
  }

  static final class Builder extends Behavior.Builder {
    private Scaling scaleDown;
    private Scaling scaleUp;
    private Duration cooldownSeconds;
    Builder() {
    }
    @Override
    public Behavior.Builder scaleDown(Scaling scaleDown) {
      this.scaleDown = scaleDown;
      return this;
    }
    @Override
    public Behavior.Builder scaleUp(Scaling scaleUp) {
      this.scaleUp = scaleUp;
      return this;
    }
    @Override
    public Behavior.Builder cooldownSeconds(Duration cooldownSeconds) {
      this.cooldownSeconds = cooldownSeconds;
      return this;
    }
    @Override
    public Behavior build() {
      return new AutoValue_Behavior(
          this.scaleDown,
          this.scaleUp,
          this.cooldownSeconds);
    }
  }

}
