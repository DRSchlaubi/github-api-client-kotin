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

import org.openapitools.client.models.IssuePerformedViaGithubApp
import org.openapitools.client.models.Reactions
import org.openapitools.client.models.User2

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The [comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment) itself.
 *
 * @param authorAssociation How the author is associated with the repository.
 * @param body Contents of the issue comment
 * @param createdAt 
 * @param htmlUrl 
 * @param id Unique identifier of the issue comment
 * @param issueUrl 
 * @param nodeId 
 * @param performedViaGithubApp 
 * @param reactions 
 * @param updatedAt 
 * @param url URL for the issue comment
 * @param user 
 */
@Serializable

data class IssueComment1 (

    /* How the author is associated with the repository. */
    @SerialName(value = "author_association")
    val authorAssociation: IssueComment1.AuthorAssociation,

    /* Contents of the issue comment */
    @SerialName(value = "body")
    val body: kotlin.String,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    /* Unique identifier of the issue comment */
    @SerialName(value = "id")
    val id: kotlin.Long,

    @Contextual @SerialName(value = "issue_url")
    val issueUrl: java.net.URI,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "performed_via_github_app")
    val performedViaGithubApp: IssuePerformedViaGithubApp,

    @SerialName(value = "reactions")
    val reactions: Reactions,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    /* URL for the issue comment */
    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "user")
    val user: User2

) {

    /**
     * How the author is associated with the repository.
     *
     * Values: COLLABORATOR,CONTRIBUTOR,FIRST_TIMER,FIRST_TIME_CONTRIBUTOR,MANNEQUIN,MEMBER,NONE,OWNER
     */
    @Serializable
    enum class AuthorAssociation(val value: kotlin.String) {
        @SerialName(value = "COLLABORATOR") COLLABORATOR("COLLABORATOR"),
        @SerialName(value = "CONTRIBUTOR") CONTRIBUTOR("CONTRIBUTOR"),
        @SerialName(value = "FIRST_TIMER") FIRST_TIMER("FIRST_TIMER"),
        @SerialName(value = "FIRST_TIME_CONTRIBUTOR") FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),
        @SerialName(value = "MANNEQUIN") MANNEQUIN("MANNEQUIN"),
        @SerialName(value = "MEMBER") MEMBER("MEMBER"),
        @SerialName(value = "NONE") NONE("NONE"),
        @SerialName(value = "OWNER") OWNER("OWNER");
    }
}

