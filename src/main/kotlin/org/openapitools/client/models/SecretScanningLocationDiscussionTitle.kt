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
 * Represents a 'discussion_title' secret scanning location type. This location type shows that a secret was detected in the title of a discussion.
 *
 * @param discussionTitleUrl The URL to the discussion where the secret was detected.
 */
@Serializable

data class SecretScanningLocationDiscussionTitle (

    /* The URL to the discussion where the secret was detected. */
    @Contextual @SerialName(value = "discussion_title_url")
    val discussionTitleUrl: java.net.URI

)
