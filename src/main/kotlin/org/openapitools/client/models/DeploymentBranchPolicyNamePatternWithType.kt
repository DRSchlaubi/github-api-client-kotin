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
 * @param name The name pattern that branches or tags must match in order to deploy to the environment.  Wildcard characters will not match `/`. For example, to match branches that begin with `release/` and contain an additional single slash, use `release/_*_/_*`. For more information about pattern matching syntax, see the [Ruby File.fnmatch documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch).
 * @param type Whether this rule targets a branch or tag
 */
@Serializable

data class DeploymentBranchPolicyNamePatternWithType (

    /* The name pattern that branches or tags must match in order to deploy to the environment.  Wildcard characters will not match `/`. For example, to match branches that begin with `release/` and contain an additional single slash, use `release/_*_/_*`. For more information about pattern matching syntax, see the [Ruby File.fnmatch documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch). */
    @SerialName(value = "name")
    val name: kotlin.String,

    /* Whether this rule targets a branch or tag */
    @SerialName(value = "type")
    val type: DeploymentBranchPolicyNamePatternWithType.Type? = null

) {

    /**
     * Whether this rule targets a branch or tag
     *
     * Values: branch,tag
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "branch") branch("branch"),
        @SerialName(value = "tag") tag("tag");
    }
}

