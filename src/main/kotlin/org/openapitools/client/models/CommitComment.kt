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

import org.openapitools.client.models.AuthorAssociation
import org.openapitools.client.models.IntegrationOwner
import org.openapitools.client.models.ReactionRollup

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Commit Comment
 *
 * @param htmlUrl 
 * @param url 
 * @param id 
 * @param nodeId 
 * @param body 
 * @param path 
 * @param position 
 * @param line 
 * @param commitId 
 * @param user 
 * @param createdAt 
 * @param updatedAt 
 * @param authorAssociation 
 * @param reactions 
 */
@Serializable

data class CommitComment (

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "body")
    val body: kotlin.String,

    @SerialName(value = "path")
    val path: kotlin.String?,

    @SerialName(value = "position")
    val position: kotlin.Int?,

    @SerialName(value = "line")
    val line: kotlin.Int?,

    @SerialName(value = "commit_id")
    val commitId: kotlin.String,

    @SerialName(value = "user")
    val user: IntegrationOwner,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "author_association")
    val authorAssociation: AuthorAssociation,

    @SerialName(value = "reactions")
    val reactions: ReactionRollup? = null

)
