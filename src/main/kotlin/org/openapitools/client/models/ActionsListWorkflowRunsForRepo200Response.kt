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

import org.openapitools.client.models.WorkflowRun

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param totalCount 
 * @param workflowRuns 
 */
@Serializable

data class ActionsListWorkflowRunsForRepo200Response (

    @SerialName(value = "total_count")
    val totalCount: kotlin.Int,

    @SerialName(value = "workflow_runs")
    val workflowRuns: kotlin.collections.List<WorkflowRun>

)

