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

import org.openapitools.client.models.CheckSuitePreferencePreferences
import org.openapitools.client.models.MinimalRepository

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Check suite configuration preferences for a repository.
 *
 * @param preferences 
 * @param repository 
 */
@Serializable

data class CheckSuitePreference (

    @SerialName(value = "preferences")
    val preferences: CheckSuitePreferencePreferences,

    @SerialName(value = "repository")
    val repository: MinimalRepository

)
