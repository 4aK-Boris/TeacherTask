package teacher.task.project.firebase.auth.core.exception

import dmitriy.losev.exception.BaseException
import dmitriy.losev.exception.FIREBASE_AUTH_EXCEPTION

class FirebaseAuthException: BaseException(extraErrorCode = FIREBASE_AUTH_EXCEPTION)

