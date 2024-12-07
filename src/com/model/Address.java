package com.model;

/**
 * The {@code Address} class represents a physical address with various attributes
 * such as street, city, state, zip code, and address type (e.g., "home", "office").
 * It also includes the unit or apartment number if applicable.
 * <p>
 * This class provides getter and setter methods for each attribute, allowing
 * you to access and modify the address details.
 * </p>
 */
public class Address {

    private String street;
    private String addressType;
    private String city;
    private String state;
    private int zipCode;
    private String number;


    /**
     * Gets the street address.
     *
     * @return the street address
     */
    public String getStreet() {
        return street;
    }

    /**
     * Gets the city of the address.
     *
     * @return the city of the address
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets the state of the address.
     *
     * @return the state of the address
     */
    public String getState() {
        return state;
    }

    /**
     * Gets the zip code (postal code) of the address.
     *
     * @return the zip code of the address
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * Gets the type of the address (e.g., "Home", "Office").
     *
     * @return the address type
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Gets the unit or apartment number of the address, if applicable.
     *
     * @return the unit or apartment number, or {@code null} if not provided
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the type of the address (e.g., "Home", "Office").
     *
     * @param addressType the type of the address
     */
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    /**
     * Sets the unit or apartment number of the address, if applicable.
     *
     * @param number the unit or apartment number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets the street address.
     *
     * @param street the street address
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Sets the city of the address.
     *
     * @param city the city of the address
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the state of the address.
     *
     * @param state the state of the address
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Sets the zip code (postal code) of the address.
     *
     * @param zipCode the zip code of the address
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
