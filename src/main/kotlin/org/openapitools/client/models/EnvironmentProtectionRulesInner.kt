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

import org.openapitools.client.models.EnvironmentProtectionRulesInnerAnyOf
import org.openapitools.client.models.EnvironmentProtectionRulesInnerAnyOf1
import org.openapitools.client.models.EnvironmentProtectionRulesInnerAnyOf2

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param id 
 * @param nodeId 
 * @param type 
 * @param waitTimer The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days).
 * @param preventSelfReview Whether deployments to this environment can be approved by the user who created the deployment.
 * @param reviewers The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.
 */
@Serializable

data class EnvironmentProtectionRulesInner (

    @Contextual @SerialName(value = "id")
    val id: kotlin.Any?,

    @Contextual @SerialName(value = "node_id")
    val nodeId: kotlin.Any?,

    @Contextual @SerialName(value = "type")
    val type: kotlin.Any?,

    /* The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days). */
    @Contextual @SerialName(value = "wait_timer")
    val waitTimer: kotlin.Any? = null,

    /* Whether deployments to this environment can be approved by the user who created the deployment. */
    @Contextual @SerialName(value = "prevent_self_review")
    val preventSelfReview: kotlin.Any? = null,

    /* The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. */
    @Contextual @SerialName(value = "reviewers")
    val reviewers: kotlin.Any? = null

)

