public enum BassStyles {
    Fender_Jazz("Fender Jazz"),
    Fender_Precision("Fender Precision"),
    Squire_Jazz("Squire Jazz"),
    Squire_Precision("Squire Precision"),
    Rickenbacker("Rickenbacker"),
    Music_Man_Stingray("Music Man Stingray"),
    Yamaha_TRBX("Yamaha TRBX");

    private String displayName;

    BassStyles(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }

}
