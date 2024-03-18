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

import org.openapitools.client.models.RuleSuiteRuleEvaluationsInnerRuleSource

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param ruleSource 
 * @param enforcement The enforcement level of this rule source.
 * @param result The result of the evaluation of the individual rule.
 * @param ruleType The type of rule.
 * @param details Any associated details with the rule evaluation.
 */
@Serializable

data class RuleSuiteRuleEvaluationsInner (

    @SerialName(value = "rule_source")
    val ruleSource: RuleSuiteRuleEvaluationsInnerRuleSource? = null,

    /* The enforcement level of this rule source. */
    @SerialName(value = "enforcement")
    val enforcement: RuleSuiteRuleEvaluationsInner.Enforcement? = null,

    /* The result of the evaluation of the individual rule. */
    @SerialName(value = "result")
    val result: RuleSuiteRuleEvaluationsInner.Result? = null,

    /* The type of rule. */
    @SerialName(value = "rule_type")
    val ruleType: kotlin.String? = null,

    /* Any associated details with the rule evaluation. */
    @SerialName(value = "details")
    val details: kotlin.String? = null

) {

    /**
     * The enforcement level of this rule source.
     *
     * Values: active,evaluate,deleted_ruleset
     */
    @Serializable
    enum class Enforcement(val value: kotlin.String) {
        @SerialName(value = "active") active("active"),
        @SerialName(value = "evaluate") evaluate("evaluate"),
        @SerialName(value = "deleted ruleset") deleted_ruleset("deleted ruleset");
    }
    /**
     * The result of the evaluation of the individual rule.
     *
     * Values: pass,fail
     */
    @Serializable
    enum class Result(val value: kotlin.String) {
        @SerialName(value = "pass") pass("pass"),
        @SerialName(value = "fail") fail("fail");
    }
}
