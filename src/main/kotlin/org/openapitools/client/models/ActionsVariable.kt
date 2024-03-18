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
 * @param name The name of the variable.
 * @param `value` The value of the variable.
 * @param createdAt The date and time at which the variable was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
 * @param updatedAt The date and time at which the variable was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
 */
@Serializable

data class ActionsVariable (

    /* The name of the variable. */
    @SerialName(value = "name")
    val name: kotlin.String,

    /* The value of the variable. */
    @SerialName(value = "value")
    val `value`: kotlin.String,

    /* The date and time at which the variable was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. */
    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    /* The date and time at which the variable was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. */
    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant

)

