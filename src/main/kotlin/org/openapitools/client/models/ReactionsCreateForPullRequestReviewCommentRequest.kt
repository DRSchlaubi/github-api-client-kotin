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
 * @param content The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the pull request review comment.
 */
@Serializable

data class ReactionsCreateForPullRequestReviewCommentRequest (

    /* The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the pull request review comment. */
    @SerialName(value = "content")
    val content: ReactionsCreateForPullRequestReviewCommentRequest.Content

) {

    /**
     * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the pull request review comment.
     *
     * Values: Plus1,Minus1,laugh,confused,heart,hooray,rocket,eyes
     */
    @Serializable
    enum class Content(val value: kotlin.String) {
        @SerialName(value = "+1") Plus1("+1"),
        @SerialName(value = "-1") Minus1("-1"),
        @SerialName(value = "laugh") laugh("laugh"),
        @SerialName(value = "confused") confused("confused"),
        @SerialName(value = "heart") heart("heart"),
        @SerialName(value = "hooray") hooray("hooray"),
        @SerialName(value = "rocket") rocket("rocket"),
        @SerialName(value = "eyes") eyes("eyes");
    }
}

