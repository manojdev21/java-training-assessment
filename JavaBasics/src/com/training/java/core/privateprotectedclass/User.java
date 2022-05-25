package com.training.java.core.privateprotectedclass;

public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }

    protected class Profile {
        private String email;
        private String phone;
        private String country;

        public Profile(String email, String phone, String country) {
            this.email = email;
            this.phone = phone;
            this.country = country;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public String getCountry() {
            return country;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "Profile [email=" + email + ", phone=" + phone + ", country=" + country + "]";
        }

    }
}
