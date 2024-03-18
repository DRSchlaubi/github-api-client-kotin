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
 * User-defined metadata to store domain-specific information limited to 8 keys with scalar values.
 *
 * @param rulesetSourceType The type of source for the ruleset that includes this rule.
 * @param rulesetSource The name of the source of the ruleset that includes this rule.
 * @param rulesetId The ID of the ruleset that includes this rule.
 */
@Serializable

data class RepositoryRuleRulesetInfo (

    /* The type of source for the ruleset that includes this rule. */
    @SerialName(value = "ruleset_source_type")
    val rulesetSourceType: RepositoryRuleRulesetInfo.RulesetSourceType? = null,

    /* The name of the source of the ruleset that includes this rule. */
    @SerialName(value = "ruleset_source")
    val rulesetSource: kotlin.String? = null,

    /* The ID of the ruleset that includes this rule. */
    @SerialName(value = "ruleset_id")
    val rulesetId: kotlin.Int? = null

) {

    /**
     * The type of source for the ruleset that includes this rule.
     *
     * Values: Repository,Organization
     */
    @Serializable
    enum class RulesetSourceType(val value: kotlin.String) {
        @SerialName(value = "Repository") Repository("Repository"),
        @SerialName(value = "Organization") Organization("Organization");
    }
}

