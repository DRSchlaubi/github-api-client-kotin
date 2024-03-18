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
import org.openapitools.client.models.Milestone
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.PullRequest3
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleUserWebhooks

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param number The pull request number.
 * @param pullRequest 
 * @param repository 
 * @param enterprise 
 * @param milestone 
 * @param organization 
 * @param sender 
 */
@Serializable

data class WebhookPullRequestDemilestoned (

    @SerialName(value = "action")
    val action: WebhookPullRequestDemilestoned.Action,

    /* The pull request number. */
    @SerialName(value = "number")
    val number: kotlin.Int,

    @SerialName(value = "pull_request")
    val pullRequest: PullRequest3,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "milestone")
    val milestone: Milestone? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks? = null

) {

    /**
     * 
     *
     * Values: demilestoned
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "demilestoned") demilestoned("demilestoned");
    }
}
