package com.google.android.gnd.ui.map;

import androidx.annotation.Nullable;
import com.google.android.gnd.model.feature.Feature;
import com.google.android.gnd.model.feature.Point;
import com.google.android.gnd.model.job.Style;
import com.google.common.collect.ImmutableList;

// Generated by com.google.auto.value.processor.AutoValueProcessor
final class AutoValue_MapPolygon extends MapPolygon {

  private final String id;

  private final ImmutableList<Point> vertices;

  private final Style style;

  private final Feature feature;

  private AutoValue_MapPolygon(
      String id,
      ImmutableList<Point> vertices,
      Style style,
      @Nullable Feature feature) {
    this.id = id;
    this.vertices = vertices;
    this.style = style;
    this.feature = feature;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public ImmutableList<Point> getVertices() {
    return vertices;
  }

  @Override
  public Style getStyle() {
    return style;
  }

  @Nullable
  @Override
  public Feature getFeature() {
    return feature;
  }

  @Override
  public String toString() {
    return "MapPolygon{"
        + "id=" + id + ", "
        + "vertices=" + vertices + ", "
        + "style=" + style + ", "
        + "feature=" + feature
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapPolygon) {
      MapPolygon that = (MapPolygon) o;
      return this.id.equals(that.getId())
          && this.vertices.equals(that.getVertices())
          && this.style.equals(that.getStyle())
          && (this.feature == null ? that.getFeature() == null : this.feature.equals(that.getFeature()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= id.hashCode();
    h$ *= 1000003;
    h$ ^= vertices.hashCode();
    h$ *= 1000003;
    h$ ^= style.hashCode();
    h$ *= 1000003;
    h$ ^= (feature == null) ? 0 : feature.hashCode();
    return h$;
  }

  @Override
  public MapPolygon.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MapPolygon.Builder {
    private String id;
    private ImmutableList<Point> vertices;
    private Style style;
    private Feature feature;
    Builder() {
    }
    private Builder(MapPolygon source) {
      this.id = source.getId();
      this.vertices = source.getVertices();
      this.style = source.getStyle();
      this.feature = source.getFeature();
    }
    @Override
    public MapPolygon.Builder setId(String id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public MapPolygon.Builder setVertices(ImmutableList<Point> vertices) {
      if (vertices == null) {
        throw new NullPointerException("Null vertices");
      }
      this.vertices = vertices;
      return this;
    }
    @Override
    public MapPolygon.Builder setStyle(Style style) {
      if (style == null) {
        throw new NullPointerException("Null style");
      }
      this.style = style;
      return this;
    }
    @Override
    public MapPolygon.Builder setFeature(@Nullable Feature feature) {
      this.feature = feature;
      return this;
    }
    @Override
    public MapPolygon build() {
      String missing = "";
      if (this.id == null) {
        missing += " id";
      }
      if (this.vertices == null) {
        missing += " vertices";
      }
      if (this.style == null) {
        missing += " style";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapPolygon(
          this.id,
          this.vertices,
          this.style,
          this.feature);
    }
  }

}