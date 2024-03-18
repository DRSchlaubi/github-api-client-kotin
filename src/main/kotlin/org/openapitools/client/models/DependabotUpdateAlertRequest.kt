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
 * @param state The state of the Dependabot alert. A `dismissed_reason` must be provided when setting the state to `dismissed`.
 * @param dismissedReason **Required when `state` is `dismissed`.** A reason for dismissing the alert.
 * @param dismissedComment An optional comment associated with dismissing the alert.
 */
@Serializable

data class DependabotUpdateAlertRequest (

    /* The state of the Dependabot alert. A `dismissed_reason` must be provided when setting the state to `dismissed`. */
    @SerialName(value = "state")
    val state: DependabotUpdateAlertRequest.State?,

    /* **Required when `state` is `dismissed`.** A reason for dismissing the alert. */
    @SerialName(value = "dismissed_reason")
    val dismissedReason: DependabotUpdateAlertRequest.DismissedReason? = null,

    /* An optional comment associated with dismissing the alert. */
    @Contextual @SerialName(value = "dismissed_comment")
    val dismissedComment: kotlin.Any? = null

) {

    /**
     * The state of the Dependabot alert. A `dismissed_reason` must be provided when setting the state to `dismissed`.
     *
     * Values: dismissed,`open`
     */
    @Serializable
    enum class State(val value: kotlin.Any) {
        @SerialName(value = "dismissed") dismissed("dismissed"),
        @SerialName(value = "open") `open`("open");
    }
    /**
     * **Required when `state` is `dismissed`.** A reason for dismissing the alert.
     *
     * Values: fix_started,inaccurate,no_bandwidth,not_used,tolerable_risk
     */
    @Serializable
    enum class DismissedReason(val value: kotlin.Any) {
        @SerialName(value = "fix_started") fix_started("fix_started"),
        @SerialName(value = "inaccurate") inaccurate("inaccurate"),
        @SerialName(value = "no_bandwidth") no_bandwidth("no_bandwidth"),
        @SerialName(value = "not_used") not_used("not_used"),
        @SerialName(value = "tolerable_risk") tolerable_risk("tolerable_risk");
    }
}

