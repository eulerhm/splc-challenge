package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new nl.rijksoverheid.en.DataBinderMapperImpl());
  }
}
