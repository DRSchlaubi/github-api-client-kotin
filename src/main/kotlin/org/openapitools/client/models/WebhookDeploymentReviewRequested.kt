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

import org.openapitools.client.models.DeploymentWorkflowRun1
import org.openapitools.client.models.EnterpriseWebhooks
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.User
import org.openapitools.client.models.WebhookDeploymentReviewRequestedReviewersInner
import org.openapitools.client.models.WebhookDeploymentReviewRequestedWorkflowJobRun

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param environment 
 * @param organization 
 * @param repository 
 * @param requestor 
 * @param reviewers 
 * @param sender 
 * @param since 
 * @param workflowJobRun 
 * @param workflowRun 
 * @param enterprise 
 * @param installation 
 */
@Serializable

data class WebhookDeploymentReviewRequested (

    @SerialName(value = "action")
    val action: WebhookDeploymentReviewRequested.Action,

    @SerialName(value = "environment")
    val environment: kotlin.String,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "requestor")
    val requestor: User,

    @SerialName(value = "reviewers")
    val reviewers: kotlin.collections.List<WebhookDeploymentReviewRequestedReviewersInner>,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "since")
    val since: kotlin.String,

    @SerialName(value = "workflow_job_run")
    val workflowJobRun: WebhookDeploymentReviewRequestedWorkflowJobRun,

    @SerialName(value = "workflow_run")
    val workflowRun: DeploymentWorkflowRun1,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null

) {

    /**
     * 
     *
     * Values: requested
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "requested") requested("requested");
    }
}

