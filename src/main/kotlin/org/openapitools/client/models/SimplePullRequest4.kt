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

import org.openapitools.client.models.Label
import org.openapitools.client.models.Milestone1
import org.openapitools.client.models.PullRequest3RequestedReviewersInner
import org.openapitools.client.models.PullRequestAutoMerge1
import org.openapitools.client.models.PullRequestLinks
import org.openapitools.client.models.SimplePullRequest3Base
import org.openapitools.client.models.Team2
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param links 
 * @param activeLockReason 
 * @param assignee 
 * @param assignees 
 * @param authorAssociation How the author is associated with the repository.
 * @param autoMerge 
 * @param base 
 * @param body 
 * @param closedAt 
 * @param commentsUrl 
 * @param commitsUrl 
 * @param createdAt 
 * @param diffUrl 
 * @param draft 
 * @param head 
 * @param htmlUrl 
 * @param id 
 * @param issueUrl 
 * @param labels 
 * @param locked 
 * @param mergeCommitSha 
 * @param mergedAt 
 * @param milestone 
 * @param nodeId 
 * @param number 
 * @param patchUrl 
 * @param requestedReviewers 
 * @param requestedTeams 
 * @param reviewCommentUrl 
 * @param reviewCommentsUrl 
 * @param state 
 * @param statusesUrl 
 * @param title 
 * @param updatedAt 
 * @param url 
 * @param user 
 */
@Serializable

data class SimplePullRequest4 (

    @SerialName(value = "_links")
    val links: PullRequestLinks,

    @SerialName(value = "active_lock_reason")
    val activeLockReason: SimplePullRequest4.ActiveLockReason?,

    @SerialName(value = "assignee")
    val assignee: User,

    @SerialName(value = "assignees")
    val assignees: kotlin.collections.List<User>,

    /* How the author is associated with the repository. */
    @SerialName(value = "author_association")
    val authorAssociation: SimplePullRequest4.AuthorAssociation,

    @SerialName(value = "auto_merge")
    val autoMerge: PullRequestAutoMerge1,

    @SerialName(value = "base")
    val base: SimplePullRequest3Base,

    @SerialName(value = "body")
    val body: kotlin.String?,

    @SerialName(value = "closed_at")
    val closedAt: kotlin.String?,

    @Contextual @SerialName(value = "comments_url")
    val commentsUrl: java.net.URI,

    @Contextual @SerialName(value = "commits_url")
    val commitsUrl: java.net.URI,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @Contextual @SerialName(value = "diff_url")
    val diffUrl: java.net.URI,

    @SerialName(value = "draft")
    val draft: kotlin.Boolean,

    @SerialName(value = "head")
    val head: SimplePullRequest3Base,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @Contextual @SerialName(value = "issue_url")
    val issueUrl: java.net.URI,

    @SerialName(value = "labels")
    val labels: kotlin.collections.List<Label>,

    @SerialName(value = "locked")
    val locked: kotlin.Boolean,

    @SerialName(value = "merge_commit_sha")
    val mergeCommitSha: kotlin.String?,

    @SerialName(value = "merged_at")
    val mergedAt: kotlin.String?,

    @SerialName(value = "milestone")
    val milestone: Milestone1,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "number")
    val number: kotlin.Int,

    @Contextual @SerialName(value = "patch_url")
    val patchUrl: java.net.URI,

    @SerialName(value = "requested_reviewers")
    val requestedReviewers: kotlin.collections.List<PullRequest3RequestedReviewersInner>,

    @SerialName(value = "requested_teams")
    val requestedTeams: kotlin.collections.List<Team2>,

    @SerialName(value = "review_comment_url")
    val reviewCommentUrl: kotlin.String,

    @Contextual @SerialName(value = "review_comments_url")
    val reviewCommentsUrl: java.net.URI,

    @SerialName(value = "state")
    val state: SimplePullRequest4.State,

    @Contextual @SerialName(value = "statuses_url")
    val statusesUrl: java.net.URI,

    @SerialName(value = "title")
    val title: kotlin.String,

    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "user")
    val user: User

) {

    /**
     * 
     *
     * Values: resolved,offMinusTopic,too_heated,spam,`null`
     */
    @Serializable
    enum class ActiveLockReason(val value: kotlin.String) {
        @SerialName(value = "resolved") resolved("resolved"),
        @SerialName(value = "off-topic") offMinusTopic("off-topic"),
        @SerialName(value = "too heated") too_heated("too heated"),
        @SerialName(value = "spam") spam("spam"),
        @SerialName(value = "null") `null`("null");
    }
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
     * 
     *
     * Values: `open`,closed
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "open") `open`("open"),
        @SerialName(value = "closed") closed("closed");
    }
}

