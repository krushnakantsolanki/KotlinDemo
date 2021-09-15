package com.elifox.legocatalog.legotheme.data

import com.elifox.legocatalog.api.BaseDataSource
import com.elifox.legocatalog.api.WebService
import javax.inject.Inject

/**
 * Works with the Lego API to get data.
 */
class LegoThemeRemoteDataSource @Inject constructor(private val service: WebService) : BaseDataSource() {

    suspend fun fetchData() = getResult { service.getThemes(1, 1000, "-id") }

}
