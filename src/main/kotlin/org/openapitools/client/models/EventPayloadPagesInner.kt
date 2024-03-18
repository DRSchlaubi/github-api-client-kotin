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
 * @param pageName 
 * @param title 
 * @param summary 
 * @param action 
 * @param sha 
 * @param htmlUrl 
 */
@Serializable

data class EventPayloadPagesInner (

    @SerialName(value = "page_name")
    val pageName: kotlin.String? = null,

    @SerialName(value = "title")
    val title: kotlin.String? = null,

    @SerialName(value = "summary")
    val summary: kotlin.String? = null,

    @SerialName(value = "action")
    val action: kotlin.String? = null,

    @SerialName(value = "sha")
    val sha: kotlin.String? = null,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String? = null

)

