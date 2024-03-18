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

import org.openapitools.client.models.CheckRunWithSimpleCheckSuite
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param checkRun 
 * @param repository 
 * @param sender 
 * @param action 
 * @param installation 
 * @param organization 
 */
@Serializable

data class WebhookCheckRunRerequested (

    @SerialName(value = "check_run")
    val checkRun: CheckRunWithSimpleCheckSuite,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "action")
    val action: WebhookCheckRunRerequested.Action? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null

) {

    /**
     * 
     *
     * Values: rerequested
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "rerequested") rerequested("rerequested");
    }
}

