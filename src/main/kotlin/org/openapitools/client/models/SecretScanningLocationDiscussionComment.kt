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
 * Represents a 'discussion_comment' secret scanning location type. This location type shows that a secret was detected in a comment on a discussion.
 *
 * @param discussionCommentUrl The API URL to get the discussion comment where the secret was detected.
 */
@Serializable

data class SecretScanningLocationDiscussionComment (

    /* The API URL to get the discussion comment where the secret was detected. */
    @Contextual @SerialName(value = "discussion_comment_url")
    val discussionCommentUrl: java.net.URI

)

