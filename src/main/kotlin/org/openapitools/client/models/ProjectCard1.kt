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

import org.openapitools.client.models.User2

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param archived Whether or not the card is archived
 * @param columnId 
 * @param columnUrl 
 * @param createdAt 
 * @param creator 
 * @param id The project card's ID
 * @param nodeId 
 * @param note 
 * @param projectUrl 
 * @param updatedAt 
 * @param url 
 * @param afterId 
 * @param contentUrl 
 */
@Serializable

data class ProjectCard1 (

    /* Whether or not the card is archived */
    @SerialName(value = "archived")
    val archived: kotlin.Boolean,

    @SerialName(value = "column_id")
    val columnId: kotlin.Int?,

    @Contextual @SerialName(value = "column_url")
    val columnUrl: java.net.URI,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "creator")
    val creator: User2,

    /* The project card's ID */
    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "note")
    val note: kotlin.String?,

    @Contextual @SerialName(value = "project_url")
    val projectUrl: java.net.URI,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "after_id")
    val afterId: kotlin.Int? = null,

    @Contextual @SerialName(value = "content_url")
    val contentUrl: java.net.URI? = null

)

