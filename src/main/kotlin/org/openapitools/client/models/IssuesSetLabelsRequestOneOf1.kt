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

import org.openapitools.client.models.IssuesSetLabelsRequestOneOf1LabelsInner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param labels 
 */
@Serializable

data class IssuesSetLabelsRequestOneOf1 (

    @SerialName(value = "labels")
    val labels: kotlin.collections.List<IssuesSetLabelsRequestOneOf1LabelsInner>? = null

)

