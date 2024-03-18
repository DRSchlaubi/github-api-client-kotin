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


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param selectedRepositoryIds List of repository IDs to enable for GitHub Actions.
 */
@Serializable

data class ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest (

    /* List of repository IDs to enable for GitHub Actions. */
    @SerialName(value = "selected_repository_ids")
    val selectedRepositoryIds: kotlin.collections.List<kotlin.Int>

)

