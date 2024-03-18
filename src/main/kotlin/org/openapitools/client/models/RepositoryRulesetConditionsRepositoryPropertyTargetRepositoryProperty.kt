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

import org.openapitools.client.models.RepositoryRulesetConditionsRepositoryPropertySpec

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param include The repository properties and values to include. All of these properties must match for the condition to pass.
 * @param exclude The repository properties and values to exclude. The condition will not pass if any of these properties match.
 */
@Serializable

data class RepositoryRulesetConditionsRepositoryPropertyTargetRepositoryProperty (

    /* The repository properties and values to include. All of these properties must match for the condition to pass. */
    @SerialName(value = "include")
    val include: kotlin.collections.List<RepositoryRulesetConditionsRepositoryPropertySpec>? = null,

    /* The repository properties and values to exclude. The condition will not pass if any of these properties match. */
    @SerialName(value = "exclude")
    val exclude: kotlin.collections.List<RepositoryRulesetConditionsRepositoryPropertySpec>? = null

)
