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

import org.openapitools.client.models.IntegrationOwner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The status of a commit.
 *
 * @param url 
 * @param avatarUrl 
 * @param id 
 * @param nodeId 
 * @param state 
 * @param description 
 * @param targetUrl 
 * @param context 
 * @param createdAt 
 * @param updatedAt 
 * @param creator 
 */
@Serializable

data class Status (

    @SerialName(value = "url")
    val url: kotlin.String,

    @SerialName(value = "avatar_url")
    val avatarUrl: kotlin.String?,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "state")
    val state: kotlin.String,

    @SerialName(value = "description")
    val description: kotlin.String?,

    @SerialName(value = "target_url")
    val targetUrl: kotlin.String?,

    @SerialName(value = "context")
    val context: kotlin.String,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,

    @SerialName(value = "creator")
    val creator: IntegrationOwner

)
