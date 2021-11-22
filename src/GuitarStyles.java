public enum GuitarStyles {
    Fender_Stratocaster("Fender Stratocaster"),
    Fender_Telecaster("Fender Telecaster"),
    Squire_Stratocaster("Squire Stratocaster"),
    Squire_Telecaster("Squire Telecaster"),
    Gibson_LesPaul("Gibson Les Paul"),
    SG("Gibson SG");

    private String displayName;

    GuitarStyles(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
