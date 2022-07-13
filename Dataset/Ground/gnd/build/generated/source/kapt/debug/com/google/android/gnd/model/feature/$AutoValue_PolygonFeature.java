package com.google.android.gnd.model.feature;

import androidx.annotation.NonNull;
import com.google.android.gnd.model.AuditInfo;
import com.google.android.gnd.model.Survey;
import com.google.android.gnd.model.job.Job;
import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

// Generated by com.google.auto.value.processor.AutoValueProcessor
abstract class $AutoValue_PolygonFeature extends PolygonFeature {

  private final String id;

  private final Survey survey;

  private final Job job;

  private final String customId;

  private final String caption;

  private final AuditInfo created;

  private final AuditInfo lastModified;

  private final ImmutableList<Point> vertices;

  $AutoValue_PolygonFeature(
      String id,
      Survey survey,
      Job job,
      @Nullable String customId,
      @Nullable String caption,
      AuditInfo created,
      AuditInfo lastModified,
      ImmutableList<Point> vertices) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (survey == null) {
      throw new NullPointerException("Null survey");
    }
    this.survey = survey;
    if (job == null) {
      throw new NullPointerException("Null job");
    }
    this.job = job;
    this.customId = customId;
    this.caption = caption;
    if (created == null) {
      throw new NullPointerException("Null created");
    }
    this.created = created;
    if (lastModified == null) {
      throw new NullPointerException("Null lastModified");
    }
    this.lastModified = lastModified;
    if (vertices == null) {
      throw new NullPointerException("Null vertices");
    }
    this.vertices = vertices;
  }

  @NonNull
  @Override
  public String getId() {
    return id;
  }

  @Override
  public Survey getSurvey() {
    return survey;
  }

  @Override
  public Job getJob() {
    return job;
  }

  @Nullable
  @Override
  public String getCustomId() {
    return customId;
  }

  @Nullable
  @Override
  public String getCaption() {
    return caption;
  }

  @Override
  public AuditInfo getCreated() {
    return created;
  }

  @Override
  public AuditInfo getLastModified() {
    return lastModified;
  }

  @Override
  public ImmutableList<Point> getVertices() {
    return vertices;
  }

  @Override
  public String toString() {
    return "PolygonFeature{"
        + "id=" + id + ", "
        + "survey=" + survey + ", "
        + "job=" + job + ", "
        + "customId=" + customId + ", "
        + "caption=" + caption + ", "
        + "created=" + created + ", "
        + "lastModified=" + lastModified + ", "
        + "vertices=" + vertices
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PolygonFeature) {
      PolygonFeature that = (PolygonFeature) o;
      return this.id.equals(that.getId())
          && this.survey.equals(that.getSurvey())
          && this.job.equals(that.getJob())
          && (this.customId == null ? that.getCustomId() == null : this.customId.equals(that.getCustomId()))
          && (this.caption == null ? that.getCaption() == null : this.caption.equals(that.getCaption()))
          && this.created.equals(that.getCreated())
          && this.lastModified.equals(that.getLastModified())
          && this.vertices.equals(that.getVertices());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= id.hashCode();
    h$ *= 1000003;
    h$ ^= survey.hashCode();
    h$ *= 1000003;
    h$ ^= job.hashCode();
    h$ *= 1000003;
    h$ ^= (customId == null) ? 0 : customId.hashCode();
    h$ *= 1000003;
    h$ ^= (caption == null) ? 0 : caption.hashCode();
    h$ *= 1000003;
    h$ ^= created.hashCode();
    h$ *= 1000003;
    h$ ^= lastModified.hashCode();
    h$ *= 1000003;
    h$ ^= vertices.hashCode();
    return h$;
  }

  @Override
  public PolygonFeature.Builder toBuilder() {
    return new Builder(this);
  }

  static class Builder extends PolygonFeature.Builder {
    private String id;
    private Survey survey;
    private Job job;
    private String customId;
    private String caption;
    private AuditInfo created;
    private AuditInfo lastModified;
    private ImmutableList<Point> vertices;
    Builder() {
    }
    private Builder(PolygonFeature source) {
      this.id = source.getId();
      this.survey = source.getSurvey();
      this.job = source.getJob();
      this.customId = source.getCustomId();
      this.caption = source.getCaption();
      this.created = source.getCreated();
      this.lastModified = source.getLastModified();
      this.vertices = source.getVertices();
    }
    @Override
    public PolygonFeature.Builder setId(String id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public PolygonFeature.Builder setSurvey(Survey survey) {
      if (survey == null) {
        throw new NullPointerException("Null survey");
      }
      this.survey = survey;
      return this;
    }
    @Override
    public PolygonFeature.Builder setJob(Job job) {
      if (job == null) {
        throw new NullPointerException("Null job");
      }
      this.job = job;
      return this;
    }
    @Override
    public PolygonFeature.Builder setCustomId(@Nullable String customId) {
      this.customId = customId;
      return this;
    }
    @Override
    public PolygonFeature.Builder setCaption(@Nullable String caption) {
      this.caption = caption;
      return this;
    }
    @Override
    public PolygonFeature.Builder setCreated(AuditInfo created) {
      if (created == null) {
        throw new NullPointerException("Null created");
      }
      this.created = created;
      return this;
    }
    @Override
    public PolygonFeature.Builder setLastModified(AuditInfo lastModified) {
      if (lastModified == null) {
        throw new NullPointerException("Null lastModified");
      }
      this.lastModified = lastModified;
      return this;
    }
    @Override
    public PolygonFeature.Builder setVertices(ImmutableList<Point> vertices) {
      if (vertices == null) {
        throw new NullPointerException("Null vertices");
      }
      this.vertices = vertices;
      return this;
    }
    @Override
    public PolygonFeature build() {
      String missing = "";
      if (this.id == null) {
        missing += " id";
      }
      if (this.survey == null) {
        missing += " survey";
      }
      if (this.job == null) {
        missing += " job";
      }
      if (this.created == null) {
        missing += " created";
      }
      if (this.lastModified == null) {
        missing += " lastModified";
      }
      if (this.vertices == null) {
        missing += " vertices";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_PolygonFeature(
          this.id,
          this.survey,
          this.job,
          this.customId,
          this.caption,
          this.created,
          this.lastModified,
          this.vertices);
    }
  }

}