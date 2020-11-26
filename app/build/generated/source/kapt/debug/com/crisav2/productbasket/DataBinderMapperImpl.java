package com.crisav2.productbasket;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crisav2.productbasket.databinding.ActivityMainBindingImpl;
import com.crisav2.productbasket.databinding.AddProductFragmentBindingImpl;
import com.crisav2.productbasket.databinding.QuickBucketFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ADDPRODUCTFRAGMENT = 2;

  private static final int LAYOUT_QUICKBUCKETFRAGMENT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crisav2.productbasket.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crisav2.productbasket.R.layout.add_product_fragment, LAYOUT_ADDPRODUCTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.crisav2.productbasket.R.layout.quick_bucket_fragment, LAYOUT_QUICKBUCKETFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ADDPRODUCTFRAGMENT: {
          if ("layout/add_product_fragment_0".equals(tag)) {
            return new AddProductFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_product_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_QUICKBUCKETFRAGMENT: {
          if ("layout/quick_bucket_fragment_0".equals(tag)) {
            return new QuickBucketFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for quick_bucket_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(1, "ProductViewModel");
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_main_0", com.crisav2.productbasket.R.layout.activity_main);
      sKeys.put("layout/add_product_fragment_0", com.crisav2.productbasket.R.layout.add_product_fragment);
      sKeys.put("layout/quick_bucket_fragment_0", com.crisav2.productbasket.R.layout.quick_bucket_fragment);
    }
  }
}
