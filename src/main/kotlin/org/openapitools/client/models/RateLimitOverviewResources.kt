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

import org.openapitools.client.models.RateLimit

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param core 
 * @param search 
 * @param graphql 
 * @param codeSearch 
 * @param sourceImport 
 * @param integrationManifest 
 * @param codeScanningUpload 
 * @param actionsRunnerRegistration 
 * @param scim 
 * @param dependencySnapshots 
 */
@Serializable

data class RateLimitOverviewResources (

    @SerialName(value = "core")
    val core: RateLimit,

    @SerialName(value = "search")
    val search: RateLimit,

    @SerialName(value = "graphql")
    val graphql: RateLimit? = null,

    @SerialName(value = "code_search")
    val codeSearch: RateLimit? = null,

    @SerialName(value = "source_import")
    val sourceImport: RateLimit? = null,

    @SerialName(value = "integration_manifest")
    val integrationManifest: RateLimit? = null,

    @SerialName(value = "code_scanning_upload")
    val codeScanningUpload: RateLimit? = null,

    @SerialName(value = "actions_runner_registration")
    val actionsRunnerRegistration: RateLimit? = null,

    @SerialName(value = "scim")
    val scim: RateLimit? = null,

    @SerialName(value = "dependency_snapshots")
    val dependencySnapshots: RateLimit? = null

)

