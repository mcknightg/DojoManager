catwalkApp.service('$global.services', [
    'DojomanagerStudent',
    'DojomanagerDojo',
    'DojomanagerSchoolstudent',
    'DojomanagerStudenttest',
    'DojomanagerTesting',
    'UserManagerApplicationAuthority',
    'UserManagerApplicationPersistentToken',
    'UserManagerApplicationUser',
    'UserManagerApplicationUserAuthority',
    'UserManagerAppPassResetToken',
    'Account',
    'AppAPI',
function(
    DojomanagerStudent,
    DojomanagerDojo,
    DojomanagerSchoolstudent,
    DojomanagerStudenttest,
    DojomanagerTesting,
    UserManagerApplicationAuthority,
    UserManagerApplicationPersistentToken,
    UserManagerApplicationUser,
    UserManagerApplicationUserAuthority,
    UserManagerAppPassResetToken,
    Account,
    AppAPI
) {
            this.DojomanagerStudent = DojomanagerStudent;
            this.DojomanagerDojo = DojomanagerDojo;
            this.DojomanagerSchoolstudent = DojomanagerSchoolstudent;
            this.DojomanagerStudenttest = DojomanagerStudenttest;
            this.DojomanagerTesting = DojomanagerTesting;
            this.UserManagerApplicationAuthority = UserManagerApplicationAuthority;
            this.UserManagerApplicationPersistentToken = UserManagerApplicationPersistentToken;
            this.UserManagerApplicationUser = UserManagerApplicationUser;
            this.UserManagerApplicationUserAuthority = UserManagerApplicationUserAuthority;
            this.UserManagerAppPassResetToken = UserManagerAppPassResetToken;
            this.Account = Account;
        this.api = AppAPI;
}
]);
