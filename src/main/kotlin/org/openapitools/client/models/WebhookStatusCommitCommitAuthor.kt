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
 * @param date 
 * @param email 
 * @param name 
 * @param username 
 */
@Serializable

data class WebhookStatusCommitCommitAuthor (

    @SerialName(value = "date")
    val date: kotlin.String,

    @SerialName(value = "email")
    val email: kotlin.String,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "username")
    val username: kotlin.String? = null

)

