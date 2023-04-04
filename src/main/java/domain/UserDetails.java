package domain;

import java.util.Date;

public class UserDetails {
    private String userID;
    private String customerID;
    private Date dateOfReg;
    private Date loginDate;
    private String UserPassword;
    public UserDetails(Builder builder) {
        this.userID = builder.userID;
        this.customerID = builder.customerID;
        this.dateOfReg = builder.dateOfReg;
        this.loginDate = builder.loginDate;
        this.UserPassword = builder.UserPassword;
    }
    public UserDetails() {
    }

    public String getUserID() {
        return userID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public Date getDateOfReg() {
        return dateOfReg;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userID='" + userID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", dateOfReg=" + dateOfReg +
                ", loginDate=" + loginDate +
                ", UserPassword='" + UserPassword + '\'' +
                '}';
    }
    public static class Builder {
        private String userID;
        private String customerID;
        private Date dateOfReg;
        private Date loginDate;
        private String UserPassword;

        public Builder setUserID(String userID) {
            this.userID = userID;
            return this;
        }

        public Builder setCustomerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setDateOfReg(Date dateOfReg) {
            this.dateOfReg = dateOfReg;
            return this;
        }

        public Builder setLoginDate(Date loginDate) {
            this.loginDate = loginDate;
            return this;
        }

        public Builder setPassword(String UserPassword) {
            this.UserPassword = UserPassword;
            return this;
        }
        public UserDetails.Builder copy(UserDetails details) {
            this.userID = details.userID;
            this.customerID = details.customerID;
            this.dateOfReg = details.dateOfReg;
            this.loginDate = details.loginDate;
            this.UserPassword = details.UserPassword;
            return this;
        }
        public UserDetails build() {
            return new UserDetails(this);
        }
    }
}
