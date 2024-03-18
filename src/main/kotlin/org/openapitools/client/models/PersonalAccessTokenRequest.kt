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

import org.openapitools.client.models.PersonalAccessTokenRequestPermissionsAdded
import org.openapitools.client.models.PersonalAccessTokenRequestPermissionsResult
import org.openapitools.client.models.PersonalAccessTokenRequestPermissionsUpgraded
import org.openapitools.client.models.PersonalAccessTokenRequestRepositoriesInner
import org.openapitools.client.models.SimpleUser

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Details of a Personal Access Token Request.
 *
 * @param id Unique identifier of the request for access via fine-grained personal access token. Used as the `pat_request_id` parameter in the list and review API calls.
 * @param owner 
 * @param permissionsAdded 
 * @param permissionsUpgraded 
 * @param permissionsResult 
 * @param repositorySelection Type of repository selection requested.
 * @param repositoryCount The number of repositories the token is requesting access to. This field is only populated when `repository_selection` is `subset`.
 * @param repositories An array of repository objects the token is requesting access to. This field is only populated when `repository_selection` is `subset`.
 * @param createdAt Date and time when the request for access was created.
 * @param tokenExpired Whether the associated fine-grained personal access token has expired.
 * @param tokenExpiresAt Date and time when the associated fine-grained personal access token expires.
 * @param tokenLastUsedAt Date and time when the associated fine-grained personal access token was last used for authentication.
 */
@Serializable

data class PersonalAccessTokenRequest (

    /* Unique identifier of the request for access via fine-grained personal access token. Used as the `pat_request_id` parameter in the list and review API calls. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "owner")
    val owner: SimpleUser,

    @SerialName(value = "permissions_added")
    val permissionsAdded: PersonalAccessTokenRequestPermissionsAdded,

    @SerialName(value = "permissions_upgraded")
    val permissionsUpgraded: PersonalAccessTokenRequestPermissionsUpgraded,

    @SerialName(value = "permissions_result")
    val permissionsResult: PersonalAccessTokenRequestPermissionsResult,

    /* Type of repository selection requested. */
    @SerialName(value = "repository_selection")
    val repositorySelection: PersonalAccessTokenRequest.RepositorySelection,

    /* The number of repositories the token is requesting access to. This field is only populated when `repository_selection` is `subset`. */
    @SerialName(value = "repository_count")
    val repositoryCount: kotlin.Int?,

    /* An array of repository objects the token is requesting access to. This field is only populated when `repository_selection` is `subset`. */
    @SerialName(value = "repositories")
    val repositories: kotlin.collections.List<PersonalAccessTokenRequestRepositoriesInner>,

    /* Date and time when the request for access was created. */
    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    /* Whether the associated fine-grained personal access token has expired. */
    @SerialName(value = "token_expired")
    val tokenExpired: kotlin.Boolean,

    /* Date and time when the associated fine-grained personal access token expires. */
    @SerialName(value = "token_expires_at")
    val tokenExpiresAt: kotlin.String?,

    /* Date and time when the associated fine-grained personal access token was last used for authentication. */
    @SerialName(value = "token_last_used_at")
    val tokenLastUsedAt: kotlin.String?

) {

    /**
     * Type of repository selection requested.
     *
     * Values: none,all,subset
     */
    @Serializable
    enum class RepositorySelection(val value: kotlin.String) {
        @SerialName(value = "none") none("none"),
        @SerialName(value = "all") all("all"),
        @SerialName(value = "subset") subset("subset");
    }
}

