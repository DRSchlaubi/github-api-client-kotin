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

import org.openapitools.client.models.AlertInstanceLocation
import org.openapitools.client.models.CodeScanningAlertInstanceMessage

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param analysisKey Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name.
 * @param environment Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed.
 * @param ref The full Git reference, formatted as `refs/heads/<branch name>`.
 * @param state State of a code scanning alert.
 * @param category Identifies the configuration under which the analysis was executed.
 * @param classifications 
 * @param commitSha 
 * @param location 
 * @param message 
 */
@Serializable

data class AlertInstance (

    /* Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. */
    @SerialName(value = "analysis_key")
    val analysisKey: kotlin.String,

    /* Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed. */
    @SerialName(value = "environment")
    val environment: kotlin.String,

    /* The full Git reference, formatted as `refs/heads/<branch name>`. */
    @SerialName(value = "ref")
    val ref: kotlin.String,

    /* State of a code scanning alert. */
    @SerialName(value = "state")
    val state: AlertInstance.State,

    /* Identifies the configuration under which the analysis was executed. */
    @SerialName(value = "category")
    val category: kotlin.String? = null,

    @SerialName(value = "classifications")
    val classifications: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "commit_sha")
    val commitSha: kotlin.String? = null,

    @SerialName(value = "location")
    val location: AlertInstanceLocation? = null,

    @SerialName(value = "message")
    val message: CodeScanningAlertInstanceMessage? = null

) {

    /**
     * State of a code scanning alert.
     *
     * Values: `open`,dismissed,fixed
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "open") `open`("open"),
        @SerialName(value = "dismissed") dismissed("dismissed"),
        @SerialName(value = "fixed") fixed("fixed");
    }
}

