package system;

public class User {
    /*用户类
    id
    用户名
    密码
    角色（1管理员 2读者）*/
    private int UserID;
    private String UserName;
    private String UserPassword;
    private int IsAdminOrNot;

    public User() {
    }

    public User(int userID, String userName, String userPassword, int isAdminOrNot) {
        UserID = userID;
        UserName = userName;
        UserPassword = userPassword;
        IsAdminOrNot = isAdminOrNot;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", UserName='" + UserName + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", IsAdminOrNot=" + IsAdminOrNot +
                '}';
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public int getIsAdminOrNot() {
        return IsAdminOrNot;
    }

    public void setIsAdminOrNot(int isAdminOrNot) {
        IsAdminOrNot = isAdminOrNot;
    }
}
