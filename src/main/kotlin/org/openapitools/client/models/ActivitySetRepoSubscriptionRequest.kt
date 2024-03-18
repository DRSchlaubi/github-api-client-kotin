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
 * @param subscribed Determines if notifications should be received from this repository.
 * @param ignored Determines if all notifications should be blocked from this repository.
 */
@Serializable

data class ActivitySetRepoSubscriptionRequest (

    /* Determines if notifications should be received from this repository. */
    @SerialName(value = "subscribed")
    val subscribed: kotlin.Boolean? = null,

    /* Determines if all notifications should be blocked from this repository. */
    @SerialName(value = "ignored")
    val ignored: kotlin.Boolean? = null

)
