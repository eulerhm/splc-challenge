@file:Suppress("DEPRECATION")

package com.haroldadmin.moonshot.features.search.views

import com.airbnb.epoxy.ModelCollector
import kotlin.Suppress
import kotlin.Unit

inline fun ModelCollector.searchResultView(modelInitializer: SearchResultViewModelBuilder.() ->
    Unit) {
  add(
  SearchResultViewModel_().apply {
    modelInitializer()
  }
  )
}

inline
    fun ModelCollector.searchUninitializedView(modelInitializer: SearchUninitializedViewModelBuilder.() ->
    Unit) {
  add(
  SearchUninitializedViewModel_().apply {
    modelInitializer()
  }
  )
}
