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
 * @param note The project card's note
 * @param archived Whether or not the card is archived
 */
@Serializable

data class ProjectsUpdateCardRequest (

    /* The project card's note */
    @SerialName(value = "note")
    val note: kotlin.String? = null,

    /* Whether or not the card is archived */
    @SerialName(value = "archived")
    val archived: kotlin.Boolean? = null

)

