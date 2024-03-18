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
 * @param url 
 * @param totalCount 
 * @param plus1 
 * @param _1 
 * @param laugh 
 * @param confused 
 * @param heart 
 * @param hooray 
 * @param eyes 
 * @param rocket 
 */
@Serializable

data class ReactionRollup (

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "total_count")
    val totalCount: kotlin.Int,

    @SerialName(value = "+1")
    val plus1: kotlin.Int,

    @SerialName(value = "-1")
    val _1: kotlin.Int,

    @SerialName(value = "laugh")
    val laugh: kotlin.Int,

    @SerialName(value = "confused")
    val confused: kotlin.Int,

    @SerialName(value = "heart")
    val heart: kotlin.Int,

    @SerialName(value = "hooray")
    val hooray: kotlin.Int,

    @SerialName(value = "eyes")
    val eyes: kotlin.Int,

    @SerialName(value = "rocket")
    val rocket: kotlin.Int

)

