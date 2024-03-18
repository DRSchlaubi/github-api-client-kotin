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

import org.openapitools.client.models.DeploymentProtectionRule

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param totalCount The number of enabled custom deployment protection rules for this environment
 * @param customDeploymentProtectionRules 
 */
@Serializable

data class ReposGetAllDeploymentProtectionRules200Response (

    /* The number of enabled custom deployment protection rules for this environment */
    @SerialName(value = "total_count")
    val totalCount: kotlin.Int? = null,

    @SerialName(value = "custom_deployment_protection_rules")
    val customDeploymentProtectionRules: kotlin.collections.List<DeploymentProtectionRule>? = null

)

