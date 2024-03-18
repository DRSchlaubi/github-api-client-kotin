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
 * @param action Action to apply to the requests.
 * @param patRequestIds Unique identifiers of the requests for access via fine-grained personal access token. Must be formed of between 1 and 100 `pat_request_id` values.
 * @param reason Reason for approving or denying the requests. Max 1024 characters.
 */
@Serializable

data class OrgsReviewPatGrantRequestsInBulkRequest (

    /* Action to apply to the requests. */
    @SerialName(value = "action")
    val action: OrgsReviewPatGrantRequestsInBulkRequest.Action,

    /* Unique identifiers of the requests for access via fine-grained personal access token. Must be formed of between 1 and 100 `pat_request_id` values. */
    @SerialName(value = "pat_request_ids")
    val patRequestIds: kotlin.collections.List<kotlin.Int>? = null,

    /* Reason for approving or denying the requests. Max 1024 characters. */
    @SerialName(value = "reason")
    val reason: kotlin.String? = null

) {

    /**
     * Action to apply to the requests.
     *
     * Values: approve,deny
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "approve") approve("approve"),
        @SerialName(value = "deny") deny("deny");
    }
}

