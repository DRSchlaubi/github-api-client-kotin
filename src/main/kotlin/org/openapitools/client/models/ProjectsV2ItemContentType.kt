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


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The type of content tracked in a project item
 *
 * Values: Issue,PullRequest,DraftIssue
 */
@Serializable
enum class ProjectsV2ItemContentType(val value: kotlin.String) {

    @SerialName(value = "Issue")
    Issue("Issue"),

    @SerialName(value = "PullRequest")
    PullRequest("PullRequest"),

    @SerialName(value = "DraftIssue")
    DraftIssue("DraftIssue");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ProjectsV2ItemContentType) "$data" else null

        /**
         * Returns a valid [ProjectsV2ItemContentType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ProjectsV2ItemContentType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
