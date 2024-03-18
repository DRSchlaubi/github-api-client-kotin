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

import org.openapitools.client.models.RunnerLabel

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A self hosted runner
 *
 * @param id The id of the runner.
 * @param name The name of the runner.
 * @param os The Operating System of the runner.
 * @param status The status of the runner.
 * @param busy 
 * @param labels 
 * @param runnerGroupId The id of the runner group.
 */
@Serializable

data class Runner (

    /* The id of the runner. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    /* The name of the runner. */
    @SerialName(value = "name")
    val name: kotlin.String,

    /* The Operating System of the runner. */
    @SerialName(value = "os")
    val os: kotlin.String,

    /* The status of the runner. */
    @SerialName(value = "status")
    val status: kotlin.String,

    @SerialName(value = "busy")
    val busy: kotlin.Boolean,

    @SerialName(value = "labels")
    val labels: kotlin.collections.List<RunnerLabel>,

    /* The id of the runner group. */
    @SerialName(value = "runner_group_id")
    val runnerGroupId: kotlin.Int? = null

)

