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
import org.openapitools.client.models.AutoMerge
import org.openapitools.client.models.IntegrationOwner
import org.openapitools.client.models.IssueMilestone
import org.openapitools.client.models.PullRequestBase
import org.openapitools.client.models.PullRequestHead
import org.openapitools.client.models.PullRequestSimpleLinks
import org.openapitools.client.models.SimpleUser

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param url 
 * @param id 
 * @param nodeId 
 * @param htmlUrl 
 * @param diffUrl 
 * @param patchUrl 
 * @param issueUrl 
 * @param commitsUrl 
 * @param reviewCommentsUrl 
 * @param reviewCommentUrl 
 * @param commentsUrl 
 * @param statusesUrl 
 * @param number Number uniquely identifying the pull request within its repository.
 * @param state State of this Pull Request. Either `open` or `closed`.
 * @param locked 
 * @param title The title of the pull request.
 * @param user 
 * @param body 
 * @param labels 
 * @param milestone 
 * @param createdAt 
 * @param updatedAt 
 * @param closedAt 
 * @param mergedAt 
 * @param mergeCommitSha 
 * @param assignee 
 * @param head 
 * @param base 
 * @param links 
 * @param authorAssociation 
 * @param autoMerge 
 * @param merged 
 * @param mergeable 
 * @param mergeableState 
 * @param mergedBy 
 * @param comments 
 * @param reviewComments 
 * @param maintainerCanModify Indicates whether maintainers can modify the pull request.
 * @param commits 
 * @param additions 
 * @param deletions 
 * @param changedFiles 
 * @param activeLockReason 
 * @param assignees 
 * @param requestedReviewers 
 * @param requestedTeams 
 * @param draft Indicates whether or not the pull request is a draft.
 * @param rebaseable 
 * @param allowAutoMerge Whether to allow auto-merge for pull requests.
 * @param allowUpdateBranch Whether to allow updating the pull request's branch.
 * @param deleteBranchOnMerge Whether to delete head branches when pull requests are merged.
 * @param mergeCommitMessage The default value for a merge commit message. - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
 * @param mergeCommitTitle The default value for a merge commit title. - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., \"Merge pull request #123 from branch-name\").
 * @param squashMergeCommitMessage The default value for a squash merge commit message: - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
 * @param squashMergeCommitTitle The default value for a squash merge commit title: - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
 * @param useSquashPrTitleAsDefault Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use `squash_merge_commit_title` instead.**
 */
@Serializable

data class WebhookPullRequestClosedPullRequest (

    @Contextual @SerialName(value = "url")
    val url: kotlin.Any?,

    @Contextual @SerialName(value = "id")
    val id: kotlin.Any?,

    @Contextual @SerialName(value = "node_id")
    val nodeId: kotlin.Any?,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: kotlin.Any?,

    @Contextual @SerialName(value = "diff_url")
    val diffUrl: kotlin.Any?,

    @Contextual @SerialName(value = "patch_url")
    val patchUrl: kotlin.Any?,

    @Contextual @SerialName(value = "issue_url")
    val issueUrl: kotlin.Any?,

    @Contextual @SerialName(value = "commits_url")
    val commitsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "review_comments_url")
    val reviewCommentsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "review_comment_url")
    val reviewCommentUrl: kotlin.Any?,

    @Contextual @SerialName(value = "comments_url")
    val commentsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "statuses_url")
    val statusesUrl: kotlin.Any?,

    /* Number uniquely identifying the pull request within its repository. */
    @Contextual @SerialName(value = "number")
    val number: kotlin.Any?,

    /* State of this Pull Request. Either `open` or `closed`. */
    @SerialName(value = "state")
    val state: WebhookPullRequestClosedPullRequest.State?,

    @Contextual @SerialName(value = "locked")
    val locked: kotlin.Any?,

    /* The title of the pull request. */
    @Contextual @SerialName(value = "title")
    val title: kotlin.Any?,

    @SerialName(value = "user")
    val user: SimpleUser,

    @Contextual @SerialName(value = "body")
    val body: kotlin.Any?,

    @Contextual @SerialName(value = "labels")
    val labels: kotlin.Any?,

    @SerialName(value = "milestone")
    val milestone: IssueMilestone,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlin.Any?,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlin.Any?,

    @Contextual @SerialName(value = "closed_at")
    val closedAt: kotlin.Any?,

    @Contextual @SerialName(value = "merged_at")
    val mergedAt: kotlin.Any?,

    @Contextual @SerialName(value = "merge_commit_sha")
    val mergeCommitSha: kotlin.Any?,

    @SerialName(value = "assignee")
    val assignee: IntegrationOwner,

    @SerialName(value = "head")
    val head: PullRequestHead,

    @SerialName(value = "base")
    val base: PullRequestBase,

    @SerialName(value = "_links")
    val links: PullRequestSimpleLinks,

    @Contextual @SerialName(value = "author_association")
    val authorAssociation: AuthorAssociation,

    @SerialName(value = "auto_merge")
    val autoMerge: AutoMerge,

    @Contextual @SerialName(value = "merged")
    val merged: kotlin.Any?,

    @Contextual @SerialName(value = "mergeable")
    val mergeable: kotlin.Any?,

    @Contextual @SerialName(value = "mergeable_state")
    val mergeableState: kotlin.Any?,

    @SerialName(value = "merged_by")
    val mergedBy: IntegrationOwner,

    @Contextual @SerialName(value = "comments")
    val comments: kotlin.Any?,

    @Contextual @SerialName(value = "review_comments")
    val reviewComments: kotlin.Any?,

    /* Indicates whether maintainers can modify the pull request. */
    @Contextual @SerialName(value = "maintainer_can_modify")
    val maintainerCanModify: kotlin.Any?,

    @Contextual @SerialName(value = "commits")
    val commits: kotlin.Any?,

    @Contextual @SerialName(value = "additions")
    val additions: kotlin.Any?,

    @Contextual @SerialName(value = "deletions")
    val deletions: kotlin.Any?,

    @Contextual @SerialName(value = "changed_files")
    val changedFiles: kotlin.Any?,

    @Contextual @SerialName(value = "active_lock_reason")
    val activeLockReason: kotlin.Any? = null,

    @Contextual @SerialName(value = "assignees")
    val assignees: kotlin.Any? = null,

    @Contextual @SerialName(value = "requested_reviewers")
    val requestedReviewers: kotlin.Any? = null,

    @Contextual @SerialName(value = "requested_teams")
    val requestedTeams: kotlin.Any? = null,

    /* Indicates whether or not the pull request is a draft. */
    @Contextual @SerialName(value = "draft")
    val draft: kotlin.Any? = null,

    @Contextual @SerialName(value = "rebaseable")
    val rebaseable: kotlin.Any? = null,

    /* Whether to allow auto-merge for pull requests. */
    @SerialName(value = "allow_auto_merge")
    val allowAutoMerge: kotlin.Boolean? = false,

    /* Whether to allow updating the pull request's branch. */
    @SerialName(value = "allow_update_branch")
    val allowUpdateBranch: kotlin.Boolean? = null,

    /* Whether to delete head branches when pull requests are merged. */
    @SerialName(value = "delete_branch_on_merge")
    val deleteBranchOnMerge: kotlin.Boolean? = false,

    /* The default value for a merge commit message. - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message. */
    @SerialName(value = "merge_commit_message")
    val mergeCommitMessage: WebhookPullRequestClosedPullRequest.MergeCommitMessage? = null,

    /* The default value for a merge commit title. - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., \"Merge pull request #123 from branch-name\"). */
    @SerialName(value = "merge_commit_title")
    val mergeCommitTitle: WebhookPullRequestClosedPullRequest.MergeCommitTitle? = null,

    /* The default value for a squash merge commit message: - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message. */
    @SerialName(value = "squash_merge_commit_message")
    val squashMergeCommitMessage: WebhookPullRequestClosedPullRequest.SquashMergeCommitMessage? = null,

    /* The default value for a squash merge commit title: - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit). */
    @SerialName(value = "squash_merge_commit_title")
    val squashMergeCommitTitle: WebhookPullRequestClosedPullRequest.SquashMergeCommitTitle? = null,

    /* Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use `squash_merge_commit_title` instead.** */
    @SerialName(value = "use_squash_pr_title_as_default")
    val useSquashPrTitleAsDefault: kotlin.Boolean? = false

) {

    /**
     * State of this Pull Request. Either `open` or `closed`.
     *
     * Values: `open`,closed
     */
    @Serializable
    enum class State(val value: kotlin.Any) {
        @SerialName(value = "open") `open`("open"),
        @SerialName(value = "closed") closed("closed");
    }
    /**
     * The default value for a merge commit message. - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
     *
     * Values: PR_BODY,PR_TITLE,BLANK
     */
    @Serializable
    enum class MergeCommitMessage(val value: kotlin.String) {
        @SerialName(value = "PR_BODY") PR_BODY("PR_BODY"),
        @SerialName(value = "PR_TITLE") PR_TITLE("PR_TITLE"),
        @SerialName(value = "BLANK") BLANK("BLANK");
    }
    /**
     * The default value for a merge commit title. - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., \"Merge pull request #123 from branch-name\").
     *
     * Values: PR_TITLE,MERGE_MESSAGE
     */
    @Serializable
    enum class MergeCommitTitle(val value: kotlin.String) {
        @SerialName(value = "PR_TITLE") PR_TITLE("PR_TITLE"),
        @SerialName(value = "MERGE_MESSAGE") MERGE_MESSAGE("MERGE_MESSAGE");
    }
    /**
     * The default value for a squash merge commit message: - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
     *
     * Values: PR_BODY,COMMIT_MESSAGES,BLANK
     */
    @Serializable
    enum class SquashMergeCommitMessage(val value: kotlin.String) {
        @SerialName(value = "PR_BODY") PR_BODY("PR_BODY"),
        @SerialName(value = "COMMIT_MESSAGES") COMMIT_MESSAGES("COMMIT_MESSAGES"),
        @SerialName(value = "BLANK") BLANK("BLANK");
    }
    /**
     * The default value for a squash merge commit title: - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     *
     * Values: PR_TITLE,COMMIT_OR_PR_TITLE
     */
    @Serializable
    enum class SquashMergeCommitTitle(val value: kotlin.String) {
        @SerialName(value = "PR_TITLE") PR_TITLE("PR_TITLE"),
        @SerialName(value = "COMMIT_OR_PR_TITLE") COMMIT_OR_PR_TITLE("COMMIT_OR_PR_TITLE");
    }
}

