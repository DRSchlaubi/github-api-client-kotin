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
 * @param path 
 * @param sha 
 * @param ref 
 */
@Serializable

data class DeploymentWorkflowRunReferencedWorkflowsInner (

    @SerialName(value = "path")
    val path: kotlin.String,

    @SerialName(value = "sha")
    val sha: kotlin.String,

    @SerialName(value = "ref")
    val ref: kotlin.String? = null

)
