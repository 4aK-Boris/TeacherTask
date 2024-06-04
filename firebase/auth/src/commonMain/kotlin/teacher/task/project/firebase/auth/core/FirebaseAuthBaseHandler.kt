package teacher.task.project.firebase.auth.core

import dev.gitlive.firebase.auth.FirebaseAuth
import dev.gitlive.firebase.auth.FirebaseUser
import teacher.task.project.firebase.auth.core.exception.FirebaseAuthException
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

abstract class FirebaseAuthBaseHandler: KoinComponent {

    protected val auth by inject<FirebaseAuth>()

    protected val user: FirebaseUser
        get() = auth.currentUser ?: throw FirebaseAuthException()

    protected val nullableUser: FirebaseUser?
        get() = auth.currentUser
}