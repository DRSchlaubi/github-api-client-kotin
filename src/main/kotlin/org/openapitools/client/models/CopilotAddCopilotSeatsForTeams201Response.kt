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
 * The total number of seat assignments created.
 *
 * @param seatsCreated 
 */
@Serializable

data class CopilotAddCopilotSeatsForTeams201Response (

    @SerialName(value = "seats_created")
    val seatsCreated: kotlin.Int

)
