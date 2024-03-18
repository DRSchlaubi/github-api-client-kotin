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

import org.openapitools.client.models.PullRequestReviewCommentLinks
import org.openapitools.client.models.Reactions
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The [comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request) itself.
 *
 * @param links 
 * @param authorAssociation How the author is associated with the repository.
 * @param body The text of the comment.
 * @param commitId The SHA of the commit to which the comment applies.
 * @param createdAt 
 * @param diffHunk The diff of the line that the comment refers to.
 * @param htmlUrl HTML URL for the pull request review comment.
 * @param id The ID of the pull request review comment.
 * @param line The line of the blob to which the comment applies. The last line of the range for a multi-line comment
 * @param nodeId The node ID of the pull request review comment.
 * @param originalCommitId The SHA of the original commit to which the comment applies.
 * @param originalLine The line of the blob to which the comment applies. The last line of the range for a multi-line comment
 * @param originalPosition The index of the original line in the diff to which the comment applies.
 * @param originalStartLine The first line of the range for a multi-line comment.
 * @param path The relative path of the file to which the comment applies.
 * @param position The line index in the diff to which the comment applies.
 * @param pullRequestReviewId The ID of the pull request review to which the comment belongs.
 * @param pullRequestUrl URL for the pull request that the review comment belongs to.
 * @param reactions 
 * @param side The side of the first line of the range for a multi-line comment.
 * @param startLine The first line of the range for a multi-line comment.
 * @param startSide The side of the first line of the range for a multi-line comment.
 * @param updatedAt 
 * @param url URL for the pull request review comment
 * @param user 
 * @param inReplyToId The comment ID to reply to.
 * @param subjectType The level at which the comment is targeted, can be a diff line or a file.
 */
@Serializable

data class PullRequestReviewComment (

    @SerialName(value = "_links")
    val links: PullRequestReviewCommentLinks,

    /* How the author is associated with the repository. */
    @SerialName(value = "author_association")
    val authorAssociation: PullRequestReviewComment.AuthorAssociation,

    /* The text of the comment. */
    @SerialName(value = "body")
    val body: kotlin.String,

    /* The SHA of the commit to which the comment applies. */
    @SerialName(value = "commit_id")
    val commitId: kotlin.String,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    /* The diff of the line that the comment refers to. */
    @SerialName(value = "diff_hunk")
    val diffHunk: kotlin.String,

    /* HTML URL for the pull request review comment. */
    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    /* The ID of the pull request review comment. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    /* The line of the blob to which the comment applies. The last line of the range for a multi-line comment */
    @SerialName(value = "line")
    val line: kotlin.Int?,

    /* The node ID of the pull request review comment. */
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    /* The SHA of the original commit to which the comment applies. */
    @SerialName(value = "original_commit_id")
    val originalCommitId: kotlin.String,

    /* The line of the blob to which the comment applies. The last line of the range for a multi-line comment */
    @SerialName(value = "original_line")
    val originalLine: kotlin.Int?,

    /* The index of the original line in the diff to which the comment applies. */
    @SerialName(value = "original_position")
    val originalPosition: kotlin.Int,

    /* The first line of the range for a multi-line comment. */
    @SerialName(value = "original_start_line")
    val originalStartLine: kotlin.Int?,

    /* The relative path of the file to which the comment applies. */
    @SerialName(value = "path")
    val path: kotlin.String,

    /* The line index in the diff to which the comment applies. */
    @SerialName(value = "position")
    val position: kotlin.Int?,

    /* The ID of the pull request review to which the comment belongs. */
    @SerialName(value = "pull_request_review_id")
    val pullRequestReviewId: kotlin.Int?,

    /* URL for the pull request that the review comment belongs to. */
    @Contextual @SerialName(value = "pull_request_url")
    val pullRequestUrl: java.net.URI,

    @SerialName(value = "reactions")
    val reactions: Reactions,

    /* The side of the first line of the range for a multi-line comment. */
    @SerialName(value = "side")
    val side: PullRequestReviewComment.Side,

    /* The first line of the range for a multi-line comment. */
    @SerialName(value = "start_line")
    val startLine: kotlin.Int?,

    /* The side of the first line of the range for a multi-line comment. */
    @SerialName(value = "start_side")
    val startSide: PullRequestReviewComment.StartSide? = StartSide.RIGHT,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    /* URL for the pull request review comment */
    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "user")
    val user: User,

    /* The comment ID to reply to. */
    @SerialName(value = "in_reply_to_id")
    val inReplyToId: kotlin.Int? = null,

    /* The level at which the comment is targeted, can be a diff line or a file. */
    @SerialName(value = "subject_type")
    val subjectType: PullRequestReviewComment.SubjectType? = null

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
     * The side of the first line of the range for a multi-line comment.
     *
     * Values: LEFT,RIGHT
     */
    @Serializable
    enum class Side(val value: kotlin.String) {
        @SerialName(value = "LEFT") LEFT("LEFT"),
        @SerialName(value = "RIGHT") RIGHT("RIGHT");
    }
    /**
     * The side of the first line of the range for a multi-line comment.
     *
     * Values: LEFT,RIGHT,`null`
     */
    @Serializable
    enum class StartSide(val value: kotlin.String) {
        @SerialName(value = "LEFT") LEFT("LEFT"),
        @SerialName(value = "RIGHT") RIGHT("RIGHT"),
        @SerialName(value = "null") `null`("null");
    }
    /**
     * The level at which the comment is targeted, can be a diff line or a file.
     *
     * Values: line,file
     */
    @Serializable
    enum class SubjectType(val value: kotlin.String) {
        @SerialName(value = "line") line("line"),
        @SerialName(value = "file") file("file");
    }
}

