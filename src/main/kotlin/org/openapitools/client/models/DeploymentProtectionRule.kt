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

import org.openapitools.client.models.CustomDeploymentRuleApp

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Deployment protection rule
 *
 * @param id The unique identifier for the deployment protection rule.
 * @param nodeId The node ID for the deployment protection rule.
 * @param enabled Whether the deployment protection rule is enabled for the environment.
 * @param app 
 */
@Serializable

data class DeploymentProtectionRule (

    /* The unique identifier for the deployment protection rule. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    /* The node ID for the deployment protection rule. */
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    /* Whether the deployment protection rule is enabled for the environment. */
    @SerialName(value = "enabled")
    val enabled: kotlin.Boolean,

    @SerialName(value = "app")
    val app: CustomDeploymentRuleApp

)

