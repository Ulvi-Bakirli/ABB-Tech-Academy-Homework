import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private long birthDay;
    private Integer iq;
    private Map<String, String> schedule;
    private Family family;

    public Human() {
    }

    public Human(String name, String surname, Integer birthDay, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.family = family;
    }

    public Human(String name, String surname, Integer birthDay) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
    }


    public Human(String name, String surname, Integer birthDay, Integer iq, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, Integer birthDay, Integer iq, Map<String, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    //Advanced complexity
    static {
        System.out.println("Class is being loaded: " + Human.class.getName());
    }

    {
        System.out.println("Object is created: " + getClass().getName());
    }

    public LocalDate describeAge() {
        return LocalDate.ofEpochDay(birthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(long birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }


    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Human human = (Human) object;
        return Objects.equals(name, human.name)
                && Objects.equals(surname, human.surname)
                && Objects.equals(birthDay, human.birthDay)
                && Objects.equals(family.getFather().name, human.getFamily().getFather().getName())
                && Objects.equals(family.getFather().surname, human.getFamily().getFather().getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getBirthDay(), getFamily().getFather().getName(), getFamily().getFather().getSurname());
    }

    @Override
    public String toString() {
        Integer iqLevel = null;
        if (this.iq != null) {
            if (this.iq >= 1 && this.iq <= 100) {
                iqLevel = this.iq;
            }
        } else {
            iq = 0;
        }
        if (name == null || surname == null) {
            return "There is no information.";
        } else if (birthDay == 0) {
            if (iq == 0 && schedule != null) {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", schedule=" + schedule + '}';
            } else if (schedule == null) {
                if (iq != 0) {
                    return "Human{" +
                            "name='" + name + '\'' +
                            ", surname='" + surname + '\'' +
                            ", iq=" + iq + '}';
                } else {
                    return "Human{" +
                            "name='" + name + '\'' +
                            ", surname='" + surname + '\'' +
                            '}';
                }
            } else {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", iq=" + iq +
                        ", schedule=" + schedule + '}';
            }
        } else if (iq == 0) {
            if (schedule == null) {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", year=" + LocalDate.ofEpochDay(birthDay).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                        '}';
            } else {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", year=" + LocalDate.ofEpochDay(birthDay).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                        ", schedule=" + schedule + '}';
            }

        } else if (schedule == null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + LocalDate.ofEpochDay(birthDay).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                    ", iq=" + iq + '}';
        } else {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + LocalDate.ofEpochDay(birthDay).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                    ", iq=" + iq +
                    ", schedule=" + schedule + '}';
        }

    }

    @Override
    protected void finalize() {
        System.out.printf("Deleted %s %s\n", name, surname);
    }
}