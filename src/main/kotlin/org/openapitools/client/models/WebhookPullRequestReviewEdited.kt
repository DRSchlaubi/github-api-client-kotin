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
import org.openapitools.client.models.SimplePullRequest1
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookPullRequestReviewEditedChanges
import org.openapitools.client.models.WebhookPullRequestReviewEditedReview

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param changes 
 * @param pullRequest 
 * @param repository 
 * @param review 
 * @param sender 
 * @param enterprise 
 * @param installation 
 * @param organization 
 */
@Serializable

data class WebhookPullRequestReviewEdited (

    @SerialName(value = "action")
    val action: WebhookPullRequestReviewEdited.Action,

    @SerialName(value = "changes")
    val changes: WebhookPullRequestReviewEditedChanges,

    @SerialName(value = "pull_request")
    val pullRequest: SimplePullRequest1,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "review")
    val review: WebhookPullRequestReviewEditedReview,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

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
     * Values: edited
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "edited") edited("edited");
    }
}

