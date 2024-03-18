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

import org.openapitools.client.models.RepositoryRuleWorkflowsParameters

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param type 
 * @param parameters 
 * @param rulesetSourceType The type of source for the ruleset that includes this rule.
 * @param rulesetSource The name of the source of the ruleset that includes this rule.
 * @param rulesetId The ID of the ruleset that includes this rule.
 */
@Serializable

data class RepositoryRuleDetailedOneOf14 (

    @SerialName(value = "type")
    val type: RepositoryRuleDetailedOneOf14.Type?,

    @SerialName(value = "parameters")
    val parameters: RepositoryRuleWorkflowsParameters? = null,

    /* The type of source for the ruleset that includes this rule. */
    @SerialName(value = "ruleset_source_type")
    val rulesetSourceType: RepositoryRuleDetailedOneOf14.RulesetSourceType? = null,

    /* The name of the source of the ruleset that includes this rule. */
    @Contextual @SerialName(value = "ruleset_source")
    val rulesetSource: kotlin.Any? = null,

    /* The ID of the ruleset that includes this rule. */
    @Contextual @SerialName(value = "ruleset_id")
    val rulesetId: kotlin.Any? = null

) {

    /**
     * 
     *
     * Values: workflows
     */
    @Serializable
    enum class Type(val value: kotlin.Any) {
        @SerialName(value = "workflows") workflows("workflows");
    }
    /**
     * The type of source for the ruleset that includes this rule.
     *
     * Values: Repository,Organization
     */
    @Serializable
    enum class RulesetSourceType(val value: kotlin.Any) {
        @SerialName(value = "Repository") Repository("Repository"),
        @SerialName(value = "Organization") Organization("Organization");
    }
}

