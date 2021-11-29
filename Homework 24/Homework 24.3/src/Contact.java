public class Contact {
    String surname;
    String patronymic;
    String mobileNumber;
    String homeNumber;
    String address;
    String email;

    public Contact(String surname, String patronymic, String mobileNumber, String homeNumber, String address, String email) {
        this.surname = surname;
        this.patronymic = patronymic;
        this.mobileNumber = mobileNumber;
        this.homeNumber = homeNumber;
        this.address = address;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                ", Фамилия " + surname +
                        ", Отчетсво " + patronymic +
                        ", Мобильный телефон " + mobileNumber +
                        ", Адрес " + address +
                        ", Email " + email;
    }
}