package org.example;

public enum StudyProfile {
    MEDICINE("Медицина"),
    ENGINEERING("Инженерия"),
    ART("Искусство"),
    SCIENCE("Наука");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
