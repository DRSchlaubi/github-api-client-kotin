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

import org.openapitools.client.models.Repository

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param totalCount 
 * @param repositories 
 * @param repositorySelection 
 */
@Serializable

data class AppsListReposAccessibleToInstallation200Response (

    @SerialName(value = "total_count")
    val totalCount: kotlin.Int,

    @SerialName(value = "repositories")
    val repositories: kotlin.collections.List<Repository>,

    @SerialName(value = "repository_selection")
    val repositorySelection: kotlin.String? = null

)

