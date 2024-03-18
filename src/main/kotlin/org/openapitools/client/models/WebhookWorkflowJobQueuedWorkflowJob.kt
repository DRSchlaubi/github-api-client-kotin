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

import org.openapitools.client.models.WorkflowStep3

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param checkRunUrl 
 * @param completedAt 
 * @param conclusion 
 * @param createdAt The time that the job created.
 * @param headSha 
 * @param htmlUrl 
 * @param id 
 * @param labels 
 * @param name 
 * @param nodeId 
 * @param runAttempt 
 * @param runId 
 * @param runUrl 
 * @param runnerGroupId 
 * @param runnerGroupName 
 * @param runnerId 
 * @param runnerName 
 * @param startedAt 
 * @param status 
 * @param headBranch The name of the current branch.
 * @param workflowName The name of the workflow.
 * @param steps 
 * @param url 
 */
@Serializable

data class WebhookWorkflowJobQueuedWorkflowJob (

    @Contextual @SerialName(value = "check_run_url")
    val checkRunUrl: java.net.URI,

    @SerialName(value = "completed_at")
    val completedAt: kotlin.String?,

    @SerialName(value = "conclusion")
    val conclusion: kotlin.String?,

    /* The time that the job created. */
    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "head_sha")
    val headSha: kotlin.String,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "labels")
    val labels: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "run_attempt")
    val runAttempt: kotlin.Int,

    @Contextual @SerialName(value = "run_id")
    val runId: java.math.BigDecimal,

    @Contextual @SerialName(value = "run_url")
    val runUrl: java.net.URI,

    @SerialName(value = "runner_group_id")
    val runnerGroupId: kotlin.Int?,

    @SerialName(value = "runner_group_name")
    val runnerGroupName: kotlin.String?,

    @SerialName(value = "runner_id")
    val runnerId: kotlin.Int?,

    @SerialName(value = "runner_name")
    val runnerName: kotlin.String?,

    @Contextual @SerialName(value = "started_at")
    val startedAt: kotlinx.datetime.Instant,

    @SerialName(value = "status")
    val status: WebhookWorkflowJobQueuedWorkflowJob.Status,

    /* The name of the current branch. */
    @SerialName(value = "head_branch")
    val headBranch: kotlin.String?,

    /* The name of the workflow. */
    @SerialName(value = "workflow_name")
    val workflowName: kotlin.String?,

    @SerialName(value = "steps")
    val steps: kotlin.collections.List<WorkflowStep3>,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI

) {

    /**
     * 
     *
     * Values: queued,in_progress,completed,waiting
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "queued") queued("queued"),
        @SerialName(value = "in_progress") in_progress("in_progress"),
        @SerialName(value = "completed") completed("completed"),
        @SerialName(value = "waiting") waiting("waiting");
    }
}

