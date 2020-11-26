package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.crisav2.productbasket.DataBinderMapperImpl());
  }
}
