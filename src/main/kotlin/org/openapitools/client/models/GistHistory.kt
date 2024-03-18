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

import org.openapitools.client.models.GistHistoryChangeStatus
import org.openapitools.client.models.IntegrationOwner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Gist History
 *
 * @param user 
 * @param version 
 * @param committedAt 
 * @param changeStatus 
 * @param url 
 */
@Serializable

data class GistHistory (

    @SerialName(value = "user")
    val user: IntegrationOwner? = null,

    @SerialName(value = "version")
    val version: kotlin.String? = null,

    @Contextual @SerialName(value = "committed_at")
    val committedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "change_status")
    val changeStatus: GistHistoryChangeStatus? = null,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI? = null

)
