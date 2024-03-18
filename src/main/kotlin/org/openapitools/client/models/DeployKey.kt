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
 * An SSH key granting access to a single repository.
 *
 * @param id 
 * @param key 
 * @param url 
 * @param title 
 * @param verified 
 * @param createdAt 
 * @param readOnly 
 * @param addedBy 
 * @param lastUsed 
 */
@Serializable

data class DeployKey (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "key")
    val key: kotlin.String,

    @SerialName(value = "url")
    val url: kotlin.String,

    @SerialName(value = "title")
    val title: kotlin.String,

    @SerialName(value = "verified")
    val verified: kotlin.Boolean,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "read_only")
    val readOnly: kotlin.Boolean,

    @SerialName(value = "added_by")
    val addedBy: kotlin.String? = null,

    @SerialName(value = "last_used")
    val lastUsed: kotlin.String? = null

)

