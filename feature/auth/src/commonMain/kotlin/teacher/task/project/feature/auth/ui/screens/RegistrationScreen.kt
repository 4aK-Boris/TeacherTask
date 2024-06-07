package teacher.task.project.feature.auth.ui.screens

import androidx.compose.runtime.Composable

@Composable
fun RegistrationScreen() {
    
//    val email by viewModel.email.collectAsState()
//    val firstName by viewModel.firstName.collectAsState()
//    val lastName by viewModel.lastName.collectAsState()
//    val patronymic by viewModel.patronymic.collectAsState()
//
//    val emailTExtFieldState by viewModel.emailTextFieldState.collectAsState()
//
//    teacher.task.project.core.ui.views.ColumnPrimaryWithLoader(verticalArrangement = Arrangement.SpaceBetween, viewModel = viewModel) {
//
//        Column(
//            modifier = Modifier.fillMaxWidth(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            LogoWithBackButton {
//                viewModel.back(authenticationNavigationListener)
//            }
//
//            Title1Text(text = stringResource(id = R.string.register))
//
//            VerticalSpacer(height = 56.dp)
//
//            DefaultTextField(
//                title = stringResource(id = R.string.first_name),
//                hint = stringResource(id = R.string.first_name),
//                text = firstName,
//                imeAction = ImeAction.Next,
//                onTextChanged = viewModel::onFirstNameChanged,
//                capitalization = KeyboardCapitalization.Words
//            )
//
//            VerticalSpacer(height = 24.dp)
//
//            DefaultTextField(
//                title = stringResource(id = R.string.last_name),
//                hint = stringResource(id = R.string.last_name),
//                text = lastName,
//                imeAction = ImeAction.Next,
//                onTextChanged = viewModel::onLastNameChanged,
//                capitalization = KeyboardCapitalization.Words
//            )
//
//            VerticalSpacer(height = 24.dp)
//
//
//            DefaultTextField(
//                title = stringResource(id = R.string.patronymic),
//                hint = stringResource(id = R.string.patronymic),
//                text = patronymic,
//                imeAction = ImeAction.Next,
//                onTextChanged = viewModel::onPatronymicChanged,
//                capitalization = KeyboardCapitalization.Words
//            )
//
//            VerticalSpacer(height = 32.dp)
//
//            EmailTextField(
//                title = stringResource(id = R.string.email),
//                email = email,
//                onEmailChanged = viewModel::onEmailChanged,
//                textFieldState = emailTExtFieldState,
//                clearTextFieldState = viewModel::clearEmailTextFieldState
//            )
//        }
//
//        Column(
//            modifier = Modifier.fillMaxWidth(),
//            verticalArrangement = Arrangement.Top,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//            VerticalSpacer(height = 40.dp)
//
//            PrimaryButton(text = stringResource(id = R.string.further)) {
//                viewModel.onNextButtonClick(authenticationNavigationListener)
//            }
//
//            VerticalSpacer(height = 40.dp)
//        }
//    }
}
