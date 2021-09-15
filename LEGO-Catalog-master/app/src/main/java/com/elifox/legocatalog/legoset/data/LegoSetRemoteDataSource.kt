package com.elifox.legocatalog.legoset.data

import com.elifox.legocatalog.api.BaseDataSource
import com.elifox.legocatalog.api.WebService
import com.elifox.legocatalog.testing.OpenForTesting
import javax.inject.Inject

/**
 * Works with the Lego API to get data.
 */
@OpenForTesting
class LegoSetRemoteDataSource @Inject constructor(private val service: WebService) : BaseDataSource() {

    suspend fun fetchSets(page: Int, pageSize: Int? = null, themeId: Int? = null)
            = getResult { service.getSets(page, pageSize, themeId, "-year") }

    suspend fun fetchSet(id: String)
            = getResult { service.getSet(id) }
}
