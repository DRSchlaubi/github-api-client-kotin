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

import org.openapitools.client.models.DeploymentWorkflowRunReferencedWorkflowsInner
import org.openapitools.client.models.RepositoryLite
import org.openapitools.client.models.SimpleCommit
import org.openapitools.client.models.User
import org.openapitools.client.models.WorkflowRunPullRequestsInner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param actor 
 * @param artifactsUrl 
 * @param cancelUrl 
 * @param checkSuiteId 
 * @param checkSuiteNodeId 
 * @param checkSuiteUrl 
 * @param conclusion 
 * @param createdAt 
 * @param event 
 * @param headBranch 
 * @param headCommit 
 * @param headRepository 
 * @param headSha 
 * @param htmlUrl 
 * @param id 
 * @param jobsUrl 
 * @param logsUrl 
 * @param name 
 * @param nodeId 
 * @param path 
 * @param previousAttemptUrl 
 * @param pullRequests 
 * @param repository 
 * @param rerunUrl 
 * @param runAttempt 
 * @param runNumber 
 * @param runStartedAt 
 * @param status 
 * @param triggeringActor 
 * @param updatedAt 
 * @param url 
 * @param workflowId 
 * @param workflowUrl 
 * @param displayTitle 
 * @param referencedWorkflows 
 */
@Serializable

data class WorkflowRun (

    @SerialName(value = "actor")
    val actor: User,

    @Contextual @SerialName(value = "artifacts_url")
    val artifactsUrl: java.net.URI,

    @Contextual @SerialName(value = "cancel_url")
    val cancelUrl: java.net.URI,

    @SerialName(value = "check_suite_id")
    val checkSuiteId: kotlin.Int,

    @SerialName(value = "check_suite_node_id")
    val checkSuiteNodeId: kotlin.String,

    @Contextual @SerialName(value = "check_suite_url")
    val checkSuiteUrl: java.net.URI,

    @SerialName(value = "conclusion")
    val conclusion: WorkflowRun.Conclusion?,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "event")
    val event: kotlin.String,

    @SerialName(value = "head_branch")
    val headBranch: kotlin.String?,

    @SerialName(value = "head_commit")
    val headCommit: SimpleCommit,

    @SerialName(value = "head_repository")
    val headRepository: RepositoryLite,

    @SerialName(value = "head_sha")
    val headSha: kotlin.String,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @Contextual @SerialName(value = "jobs_url")
    val jobsUrl: java.net.URI,

    @Contextual @SerialName(value = "logs_url")
    val logsUrl: java.net.URI,

    @SerialName(value = "name")
    val name: kotlin.String?,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "path")
    val path: kotlin.String,

    @Contextual @SerialName(value = "previous_attempt_url")
    val previousAttemptUrl: java.net.URI?,

    @SerialName(value = "pull_requests")
    val pullRequests: kotlin.collections.List<WorkflowRunPullRequestsInner>,

    @SerialName(value = "repository")
    val repository: RepositoryLite,

    @Contextual @SerialName(value = "rerun_url")
    val rerunUrl: java.net.URI,

    @SerialName(value = "run_attempt")
    val runAttempt: kotlin.Int,

    @SerialName(value = "run_number")
    val runNumber: kotlin.Int,

    @Contextual @SerialName(value = "run_started_at")
    val runStartedAt: kotlinx.datetime.Instant,

    @SerialName(value = "status")
    val status: WorkflowRun.Status,

    @SerialName(value = "triggering_actor")
    val triggeringActor: User,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "workflow_id")
    val workflowId: kotlin.Int,

    @Contextual @SerialName(value = "workflow_url")
    val workflowUrl: java.net.URI,

    @SerialName(value = "display_title")
    val displayTitle: kotlin.String,

    @SerialName(value = "referenced_workflows")
    val referencedWorkflows: kotlin.collections.List<DeploymentWorkflowRunReferencedWorkflowsInner>? = null

) {

    /**
     * 
     *
     * Values: success,failure,neutral,cancelled,timed_out,action_required,stale,`null`,skipped,startup_failure
     */
    @Serializable
    enum class Conclusion(val value: kotlin.String) {
        @SerialName(value = "success") success("success"),
        @SerialName(value = "failure") failure("failure"),
        @SerialName(value = "neutral") neutral("neutral"),
        @SerialName(value = "cancelled") cancelled("cancelled"),
        @SerialName(value = "timed_out") timed_out("timed_out"),
        @SerialName(value = "action_required") action_required("action_required"),
        @SerialName(value = "stale") stale("stale"),
        @SerialName(value = "null") `null`("null"),
        @SerialName(value = "skipped") skipped("skipped"),
        @SerialName(value = "startup_failure") startup_failure("startup_failure");
    }
    /**
     * 
     *
     * Values: requested,in_progress,completed,queued,pending,waiting
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "requested") requested("requested"),
        @SerialName(value = "in_progress") in_progress("in_progress"),
        @SerialName(value = "completed") completed("completed"),
        @SerialName(value = "queued") queued("queued"),
        @SerialName(value = "pending") pending("pending"),
        @SerialName(value = "waiting") waiting("waiting");
    }
}
