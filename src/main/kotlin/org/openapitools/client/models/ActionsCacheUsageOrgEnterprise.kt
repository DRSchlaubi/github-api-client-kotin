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
 * 
 *
 * @param totalActiveCachesCount The count of active caches across all repositories of an enterprise or an organization.
 * @param totalActiveCachesSizeInBytes The total size in bytes of all active cache items across all repositories of an enterprise or an organization.
 */
@Serializable

data class ActionsCacheUsageOrgEnterprise (

    /* The count of active caches across all repositories of an enterprise or an organization. */
    @SerialName(value = "total_active_caches_count")
    val totalActiveCachesCount: kotlin.Int,

    /* The total size in bytes of all active cache items across all repositories of an enterprise or an organization. */
    @SerialName(value = "total_active_caches_size_in_bytes")
    val totalActiveCachesSizeInBytes: kotlin.Int

)
