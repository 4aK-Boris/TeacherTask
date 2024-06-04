package dmitriy.losev.exception

// add exceptions

class StudentAddException: BaseException(extraErrorCode = STUDENT_ADD_EXCEPTION_CODE)
class GroupAddException: BaseException(extraErrorCode = GROUP_ADD_EXCEPTION_CODE)
class ContactAddException: BaseException(extraErrorCode = CONTACT_ADD_EXCEPTION_CODE)
class SubjectAddException: BaseException(extraErrorCode = SUBJECT_ADD_EXCEPTION_CODE)
class LessonAddException: BaseException(extraErrorCode = LESSON_ADD_EXCEPTION_CODE)
class PeriodAddException: BaseException(extraErrorCode = PERIOD_ADD_EXCEPTION_CODE)
class TaskAddException: BaseException(extraErrorCode = TASK_ADD_EXCEPTION_CODE)

// get exceptions

class NullableStudentException: BaseException(extraErrorCode = NULLABLE_STUDENT_EXCEPTION_CODE)
class NullableContactException: BaseException(extraErrorCode = NULLABLE_CONTACT_EXCEPTION_CODE)
class NullableGroupException: BaseException(extraErrorCode = NULLABLE_GROUP_EXCEPTION_CODE)
class NullableSubjectException: BaseException(extraErrorCode = NULLABLE_SUBJECT_EXCEPTION_CODE)
class NullableLessonException: BaseException(extraErrorCode = NULLABLE_LESSON_EXCEPTION_CODE)
class NullablePeriodException: BaseException(extraErrorCode = NULLABLE_PERIOD_EXCEPTION_CODE)
class NullableTaskException: BaseException(extraErrorCode = NULLABLE_TASK_EXCEPTION_CODE)
class NullableFullUserDataException: BaseException(extraErrorCode = NULLABLE_FULL_USER_DATA_EXCEPTION_CODE)