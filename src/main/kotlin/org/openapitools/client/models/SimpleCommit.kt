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

import org.openapitools.client.models.Committer

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param author 
 * @param committer 
 * @param id 
 * @param message 
 * @param timestamp 
 * @param treeId 
 */
@Serializable

data class SimpleCommit (

    @SerialName(value = "author")
    val author: Committer,

    @SerialName(value = "committer")
    val committer: Committer,

    @SerialName(value = "id")
    val id: kotlin.String,

    @SerialName(value = "message")
    val message: kotlin.String,

    @SerialName(value = "timestamp")
    val timestamp: kotlin.String,

    @SerialName(value = "tree_id")
    val treeId: kotlin.String

)
