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

import org.openapitools.client.models.IntegrationOwner
import org.openapitools.client.models.PageBuildError

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Page Build
 *
 * @param url 
 * @param status 
 * @param error 
 * @param pusher 
 * @param commit 
 * @param duration 
 * @param createdAt 
 * @param updatedAt 
 */
@Serializable

data class PageBuild (

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "status")
    val status: kotlin.String,

    @SerialName(value = "error")
    val error: PageBuildError,

    @SerialName(value = "pusher")
    val pusher: IntegrationOwner,

    @SerialName(value = "commit")
    val commit: kotlin.String,

    @SerialName(value = "duration")
    val duration: kotlin.Int,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant

)
