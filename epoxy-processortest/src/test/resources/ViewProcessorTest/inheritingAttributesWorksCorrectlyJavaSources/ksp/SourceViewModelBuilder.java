package com.airbnb.epoxy;

import androidx.annotation.Nullable;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.String;

@EpoxyBuildScope
public interface SourceViewModelBuilder {
  SourceViewModelBuilder onBind(OnModelBoundListener<SourceViewModel_, SourceView> listener);

  SourceViewModelBuilder onUnbind(OnModelUnboundListener<SourceViewModel_, SourceView> listener);

  SourceViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<SourceViewModel_, SourceView> listener);

  SourceViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<SourceViewModel_, SourceView> listener);

  SourceViewModelBuilder sectionId(@Nullable String sectionId);

  SourceViewModelBuilder baseViewProp(int baseViewProp);

  SourceViewModelBuilder numCarouselItemsShown(
      @Nullable AirEpoxyModel.SomeType numCarouselItemsShown);

  SourceViewModelBuilder id(long p0);

  SourceViewModelBuilder id(@Nullable Number... p0);

  SourceViewModelBuilder id(long p0, long p1);

  SourceViewModelBuilder id(@Nullable CharSequence p0);

  SourceViewModelBuilder id(@Nullable CharSequence p0, @Nullable CharSequence... p1);

  SourceViewModelBuilder id(@Nullable CharSequence p0, long p1);

  SourceViewModelBuilder spanSizeOverride(@Nullable EpoxyModel.SpanSizeOverrideCallback p0);
}
