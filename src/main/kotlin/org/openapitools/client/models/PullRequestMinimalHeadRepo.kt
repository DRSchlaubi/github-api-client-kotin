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
 * @param id 
 * @param url 
 * @param name 
 */
@Serializable

data class PullRequestMinimalHeadRepo (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "url")
    val url: kotlin.String,

    @SerialName(value = "name")
    val name: kotlin.String

)

