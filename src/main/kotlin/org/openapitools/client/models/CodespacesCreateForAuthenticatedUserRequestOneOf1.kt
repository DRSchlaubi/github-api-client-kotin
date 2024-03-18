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

import org.openapitools.client.models.CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param pullRequest 
 * @param location The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided.
 * @param geo The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces `location`, which is being deprecated.
 * @param machine Machine type to use for this codespace
 * @param devcontainerPath Path to devcontainer.json config to use for this codespace
 * @param workingDirectory Working directory for this codespace
 * @param idleTimeoutMinutes Time in minutes before codespace stops from inactivity
 */
@Serializable

data class CodespacesCreateForAuthenticatedUserRequestOneOf1 (

    @SerialName(value = "pull_request")
    val pullRequest: CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest,

    /* The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided. */
    @SerialName(value = "location")
    val location: kotlin.String? = null,

    /* The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces `location`, which is being deprecated. */
    @SerialName(value = "geo")
    val geo: CodespacesCreateForAuthenticatedUserRequestOneOf1.Geo? = null,

    /* Machine type to use for this codespace */
    @SerialName(value = "machine")
    val machine: kotlin.String? = null,

    /* Path to devcontainer.json config to use for this codespace */
    @SerialName(value = "devcontainer_path")
    val devcontainerPath: kotlin.String? = null,

    /* Working directory for this codespace */
    @SerialName(value = "working_directory")
    val workingDirectory: kotlin.String? = null,

    /* Time in minutes before codespace stops from inactivity */
    @SerialName(value = "idle_timeout_minutes")
    val idleTimeoutMinutes: kotlin.Int? = null

) {

    /**
     * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces `location`, which is being deprecated.
     *
     * Values: EuropeWest,SoutheastAsia,UsEast,UsWest
     */
    @Serializable
    enum class Geo(val value: kotlin.String) {
        @SerialName(value = "EuropeWest") EuropeWest("EuropeWest"),
        @SerialName(value = "SoutheastAsia") SoutheastAsia("SoutheastAsia"),
        @SerialName(value = "UsEast") UsEast("UsEast"),
        @SerialName(value = "UsWest") UsWest("UsWest");
    }
}

