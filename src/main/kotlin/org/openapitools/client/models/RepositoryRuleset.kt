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
import org.openapitools.client.models.RepositoryRuleEnforcement
import org.openapitools.client.models.RepositoryRulesetBypassActor
import org.openapitools.client.models.RepositoryRulesetConditions
import org.openapitools.client.models.RepositoryRulesetLinks

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A set of rules to apply when specified conditions are met.
 *
 * @param id The ID of the ruleset
 * @param name The name of the ruleset
 * @param source The name of the source
 * @param enforcement 
 * @param target The target of the ruleset
 * @param sourceType The type of the source of the ruleset
 * @param bypassActors The actors that can bypass the rules in this ruleset
 * @param currentUserCanBypass The bypass type of the user making the API request for this ruleset. This field is only returned when querying the repository-level endpoint.
 * @param nodeId 
 * @param links 
 * @param conditions 
 * @param rules 
 * @param createdAt 
 * @param updatedAt 
 */
@Serializable

data class RepositoryRuleset (

    /* The ID of the ruleset */
    @SerialName(value = "id")
    val id: kotlin.Int,

    /* The name of the ruleset */
    @SerialName(value = "name")
    val name: kotlin.String,

    /* The name of the source */
    @SerialName(value = "source")
    val source: kotlin.String,

    @Contextual @SerialName(value = "enforcement")
    val enforcement: RepositoryRuleEnforcement,

    /* The target of the ruleset */
    @SerialName(value = "target")
    val target: RepositoryRuleset.Target? = null,

    /* The type of the source of the ruleset */
    @SerialName(value = "source_type")
    val sourceType: RepositoryRuleset.SourceType? = null,

    /* The actors that can bypass the rules in this ruleset */
    @SerialName(value = "bypass_actors")
    val bypassActors: kotlin.collections.List<RepositoryRulesetBypassActor>? = null,

    /* The bypass type of the user making the API request for this ruleset. This field is only returned when querying the repository-level endpoint. */
    @SerialName(value = "current_user_can_bypass")
    val currentUserCanBypass: RepositoryRuleset.CurrentUserCanBypass? = null,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String? = null,

    @SerialName(value = "_links")
    val links: RepositoryRulesetLinks? = null,

    @SerialName(value = "conditions")
    val conditions: RepositoryRulesetConditions? = null,

    @SerialName(value = "rules")
    val rules: kotlin.collections.List<RepositoryRule>? = null,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant? = null,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant? = null

) {

    /**
     * The target of the ruleset
     *
     * Values: branch,tag
     */
    @Serializable
    enum class Target(val value: kotlin.String) {
        @SerialName(value = "branch") branch("branch"),
        @SerialName(value = "tag") tag("tag");
    }
    /**
     * The type of the source of the ruleset
     *
     * Values: Repository,Organization
     */
    @Serializable
    enum class SourceType(val value: kotlin.String) {
        @SerialName(value = "Repository") Repository("Repository"),
        @SerialName(value = "Organization") Organization("Organization");
    }
    /**
     * The bypass type of the user making the API request for this ruleset. This field is only returned when querying the repository-level endpoint.
     *
     * Values: always,pull_requests_only,never
     */
    @Serializable
    enum class CurrentUserCanBypass(val value: kotlin.String) {
        @SerialName(value = "always") always("always"),
        @SerialName(value = "pull_requests_only") pull_requests_only("pull_requests_only"),
        @SerialName(value = "never") never("never");
    }
}
