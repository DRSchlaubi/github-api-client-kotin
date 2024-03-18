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

import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A collection of related issues and pull requests.
 *
 * @param closedAt 
 * @param closedIssues 
 * @param createdAt 
 * @param creator 
 * @param description 
 * @param dueOn 
 * @param htmlUrl 
 * @param id 
 * @param labelsUrl 
 * @param nodeId 
 * @param number The number of the milestone.
 * @param openIssues 
 * @param state The state of the milestone.
 * @param title The title of the milestone.
 * @param updatedAt 
 * @param url 
 */
@Serializable

data class Milestone1 (

    @Contextual @SerialName(value = "closed_at")
    val closedAt: kotlinx.datetime.Instant?,

    @SerialName(value = "closed_issues")
    val closedIssues: kotlin.Int,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "creator")
    val creator: User,

    @SerialName(value = "description")
    val description: kotlin.String?,

    @Contextual @SerialName(value = "due_on")
    val dueOn: kotlinx.datetime.Instant?,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @Contextual @SerialName(value = "labels_url")
    val labelsUrl: java.net.URI,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    /* The number of the milestone. */
    @SerialName(value = "number")
    val number: kotlin.Int,

    @SerialName(value = "open_issues")
    val openIssues: kotlin.Int,

    /* The state of the milestone. */
    @SerialName(value = "state")
    val state: Milestone1.State,

    /* The title of the milestone. */
    @SerialName(value = "title")
    val title: kotlin.String,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI

) {

    /**
     * The state of the milestone.
     *
     * Values: `open`,closed
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "open") `open`("open"),
        @SerialName(value = "closed") closed("closed");
    }
}

