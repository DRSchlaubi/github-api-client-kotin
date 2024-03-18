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
 * @param state 
 * @param reviewId 
 * @param dismissalMessage 
 * @param dismissalCommitId 
 */
@Serializable

data class IssueEventDismissedReview (

    @SerialName(value = "state")
    val state: kotlin.String,

    @SerialName(value = "review_id")
    val reviewId: kotlin.Int,

    @SerialName(value = "dismissal_message")
    val dismissalMessage: kotlin.String?,

    @SerialName(value = "dismissal_commit_id")
    val dismissalCommitId: kotlin.String? = null

)

