package teacher.task.project.firebase.auth.dto

data class UserDataDTO(
    val avatarUri: String?,
    val firstName: String?,
    val lastName: String?,
    val patronymic: String?,
    val email: String?,
    val phoneNumber: String?
)