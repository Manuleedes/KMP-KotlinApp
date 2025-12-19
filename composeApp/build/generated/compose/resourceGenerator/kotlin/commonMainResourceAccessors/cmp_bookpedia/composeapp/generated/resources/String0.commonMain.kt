@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package cmp_bookpedia.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.StringResource

private object CommonMainString0 {
  public val close_hint: StringResource by 
      lazy { init_close_hint() }

  public val favorites: StringResource by 
      lazy { init_favorites() }

  public val no_books: StringResource by 
      lazy { init_no_books() }

  public val no_search: StringResource by 
      lazy { init_no_search() }

  public val search_hint: StringResource by 
      lazy { init_search_hint() }

  public val search_results: StringResource by 
      lazy { init_search_results() }
}

@InternalResourceApi
internal fun _collectCommonMainString0Resources(map: MutableMap<String, StringResource>) {
  map.put("close_hint", CommonMainString0.close_hint)
  map.put("favorites", CommonMainString0.favorites)
  map.put("no_books", CommonMainString0.no_books)
  map.put("no_search", CommonMainString0.no_search)
  map.put("search_hint", CommonMainString0.search_hint)
  map.put("search_results", CommonMainString0.search_results)
}

internal val Res.string.close_hint: StringResource
  get() = CommonMainString0.close_hint

private fun init_close_hint(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:close_hint", "close_hint",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/cmp_bookpedia.composeapp.generated.resources/values/strings.commonMain.cvr",
    10, 38),
    )
)

internal val Res.string.favorites: StringResource
  get() = CommonMainString0.favorites

private fun init_favorites(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:favorites", "favorites",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/cmp_bookpedia.composeapp.generated.resources/values/strings.commonMain.cvr",
    49, 33),
    )
)

internal val Res.string.no_books: StringResource
  get() = CommonMainString0.no_books

private fun init_no_books(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:no_books", "no_books",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/cmp_bookpedia.composeapp.generated.resources/values/strings.commonMain.cvr",
    83, 68),
    )
)

internal val Res.string.no_search: StringResource
  get() = CommonMainString0.no_search

private fun init_no_search(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:no_search", "no_search",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/cmp_bookpedia.composeapp.generated.resources/values/strings.commonMain.cvr",
    152, 57),
    )
)

internal val Res.string.search_hint: StringResource
  get() = CommonMainString0.search_hint

private fun init_search_hint(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:search_hint", "search_hint",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/cmp_bookpedia.composeapp.generated.resources/values/strings.commonMain.cvr",
    210, 35),
    )
)

internal val Res.string.search_results: StringResource
  get() = CommonMainString0.search_results

private fun init_search_results(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:search_results", "search_results",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/cmp_bookpedia.composeapp.generated.resources/values/strings.commonMain.cvr",
    246, 42),
    )
)
