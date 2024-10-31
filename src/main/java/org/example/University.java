package org.example;

public class University {
    private String id;
    private String fullName;
    private String shortName;
    private int yearOfFoundation;
    private StudyProfile mainProfile;

    // Конструктор по умолчанию
    public University() {}

    // Конструктор с параметрами
    public University(String id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }

    // Геттеры и сеттеры
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getShortName() { return shortName; }
    public void setShortName(String shortName) { this.shortName = shortName; }

    public int getYearOfFoundation() { return yearOfFoundation; }
    public void setYearOfFoundation(int yearOfFoundation) { this.yearOfFoundation = yearOfFoundation; }

    public StudyProfile getMainProfile() { return mainProfile; }
    public void setMainProfile(StudyProfile mainProfile) { this.mainProfile = mainProfile; }

    @Override
    public String toString() {
        return "Университет{" +
                "Идентификатор='" + id + '\'' +
                ", Полное название='" + fullName + '\'' +
                ", Сокращённое название='" + shortName + '\'' +
                ", Год основания=" + yearOfFoundation +
                ", Основной профиль образования=" + mainProfile.getProfileName() +
                '}';
    }
}

