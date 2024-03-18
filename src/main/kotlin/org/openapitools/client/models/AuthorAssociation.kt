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
 * How the author is associated with the repository.
 *
 * Values: COLLABORATOR,CONTRIBUTOR,FIRST_TIMER,FIRST_TIME_CONTRIBUTOR,MANNEQUIN,MEMBER,NONE,OWNER
 */
@Serializable
enum class AuthorAssociation(val value: kotlin.String) {

    @SerialName(value = "COLLABORATOR")
    COLLABORATOR("COLLABORATOR"),

    @SerialName(value = "CONTRIBUTOR")
    CONTRIBUTOR("CONTRIBUTOR"),

    @SerialName(value = "FIRST_TIMER")
    FIRST_TIMER("FIRST_TIMER"),

    @SerialName(value = "FIRST_TIME_CONTRIBUTOR")
    FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),

    @SerialName(value = "MANNEQUIN")
    MANNEQUIN("MANNEQUIN"),

    @SerialName(value = "MEMBER")
    MEMBER("MEMBER"),

    @SerialName(value = "NONE")
    NONE("NONE"),

    @SerialName(value = "OWNER")
    OWNER("OWNER");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AuthorAssociation) "$data" else null

        /**
         * Returns a valid [AuthorAssociation] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AuthorAssociation? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

