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
import org.openapitools.client.models.IssuePerformedViaGithubApp
import org.openapitools.client.models.ReactionRollup
import org.openapitools.client.models.SimpleUser

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Timeline Comment Event
 *
 * @param event 
 * @param actor 
 * @param id Unique identifier of the issue comment
 * @param nodeId 
 * @param url URL for the issue comment
 * @param htmlUrl 
 * @param user 
 * @param createdAt 
 * @param updatedAt 
 * @param issueUrl 
 * @param authorAssociation 
 * @param body Contents of the issue comment
 * @param bodyText 
 * @param bodyHtml 
 * @param performedViaGithubApp 
 * @param reactions 
 */
@Serializable

data class TimelineCommentEvent (

    @SerialName(value = "event")
    val event: kotlin.String,

    @SerialName(value = "actor")
    val actor: SimpleUser,

    /* Unique identifier of the issue comment */
    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    /* URL for the issue comment */
    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "user")
    val user: SimpleUser,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "issue_url")
    val issueUrl: java.net.URI,

    @Contextual @SerialName(value = "author_association")
    val authorAssociation: AuthorAssociation,

    /* Contents of the issue comment */
    @SerialName(value = "body")
    val body: kotlin.String? = null,

    @SerialName(value = "body_text")
    val bodyText: kotlin.String? = null,

    @SerialName(value = "body_html")
    val bodyHtml: kotlin.String? = null,

    @SerialName(value = "performed_via_github_app")
    val performedViaGithubApp: IssuePerformedViaGithubApp? = null,

    @SerialName(value = "reactions")
    val reactions: ReactionRollup? = null

)

