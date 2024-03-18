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

import org.openapitools.client.models.EnterpriseWebhooks
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.Workflow
import org.openapitools.client.models.WorkflowRun

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param repository 
 * @param sender 
 * @param workflow 
 * @param workflowRun 
 * @param enterprise 
 * @param installation 
 * @param organization 
 */
@Serializable

data class WebhookWorkflowRunRequested (

    @SerialName(value = "action")
    val action: WebhookWorkflowRunRequested.Action,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "workflow")
    val workflow: Workflow,

    @SerialName(value = "workflow_run")
    val workflowRun: WorkflowRun,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null

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

