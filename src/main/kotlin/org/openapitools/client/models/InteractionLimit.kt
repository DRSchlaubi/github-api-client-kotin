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

import org.openapitools.client.models.InteractionExpiry
import org.openapitools.client.models.InteractionGroup

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Limit interactions to a specific type of user for a specified duration
 *
 * @param limit 
 * @param expiry 
 */
@Serializable

data class InteractionLimit (

    @Contextual @SerialName(value = "limit")
    val limit: InteractionGroup,

    @Contextual @SerialName(value = "expiry")
    val expiry: InteractionExpiry? = null

)

