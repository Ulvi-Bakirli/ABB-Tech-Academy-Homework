import java.util.Map;

public class Woman extends Human{

    private String name;
    private String surname;
    private long year;
    private Integer iq;
    private Map<String, String> schedule;

    public Woman(String name, String surname, Integer year, Integer iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Woman(String name, String surname, Integer year, Integer iq, Map<String, String> schedule, Family family){
        super(name, surname, year, iq, schedule, family);
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Woman() {
    }

    public void makeUp(){
        System.out.println("I make up myself :)");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public long getBirthDay() {
        return year;
    }

    @Override
    public void setBirthDay(long birthDay) {
        this.year = birthDay;
    }

    @Override
    public Integer getIq() {
        return iq;
    }

    @Override
    public void setIq(Integer iq) {
        this.iq = iq;
    }

    @Override
    public Map<String, String> getSchedule() {
        return schedule;
    }

    @Override
    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
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
        } else if (year == 0) {
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
                        ", year=" + year +
                        '}';
            } else {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", year=" + year +
                        ", schedule=" + schedule + '}';
            }

        } else if (schedule == null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq + '}';
        } else {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq +
                    ", schedule=" + schedule + '}';
        }
    }
}