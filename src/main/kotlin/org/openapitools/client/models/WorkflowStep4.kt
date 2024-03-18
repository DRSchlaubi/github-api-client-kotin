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
 * @param completedAt 
 * @param conclusion 
 * @param name 
 * @param number 
 * @param startedAt 
 * @param status 
 */
@Serializable

data class WorkflowStep4 (

    @SerialName(value = "completed_at")
    val completedAt: kotlin.String?,

    @SerialName(value = "conclusion")
    val conclusion: WorkflowStep4.Conclusion?,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "number")
    val number: kotlin.Int,

    @SerialName(value = "started_at")
    val startedAt: kotlin.String?,

    @SerialName(value = "status")
    val status: WorkflowStep4.Status

) {

    /**
     * 
     *
     * Values: failure,skipped,success,cancelled,`null`
     */
    @Serializable
    enum class Conclusion(val value: kotlin.String) {
        @SerialName(value = "failure") failure("failure"),
        @SerialName(value = "skipped") skipped("skipped"),
        @SerialName(value = "success") success("success"),
        @SerialName(value = "cancelled") cancelled("cancelled"),
        @SerialName(value = "null") `null`("null");
    }
    /**
     * 
     *
     * Values: completed,in_progress,queued,pending,waiting
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "completed") completed("completed"),
        @SerialName(value = "in_progress") in_progress("in_progress"),
        @SerialName(value = "queued") queued("queued"),
        @SerialName(value = "pending") pending("pending"),
        @SerialName(value = "waiting") waiting("waiting");
    }
}

