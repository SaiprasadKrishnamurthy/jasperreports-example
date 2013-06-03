package be.example.jasper.domain;

public class Address {

    private String street;
    private String zipCode;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }

    public static class Builder {
        private Address address = new Address();

        public Builder setStreet(final String street) {
            address.setStreet(street);
            return this;
        }

        public Builder setCity(final String city) {
            address.setCity(city);
            return this;
        }

        public Builder setZipCode(final String zipCode) {
            address.setZipCode(zipCode);
            return this;
        }

        public Address build() {
            return address;
        }
    }

}
