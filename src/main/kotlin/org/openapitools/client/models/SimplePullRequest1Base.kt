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

import org.openapitools.client.models.Repository5
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param label 
 * @param ref 
 * @param repo 
 * @param sha 
 * @param user 
 */
@Serializable

data class SimplePullRequest1Base (

    @SerialName(value = "label")
    val label: kotlin.String,

    @SerialName(value = "ref")
    val ref: kotlin.String,

    @SerialName(value = "repo")
    val repo: Repository5,

    @SerialName(value = "sha")
    val sha: kotlin.String,

    @SerialName(value = "user")
    val user: User

)

