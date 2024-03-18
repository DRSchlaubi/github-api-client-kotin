/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * GitHub Actions Cache Usage by repository.
 *
 * @param fullName The repository owner and name for the cache usage being shown.
 * @param activeCachesSizeInBytes The sum of the size in bytes of all the active cache items in the repository.
 * @param activeCachesCount The number of active caches in the repository.
 */
@Serializable

data class ActionsCacheUsageByRepository (

    /* The repository owner and name for the cache usage being shown. */
    @SerialName(value = "full_name")
    val fullName: kotlin.String,

    /* The sum of the size in bytes of all the active cache items in the repository. */
    @SerialName(value = "active_caches_size_in_bytes")
    val activeCachesSizeInBytes: kotlin.Int,

    /* The number of active caches in the repository. */
    @SerialName(value = "active_caches_count")
    val activeCachesCount: kotlin.Int

)

