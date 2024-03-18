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

import org.openapitools.client.models.IntegrationOwner
import org.openapitools.client.models.IssuePerformedViaGithubApp

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The status of a deployment.
 *
 * @param url 
 * @param id 
 * @param nodeId 
 * @param state The state of the status.
 * @param creator 
 * @param description A short description of the status.
 * @param targetUrl Deprecated: the URL to associate with this status.
 * @param createdAt 
 * @param updatedAt 
 * @param deploymentUrl 
 * @param repositoryUrl 
 * @param environment The environment of the deployment that the status is for.
 * @param environmentUrl The URL for accessing your environment.
 * @param logUrl The URL to associate with this status.
 * @param performedViaGithubApp 
 */
@Serializable

data class DeploymentStatus (

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    /* The state of the status. */
    @SerialName(value = "state")
    val state: DeploymentStatus.State,

    @SerialName(value = "creator")
    val creator: IntegrationOwner,

    /* A short description of the status. */
    @SerialName(value = "description")
    val description: kotlin.String = "",

    /* Deprecated: the URL to associate with this status. */
    @Contextual @SerialName(value = "target_url")
    val targetUrl: java.net.URI = java.net.URI.create(""),

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "deployment_url")
    val deploymentUrl: java.net.URI,

    @Contextual @SerialName(value = "repository_url")
    val repositoryUrl: java.net.URI,

    /* The environment of the deployment that the status is for. */
    @SerialName(value = "environment")
    val environment: kotlin.String? = "",

    /* The URL for accessing your environment. */
    @Contextual @SerialName(value = "environment_url")
    val environmentUrl: java.net.URI? = java.net.URI.create(""),

    /* The URL to associate with this status. */
    @Contextual @SerialName(value = "log_url")
    val logUrl: java.net.URI? = java.net.URI.create(""),

    @SerialName(value = "performed_via_github_app")
    val performedViaGithubApp: IssuePerformedViaGithubApp? = null

) {

    /**
     * The state of the status.
     *
     * Values: error,failure,inactive,pending,success,queued,in_progress
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "error") error("error"),
        @SerialName(value = "failure") failure("failure"),
        @SerialName(value = "inactive") inactive("inactive"),
        @SerialName(value = "pending") pending("pending"),
        @SerialName(value = "success") success("success"),
        @SerialName(value = "queued") queued("queued"),
        @SerialName(value = "in_progress") in_progress("in_progress");
    }
}

