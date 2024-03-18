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

import org.openapitools.client.models.DiscussionCategory
import org.openapitools.client.models.Reactions
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A Discussion in a repository.
 *
 * @param activeLockReason 
 * @param answerChosenAt 
 * @param answerChosenBy 
 * @param answerHtmlUrl 
 * @param authorAssociation How the author is associated with the repository.
 * @param body 
 * @param category 
 * @param comments 
 * @param createdAt 
 * @param htmlUrl 
 * @param id 
 * @param locked 
 * @param nodeId 
 * @param number 
 * @param repositoryUrl 
 * @param state The current state of the discussion. `converting` means that the discussion is being converted from an issue. `transferring` means that the discussion is being transferred from another repository.
 * @param stateReason The reason for the current state
 * @param title 
 * @param updatedAt 
 * @param user 
 * @param reactions 
 * @param timelineUrl 
 */
@Serializable

data class Discussion (

    @SerialName(value = "active_lock_reason")
    val activeLockReason: kotlin.String?,

    @SerialName(value = "answer_chosen_at")
    val answerChosenAt: kotlin.String?,

    @SerialName(value = "answer_chosen_by")
    val answerChosenBy: User,

    @SerialName(value = "answer_html_url")
    val answerHtmlUrl: kotlin.String?,

    /* How the author is associated with the repository. */
    @SerialName(value = "author_association")
    val authorAssociation: Discussion.AuthorAssociation,

    @SerialName(value = "body")
    val body: kotlin.String,

    @SerialName(value = "category")
    val category: DiscussionCategory,

    @SerialName(value = "comments")
    val comments: kotlin.Int,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "locked")
    val locked: kotlin.Boolean,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "number")
    val number: kotlin.Int,

    @SerialName(value = "repository_url")
    val repositoryUrl: kotlin.String,

    /* The current state of the discussion. `converting` means that the discussion is being converted from an issue. `transferring` means that the discussion is being transferred from another repository. */
    @SerialName(value = "state")
    val state: Discussion.State,

    /* The reason for the current state */
    @SerialName(value = "state_reason")
    val stateReason: Discussion.StateReason?,

    @SerialName(value = "title")
    val title: kotlin.String,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @SerialName(value = "user")
    val user: User,

    @SerialName(value = "reactions")
    val reactions: Reactions? = null,

    @SerialName(value = "timeline_url")
    val timelineUrl: kotlin.String? = null

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
    /**
     * The current state of the discussion. `converting` means that the discussion is being converted from an issue. `transferring` means that the discussion is being transferred from another repository.
     *
     * Values: `open`,closed,locked,converting,transferring
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "open") `open`("open"),
        @SerialName(value = "closed") closed("closed"),
        @SerialName(value = "locked") locked("locked"),
        @SerialName(value = "converting") converting("converting"),
        @SerialName(value = "transferring") transferring("transferring");
    }
    /**
     * The reason for the current state
     *
     * Values: resolved,outdated,duplicate,reopened,`null`
     */
    @Serializable
    enum class StateReason(val value: kotlin.String) {
        @SerialName(value = "resolved") resolved("resolved"),
        @SerialName(value = "outdated") outdated("outdated"),
        @SerialName(value = "duplicate") duplicate("duplicate"),
        @SerialName(value = "reopened") reopened("reopened"),
        @SerialName(value = "null") `null`("null");
    }
}
