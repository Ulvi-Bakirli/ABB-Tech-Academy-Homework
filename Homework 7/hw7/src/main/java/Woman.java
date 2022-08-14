import java.util.Arrays;

public class Woman extends Human{

    private String name;
    private String surname;
    private Integer year;
    private Integer iq;
    private String[][] schedule;

    public Woman(String name, String surname, Integer year, Integer iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Woman(String name, String surname, Integer year, Integer iq, String[][] schedule, Family family){
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
    public Integer getYear() {
        return year;
    }

    @Override
    public void setYear(Integer year) {
        this.year = year;
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
    public String[][] getSchedule() {
        return schedule;
    }

    @Override
    public void setSchedule(String[][] schedule) {
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
        } else if (year == null || year == 0) {
            if (iq == 0 && schedule != null) {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", schedule=" + Arrays.deepToString(schedule) + '}';
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
                        ", schedule=" + Arrays.deepToString(schedule) + '}';
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
                        ", schedule=" + Arrays.deepToString(schedule) + '}';
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
                    ", schedule=" + Arrays.deepToString(schedule) + '}';
        }
    }
}
