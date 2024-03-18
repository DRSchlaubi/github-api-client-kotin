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
 * Grade for a student or groups GitHub Classroom assignment
 *
 * @param assignmentName Name of the assignment
 * @param assignmentUrl URL of the assignment
 * @param starterCodeUrl URL of the starter code for the assignment
 * @param githubUsername GitHub username of the student
 * @param rosterIdentifier Roster identifier of the student
 * @param studentRepositoryName Name of the student's assignment repository
 * @param studentRepositoryUrl URL of the student's assignment repository
 * @param submissionTimestamp Timestamp of the student's assignment submission
 * @param pointsAwarded Number of points awarded to the student
 * @param pointsAvailable Number of points available for the assignment
 * @param groupName If a group assignment, name of the group the student is in
 */
@Serializable

data class ClassroomAssignmentGrade (

    /* Name of the assignment */
    @SerialName(value = "assignment_name")
    val assignmentName: kotlin.String,

    /* URL of the assignment */
    @SerialName(value = "assignment_url")
    val assignmentUrl: kotlin.String,

    /* URL of the starter code for the assignment */
    @SerialName(value = "starter_code_url")
    val starterCodeUrl: kotlin.String,

    /* GitHub username of the student */
    @SerialName(value = "github_username")
    val githubUsername: kotlin.String,

    /* Roster identifier of the student */
    @SerialName(value = "roster_identifier")
    val rosterIdentifier: kotlin.String,

    /* Name of the student's assignment repository */
    @SerialName(value = "student_repository_name")
    val studentRepositoryName: kotlin.String,

    /* URL of the student's assignment repository */
    @SerialName(value = "student_repository_url")
    val studentRepositoryUrl: kotlin.String,

    /* Timestamp of the student's assignment submission */
    @SerialName(value = "submission_timestamp")
    val submissionTimestamp: kotlin.String,

    /* Number of points awarded to the student */
    @SerialName(value = "points_awarded")
    val pointsAwarded: kotlin.Int,

    /* Number of points available for the assignment */
    @SerialName(value = "points_available")
    val pointsAvailable: kotlin.Int,

    /* If a group assignment, name of the group the student is in */
    @SerialName(value = "group_name")
    val groupName: kotlin.String? = null

)

