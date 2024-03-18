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
 * @param type 
 * @param rulesetSourceType The type of source for the ruleset that includes this rule.
 * @param rulesetSource The name of the source of the ruleset that includes this rule.
 * @param rulesetId The ID of the ruleset that includes this rule.
 */
@Serializable

data class RepositoryRuleDetailedOneOf5 (

    @SerialName(value = "type")
    val type: RepositoryRuleDetailedOneOf5.Type?,

    /* The type of source for the ruleset that includes this rule. */
    @SerialName(value = "ruleset_source_type")
    val rulesetSourceType: RepositoryRuleDetailedOneOf5.RulesetSourceType? = null,

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
     * Values: required_signatures
     */
    @Serializable
    enum class Type(val value: kotlin.Any) {
        @SerialName(value = "required_signatures") required_signatures("required_signatures");
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

