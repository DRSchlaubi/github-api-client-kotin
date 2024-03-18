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
import org.openapitools.client.models.Installation
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.PersonalAccessTokenRequestRepositoriesInner
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param installation 
 * @param repositoriesAdded An array of repository objects, which were added to the installation.
 * @param repositoriesRemoved An array of repository objects, which were removed from the installation.
 * @param repositorySelection Describe whether all repositories have been selected or there's a selection involved
 * @param requester 
 * @param sender 
 * @param enterprise 
 * @param organization 
 * @param repository 
 */
@Serializable

data class WebhookInstallationRepositoriesRemoved (

    @SerialName(value = "action")
    val action: WebhookInstallationRepositoriesRemoved.Action,

    @SerialName(value = "installation")
    val installation: Installation,

    /* An array of repository objects, which were added to the installation. */
    @SerialName(value = "repositories_added")
    val repositoriesAdded: kotlin.collections.List<PersonalAccessTokenRequestRepositoriesInner>,

    /* An array of repository objects, which were removed from the installation. */
    @SerialName(value = "repositories_removed")
    val repositoriesRemoved: kotlin.collections.List<PersonalAccessTokenRequestRepositoriesInner>,

    /* Describe whether all repositories have been selected or there's a selection involved */
    @SerialName(value = "repository_selection")
    val repositorySelection: WebhookInstallationRepositoriesRemoved.RepositorySelection,

    @SerialName(value = "requester")
    val requester: User,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks? = null

) {

    /**
     * 
     *
     * Values: removed
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "removed") removed("removed");
    }
    /**
     * Describe whether all repositories have been selected or there's a selection involved
     *
     * Values: all,selected
     */
    @Serializable
    enum class RepositorySelection(val value: kotlin.String) {
        @SerialName(value = "all") all("all"),
        @SerialName(value = "selected") selected("selected");
    }
}
