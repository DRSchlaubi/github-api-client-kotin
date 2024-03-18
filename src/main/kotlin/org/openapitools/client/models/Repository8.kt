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

import org.openapitools.client.models.License
import org.openapitools.client.models.RepositoryCreatedAt
import org.openapitools.client.models.RepositoryPermissions
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A git repository
 *
 * @param archiveUrl 
 * @param archived Whether the repository is archived.
 * @param assigneesUrl 
 * @param blobsUrl 
 * @param branchesUrl 
 * @param cloneUrl 
 * @param collaboratorsUrl 
 * @param commentsUrl 
 * @param commitsUrl 
 * @param compareUrl 
 * @param contentsUrl 
 * @param contributorsUrl 
 * @param createdAt 
 * @param defaultBranch The default branch of the repository.
 * @param deploymentsUrl 
 * @param description 
 * @param downloadsUrl 
 * @param eventsUrl 
 * @param fork 
 * @param forks 
 * @param forksCount 
 * @param forksUrl 
 * @param fullName 
 * @param gitCommitsUrl 
 * @param gitRefsUrl 
 * @param gitTagsUrl 
 * @param gitUrl 
 * @param hasDownloads Whether downloads are enabled.
 * @param hasIssues Whether issues are enabled.
 * @param hasPages 
 * @param hasProjects Whether projects are enabled.
 * @param hasWiki Whether the wiki is enabled.
 * @param hasDiscussions Whether discussions are enabled.
 * @param homepage 
 * @param hooksUrl 
 * @param htmlUrl 
 * @param id Unique identifier of the repository
 * @param issueCommentUrl 
 * @param issueEventsUrl 
 * @param issuesUrl 
 * @param keysUrl 
 * @param labelsUrl 
 * @param language 
 * @param languagesUrl 
 * @param license 
 * @param mergesUrl 
 * @param milestonesUrl 
 * @param mirrorUrl 
 * @param name The name of the repository.
 * @param nodeId 
 * @param notificationsUrl 
 * @param openIssues 
 * @param openIssuesCount 
 * @param owner 
 * @param `private` Whether the repository is private or public.
 * @param pullsUrl 
 * @param pushedAt 
 * @param releasesUrl 
 * @param propertySize 
 * @param sshUrl 
 * @param stargazersCount 
 * @param stargazersUrl 
 * @param statusesUrl 
 * @param subscribersUrl 
 * @param subscriptionUrl 
 * @param svnUrl 
 * @param tagsUrl 
 * @param teamsUrl 
 * @param topics 
 * @param treesUrl 
 * @param updatedAt 
 * @param url 
 * @param visibility 
 * @param watchers 
 * @param watchersCount 
 * @param allowAutoMerge Whether to allow auto-merge for pull requests.
 * @param allowForking Whether to allow private forks
 * @param allowMergeCommit Whether to allow merge commits for pull requests.
 * @param allowRebaseMerge Whether to allow rebase merges for pull requests.
 * @param allowSquashMerge Whether to allow squash merges for pull requests.
 * @param allowUpdateBranch 
 * @param deleteBranchOnMerge Whether to delete head branches when pull requests are merged
 * @param disabled Returns whether or not this repository is disabled.
 * @param isTemplate 
 * @param masterBranch 
 * @param mergeCommitMessage The default value for a merge commit message.
 * @param mergeCommitTitle The default value for a merge commit message title.
 * @param organization 
 * @param permissions 
 * @param `public` 
 * @param roleName 
 * @param squashMergeCommitMessage The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
 * @param squashMergeCommitTitle The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
 * @param stargazers 
 * @param useSquashPrTitleAsDefault Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use `squash_merge_commit_title` instead.
 * @param webCommitSignoffRequired Whether to require contributors to sign off on web-based commits
 */
@Serializable

data class Repository8 (

    @SerialName(value = "archive_url")
    val archiveUrl: kotlin.String,

    /* Whether the repository is archived. */
    @SerialName(value = "archived")
    val archived: kotlin.Boolean = false,

    @SerialName(value = "assignees_url")
    val assigneesUrl: kotlin.String,

    @SerialName(value = "blobs_url")
    val blobsUrl: kotlin.String,

    @SerialName(value = "branches_url")
    val branchesUrl: kotlin.String,

    @Contextual @SerialName(value = "clone_url")
    val cloneUrl: java.net.URI,

    @SerialName(value = "collaborators_url")
    val collaboratorsUrl: kotlin.String,

    @SerialName(value = "comments_url")
    val commentsUrl: kotlin.String,

    @SerialName(value = "commits_url")
    val commitsUrl: kotlin.String,

    @SerialName(value = "compare_url")
    val compareUrl: kotlin.String,

    @SerialName(value = "contents_url")
    val contentsUrl: kotlin.String,

    @Contextual @SerialName(value = "contributors_url")
    val contributorsUrl: java.net.URI,

    @SerialName(value = "created_at")
    val createdAt: RepositoryCreatedAt,

    /* The default branch of the repository. */
    @SerialName(value = "default_branch")
    val defaultBranch: kotlin.String,

    @Contextual @SerialName(value = "deployments_url")
    val deploymentsUrl: java.net.URI,

    @SerialName(value = "description")
    val description: kotlin.String?,

    @Contextual @SerialName(value = "downloads_url")
    val downloadsUrl: java.net.URI,

    @Contextual @SerialName(value = "events_url")
    val eventsUrl: java.net.URI,

    @SerialName(value = "fork")
    val fork: kotlin.Boolean,

    @SerialName(value = "forks")
    val forks: kotlin.Int,

    @SerialName(value = "forks_count")
    val forksCount: kotlin.Int,

    @Contextual @SerialName(value = "forks_url")
    val forksUrl: java.net.URI,

    @SerialName(value = "full_name")
    val fullName: kotlin.String,

    @SerialName(value = "git_commits_url")
    val gitCommitsUrl: kotlin.String,

    @SerialName(value = "git_refs_url")
    val gitRefsUrl: kotlin.String,

    @SerialName(value = "git_tags_url")
    val gitTagsUrl: kotlin.String,

    @Contextual @SerialName(value = "git_url")
    val gitUrl: java.net.URI,

    /* Whether downloads are enabled. */
    @SerialName(value = "has_downloads")
    val hasDownloads: kotlin.Boolean = true,

    /* Whether issues are enabled. */
    @SerialName(value = "has_issues")
    val hasIssues: kotlin.Boolean = true,

    @SerialName(value = "has_pages")
    val hasPages: kotlin.Boolean,

    /* Whether projects are enabled. */
    @SerialName(value = "has_projects")
    val hasProjects: kotlin.Boolean = true,

    /* Whether the wiki is enabled. */
    @SerialName(value = "has_wiki")
    val hasWiki: kotlin.Boolean = true,

    /* Whether discussions are enabled. */
    @SerialName(value = "has_discussions")
    val hasDiscussions: kotlin.Boolean = false,

    @SerialName(value = "homepage")
    val homepage: kotlin.String?,

    @Contextual @SerialName(value = "hooks_url")
    val hooksUrl: java.net.URI,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    /* Unique identifier of the repository */
    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "issue_comment_url")
    val issueCommentUrl: kotlin.String,

    @SerialName(value = "issue_events_url")
    val issueEventsUrl: kotlin.String,

    @SerialName(value = "issues_url")
    val issuesUrl: kotlin.String,

    @SerialName(value = "keys_url")
    val keysUrl: kotlin.String,

    @SerialName(value = "labels_url")
    val labelsUrl: kotlin.String,

    @SerialName(value = "language")
    val language: kotlin.String?,

    @Contextual @SerialName(value = "languages_url")
    val languagesUrl: java.net.URI,

    @SerialName(value = "license")
    val license: License,

    @Contextual @SerialName(value = "merges_url")
    val mergesUrl: java.net.URI,

    @SerialName(value = "milestones_url")
    val milestonesUrl: kotlin.String,

    @Contextual @SerialName(value = "mirror_url")
    val mirrorUrl: java.net.URI?,

    /* The name of the repository. */
    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "notifications_url")
    val notificationsUrl: kotlin.String,

    @SerialName(value = "open_issues")
    val openIssues: kotlin.Int,

    @SerialName(value = "open_issues_count")
    val openIssuesCount: kotlin.Int,

    @SerialName(value = "owner")
    val owner: User,

    /* Whether the repository is private or public. */
    @SerialName(value = "private")
    val `private`: kotlin.Boolean,

    @SerialName(value = "pulls_url")
    val pullsUrl: kotlin.String,

    @SerialName(value = "pushed_at")
    val pushedAt: RepositoryCreatedAt,

    @SerialName(value = "releases_url")
    val releasesUrl: kotlin.String,

    @SerialName(value = "size")
    val propertySize: kotlin.Int,

    @SerialName(value = "ssh_url")
    val sshUrl: kotlin.String,

    @SerialName(value = "stargazers_count")
    val stargazersCount: kotlin.Int,

    @Contextual @SerialName(value = "stargazers_url")
    val stargazersUrl: java.net.URI,

    @SerialName(value = "statuses_url")
    val statusesUrl: kotlin.String,

    @Contextual @SerialName(value = "subscribers_url")
    val subscribersUrl: java.net.URI,

    @Contextual @SerialName(value = "subscription_url")
    val subscriptionUrl: java.net.URI,

    @Contextual @SerialName(value = "svn_url")
    val svnUrl: java.net.URI,

    @Contextual @SerialName(value = "tags_url")
    val tagsUrl: java.net.URI,

    @Contextual @SerialName(value = "teams_url")
    val teamsUrl: java.net.URI,

    @SerialName(value = "topics")
    val topics: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "trees_url")
    val treesUrl: kotlin.String,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "visibility")
    val visibility: Repository8.Visibility,

    @SerialName(value = "watchers")
    val watchers: kotlin.Int,

    @SerialName(value = "watchers_count")
    val watchersCount: kotlin.Int,

    /* Whether to allow auto-merge for pull requests. */
    @SerialName(value = "allow_auto_merge")
    val allowAutoMerge: kotlin.Boolean? = false,

    /* Whether to allow private forks */
    @SerialName(value = "allow_forking")
    val allowForking: kotlin.Boolean? = null,

    /* Whether to allow merge commits for pull requests. */
    @SerialName(value = "allow_merge_commit")
    val allowMergeCommit: kotlin.Boolean? = true,

    /* Whether to allow rebase merges for pull requests. */
    @SerialName(value = "allow_rebase_merge")
    val allowRebaseMerge: kotlin.Boolean? = true,

    /* Whether to allow squash merges for pull requests. */
    @SerialName(value = "allow_squash_merge")
    val allowSquashMerge: kotlin.Boolean? = true,

    @SerialName(value = "allow_update_branch")
    val allowUpdateBranch: kotlin.Boolean? = null,

    /* Whether to delete head branches when pull requests are merged */
    @SerialName(value = "delete_branch_on_merge")
    val deleteBranchOnMerge: kotlin.Boolean? = false,

    /* Returns whether or not this repository is disabled. */
    @SerialName(value = "disabled")
    val disabled: kotlin.Boolean? = null,

    @SerialName(value = "is_template")
    val isTemplate: kotlin.Boolean? = null,

    @SerialName(value = "master_branch")
    val masterBranch: kotlin.String? = null,

    /* The default value for a merge commit message. */
    @SerialName(value = "merge_commit_message")
    val mergeCommitMessage: Repository8.MergeCommitMessage? = null,

    /* The default value for a merge commit message title. */
    @SerialName(value = "merge_commit_title")
    val mergeCommitTitle: Repository8.MergeCommitTitle? = null,

    @SerialName(value = "organization")
    val organization: kotlin.String? = null,

    @SerialName(value = "permissions")
    val permissions: RepositoryPermissions? = null,

    @SerialName(value = "public")
    val `public`: kotlin.Boolean? = null,

    @SerialName(value = "role_name")
    val roleName: kotlin.String? = null,

    /* The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message. */
    @SerialName(value = "squash_merge_commit_message")
    val squashMergeCommitMessage: Repository8.SquashMergeCommitMessage? = null,

    /* The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit). */
    @SerialName(value = "squash_merge_commit_title")
    val squashMergeCommitTitle: Repository8.SquashMergeCommitTitle? = null,

    @SerialName(value = "stargazers")
    val stargazers: kotlin.Int? = null,

    /* Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use `squash_merge_commit_title` instead. */
    @SerialName(value = "use_squash_pr_title_as_default")
    val useSquashPrTitleAsDefault: kotlin.Boolean? = false,

    /* Whether to require contributors to sign off on web-based commits */
    @SerialName(value = "web_commit_signoff_required")
    val webCommitSignoffRequired: kotlin.Boolean? = null

) {

    /**
     * 
     *
     * Values: `public`,`private`,`internal`
     */
    @Serializable
    enum class Visibility(val value: kotlin.String) {
        @SerialName(value = "public") `public`("public"),
        @SerialName(value = "private") `private`("private"),
        @SerialName(value = "internal") `internal`("internal");
    }
    /**
     * The default value for a merge commit message.
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
     * The default value for a merge commit message title.
     *
     * Values: PR_TITLE,MERGE_MESSAGE
     */
    @Serializable
    enum class MergeCommitTitle(val value: kotlin.String) {
        @SerialName(value = "PR_TITLE") PR_TITLE("PR_TITLE"),
        @SerialName(value = "MERGE_MESSAGE") MERGE_MESSAGE("MERGE_MESSAGE");
    }
    /**
     * The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
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
     * The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     *
     * Values: PR_TITLE,COMMIT_OR_PR_TITLE
     */
    @Serializable
    enum class SquashMergeCommitTitle(val value: kotlin.String) {
        @SerialName(value = "PR_TITLE") PR_TITLE("PR_TITLE"),
        @SerialName(value = "COMMIT_OR_PR_TITLE") COMMIT_OR_PR_TITLE("COMMIT_OR_PR_TITLE");
    }
}
