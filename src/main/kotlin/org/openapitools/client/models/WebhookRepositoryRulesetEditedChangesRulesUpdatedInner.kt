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

import org.openapitools.client.models.RepositoryRule
import org.openapitools.client.models.WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param rule 
 * @param changes 
 */
@Serializable

data class WebhookRepositoryRulesetEditedChangesRulesUpdatedInner (

    @SerialName(value = "rule")
    val rule: RepositoryRule? = null,

    @SerialName(value = "changes")
    val changes: WebhookRepositoryRulesetEditedChangesRulesUpdatedInnerChanges? = null

)

