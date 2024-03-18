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
 * @param summary A short summary of the advisory.
 * @param description A detailed description of what the advisory impacts.
 * @param cveId The Common Vulnerabilities and Exposures (CVE) ID.
 * @param vulnerabilities A product affected by the vulnerability detailed in a repository security advisory.
 * @param cweIds A list of Common Weakness Enumeration (CWE) IDs.
 * @param credits A list of users receiving credit for their participation in the security advisory.
 * @param severity The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
 * @param cvssVectorString The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or `severity`.
 * @param state The state of the advisory.
 * @param collaboratingUsers A list of usernames who have been granted write access to the advisory.
 * @param collaboratingTeams A list of team slugs which have been granted write access to the advisory.
 */
@Serializable

data class RepositoryAdvisoryUpdate (

    /* A short summary of the advisory. */
    @Contextual @SerialName(value = "summary")
    val summary: kotlin.Any? = null,

    /* A detailed description of what the advisory impacts. */
    @Contextual @SerialName(value = "description")
    val description: kotlin.Any? = null,

    /* The Common Vulnerabilities and Exposures (CVE) ID. */
    @Contextual @SerialName(value = "cve_id")
    val cveId: kotlin.Any? = null,

    /* A product affected by the vulnerability detailed in a repository security advisory. */
    @Contextual @SerialName(value = "vulnerabilities")
    val vulnerabilities: kotlin.Any? = null,

    /* A list of Common Weakness Enumeration (CWE) IDs. */
    @Contextual @SerialName(value = "cwe_ids")
    val cweIds: kotlin.Any? = null,

    /* A list of users receiving credit for their participation in the security advisory. */
    @Contextual @SerialName(value = "credits")
    val credits: kotlin.Any? = null,

    /* The severity of the advisory. You must choose between setting this field or `cvss_vector_string`. */
    @SerialName(value = "severity")
    val severity: RepositoryAdvisoryUpdate.Severity? = null,

    /* The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or `severity`. */
    @Contextual @SerialName(value = "cvss_vector_string")
    val cvssVectorString: kotlin.Any? = null,

    /* The state of the advisory. */
    @SerialName(value = "state")
    val state: RepositoryAdvisoryUpdate.State? = null,

    /* A list of usernames who have been granted write access to the advisory. */
    @Contextual @SerialName(value = "collaborating_users")
    val collaboratingUsers: kotlin.Any? = null,

    /* A list of team slugs which have been granted write access to the advisory. */
    @Contextual @SerialName(value = "collaborating_teams")
    val collaboratingTeams: kotlin.Any? = null

) {

    /**
     * The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
     *
     * Values: critical,high,medium,low,`null`
     */
    @Serializable
    enum class Severity(val value: kotlin.Any) {
        @SerialName(value = "critical") critical("critical"),
        @SerialName(value = "high") high("high"),
        @SerialName(value = "medium") medium("medium"),
        @SerialName(value = "low") low("low"),
        @SerialName(value = "null") `null`("null");
    }
    /**
     * The state of the advisory.
     *
     * Values: published,closed,draft
     */
    @Serializable
    enum class State(val value: kotlin.Any) {
        @SerialName(value = "published") published("published"),
        @SerialName(value = "closed") closed("closed"),
        @SerialName(value = "draft") draft("draft");
    }
}
