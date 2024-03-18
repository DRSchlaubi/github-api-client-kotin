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

package org.openapitools.client.apis

import org.openapitools.client.models.BasicError
import org.openapitools.client.models.Classroom
import org.openapitools.client.models.ClassroomAcceptedAssignment
import org.openapitools.client.models.ClassroomAssignment
import org.openapitools.client.models.ClassroomAssignmentGrade
import org.openapitools.client.models.SimpleClassroom
import org.openapitools.client.models.SimpleClassroomAssignment

import org.openapitools.client.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder

    open class ClassroomApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    ) : ApiClient(
        baseUrl,
        httpClientEngine,
        httpClientConfig,
    ) {

        /**
        * Get a classroom
        * Gets a GitHub Classroom classroom for the current user. Classroom will only be returned if the current user is an administrator of the GitHub Classroom.
         * @param classroomId The unique identifier of the classroom. 
         * @return Classroom
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun classroomGetAClassroom(classroomId: kotlin.Int): HttpResponse<Classroom> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/classrooms/{classroom_id}".replace("{" + "classroom_id" + "}", "$classroomId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Get an assignment
        * Gets a GitHub Classroom assignment. Assignment will only be returned if the current user is an administrator of the GitHub Classroom for the assignment.
         * @param assignmentId The unique identifier of the classroom assignment. 
         * @return ClassroomAssignment
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun classroomGetAnAssignment(assignmentId: kotlin.Int): HttpResponse<ClassroomAssignment> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/assignments/{assignment_id}".replace("{" + "assignment_id" + "}", "$assignmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Get assignment grades
        * Gets grades for a GitHub Classroom assignment. Grades will only be returned if the current user is an administrator of the GitHub Classroom for the assignment.
         * @param assignmentId The unique identifier of the classroom assignment. 
         * @return kotlin.collections.List<ClassroomAssignmentGrade>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun classroomGetAssignmentGrades(assignmentId: kotlin.Int): HttpResponse<kotlin.collections.List<ClassroomAssignmentGrade>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/assignments/{assignment_id}/grades".replace("{" + "assignment_id" + "}", "$assignmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * List accepted assignments for an assignment
        * Lists any assignment repositories that have been created by students accepting a GitHub Classroom assignment. Accepted assignments will only be returned if the current user is an administrator of the GitHub Classroom for the assignment.
         * @param assignmentId The unique identifier of the classroom assignment. 
         * @param page The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 1)
         * @param perPage The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 30)
         * @return kotlin.collections.List<ClassroomAcceptedAssignment>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun classroomListAcceptedAssigmentsForAnAssignment(assignmentId: kotlin.Int, page: kotlin.Int?, perPage: kotlin.Int?): HttpResponse<kotlin.collections.List<ClassroomAcceptedAssignment>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            page?.apply { localVariableQuery["page"] = listOf("$page") }
            perPage?.apply { localVariableQuery["per_page"] = listOf("$perPage") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/assignments/{assignment_id}/accepted_assignments".replace("{" + "assignment_id" + "}", "$assignmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * List assignments for a classroom
        * Lists GitHub Classroom assignments for a classroom. Assignments will only be returned if the current user is an administrator of the GitHub Classroom.
         * @param classroomId The unique identifier of the classroom. 
         * @param page The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 1)
         * @param perPage The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 30)
         * @return kotlin.collections.List<SimpleClassroomAssignment>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun classroomListAssignmentsForAClassroom(classroomId: kotlin.Int, page: kotlin.Int?, perPage: kotlin.Int?): HttpResponse<kotlin.collections.List<SimpleClassroomAssignment>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            page?.apply { localVariableQuery["page"] = listOf("$page") }
            perPage?.apply { localVariableQuery["per_page"] = listOf("$perPage") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/classrooms/{classroom_id}/assignments".replace("{" + "classroom_id" + "}", "$classroomId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * List classrooms
        * Lists GitHub Classroom classrooms for the current user. Classrooms will only be returned if the current user is an administrator of one or more GitHub Classrooms.
         * @param page The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 1)
         * @param perPage The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 30)
         * @return kotlin.collections.List<SimpleClassroom>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun classroomListClassrooms(page: kotlin.Int?, perPage: kotlin.Int?): HttpResponse<kotlin.collections.List<SimpleClassroom>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            page?.apply { localVariableQuery["page"] = listOf("$page") }
            perPage?.apply { localVariableQuery["per_page"] = listOf("$perPage") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/classrooms",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        }