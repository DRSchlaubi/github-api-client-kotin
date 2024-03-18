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


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param tagName The name of the tag.
 * @param targetCommitish Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch.
 * @param name The name of the release.
 * @param body Text describing the contents of the tag.
 * @param draft `true` makes the release a draft, and `false` publishes the release.
 * @param prerelease `true` to identify the release as a prerelease, `false` to identify the release as a full release.
 * @param makeLatest Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest release should be determined based on the release creation date and higher semantic version.
 * @param discussionCategoryName If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. If there is already a discussion linked to the release, this parameter is ignored. For more information, see \"[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).\"
 */
@Serializable

data class ReposUpdateReleaseRequest (

    /* The name of the tag. */
    @SerialName(value = "tag_name")
    val tagName: kotlin.String? = null,

    /* Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch. */
    @SerialName(value = "target_commitish")
    val targetCommitish: kotlin.String? = null,

    /* The name of the release. */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* Text describing the contents of the tag. */
    @SerialName(value = "body")
    val body: kotlin.String? = null,

    /* `true` makes the release a draft, and `false` publishes the release. */
    @SerialName(value = "draft")
    val draft: kotlin.Boolean? = null,

    /* `true` to identify the release as a prerelease, `false` to identify the release as a full release. */
    @SerialName(value = "prerelease")
    val prerelease: kotlin.Boolean? = null,

    /* Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest release should be determined based on the release creation date and higher semantic version. */
    @SerialName(value = "make_latest")
    val makeLatest: ReposUpdateReleaseRequest.MakeLatest? = MakeLatest.`true`,

    /* If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. If there is already a discussion linked to the release, this parameter is ignored. For more information, see \"[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).\" */
    @SerialName(value = "discussion_category_name")
    val discussionCategoryName: kotlin.String? = null

) {

    /**
     * Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to `true` for newly published releases. `legacy` specifies that the latest release should be determined based on the release creation date and higher semantic version.
     *
     * Values: `true`,`false`,legacy
     */
    @Serializable
    enum class MakeLatest(val value: kotlin.String) {
        @SerialName(value = "true") `true`("true"),
        @SerialName(value = "false") `false`("false"),
        @SerialName(value = "legacy") legacy("legacy");
    }
}

